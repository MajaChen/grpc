package com.example.grpc.client;

import com.proto.common.KeyStringValuePair;
import com.proto.report.ReportData;
import com.proto.report.ReportServiceGrpc;
import com.proto.report.ReportType;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ReportClient {
  public static void main(String[] args) {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9089).usePlaintext().build();
    ReportServiceGrpc.ReportServiceBlockingStub reportServiceStub = ReportServiceGrpc.newBlockingStub(channel);
    reportServiceStub.uploadReport(mockReportData());
    System.out.println("报告已上传");
    channel.shutdown();
  }
  
  public static ReportData mockReportData() {
    ReportData reportData = ReportData
            .newBuilder()
            .setReportType(ReportType.Normal)
            .addDetail(KeyStringValuePair.newBuilder().setKey("a").setValue("1").build())
            .addDetail(KeyStringValuePair.newBuilder().setKey("b").setValue("2").build())
            .build();
    System.out.println("自动生成Mock数据，数据内容如下：");
    System.out.println(reportData);
    return reportData;
  }
}
