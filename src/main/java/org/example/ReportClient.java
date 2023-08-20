package org.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.common.Commands;
import proto.common.KeyStringValuePair;
import proto.common.ReportData;
import proto.common.ReportServiceGrpc;
import proto.common.ReportType;

public class ReportClient {
  public static void main(String[] args) {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9089).usePlaintext().build();
    ReportServiceGrpc.ReportServiceBlockingStub reportServiceStub = ReportServiceGrpc.newBlockingStub(channel);
    reportServiceStub.uploadReport(mockReportData());
    System.out.printf("报告已上传");
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
