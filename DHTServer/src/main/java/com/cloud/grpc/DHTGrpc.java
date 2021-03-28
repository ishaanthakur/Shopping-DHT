package com.cloud.grpc;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: DHT.proto")
public final class DHTGrpc {

  private DHTGrpc() {}

  public static final String SERVICE_NAME = "DHT";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cloud.grpc.DHTOuterClass.getRequest,
      com.cloud.grpc.DHTOuterClass.getResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.cloud.grpc.DHTOuterClass.getRequest.class,
      responseType = com.cloud.grpc.DHTOuterClass.getResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.grpc.DHTOuterClass.getRequest,
      com.cloud.grpc.DHTOuterClass.getResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.cloud.grpc.DHTOuterClass.getRequest, com.cloud.grpc.DHTOuterClass.getResponse> getGetMethod;
    if ((getGetMethod = DHTGrpc.getGetMethod) == null) {
      synchronized (DHTGrpc.class) {
        if ((getGetMethod = DHTGrpc.getGetMethod) == null) {
          DHTGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<com.cloud.grpc.DHTOuterClass.getRequest, com.cloud.grpc.DHTOuterClass.getResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DHT", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.grpc.DHTOuterClass.getRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.grpc.DHTOuterClass.getResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DHTMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cloud.grpc.DHTOuterClass.putRequest,
      com.cloud.grpc.DHTOuterClass.putResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = com.cloud.grpc.DHTOuterClass.putRequest.class,
      responseType = com.cloud.grpc.DHTOuterClass.putResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.grpc.DHTOuterClass.putRequest,
      com.cloud.grpc.DHTOuterClass.putResponse> getPutMethod() {
    io.grpc.MethodDescriptor<com.cloud.grpc.DHTOuterClass.putRequest, com.cloud.grpc.DHTOuterClass.putResponse> getPutMethod;
    if ((getPutMethod = DHTGrpc.getPutMethod) == null) {
      synchronized (DHTGrpc.class) {
        if ((getPutMethod = DHTGrpc.getPutMethod) == null) {
          DHTGrpc.getPutMethod = getPutMethod = 
              io.grpc.MethodDescriptor.<com.cloud.grpc.DHTOuterClass.putRequest, com.cloud.grpc.DHTOuterClass.putResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DHT", "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.grpc.DHTOuterClass.putRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.grpc.DHTOuterClass.putResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DHTMethodDescriptorSupplier("put"))
                  .build();
          }
        }
     }
     return getPutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DHTStub newStub(io.grpc.Channel channel) {
    return new DHTStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DHTBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DHTBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DHTFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DHTFutureStub(channel);
  }

  /**
   */
  public static abstract class DHTImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(com.cloud.grpc.DHTOuterClass.getRequest request,
        io.grpc.stub.StreamObserver<com.cloud.grpc.DHTOuterClass.getResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void put(com.cloud.grpc.DHTOuterClass.putRequest request,
        io.grpc.stub.StreamObserver<com.cloud.grpc.DHTOuterClass.putResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.grpc.DHTOuterClass.getRequest,
                com.cloud.grpc.DHTOuterClass.getResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.grpc.DHTOuterClass.putRequest,
                com.cloud.grpc.DHTOuterClass.putResponse>(
                  this, METHODID_PUT)))
          .build();
    }
  }

  /**
   */
  public static final class DHTStub extends io.grpc.stub.AbstractStub<DHTStub> {
    private DHTStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DHTStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DHTStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DHTStub(channel, callOptions);
    }

    /**
     */
    public void get(com.cloud.grpc.DHTOuterClass.getRequest request,
        io.grpc.stub.StreamObserver<com.cloud.grpc.DHTOuterClass.getResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void put(com.cloud.grpc.DHTOuterClass.putRequest request,
        io.grpc.stub.StreamObserver<com.cloud.grpc.DHTOuterClass.putResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DHTBlockingStub extends io.grpc.stub.AbstractStub<DHTBlockingStub> {
    private DHTBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DHTBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DHTBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DHTBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cloud.grpc.DHTOuterClass.getResponse get(com.cloud.grpc.DHTOuterClass.getRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cloud.grpc.DHTOuterClass.putResponse put(com.cloud.grpc.DHTOuterClass.putRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DHTFutureStub extends io.grpc.stub.AbstractStub<DHTFutureStub> {
    private DHTFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DHTFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DHTFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DHTFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.grpc.DHTOuterClass.getResponse> get(
        com.cloud.grpc.DHTOuterClass.getRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.grpc.DHTOuterClass.putResponse> put(
        com.cloud.grpc.DHTOuterClass.putRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_PUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DHTImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DHTImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.cloud.grpc.DHTOuterClass.getRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.grpc.DHTOuterClass.getResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((com.cloud.grpc.DHTOuterClass.putRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.grpc.DHTOuterClass.putResponse>) responseObserver);
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

  private static abstract class DHTBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DHTBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cloud.grpc.DHTOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DHT");
    }
  }

  private static final class DHTFileDescriptorSupplier
      extends DHTBaseDescriptorSupplier {
    DHTFileDescriptorSupplier() {}
  }

  private static final class DHTMethodDescriptorSupplier
      extends DHTBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DHTMethodDescriptorSupplier(String methodName) {
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
      synchronized (DHTGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DHTFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getPutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
