package com.example.grpc.server;

import com.proto.common.Commands;
import com.proto.report.ReportData;
import com.proto.report.ReportServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class ReportServer {
  public static void main(String[] args) throws IOException, InterruptedException {
    System.out.println("Starting report OpenAPI server on port: 9089");
    Server server = ServerBuilder.forPort(9089).addService(new ReportServiceImpl()).build(); // create a instance of server
    server.start();
    server.awaitTermination();
  }
}

class ReportServiceImpl extends ReportServiceGrpc.ReportServiceImplBase{
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
