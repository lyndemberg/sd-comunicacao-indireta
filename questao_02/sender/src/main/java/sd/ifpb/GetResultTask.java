//package sd.ifpb;
//
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import sd.ifpb.repositories.MessageResultRepository;
//import sd.ifpb.repositories.SendedMessageRepository;
//import sd.ifpb.share.Id;
//import sd.ifpb.share.ReceiverServiceGrpc;
//
//import java.io.IOException;
//import java.rmi.NotBoundException;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.TimerTask;
//
//
//public class GetResultTask extends TimerTask {
//	private final SendedMessageRepository repository;
//	private final MessageResultRepository resultRepository;
//
//	public GetResultTask(SendedMessageRepository rep, MessageResultRepository result) {
//		this.resultRepository = result;
//		this.repository = rep;
//	}
//
//	@Override
//	public void run() {
//		//
//		System.out.println("Executando tarefa de obter o resultado.");
//		ManagedChannel channel = ManagedChannelBuilder.forAddress("serverapp", 10991)
//				.usePlaintext()
//				.build();
//		//
//		List<sd.ifpb.share.Message> messages = repository.list();
//		//
//		ReceiverServiceGrpc.ReceiverServiceStub receiver;
//		if (messages.size() > 0){
//			receiver = ReceiverServiceGrpc.newStub(channel);
//		}
//		else {
//			return;
//		}
//		//
//		List<sd.ifpb.share.Message> messagesCopy = new ArrayList<>(messages.size());
//		messagesCopy.addAll(messages);
//		//
//		for (int i = 0; i < messagesCopy.size(); i++) {
//			sd.ifpb.share.Message msg = messagesCopy.get(i);
//			sd.ifpb.share.MessageResult result = receiver.result(Id.newBuilder().setId(msg.getId()).build());
//			if (result != null){
//				resultRepository.add(result);
//				repository.remove(msg);
//			}
//		}
//
//	}
//
//}
