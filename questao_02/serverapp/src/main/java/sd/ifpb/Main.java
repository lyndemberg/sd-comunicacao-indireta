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
		System.out.println("Servidor inicializado");
		//

		//inicializar o serviço para server app
		Server serverSender = ServerBuilder.forPort(10992)
				.addService(new ServerApp())
				.build();
		serverSender.start();
		serverSender.awaitTermination();
	}
	
}
