package sd.ifpb;

import sd.ifpb.repositories.MessageResultRepository;
import sd.ifpb.repositories.SendedMessageRepository;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;


public class GetResultTask extends TimerTask {
	private final SendedMessageRepository repository;
	private final MessageResultRepository resultRepository;
	
	public GetResultTask(SendedMessageRepository rep, MessageResultRepository result) {
		this.resultRepository = result;
		this.repository = rep;
	}

	@Override
	public void run() {
		//
		System.out.println("Executando tarefa de obter o resultado.");
		try {
			//
			List<Message> messages = repository.list();
			//
			IReceiver receiver;
			if (messages.size() > 0){
				Registry registry = LocateRegistry.getRegistry("host-receiver",10991);
				receiver = (IReceiver) registry.lookup("Receiver");
			}
			else {
				return;
			}
			//
			List<Message> messagesCopy = new ArrayList<>(messages.size());
			messagesCopy.addAll(messages);
			//
			for (int i = 0; i < messagesCopy.size(); i++) {
				Message msg = messagesCopy.get(i);
				MessageResult result = receiver.result(msg.getId());
				if (result != null){
					resultRepository.add(result);
					repository.remove(msg);
				}
			}
		}
		catch(NotBoundException | IOException e){
			e.printStackTrace();
		}
		
	}

}
