package sd.ifpb;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import sd.ifpb.repositories.MessageRepository;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		//log
		System.out.println("Inicializado o serviço de Sender");
		//inicializar o repositorio
		MessageRepository repository = new MessageRepository();
		//inicializar o serviço para sender
		Server serverSender = ServerBuilder.forPort(10990)
				.addService(new SenderImpl(repository))
				.build();
		serverSender.start();
		serverSender.awaitTermination();
	}
}
