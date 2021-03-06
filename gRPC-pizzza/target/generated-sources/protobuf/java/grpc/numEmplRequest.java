// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package grpc;

/**
 * Protobuf type {@code grpc.numEmplRequest}
 */
public final class numEmplRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.numEmplRequest)
    numEmplRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use numEmplRequest.newBuilder() to construct.
  private numEmplRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private numEmplRequest() {
    stat_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new numEmplRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private numEmplRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            num_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            stat_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.EchoServiceProto.internal_static_grpc_numEmplRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.EchoServiceProto.internal_static_grpc_numEmplRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.numEmplRequest.class, grpc.numEmplRequest.Builder.class);
  }

  public static final int NUM_FIELD_NUMBER = 1;
  private int num_;
  /**
   * <code>int32 num = 1;</code>
   * @return The num.
   */
  @java.lang.Override
  public int getNum() {
    return num_;
  }

  public static final int STAT_FIELD_NUMBER = 2;
  private volatile java.lang.Object stat_;
  /**
   * <code>string stat = 2;</code>
   * @return The stat.
   */
  @java.lang.Override
  public java.lang.String getStat() {
    java.lang.Object ref = stat_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stat_ = s;
      return s;
    }
  }
  /**
   * <code>string stat = 2;</code>
   * @return The bytes for stat.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatBytes() {
    java.lang.Object ref = stat_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stat_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (num_ != 0) {
      output.writeInt32(1, num_);
    }
    if (!getStatBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stat_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (num_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, num_);
    }
    if (!getStatBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stat_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.numEmplRequest)) {
      return super.equals(obj);
    }
    grpc.numEmplRequest other = (grpc.numEmplRequest) obj;

    if (getNum()
        != other.getNum()) return false;
    if (!getStat()
        .equals(other.getStat())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUM_FIELD_NUMBER;
    hash = (53 * hash) + getNum();
    hash = (37 * hash) + STAT_FIELD_NUMBER;
    hash = (53 * hash) + getStat().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.numEmplRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.numEmplRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.numEmplRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.numEmplRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.numEmplRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.numEmplRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.numEmplRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.numEmplRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.numEmplRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.numEmplRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.numEmplRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.numEmplRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.numEmplRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.numEmplRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.numEmplRequest)
      grpc.numEmplRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.EchoServiceProto.internal_static_grpc_numEmplRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.EchoServiceProto.internal_static_grpc_numEmplRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.numEmplRequest.class, grpc.numEmplRequest.Builder.class);
    }

    // Construct using grpc.numEmplRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      num_ = 0;

      stat_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.EchoServiceProto.internal_static_grpc_numEmplRequest_descriptor;
    }

    @java.lang.Override
    public grpc.numEmplRequest getDefaultInstanceForType() {
      return grpc.numEmplRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.numEmplRequest build() {
      grpc.numEmplRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.numEmplRequest buildPartial() {
      grpc.numEmplRequest result = new grpc.numEmplRequest(this);
      result.num_ = num_;
      result.stat_ = stat_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.numEmplRequest) {
        return mergeFrom((grpc.numEmplRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.numEmplRequest other) {
      if (other == grpc.numEmplRequest.getDefaultInstance()) return this;
      if (other.getNum() != 0) {
        setNum(other.getNum());
      }
      if (!other.getStat().isEmpty()) {
        stat_ = other.stat_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.numEmplRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.numEmplRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int num_ ;
    /**
     * <code>int32 num = 1;</code>
     * @return The num.
     */
    @java.lang.Override
    public int getNum() {
      return num_;
    }
    /**
     * <code>int32 num = 1;</code>
     * @param value The num to set.
     * @return This builder for chaining.
     */
    public Builder setNum(int value) {
      
      num_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum() {
      
      num_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object stat_ = "";
    /**
     * <code>string stat = 2;</code>
     * @return The stat.
     */
    public java.lang.String getStat() {
      java.lang.Object ref = stat_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stat_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stat = 2;</code>
     * @return The bytes for stat.
     */
    public com.google.protobuf.ByteString
        getStatBytes() {
      java.lang.Object ref = stat_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stat_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stat = 2;</code>
     * @param value The stat to set.
     * @return This builder for chaining.
     */
    public Builder setStat(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stat = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStat() {
      
      stat_ = getDefaultInstance().getStat();
      onChanged();
      return this;
    }
    /**
     * <code>string stat = 2;</code>
     * @param value The bytes for stat to set.
     * @return This builder for chaining.
     */
    public Builder setStatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stat_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.numEmplRequest)
  }

  // @@protoc_insertion_point(class_scope:grpc.numEmplRequest)
  private static final grpc.numEmplRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.numEmplRequest();
  }

  public static grpc.numEmplRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<numEmplRequest>
      PARSER = new com.google.protobuf.AbstractParser<numEmplRequest>() {
    @java.lang.Override
    public numEmplRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new numEmplRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<numEmplRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<numEmplRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.numEmplRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

