// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package grpc;

/**
 * Protobuf type {@code grpc.pizzaResponse}
 */
public final class pizzaResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.pizzaResponse)
    pizzaResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use pizzaResponse.newBuilder() to construct.
  private pizzaResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private pizzaResponse() {
    id_ = emptyIntList();
    name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new pizzaResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private pizzaResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              id_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            id_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              id_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              id_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              name_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            name_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        id_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        name_ = name_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.EchoServiceProto.internal_static_grpc_pizzaResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.EchoServiceProto.internal_static_grpc_pizzaResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.pizzaResponse.class, grpc.pizzaResponse.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList id_;
  /**
   * <code>repeated int32 id = 1;</code>
   * @return A list containing the id.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getIdList() {
    return id_;
  }
  /**
   * <code>repeated int32 id = 1;</code>
   * @return The count of id.
   */
  public int getIdCount() {
    return id_.size();
  }
  /**
   * <code>repeated int32 id = 1;</code>
   * @param index The index of the element to return.
   * @return The id at the given index.
   */
  public int getId(int index) {
    return id_.getInt(index);
  }
  private int idMemoizedSerializedSize = -1;

  public static final int NAME_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList name_;
  /**
   * <code>repeated string name = 2;</code>
   * @return A list containing the name.
   */
  public com.google.protobuf.ProtocolStringList
      getNameList() {
    return name_;
  }
  /**
   * <code>repeated string name = 2;</code>
   * @return The count of name.
   */
  public int getNameCount() {
    return name_.size();
  }
  /**
   * <code>repeated string name = 2;</code>
   * @param index The index of the element to return.
   * @return The name at the given index.
   */
  public java.lang.String getName(int index) {
    return name_.get(index);
  }
  /**
   * <code>repeated string name = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the name at the given index.
   */
  public com.google.protobuf.ByteString
      getNameBytes(int index) {
    return name_.getByteString(index);
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
    getSerializedSize();
    if (getIdList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(idMemoizedSerializedSize);
    }
    for (int i = 0; i < id_.size(); i++) {
      output.writeInt32NoTag(id_.getInt(i));
    }
    for (int i = 0; i < name_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < id_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(id_.getInt(i));
      }
      size += dataSize;
      if (!getIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      idMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < name_.size(); i++) {
        dataSize += computeStringSizeNoTag(name_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNameList().size();
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
    if (!(obj instanceof grpc.pizzaResponse)) {
      return super.equals(obj);
    }
    grpc.pizzaResponse other = (grpc.pizzaResponse) obj;

    if (!getIdList()
        .equals(other.getIdList())) return false;
    if (!getNameList()
        .equals(other.getNameList())) return false;
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
    if (getIdCount() > 0) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getIdList().hashCode();
    }
    if (getNameCount() > 0) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getNameList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.pizzaResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.pizzaResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.pizzaResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.pizzaResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.pizzaResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.pizzaResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.pizzaResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.pizzaResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.pizzaResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.pizzaResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.pizzaResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.pizzaResponse parseFrom(
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
  public static Builder newBuilder(grpc.pizzaResponse prototype) {
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
   * Protobuf type {@code grpc.pizzaResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.pizzaResponse)
      grpc.pizzaResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.EchoServiceProto.internal_static_grpc_pizzaResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.EchoServiceProto.internal_static_grpc_pizzaResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.pizzaResponse.class, grpc.pizzaResponse.Builder.class);
    }

    // Construct using grpc.pizzaResponse.newBuilder()
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
      id_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.EchoServiceProto.internal_static_grpc_pizzaResponse_descriptor;
    }

    @java.lang.Override
    public grpc.pizzaResponse getDefaultInstanceForType() {
      return grpc.pizzaResponse.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.pizzaResponse build() {
      grpc.pizzaResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.pizzaResponse buildPartial() {
      grpc.pizzaResponse result = new grpc.pizzaResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        id_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.id_ = id_;
      if (((bitField0_ & 0x00000002) != 0)) {
        name_ = name_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.name_ = name_;
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
      if (other instanceof grpc.pizzaResponse) {
        return mergeFrom((grpc.pizzaResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.pizzaResponse other) {
      if (other == grpc.pizzaResponse.getDefaultInstance()) return this;
      if (!other.id_.isEmpty()) {
        if (id_.isEmpty()) {
          id_ = other.id_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdIsMutable();
          id_.addAll(other.id_);
        }
        onChanged();
      }
      if (!other.name_.isEmpty()) {
        if (name_.isEmpty()) {
          name_ = other.name_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureNameIsMutable();
          name_.addAll(other.name_);
        }
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
      grpc.pizzaResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.pizzaResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList id_ = emptyIntList();
    private void ensureIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        id_ = mutableCopy(id_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 id = 1;</code>
     * @return A list containing the id.
     */
    public java.util.List<java.lang.Integer>
        getIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(id_) : id_;
    }
    /**
     * <code>repeated int32 id = 1;</code>
     * @return The count of id.
     */
    public int getIdCount() {
      return id_.size();
    }
    /**
     * <code>repeated int32 id = 1;</code>
     * @param index The index of the element to return.
     * @return The id at the given index.
     */
    public int getId(int index) {
      return id_.getInt(index);
    }
    /**
     * <code>repeated int32 id = 1;</code>
     * @param index The index to set the value at.
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        int index, int value) {
      ensureIdIsMutable();
      id_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 id = 1;</code>
     * @param value The id to add.
     * @return This builder for chaining.
     */
    public Builder addId(int value) {
      ensureIdIsMutable();
      id_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 id = 1;</code>
     * @param values The id to add.
     * @return This builder for chaining.
     */
    public Builder addAllId(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, id_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNameIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        name_ = new com.google.protobuf.LazyStringArrayList(name_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string name = 2;</code>
     * @return A list containing the name.
     */
    public com.google.protobuf.ProtocolStringList
        getNameList() {
      return name_.getUnmodifiableView();
    }
    /**
     * <code>repeated string name = 2;</code>
     * @return The count of name.
     */
    public int getNameCount() {
      return name_.size();
    }
    /**
     * <code>repeated string name = 2;</code>
     * @param index The index of the element to return.
     * @return The name at the given index.
     */
    public java.lang.String getName(int index) {
      return name_.get(index);
    }
    /**
     * <code>repeated string name = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the name at the given index.
     */
    public com.google.protobuf.ByteString
        getNameBytes(int index) {
      return name_.getByteString(index);
    }
    /**
     * <code>repeated string name = 2;</code>
     * @param index The index to set the value at.
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNameIsMutable();
      name_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 2;</code>
     * @param value The name to add.
     * @return This builder for chaining.
     */
    public Builder addName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNameIsMutable();
      name_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 2;</code>
     * @param values The name to add.
     * @return This builder for chaining.
     */
    public Builder addAllName(
        java.lang.Iterable<java.lang.String> values) {
      ensureNameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, name_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 2;</code>
     * @param value The bytes of the name to add.
     * @return This builder for chaining.
     */
    public Builder addNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNameIsMutable();
      name_.add(value);
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


    // @@protoc_insertion_point(builder_scope:grpc.pizzaResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.pizzaResponse)
  private static final grpc.pizzaResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.pizzaResponse();
  }

  public static grpc.pizzaResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<pizzaResponse>
      PARSER = new com.google.protobuf.AbstractParser<pizzaResponse>() {
    @java.lang.Override
    public pizzaResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new pizzaResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<pizzaResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<pizzaResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.pizzaResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

