package sd.ifpb;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import sd.ifpb.share.Message;
import sd.ifpb.share.MessageResult;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class Receiver extends sd.ifpb.share.ReceiverServiceGrpc.ReceiverServiceImplBase {

	private final ManagedChannel serverChannel;
	private final ResponseMessageRepository repository;
	private sd.ifpb.share.ServerServiceGrpc.ServerServiceStub serverServiceStub;

	protected Receiver(ResponseMessageRepository repository) throws RemoteException {
		this.repository = repository;
		this.serverChannel = ManagedChannelBuilder.forAddress("serverapp", 10992)
				.usePlaintext()
				.build();
	}

	@Override
	public void delivery(Message request, StreamObserver<MessageResult> responseObserver) {
		System.out.println("Recebendo uma mensagem e tentando encaminhar para o server.");
		serverServiceStub = sd.ifpb.share.ServerServiceGrpc.newStub(serverChannel);
		serverServiceStub.print(request, new StreamObserver<MessageResult>() {
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
				responseObserver.onNext(result);
				responseObserver.onCompleted();
			}
		});
	}

	//	@Override
//	public void delivery(Message msg) throws RemoteException {
//		//
//		System.out.println("Recebendo uma mensagem e tentando encaminhar para o server.");
//		//
//		Registry registry =  LocateRegistry.getRegistry(10992);
//		try {
//			IServerApp serverApp = (IServerApp) registry.lookup("ServerApp");
//			MessageResult result = serverApp.print(msg);
//			repository.add(result);
//		}
//		catch(NotBoundException | AccessException e){
//			throw new RuntimeException("Foi mal!!");
//		}
//
//	}
//
//	@Override
//	public MessageResult result(String id) throws RemoteException {
//		return repository.get(id);
//	}

	
}
