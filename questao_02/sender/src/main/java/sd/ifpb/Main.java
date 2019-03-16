package sd.ifpb;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import sd.ifpb.repositories.MessageRepository;
import sd.ifpb.repositories.MessageResultRepository;
import sd.ifpb.repositories.SendedMessageRepository;

import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		//log
		System.out.println("Inicializado o serviço de Sender");
		//inicializar o repositorio
		MessageRepository repository = new MessageRepository();
//		SendedMessageRepository sendedMessageRepository = new SendedMessageRepository();
//		MessageResultRepository resultRepository = new MessageResultRepository();
//		//inicializar o gerenciador de tarefas
//		TaskManager.runTask(repository, sendedMessageRepository, resultRepository);

		//inicializar o serviço para client app
		Server serverSender = ServerBuilder.forPort(10990)
				.addService(new SenderImpl(repository))
				.build();
		serverSender.start();
		serverSender.awaitTermination();
	}
}
