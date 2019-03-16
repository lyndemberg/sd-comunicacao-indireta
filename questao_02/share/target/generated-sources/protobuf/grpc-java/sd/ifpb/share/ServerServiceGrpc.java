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
public final class ServerServiceGrpc {

  private ServerServiceGrpc() {}

  public static final String SERVICE_NAME = "sd.ifpb.share.ServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sd.ifpb.share.Message,
      sd.ifpb.share.MessageResult> getPrintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "print",
      requestType = sd.ifpb.share.Message.class,
      responseType = sd.ifpb.share.MessageResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sd.ifpb.share.Message,
      sd.ifpb.share.MessageResult> getPrintMethod() {
    io.grpc.MethodDescriptor<sd.ifpb.share.Message, sd.ifpb.share.MessageResult> getPrintMethod;
    if ((getPrintMethod = ServerServiceGrpc.getPrintMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getPrintMethod = ServerServiceGrpc.getPrintMethod) == null) {
          ServerServiceGrpc.getPrintMethod = getPrintMethod = 
              io.grpc.MethodDescriptor.<sd.ifpb.share.Message, sd.ifpb.share.MessageResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sd.ifpb.share.ServerService", "print"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sd.ifpb.share.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sd.ifpb.share.MessageResult.getDefaultInstance()))
                  .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("print"))
                  .build();
          }
        }
     }
     return getPrintMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerServiceStub newStub(io.grpc.Channel channel) {
    return new ServerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ServerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void print(sd.ifpb.share.Message request,
        io.grpc.stub.StreamObserver<sd.ifpb.share.MessageResult> responseObserver) {
      asyncUnimplementedUnaryCall(getPrintMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPrintMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sd.ifpb.share.Message,
                sd.ifpb.share.MessageResult>(
                  this, METHODID_PRINT)))
          .build();
    }
  }

  /**
   */
  public static final class ServerServiceStub extends io.grpc.stub.AbstractStub<ServerServiceStub> {
    private ServerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerServiceStub(channel, callOptions);
    }

    /**
     */
    public void print(sd.ifpb.share.Message request,
        io.grpc.stub.StreamObserver<sd.ifpb.share.MessageResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrintMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServerServiceBlockingStub extends io.grpc.stub.AbstractStub<ServerServiceBlockingStub> {
    private ServerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sd.ifpb.share.MessageResult print(sd.ifpb.share.Message request) {
      return blockingUnaryCall(
          getChannel(), getPrintMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServerServiceFutureStub extends io.grpc.stub.AbstractStub<ServerServiceFutureStub> {
    private ServerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sd.ifpb.share.MessageResult> print(
        sd.ifpb.share.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getPrintMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRINT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRINT:
          serviceImpl.print((sd.ifpb.share.Message) request,
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

  private static abstract class ServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sd.ifpb.share.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerService");
    }
  }

  private static final class ServerServiceFileDescriptorSupplier
      extends ServerServiceBaseDescriptorSupplier {
    ServerServiceFileDescriptorSupplier() {}
  }

  private static final class ServerServiceMethodDescriptorSupplier
      extends ServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerServiceFileDescriptorSupplier())
              .addMethod(getPrintMethod())
              .build();
        }
      }
    }
    return result;
  }
}
