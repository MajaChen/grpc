package org.example;

import io.grpc.stub.StreamObserver;
import proto.common.Commands;
import proto.common.ReportData;
import proto.common.ReportServiceGrpc;

public class ReportServiceImpl extends ReportServiceGrpc.ReportServiceImplBase {
  @Override
  public void uploadReport(ReportData request, StreamObserver<Commands> responseObserver) {
    System.out.println("OpenAPI: 接收 Client 上报的数据，内容如下：");
    System.out.println(request);
    System.out.println("OpenAPI: 数据类型为：" + request.getReportType());
    System.out.println("OpenAPI: 数据已处理，发送响应至 Agent Client");
    responseObserver.onNext(Commands.newBuilder().build());
    responseObserver.onCompleted();
  }
}
