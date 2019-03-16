package sd.ifpb.share;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: services.proto")
public final class SenderServiceGrpc {

  private SenderServiceGrpc() {}

  public static final String SERVICE_NAME = "sd.ifpb.share.SenderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sd.ifpb.share.Message,
      sd.ifpb.share.MessageResult> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = sd.ifpb.share.Message.class,
      responseType = sd.ifpb.share.MessageResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sd.ifpb.share.Message,
      sd.ifpb.share.MessageResult> getSendMessageMethod() {
    io.grpc.MethodDescriptor<sd.ifpb.share.Message, sd.ifpb.share.MessageResult> getSendMessageMethod;
    if ((getSendMessageMethod = SenderServiceGrpc.getSendMessageMethod) == null) {
      synchronized (SenderServiceGrpc.class) {
        if ((getSendMessageMethod = SenderServiceGrpc.getSendMessageMethod) == null) {
          SenderServiceGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<sd.ifpb.share.Message, sd.ifpb.share.MessageResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sd.ifpb.share.SenderService", "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sd.ifpb.share.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sd.ifpb.share.MessageResult.getDefaultInstance()))
                  .setSchemaDescriptor(new SenderServiceMethodDescriptorSupplier("sendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SenderServiceStub newStub(io.grpc.Channel channel) {
    return new SenderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SenderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SenderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SenderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SenderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SenderServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *    rpc getMessage(Id) returns (MessageResult);
     * </pre>
     */
    public void sendMessage(sd.ifpb.share.Message request,
        io.grpc.stub.StreamObserver<sd.ifpb.share.MessageResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sd.ifpb.share.Message,
                sd.ifpb.share.MessageResult>(
                  this, METHODID_SEND_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class SenderServiceStub extends io.grpc.stub.AbstractStub<SenderServiceStub> {
    private SenderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SenderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SenderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SenderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc getMessage(Id) returns (MessageResult);
     * </pre>
     */
    public void sendMessage(sd.ifpb.share.Message request,
        io.grpc.stub.StreamObserver<sd.ifpb.share.MessageResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SenderServiceBlockingStub extends io.grpc.stub.AbstractStub<SenderServiceBlockingStub> {
    private SenderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SenderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SenderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SenderServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc getMessage(Id) returns (MessageResult);
     * </pre>
     */
    public sd.ifpb.share.MessageResult sendMessage(sd.ifpb.share.Message request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SenderServiceFutureStub extends io.grpc.stub.AbstractStub<SenderServiceFutureStub> {
    private SenderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SenderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SenderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SenderServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc getMessage(Id) returns (MessageResult);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<sd.ifpb.share.MessageResult> sendMessage(
        sd.ifpb.share.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SenderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SenderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((sd.ifpb.share.Message) request,
              (io.grpc.stub.StreamObserver<sd.ifpb.share.MessageResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SenderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sd.ifpb.share.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SenderService");
    }
  }

  private static final class SenderServiceFileDescriptorSupplier
      extends SenderServiceBaseDescriptorSupplier {
    SenderServiceFileDescriptorSupplier() {}
  }

  private static final class SenderServiceMethodDescriptorSupplier
      extends SenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SenderServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SenderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SenderServiceFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
