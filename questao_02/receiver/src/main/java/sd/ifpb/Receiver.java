package sd.ifpb;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import sd.ifpb.share.Message;
import sd.ifpb.share.MessageResult;

@SuppressWarnings("serial")
public class Receiver extends sd.ifpb.share.ReceiverServiceGrpc.ReceiverServiceImplBase {

	private final ManagedChannel serverChannel;
	private sd.ifpb.share.ServerServiceGrpc.ServerServiceStub serverServiceStub;

	protected Receiver(){
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
				responseObserver.onError(throwable);
			}

			@Override
			public void onCompleted() {
				responseObserver.onNext(result);
				responseObserver.onCompleted();
			}
		});
	}
	
}
