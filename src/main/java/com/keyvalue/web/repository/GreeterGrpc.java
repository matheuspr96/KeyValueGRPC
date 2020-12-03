package com.keyvalue.web.repository;

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
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: helloworld.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.keyvalue.web.repository.HelloRequest,
      com.keyvalue.web.repository.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.keyvalue.web.repository.HelloRequest.class,
      responseType = com.keyvalue.web.repository.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.keyvalue.web.repository.HelloRequest,
      com.keyvalue.web.repository.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.keyvalue.web.repository.HelloRequest, com.keyvalue.web.repository.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.keyvalue.web.repository.HelloRequest, com.keyvalue.web.repository.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.keyvalue.web.repository.HelloRequest,
      com.keyvalue.web.repository.HelloReply> getSayHelloAgainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloAgain",
      requestType = com.keyvalue.web.repository.HelloRequest.class,
      responseType = com.keyvalue.web.repository.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.keyvalue.web.repository.HelloRequest,
      com.keyvalue.web.repository.HelloReply> getSayHelloAgainMethod() {
    io.grpc.MethodDescriptor<com.keyvalue.web.repository.HelloRequest, com.keyvalue.web.repository.HelloReply> getSayHelloAgainMethod;
    if ((getSayHelloAgainMethod = GreeterGrpc.getSayHelloAgainMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloAgainMethod = GreeterGrpc.getSayHelloAgainMethod) == null) {
          GreeterGrpc.getSayHelloAgainMethod = getSayHelloAgainMethod =
              io.grpc.MethodDescriptor.<com.keyvalue.web.repository.HelloRequest, com.keyvalue.web.repository.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloAgain"))
              .setSampledToLocalTracing(true)
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHelloAgain"))
              .build();
        }
      }
    }
    return getSayHelloAgainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.keyvalue.web.repository.SetRequest,
      com.keyvalue.web.repository.Reply> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "set",
      requestType = com.keyvalue.web.repository.SetRequest.class,
      responseType = com.keyvalue.web.repository.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.keyvalue.web.repository.SetRequest,
      com.keyvalue.web.repository.Reply> getSetMethod() {
    io.grpc.MethodDescriptor<com.keyvalue.web.repository.SetRequest, com.keyvalue.web.repository.Reply> getSetMethod;
    if ((getSetMethod = GreeterGrpc.getSetMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSetMethod = GreeterGrpc.getSetMethod) == null) {
          GreeterGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<com.keyvalue.web.repository.SetRequest, com.keyvalue.web.repository.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "set"))
              .setSampledToLocalTracing(true)
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.keyvalue.web.repository.GetRequest,
      com.keyvalue.web.repository.Reply> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.keyvalue.web.repository.GetRequest.class,
      responseType = com.keyvalue.web.repository.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.keyvalue.web.repository.GetRequest,
      com.keyvalue.web.repository.Reply> getGetMethod() {
    io.grpc.MethodDescriptor<com.keyvalue.web.repository.GetRequest, com.keyvalue.web.repository.Reply> getGetMethod;
    if ((getGetMethod = GreeterGrpc.getGetMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getGetMethod = GreeterGrpc.getGetMethod) == null) {
          GreeterGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.keyvalue.web.repository.GetRequest, com.keyvalue.web.repository.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.keyvalue.web.repository.DelRequest,
      com.keyvalue.web.repository.Reply> getDelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "del",
      requestType = com.keyvalue.web.repository.DelRequest.class,
      responseType = com.keyvalue.web.repository.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.keyvalue.web.repository.DelRequest,
      com.keyvalue.web.repository.Reply> getDelMethod() {
    io.grpc.MethodDescriptor<com.keyvalue.web.repository.DelRequest, com.keyvalue.web.repository.Reply> getDelMethod;
    if ((getDelMethod = GreeterGrpc.getDelMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getDelMethod = GreeterGrpc.getDelMethod) == null) {
          GreeterGrpc.getDelMethod = getDelMethod =
              io.grpc.MethodDescriptor.<com.keyvalue.web.repository.DelRequest, com.keyvalue.web.repository.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "del"))
              .setSampledToLocalTracing(true)
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("del"))
              .build();
        }
      }
    }
    return getDelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.keyvalue.web.repository.DelRequestVers,
      com.keyvalue.web.repository.Reply> getDelVersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delVers",
      requestType = com.keyvalue.web.repository.DelRequestVers.class,
      responseType = com.keyvalue.web.repository.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.keyvalue.web.repository.DelRequestVers,
      com.keyvalue.web.repository.Reply> getDelVersMethod() {
    io.grpc.MethodDescriptor<com.keyvalue.web.repository.DelRequestVers, com.keyvalue.web.repository.Reply> getDelVersMethod;
    if ((getDelVersMethod = GreeterGrpc.getDelVersMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getDelVersMethod = GreeterGrpc.getDelVersMethod) == null) {
          GreeterGrpc.getDelVersMethod = getDelVersMethod =
              io.grpc.MethodDescriptor.<com.keyvalue.web.repository.DelRequestVers, com.keyvalue.web.repository.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delVers"))
              .setSampledToLocalTracing(true)
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("delVers"))
              .build();
        }
      }
    }
    return getDelVersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.keyvalue.web.repository.TestAndSetRequest,
      com.keyvalue.web.repository.Reply> getTestAndSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testAndSet",
      requestType = com.keyvalue.web.repository.TestAndSetRequest.class,
      responseType = com.keyvalue.web.repository.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.keyvalue.web.repository.TestAndSetRequest,
      com.keyvalue.web.repository.Reply> getTestAndSetMethod() {
    io.grpc.MethodDescriptor<com.keyvalue.web.repository.TestAndSetRequest, com.keyvalue.web.repository.Reply> getTestAndSetMethod;
    if ((getTestAndSetMethod = GreeterGrpc.getTestAndSetMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getTestAndSetMethod = GreeterGrpc.getTestAndSetMethod) == null) {
          GreeterGrpc.getTestAndSetMethod = getTestAndSetMethod =
              io.grpc.MethodDescriptor.<com.keyvalue.web.repository.TestAndSetRequest, com.keyvalue.web.repository.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testAndSet"))
              .setSampledToLocalTracing(true)
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("testAndSet"))
              .build();
        }
      }
    }
    return getTestAndSetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
        @java.lang.Override
        public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterStub(channel, callOptions);
        }
      };
    return GreeterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
        @java.lang.Override
        public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterBlockingStub(channel, callOptions);
        }
      };
    return GreeterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
        @java.lang.Override
        public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterFutureStub(channel, callOptions);
        }
      };
    return GreeterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.keyvalue.web.repository.HelloRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void sayHelloAgain(com.keyvalue.web.repository.HelloRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloAgainMethod(), responseObserver);
    }

    /**
     * <pre>
     *service CrudKeyValue {
     * </pre>
     */
    public void set(com.keyvalue.web.repository.SetRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     */
    public void get(com.keyvalue.web.repository.GetRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void del(com.keyvalue.web.repository.DelRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getDelMethod(), responseObserver);
    }

    /**
     */
    public void delVers(com.keyvalue.web.repository.DelRequestVers request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getDelVersMethod(), responseObserver);
    }

    /**
     */
    public void testAndSet(com.keyvalue.web.repository.TestAndSetRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getTestAndSetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.keyvalue.web.repository.HelloRequest,
                com.keyvalue.web.repository.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloAgainMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.keyvalue.web.repository.HelloRequest,
                com.keyvalue.web.repository.HelloReply>(
                  this, METHODID_SAY_HELLO_AGAIN)))
          .addMethod(
            getSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.keyvalue.web.repository.SetRequest,
                com.keyvalue.web.repository.Reply>(
                  this, METHODID_SET)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.keyvalue.web.repository.GetRequest,
                com.keyvalue.web.repository.Reply>(
                  this, METHODID_GET)))
          .addMethod(
            getDelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.keyvalue.web.repository.DelRequest,
                com.keyvalue.web.repository.Reply>(
                  this, METHODID_DEL)))
          .addMethod(
            getDelVersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.keyvalue.web.repository.DelRequestVers,
                com.keyvalue.web.repository.Reply>(
                  this, METHODID_DEL_VERS)))
          .addMethod(
            getTestAndSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.keyvalue.web.repository.TestAndSetRequest,
                com.keyvalue.web.repository.Reply>(
                  this, METHODID_TEST_AND_SET)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
    private GreeterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.keyvalue.web.repository.HelloRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloAgain(com.keyvalue.web.repository.HelloRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloAgainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *service CrudKeyValue {
     * </pre>
     */
    public void set(com.keyvalue.web.repository.SetRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.keyvalue.web.repository.GetRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void del(com.keyvalue.web.repository.DelRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delVers(com.keyvalue.web.repository.DelRequestVers request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelVersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testAndSet(com.keyvalue.web.repository.TestAndSetRequest request,
        io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestAndSetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
    private GreeterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.keyvalue.web.repository.HelloReply sayHello(com.keyvalue.web.repository.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.keyvalue.web.repository.HelloReply sayHelloAgain(com.keyvalue.web.repository.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloAgainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *service CrudKeyValue {
     * </pre>
     */
    public com.keyvalue.web.repository.Reply set(com.keyvalue.web.repository.SetRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.keyvalue.web.repository.Reply get(com.keyvalue.web.repository.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.keyvalue.web.repository.Reply del(com.keyvalue.web.repository.DelRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.keyvalue.web.repository.Reply delVers(com.keyvalue.web.repository.DelRequestVers request) {
      return blockingUnaryCall(
          getChannel(), getDelVersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.keyvalue.web.repository.Reply testAndSet(com.keyvalue.web.repository.TestAndSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestAndSetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
    private GreeterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.keyvalue.web.repository.HelloReply> sayHello(
        com.keyvalue.web.repository.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.keyvalue.web.repository.HelloReply> sayHelloAgain(
        com.keyvalue.web.repository.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloAgainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *service CrudKeyValue {
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.keyvalue.web.repository.Reply> set(
        com.keyvalue.web.repository.SetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.keyvalue.web.repository.Reply> get(
        com.keyvalue.web.repository.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.keyvalue.web.repository.Reply> del(
        com.keyvalue.web.repository.DelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.keyvalue.web.repository.Reply> delVers(
        com.keyvalue.web.repository.DelRequestVers request) {
      return futureUnaryCall(
          getChannel().newCall(getDelVersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.keyvalue.web.repository.Reply> testAndSet(
        com.keyvalue.web.repository.TestAndSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestAndSetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_AGAIN = 1;
  private static final int METHODID_SET = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_DEL = 4;
  private static final int METHODID_DEL_VERS = 5;
  private static final int METHODID_TEST_AND_SET = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.keyvalue.web.repository.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.keyvalue.web.repository.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_AGAIN:
          serviceImpl.sayHelloAgain((com.keyvalue.web.repository.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.keyvalue.web.repository.HelloReply>) responseObserver);
          break;
        case METHODID_SET:
          serviceImpl.set((com.keyvalue.web.repository.SetRequest) request,
              (io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.keyvalue.web.repository.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply>) responseObserver);
          break;
        case METHODID_DEL:
          serviceImpl.del((com.keyvalue.web.repository.DelRequest) request,
              (io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply>) responseObserver);
          break;
        case METHODID_DEL_VERS:
          serviceImpl.delVers((com.keyvalue.web.repository.DelRequestVers) request,
              (io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply>) responseObserver);
          break;
        case METHODID_TEST_AND_SET:
          serviceImpl.testAndSet((com.keyvalue.web.repository.TestAndSetRequest) request,
              (io.grpc.stub.StreamObserver<com.keyvalue.web.repository.Reply>) responseObserver);
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

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.keyvalue.web.repository.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloAgainMethod())
              .addMethod(getSetMethod())
              .addMethod(getGetMethod())
              .addMethod(getDelMethod())
              .addMethod(getDelVersMethod())
              .addMethod(getTestAndSetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
