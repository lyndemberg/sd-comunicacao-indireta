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
public final class ReceiverServiceGrpc {

  private ReceiverServiceGrpc() {}

  public static final String SERVICE_NAME = "sd.ifpb.share.ReceiverService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sd.ifpb.share.Message,
      sd.ifpb.share.MessageResult> getDeliveryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delivery",
      requestType = sd.ifpb.share.Message.class,
      responseType = sd.ifpb.share.MessageResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sd.ifpb.share.Message,
      sd.ifpb.share.MessageResult> getDeliveryMethod() {
    io.grpc.MethodDescriptor<sd.ifpb.share.Message, sd.ifpb.share.MessageResult> getDeliveryMethod;
    if ((getDeliveryMethod = ReceiverServiceGrpc.getDeliveryMethod) == null) {
      synchronized (ReceiverServiceGrpc.class) {
        if ((getDeliveryMethod = ReceiverServiceGrpc.getDeliveryMethod) == null) {
          ReceiverServiceGrpc.getDeliveryMethod = getDeliveryMethod = 
              io.grpc.MethodDescriptor.<sd.ifpb.share.Message, sd.ifpb.share.MessageResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sd.ifpb.share.ReceiverService", "delivery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sd.ifpb.share.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sd.ifpb.share.MessageResult.getDefaultInstance()))
                  .setSchemaDescriptor(new ReceiverServiceMethodDescriptorSupplier("delivery"))
                  .build();
          }
        }
     }
     return getDeliveryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReceiverServiceStub newStub(io.grpc.Channel channel) {
    return new ReceiverServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReceiverServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReceiverServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReceiverServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReceiverServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReceiverServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *    rpc result(Id) returns (MessageResult);
     * </pre>
     */
    public void delivery(sd.ifpb.share.Message request,
        io.grpc.stub.StreamObserver<sd.ifpb.share.MessageResult> responseObserver) {
      asyncUnimplementedUnaryCall(getDeliveryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeliveryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sd.ifpb.share.Message,
                sd.ifpb.share.MessageResult>(
                  this, METHODID_DELIVERY)))
          .build();
    }
  }

  /**
   */
  public static final class ReceiverServiceStub extends io.grpc.stub.AbstractStub<ReceiverServiceStub> {
    private ReceiverServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReceiverServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReceiverServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReceiverServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc result(Id) returns (MessageResult);
     * </pre>
     */
    public void delivery(sd.ifpb.share.Message request,
        io.grpc.stub.StreamObserver<sd.ifpb.share.MessageResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeliveryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReceiverServiceBlockingStub extends io.grpc.stub.AbstractStub<ReceiverServiceBlockingStub> {
    private ReceiverServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReceiverServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReceiverServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReceiverServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc result(Id) returns (MessageResult);
     * </pre>
     */
    public sd.ifpb.share.MessageResult delivery(sd.ifpb.share.Message request) {
      return blockingUnaryCall(
          getChannel(), getDeliveryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReceiverServiceFutureStub extends io.grpc.stub.AbstractStub<ReceiverServiceFutureStub> {
    private ReceiverServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReceiverServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReceiverServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReceiverServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc result(Id) returns (MessageResult);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<sd.ifpb.share.MessageResult> delivery(
        sd.ifpb.share.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getDeliveryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELIVERY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReceiverServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReceiverServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELIVERY:
          serviceImpl.delivery((sd.ifpb.share.Message) request,
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

  private static abstract class ReceiverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReceiverServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sd.ifpb.share.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReceiverService");
    }
  }

  private static final class ReceiverServiceFileDescriptorSupplier
      extends ReceiverServiceBaseDescriptorSupplier {
    ReceiverServiceFileDescriptorSupplier() {}
  }

  private static final class ReceiverServiceMethodDescriptorSupplier
      extends ReceiverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReceiverServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReceiverServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReceiverServiceFileDescriptorSupplier())
              .addMethod(getDeliveryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
