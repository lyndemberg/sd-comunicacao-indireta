package sd.ifpb;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import sd.ifpb.share.Message;
import sd.ifpb.share.MessageResult;
import sd.ifpb.share.SenderServiceGrpc;
import sd.ifpb.share.Void;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
	//utilizado so para comparar o tempo em relaçao a RMI
	private static volatile int count = 0;
	private static long tempoInicial;

	private static void sendAndResultMessage(String id, String text, SenderServiceGrpc.SenderServiceStub sender){
		//
		Message build = Message.newBuilder()
				.setId(id)
				.setText(text)
				.build();

		sender.sendMessage(build, new StreamObserver<MessageResult>() {
			private MessageResult result;
			@Override
			public void onNext(MessageResult messageResult) {
				this.result = messageResult;
			}

			@Override
			public void onError(Throwable throwable) {
			}

			@Override
			public void onCompleted() {
				System.out.println("Recebido resultado para mensagem " + result.getId() + ": " + result.getHash());
				count++;
			}
		});
	}

	public static void main(String[] args){
		//log
		System.out.println("Acionado o clientapp");

		//recuperação do SenderService
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 10990)
				.usePlaintext()
				.build();
		SenderServiceGrpc.SenderServiceStub stubSender
				= SenderServiceGrpc.newStub(channel);

		String id = "askjdlkasjd";
		String text = "Hello World!";

		tempoInicial = System.currentTimeMillis();
		for (int i = 0; i < 100; i++){

			final String ix = id + "#" + i;
			final String mx = text + "#" + i;

			sendAndResultMessage(ix, mx, stubSender);
		}

		//para a aplicaçao cliente nao morrer ja que todos os envios sao assincronos
		while(true){
			if(count==100){
				break;
			}
		}
		imprimirTempo();

	}

	private static void imprimirTempo(){
		long t1 = System.currentTimeMillis();
		long tempoTotal = t1 - tempoInicial;
		System.out.println(" - Durou: " + tempoTotal);
	}
	
}
