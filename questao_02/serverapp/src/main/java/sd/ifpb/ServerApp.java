package sd.ifpb;

import io.grpc.stub.StreamObserver;
import sd.ifpb.share.MessageResult;
import sd.ifpb.share.ServerServiceGrpc;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SuppressWarnings("serial")
public class ServerApp extends ServerServiceGrpc.ServerServiceImplBase {

	@Override
	public void print(sd.ifpb.share.Message request, StreamObserver<sd.ifpb.share.MessageResult> responseObserver) {
		MessageDigest msd = null;
		try {
			msd = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Erro no MD5");
			responseObserver.onError(e);
		}
		//
		byte[] bhash = msd.digest(request.getText().getBytes());
		BigInteger bi = new BigInteger(bhash);
		//
		sd.ifpb.share.MessageResult result = MessageResult.newBuilder()
							.setId(request.getId()).setHash(bi.toString(16)).build();
		//
		System.out.println(request.getId() + " " + request.getText());
		//
		responseObserver.onNext(result);
		responseObserver.onCompleted();
	}

//	@Override
//	public MessageResult print(Message msg) throws RemoteException {
//		//
//		MessageDigest msd;
//		try {
//			msd = MessageDigest.getInstance("MD5");
//		} catch (NoSuchAlgorithmException e) {
//			throw new RemoteException("Erro de MD5", e);
//		}
//		//
//		byte[] bhash = msd.digest(msg.getText().getBytes());
//		BigInteger bi = new BigInteger(bhash);
//		//
//		MessageResult result = new MessageResult(msg.getId(), bi.toString(16));
//		//
//		System.out.println(msg.getId() + " " + msg.getText());
//		//
//		return result;
//
//	}

}
