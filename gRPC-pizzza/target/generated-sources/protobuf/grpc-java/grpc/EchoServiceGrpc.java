package grpc;

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
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: hello.proto")
public final class EchoServiceGrpc {

  private EchoServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.EchoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.pizzaRequest,
      grpc.pizzaResponse> getPilistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pilist",
      requestType = grpc.pizzaRequest.class,
      responseType = grpc.pizzaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.pizzaRequest,
      grpc.pizzaResponse> getPilistMethod() {
    io.grpc.MethodDescriptor<grpc.pizzaRequest, grpc.pizzaResponse> getPilistMethod;
    if ((getPilistMethod = EchoServiceGrpc.getPilistMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getPilistMethod = EchoServiceGrpc.getPilistMethod) == null) {
          EchoServiceGrpc.getPilistMethod = getPilistMethod =
              io.grpc.MethodDescriptor.<grpc.pizzaRequest, grpc.pizzaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pilist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.pizzaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.pizzaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("pilist"))
              .build();
        }
      }
    }
    return getPilistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newPizzaRequest,
      grpc.newPizzaResponse> getPizaddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pizadd",
      requestType = grpc.newPizzaRequest.class,
      responseType = grpc.newPizzaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.newPizzaRequest,
      grpc.newPizzaResponse> getPizaddMethod() {
    io.grpc.MethodDescriptor<grpc.newPizzaRequest, grpc.newPizzaResponse> getPizaddMethod;
    if ((getPizaddMethod = EchoServiceGrpc.getPizaddMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getPizaddMethod = EchoServiceGrpc.getPizaddMethod) == null) {
          EchoServiceGrpc.getPizaddMethod = getPizaddMethod =
              io.grpc.MethodDescriptor.<grpc.newPizzaRequest, grpc.newPizzaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pizadd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newPizzaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newPizzaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("pizadd"))
              .build();
        }
      }
    }
    return getPizaddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.delRequest,
      grpc.delResponse> getPidelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pidel",
      requestType = grpc.delRequest.class,
      responseType = grpc.delResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.delRequest,
      grpc.delResponse> getPidelMethod() {
    io.grpc.MethodDescriptor<grpc.delRequest, grpc.delResponse> getPidelMethod;
    if ((getPidelMethod = EchoServiceGrpc.getPidelMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getPidelMethod = EchoServiceGrpc.getPidelMethod) == null) {
          EchoServiceGrpc.getPidelMethod = getPidelMethod =
              io.grpc.MethodDescriptor.<grpc.delRequest, grpc.delResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pidel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.delRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.delResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("pidel"))
              .build();
        }
      }
    }
    return getPidelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.orderRequest,
      grpc.orderResponse> getOrderpizaaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "orderpizaa",
      requestType = grpc.orderRequest.class,
      responseType = grpc.orderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.orderRequest,
      grpc.orderResponse> getOrderpizaaMethod() {
    io.grpc.MethodDescriptor<grpc.orderRequest, grpc.orderResponse> getOrderpizaaMethod;
    if ((getOrderpizaaMethod = EchoServiceGrpc.getOrderpizaaMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getOrderpizaaMethod = EchoServiceGrpc.getOrderpizaaMethod) == null) {
          EchoServiceGrpc.getOrderpizaaMethod = getOrderpizaaMethod =
              io.grpc.MethodDescriptor.<grpc.orderRequest, grpc.orderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "orderpizaa"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.orderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.orderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("orderpizaa"))
              .build();
        }
      }
    }
    return getOrderpizaaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.numRequest,
      grpc.numResponse> getNumclientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "numclient",
      requestType = grpc.numRequest.class,
      responseType = grpc.numResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.numRequest,
      grpc.numResponse> getNumclientMethod() {
    io.grpc.MethodDescriptor<grpc.numRequest, grpc.numResponse> getNumclientMethod;
    if ((getNumclientMethod = EchoServiceGrpc.getNumclientMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getNumclientMethod = EchoServiceGrpc.getNumclientMethod) == null) {
          EchoServiceGrpc.getNumclientMethod = getNumclientMethod =
              io.grpc.MethodDescriptor.<grpc.numRequest, grpc.numResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "numclient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.numRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.numResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("numclient"))
              .build();
        }
      }
    }
    return getNumclientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.numEmplRequest,
      grpc.numEmplResponse> getNumemployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "numemployee",
      requestType = grpc.numEmplRequest.class,
      responseType = grpc.numEmplResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.numEmplRequest,
      grpc.numEmplResponse> getNumemployeeMethod() {
    io.grpc.MethodDescriptor<grpc.numEmplRequest, grpc.numEmplResponse> getNumemployeeMethod;
    if ((getNumemployeeMethod = EchoServiceGrpc.getNumemployeeMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getNumemployeeMethod = EchoServiceGrpc.getNumemployeeMethod) == null) {
          EchoServiceGrpc.getNumemployeeMethod = getNumemployeeMethod =
              io.grpc.MethodDescriptor.<grpc.numEmplRequest, grpc.numEmplResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "numemployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.numEmplRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.numEmplResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("numemployee"))
              .build();
        }
      }
    }
    return getNumemployeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EchoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoServiceStub>() {
        @java.lang.Override
        public EchoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoServiceStub(channel, callOptions);
        }
      };
    return EchoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EchoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoServiceBlockingStub>() {
        @java.lang.Override
        public EchoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoServiceBlockingStub(channel, callOptions);
        }
      };
    return EchoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EchoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoServiceFutureStub>() {
        @java.lang.Override
        public EchoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoServiceFutureStub(channel, callOptions);
        }
      };
    return EchoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EchoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void pilist(grpc.pizzaRequest request,
        io.grpc.stub.StreamObserver<grpc.pizzaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPilistMethod(), responseObserver);
    }

    /**
     */
    public void pizadd(grpc.newPizzaRequest request,
        io.grpc.stub.StreamObserver<grpc.newPizzaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPizaddMethod(), responseObserver);
    }

    /**
     */
    public void pidel(grpc.delRequest request,
        io.grpc.stub.StreamObserver<grpc.delResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPidelMethod(), responseObserver);
    }

    /**
     */
    public void orderpizaa(grpc.orderRequest request,
        io.grpc.stub.StreamObserver<grpc.orderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOrderpizaaMethod(), responseObserver);
    }

    /**
     */
    public void numclient(grpc.numRequest request,
        io.grpc.stub.StreamObserver<grpc.numResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNumclientMethod(), responseObserver);
    }

    /**
     */
    public void numemployee(grpc.numEmplRequest request,
        io.grpc.stub.StreamObserver<grpc.numEmplResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNumemployeeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPilistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.pizzaRequest,
                grpc.pizzaResponse>(
                  this, METHODID_PILIST)))
          .addMethod(
            getPizaddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.newPizzaRequest,
                grpc.newPizzaResponse>(
                  this, METHODID_PIZADD)))
          .addMethod(
            getPidelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.delRequest,
                grpc.delResponse>(
                  this, METHODID_PIDEL)))
          .addMethod(
            getOrderpizaaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.orderRequest,
                grpc.orderResponse>(
                  this, METHODID_ORDERPIZAA)))
          .addMethod(
            getNumclientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.numRequest,
                grpc.numResponse>(
                  this, METHODID_NUMCLIENT)))
          .addMethod(
            getNumemployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.numEmplRequest,
                grpc.numEmplResponse>(
                  this, METHODID_NUMEMPLOYEE)))
          .build();
    }
  }

  /**
   */
  public static final class EchoServiceStub extends io.grpc.stub.AbstractAsyncStub<EchoServiceStub> {
    private EchoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoServiceStub(channel, callOptions);
    }

    /**
     */
    public void pilist(grpc.pizzaRequest request,
        io.grpc.stub.StreamObserver<grpc.pizzaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPilistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pizadd(grpc.newPizzaRequest request,
        io.grpc.stub.StreamObserver<grpc.newPizzaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPizaddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pidel(grpc.delRequest request,
        io.grpc.stub.StreamObserver<grpc.delResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPidelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void orderpizaa(grpc.orderRequest request,
        io.grpc.stub.StreamObserver<grpc.orderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOrderpizaaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void numclient(grpc.numRequest request,
        io.grpc.stub.StreamObserver<grpc.numResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNumclientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void numemployee(grpc.numEmplRequest request,
        io.grpc.stub.StreamObserver<grpc.numEmplResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNumemployeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EchoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EchoServiceBlockingStub> {
    private EchoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.pizzaResponse pilist(grpc.pizzaRequest request) {
      return blockingUnaryCall(
          getChannel(), getPilistMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.newPizzaResponse pizadd(grpc.newPizzaRequest request) {
      return blockingUnaryCall(
          getChannel(), getPizaddMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.delResponse pidel(grpc.delRequest request) {
      return blockingUnaryCall(
          getChannel(), getPidelMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.orderResponse orderpizaa(grpc.orderRequest request) {
      return blockingUnaryCall(
          getChannel(), getOrderpizaaMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.numResponse numclient(grpc.numRequest request) {
      return blockingUnaryCall(
          getChannel(), getNumclientMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.numEmplResponse numemployee(grpc.numEmplRequest request) {
      return blockingUnaryCall(
          getChannel(), getNumemployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EchoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EchoServiceFutureStub> {
    private EchoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.pizzaResponse> pilist(
        grpc.pizzaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPilistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.newPizzaResponse> pizadd(
        grpc.newPizzaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPizaddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.delResponse> pidel(
        grpc.delRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPidelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.orderResponse> orderpizaa(
        grpc.orderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOrderpizaaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.numResponse> numclient(
        grpc.numRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNumclientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.numEmplResponse> numemployee(
        grpc.numEmplRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNumemployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PILIST = 0;
  private static final int METHODID_PIZADD = 1;
  private static final int METHODID_PIDEL = 2;
  private static final int METHODID_ORDERPIZAA = 3;
  private static final int METHODID_NUMCLIENT = 4;
  private static final int METHODID_NUMEMPLOYEE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EchoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EchoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PILIST:
          serviceImpl.pilist((grpc.pizzaRequest) request,
              (io.grpc.stub.StreamObserver<grpc.pizzaResponse>) responseObserver);
          break;
        case METHODID_PIZADD:
          serviceImpl.pizadd((grpc.newPizzaRequest) request,
              (io.grpc.stub.StreamObserver<grpc.newPizzaResponse>) responseObserver);
          break;
        case METHODID_PIDEL:
          serviceImpl.pidel((grpc.delRequest) request,
              (io.grpc.stub.StreamObserver<grpc.delResponse>) responseObserver);
          break;
        case METHODID_ORDERPIZAA:
          serviceImpl.orderpizaa((grpc.orderRequest) request,
              (io.grpc.stub.StreamObserver<grpc.orderResponse>) responseObserver);
          break;
        case METHODID_NUMCLIENT:
          serviceImpl.numclient((grpc.numRequest) request,
              (io.grpc.stub.StreamObserver<grpc.numResponse>) responseObserver);
          break;
        case METHODID_NUMEMPLOYEE:
          serviceImpl.numemployee((grpc.numEmplRequest) request,
              (io.grpc.stub.StreamObserver<grpc.numEmplResponse>) responseObserver);
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

  private static abstract class EchoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EchoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.EchoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EchoService");
    }
  }

  private static final class EchoServiceFileDescriptorSupplier
      extends EchoServiceBaseDescriptorSupplier {
    EchoServiceFileDescriptorSupplier() {}
  }

  private static final class EchoServiceMethodDescriptorSupplier
      extends EchoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EchoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EchoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EchoServiceFileDescriptorSupplier())
              .addMethod(getPilistMethod())
              .addMethod(getPizaddMethod())
              .addMethod(getPidelMethod())
              .addMethod(getOrderpizaaMethod())
              .addMethod(getNumclientMethod())
              .addMethod(getNumemployeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
