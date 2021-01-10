// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package grpc;

/**
 * Protobuf type {@code grpc.newPizzaRequest}
 */
public final class newPizzaRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.newPizzaRequest)
    newPizzaRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use newPizzaRequest.newBuilder() to construct.
  private newPizzaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private newPizzaRequest() {
    namepiz_ = "";
    descr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new newPizzaRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private newPizzaRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            namepiz_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            descr_ = s;
            break;
          }
          case 24: {

            cost_ = input.readInt32();
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
    return grpc.EchoServiceProto.internal_static_grpc_newPizzaRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.EchoServiceProto.internal_static_grpc_newPizzaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.newPizzaRequest.class, grpc.newPizzaRequest.Builder.class);
  }

  public static final int NAMEPIZ_FIELD_NUMBER = 1;
  private volatile java.lang.Object namepiz_;
  /**
   * <code>string namepiz = 1;</code>
   * @return The namepiz.
   */
  @java.lang.Override
  public java.lang.String getNamepiz() {
    java.lang.Object ref = namepiz_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namepiz_ = s;
      return s;
    }
  }
  /**
   * <code>string namepiz = 1;</code>
   * @return The bytes for namepiz.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamepizBytes() {
    java.lang.Object ref = namepiz_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namepiz_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCR_FIELD_NUMBER = 2;
  private volatile java.lang.Object descr_;
  /**
   * <code>string descr = 2;</code>
   * @return The descr.
   */
  @java.lang.Override
  public java.lang.String getDescr() {
    java.lang.Object ref = descr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      descr_ = s;
      return s;
    }
  }
  /**
   * <code>string descr = 2;</code>
   * @return The bytes for descr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescrBytes() {
    java.lang.Object ref = descr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      descr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COST_FIELD_NUMBER = 3;
  private int cost_;
  /**
   * <code>int32 cost = 3;</code>
   * @return The cost.
   */
  @java.lang.Override
  public int getCost() {
    return cost_;
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
    if (!getNamepizBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namepiz_);
    }
    if (!getDescrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, descr_);
    }
    if (cost_ != 0) {
      output.writeInt32(3, cost_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNamepizBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namepiz_);
    }
    if (!getDescrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, descr_);
    }
    if (cost_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, cost_);
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
    if (!(obj instanceof grpc.newPizzaRequest)) {
      return super.equals(obj);
    }
    grpc.newPizzaRequest other = (grpc.newPizzaRequest) obj;

    if (!getNamepiz()
        .equals(other.getNamepiz())) return false;
    if (!getDescr()
        .equals(other.getDescr())) return false;
    if (getCost()
        != other.getCost()) return false;
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
    hash = (37 * hash) + NAMEPIZ_FIELD_NUMBER;
    hash = (53 * hash) + getNamepiz().hashCode();
    hash = (37 * hash) + DESCR_FIELD_NUMBER;
    hash = (53 * hash) + getDescr().hashCode();
    hash = (37 * hash) + COST_FIELD_NUMBER;
    hash = (53 * hash) + getCost();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.newPizzaRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.newPizzaRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.newPizzaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.newPizzaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.newPizzaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.newPizzaRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.newPizzaRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.newPizzaRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.newPizzaRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.newPizzaRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.newPizzaRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.newPizzaRequest parseFrom(
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
  public static Builder newBuilder(grpc.newPizzaRequest prototype) {
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
   * Protobuf type {@code grpc.newPizzaRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.newPizzaRequest)
      grpc.newPizzaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.EchoServiceProto.internal_static_grpc_newPizzaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.EchoServiceProto.internal_static_grpc_newPizzaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.newPizzaRequest.class, grpc.newPizzaRequest.Builder.class);
    }

    // Construct using grpc.newPizzaRequest.newBuilder()
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
      namepiz_ = "";

      descr_ = "";

      cost_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.EchoServiceProto.internal_static_grpc_newPizzaRequest_descriptor;
    }

    @java.lang.Override
    public grpc.newPizzaRequest getDefaultInstanceForType() {
      return grpc.newPizzaRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.newPizzaRequest build() {
      grpc.newPizzaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.newPizzaRequest buildPartial() {
      grpc.newPizzaRequest result = new grpc.newPizzaRequest(this);
      result.namepiz_ = namepiz_;
      result.descr_ = descr_;
      result.cost_ = cost_;
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
      if (other instanceof grpc.newPizzaRequest) {
        return mergeFrom((grpc.newPizzaRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.newPizzaRequest other) {
      if (other == grpc.newPizzaRequest.getDefaultInstance()) return this;
      if (!other.getNamepiz().isEmpty()) {
        namepiz_ = other.namepiz_;
        onChanged();
      }
      if (!other.getDescr().isEmpty()) {
        descr_ = other.descr_;
        onChanged();
      }
      if (other.getCost() != 0) {
        setCost(other.getCost());
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
      grpc.newPizzaRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.newPizzaRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object namepiz_ = "";
    /**
     * <code>string namepiz = 1;</code>
     * @return The namepiz.
     */
    public java.lang.String getNamepiz() {
      java.lang.Object ref = namepiz_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namepiz_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string namepiz = 1;</code>
     * @return The bytes for namepiz.
     */
    public com.google.protobuf.ByteString
        getNamepizBytes() {
      java.lang.Object ref = namepiz_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namepiz_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string namepiz = 1;</code>
     * @param value The namepiz to set.
     * @return This builder for chaining.
     */
    public Builder setNamepiz(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      namepiz_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string namepiz = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNamepiz() {
      
      namepiz_ = getDefaultInstance().getNamepiz();
      onChanged();
      return this;
    }
    /**
     * <code>string namepiz = 1;</code>
     * @param value The bytes for namepiz to set.
     * @return This builder for chaining.
     */
    public Builder setNamepizBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      namepiz_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object descr_ = "";
    /**
     * <code>string descr = 2;</code>
     * @return The descr.
     */
    public java.lang.String getDescr() {
      java.lang.Object ref = descr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        descr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string descr = 2;</code>
     * @return The bytes for descr.
     */
    public com.google.protobuf.ByteString
        getDescrBytes() {
      java.lang.Object ref = descr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        descr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string descr = 2;</code>
     * @param value The descr to set.
     * @return This builder for chaining.
     */
    public Builder setDescr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      descr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string descr = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescr() {
      
      descr_ = getDefaultInstance().getDescr();
      onChanged();
      return this;
    }
    /**
     * <code>string descr = 2;</code>
     * @param value The bytes for descr to set.
     * @return This builder for chaining.
     */
    public Builder setDescrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      descr_ = value;
      onChanged();
      return this;
    }

    private int cost_ ;
    /**
     * <code>int32 cost = 3;</code>
     * @return The cost.
     */
    @java.lang.Override
    public int getCost() {
      return cost_;
    }
    /**
     * <code>int32 cost = 3;</code>
     * @param value The cost to set.
     * @return This builder for chaining.
     */
    public Builder setCost(int value) {
      
      cost_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cost = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCost() {
      
      cost_ = 0;
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


    // @@protoc_insertion_point(builder_scope:grpc.newPizzaRequest)
  }

  // @@protoc_insertion_point(class_scope:grpc.newPizzaRequest)
  private static final grpc.newPizzaRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.newPizzaRequest();
  }

  public static grpc.newPizzaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<newPizzaRequest>
      PARSER = new com.google.protobuf.AbstractParser<newPizzaRequest>() {
    @java.lang.Override
    public newPizzaRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new newPizzaRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<newPizzaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<newPizzaRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.newPizzaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

