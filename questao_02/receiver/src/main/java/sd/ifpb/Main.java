package sd.ifpb;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		//
		System.out.println("Inicializando o receiver");
		//
		ResponseMessageRepository repository = new ResponseMessageRepository();
		//
		//inicializar o serviço para client app
		Server serverSender = ServerBuilder.forPort(10991)
				.addService(new Receiver(repository))
				.build();
		serverSender.start();
		serverSender.awaitTermination();
	}
	
}
