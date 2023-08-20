package proto.common;

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
 * Collect performance raw data from browser.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: report.proto")
public final class ReportServiceGrpc {

  private ReportServiceGrpc() {}

  public static final String SERVICE_NAME = "chxy.proto.common.ReportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.common.ReportData,
      proto.common.Commands> getUploadReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadReport",
      requestType = proto.common.ReportData.class,
      responseType = proto.common.Commands.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.common.ReportData,
      proto.common.Commands> getUploadReportMethod() {
    io.grpc.MethodDescriptor<proto.common.ReportData, proto.common.Commands> getUploadReportMethod;
    if ((getUploadReportMethod = ReportServiceGrpc.getUploadReportMethod) == null) {
      synchronized (ReportServiceGrpc.class) {
        if ((getUploadReportMethod = ReportServiceGrpc.getUploadReportMethod) == null) {
          ReportServiceGrpc.getUploadReportMethod = getUploadReportMethod = 
              io.grpc.MethodDescriptor.<proto.common.ReportData, proto.common.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chxy.proto.common.ReportService", "uploadReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.common.ReportData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.common.Commands.getDefaultInstance()))
                  .setSchemaDescriptor(new ReportServiceMethodDescriptorSupplier("uploadReport"))
                  .build();
          }
        }
     }
     return getUploadReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.common.ReportData,
      proto.common.Commands> getUploadStreamReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadStreamReport",
      requestType = proto.common.ReportData.class,
      responseType = proto.common.Commands.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<proto.common.ReportData,
      proto.common.Commands> getUploadStreamReportMethod() {
    io.grpc.MethodDescriptor<proto.common.ReportData, proto.common.Commands> getUploadStreamReportMethod;
    if ((getUploadStreamReportMethod = ReportServiceGrpc.getUploadStreamReportMethod) == null) {
      synchronized (ReportServiceGrpc.class) {
        if ((getUploadStreamReportMethod = ReportServiceGrpc.getUploadStreamReportMethod) == null) {
          ReportServiceGrpc.getUploadStreamReportMethod = getUploadStreamReportMethod = 
              io.grpc.MethodDescriptor.<proto.common.ReportData, proto.common.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "chxy.proto.common.ReportService", "uploadStreamReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.common.ReportData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.common.Commands.getDefaultInstance()))
                  .setSchemaDescriptor(new ReportServiceMethodDescriptorSupplier("uploadStreamReport"))
                  .build();
          }
        }
     }
     return getUploadStreamReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReportServiceStub newStub(io.grpc.Channel channel) {
    return new ReportServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReportServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReportServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Collect performance raw data from browser.
   * </pre>
   */
  public static abstract class ReportServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * report once per page
     * </pre>
     */
    public void uploadReport(proto.common.ReportData request,
        io.grpc.stub.StreamObserver<proto.common.Commands> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * report one or more error logs for pages, could report multiple times.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<proto.common.ReportData> uploadStreamReport(
        io.grpc.stub.StreamObserver<proto.common.Commands> responseObserver) {
      return asyncUnimplementedStreamingCall(getUploadStreamReportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.common.ReportData,
                proto.common.Commands>(
                  this, METHODID_UPLOAD_REPORT)))
          .addMethod(
            getUploadStreamReportMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                proto.common.ReportData,
                proto.common.Commands>(
                  this, METHODID_UPLOAD_STREAM_REPORT)))
          .build();
    }
  }

  /**
   * <pre>
   * Collect performance raw data from browser.
   * </pre>
   */
  public static final class ReportServiceStub extends io.grpc.stub.AbstractStub<ReportServiceStub> {
    private ReportServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * report once per page
     * </pre>
     */
    public void uploadReport(proto.common.ReportData request,
        io.grpc.stub.StreamObserver<proto.common.Commands> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * report one or more error logs for pages, could report multiple times.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<proto.common.ReportData> uploadStreamReport(
        io.grpc.stub.StreamObserver<proto.common.Commands> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUploadStreamReportMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Collect performance raw data from browser.
   * </pre>
   */
  public static final class ReportServiceBlockingStub extends io.grpc.stub.AbstractStub<ReportServiceBlockingStub> {
    private ReportServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * report once per page
     * </pre>
     */
    public proto.common.Commands uploadReport(proto.common.ReportData request) {
      return blockingUnaryCall(
          getChannel(), getUploadReportMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Collect performance raw data from browser.
   * </pre>
   */
  public static final class ReportServiceFutureStub extends io.grpc.stub.AbstractStub<ReportServiceFutureStub> {
    private ReportServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * report once per page
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.common.Commands> uploadReport(
        proto.common.ReportData request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_REPORT = 0;
  private static final int METHODID_UPLOAD_STREAM_REPORT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_REPORT:
          serviceImpl.uploadReport((proto.common.ReportData) request,
              (io.grpc.stub.StreamObserver<proto.common.Commands>) responseObserver);
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
        case METHODID_UPLOAD_STREAM_REPORT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadStreamReport(
              (io.grpc.stub.StreamObserver<proto.common.Commands>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.common.Report.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReportService");
    }
  }

  private static final class ReportServiceFileDescriptorSupplier
      extends ReportServiceBaseDescriptorSupplier {
    ReportServiceFileDescriptorSupplier() {}
  }

  private static final class ReportServiceMethodDescriptorSupplier
      extends ReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReportServiceFileDescriptorSupplier())
              .addMethod(getUploadReportMethod())
              .addMethod(getUploadStreamReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
