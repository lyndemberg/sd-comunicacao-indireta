package sd.ifpb;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import sd.ifpb.repositories.MessageRepository;
import sd.ifpb.share.Message;
import sd.ifpb.share.MessageResult;
import sd.ifpb.share.ReceiverServiceGrpc;

@SuppressWarnings("serial")
public class SenderImpl extends sd.ifpb.share.SenderServiceGrpc.SenderServiceImplBase {

	private final ManagedChannel receiverChannel;
	private final MessageRepository repository;
	private ReceiverServiceGrpc.ReceiverServiceStub receiverServiceStub;
	
	public SenderImpl(MessageRepository rep){
		this.repository = rep;
		this.receiverChannel = ManagedChannelBuilder.forAddress("serverapp", 10991)
							.usePlaintext()
							.build();
	}

	@Override
	public void sendMessage(Message request, StreamObserver<MessageResult> responseObserver) {
		//save local
		repository.add(request);

		//send to receiver
		receiverServiceStub = ReceiverServiceGrpc.newStub(receiverChannel);
		receiverServiceStub.delivery(request, new StreamObserver<MessageResult>() {
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
				//remove local
				repository.remove(request);
			}
		});
	}

}
