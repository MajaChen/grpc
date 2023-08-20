// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: report.proto

package proto.common;

/**
 * Protobuf enum {@code chxy.proto.common.ReportType}
 */
public enum ReportType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Normal = 0;</code>
   */
  Normal(0),
  /**
   * <code>Error = 1;</code>
   */
  Error(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Normal = 0;</code>
   */
  public static final int Normal_VALUE = 0;
  /**
   * <code>Error = 1;</code>
   */
  public static final int Error_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ReportType valueOf(int value) {
    return forNumber(value);
  }

  public static ReportType forNumber(int value) {
    switch (value) {
      case 0: return Normal;
      case 1: return Error;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReportType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ReportType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReportType>() {
          public ReportType findValueByNumber(int number) {
            return ReportType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return proto.common.Report.getDescriptor().getEnumTypes().get(0);
  }

  private static final ReportType[] VALUES = values();

  public static ReportType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ReportType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chxy.proto.common.ReportType)
}

