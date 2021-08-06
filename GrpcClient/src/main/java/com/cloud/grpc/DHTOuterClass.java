package com.cloud.grpc;

public final class DHTOuterClass {
  private DHTOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface getRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:getRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 Key = 1;</code>
     */
    long getKey();

    /**
     * <code>int32 ServerNo = 2;</code>
     */
    int getServerNo();
  }
  /**
   * Protobuf type {@code getRequest}
   */
  public  static final class getRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:getRequest)
      getRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use getRequest.newBuilder() to construct.
    private getRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private getRequest() {
      key_ = 0L;
      serverNo_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private getRequest(
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

              key_ = input.readInt64();
              break;
            }
            case 16: {

              serverNo_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return com.cloud.grpc.DHTOuterClass.internal_static_getRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cloud.grpc.DHTOuterClass.internal_static_getRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cloud.grpc.DHTOuterClass.getRequest.class, com.cloud.grpc.DHTOuterClass.getRequest.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private long key_;
    /**
     * <code>int64 Key = 1;</code>
     */
    public long getKey() {
      return key_;
    }

    public static final int SERVERNO_FIELD_NUMBER = 2;
    private int serverNo_;
    /**
     * <code>int32 ServerNo = 2;</code>
     */
    public int getServerNo() {
      return serverNo_;
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
      if (key_ != 0L) {
        output.writeInt64(1, key_);
      }
      if (serverNo_ != 0) {
        output.writeInt32(2, serverNo_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (key_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, key_);
      }
      if (serverNo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, serverNo_);
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
      if (!(obj instanceof com.cloud.grpc.DHTOuterClass.getRequest)) {
        return super.equals(obj);
      }
      com.cloud.grpc.DHTOuterClass.getRequest other = (com.cloud.grpc.DHTOuterClass.getRequest) obj;

      boolean result = true;
      result = result && (getKey()
          == other.getKey());
      result = result && (getServerNo()
          == other.getServerNo());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getKey());
      hash = (37 * hash) + SERVERNO_FIELD_NUMBER;
      hash = (53 * hash) + getServerNo();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.cloud.grpc.DHTOuterClass.getRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.getRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.getRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.getRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.getRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.getRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.getRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.getRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.getRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.getRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.getRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.getRequest parseFrom(
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
    public static Builder newBuilder(com.cloud.grpc.DHTOuterClass.getRequest prototype) {
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
     * Protobuf type {@code getRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:getRequest)
        com.cloud.grpc.DHTOuterClass.getRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cloud.grpc.DHTOuterClass.internal_static_getRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cloud.grpc.DHTOuterClass.internal_static_getRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cloud.grpc.DHTOuterClass.getRequest.class, com.cloud.grpc.DHTOuterClass.getRequest.Builder.class);
      }

      // Construct using com.cloud.grpc.DHTOuterClass.getRequest.newBuilder()
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
        key_ = 0L;

        serverNo_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cloud.grpc.DHTOuterClass.internal_static_getRequest_descriptor;
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.getRequest getDefaultInstanceForType() {
        return com.cloud.grpc.DHTOuterClass.getRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.getRequest build() {
        com.cloud.grpc.DHTOuterClass.getRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.getRequest buildPartial() {
        com.cloud.grpc.DHTOuterClass.getRequest result = new com.cloud.grpc.DHTOuterClass.getRequest(this);
        result.key_ = key_;
        result.serverNo_ = serverNo_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.cloud.grpc.DHTOuterClass.getRequest) {
          return mergeFrom((com.cloud.grpc.DHTOuterClass.getRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cloud.grpc.DHTOuterClass.getRequest other) {
        if (other == com.cloud.grpc.DHTOuterClass.getRequest.getDefaultInstance()) return this;
        if (other.getKey() != 0L) {
          setKey(other.getKey());
        }
        if (other.getServerNo() != 0) {
          setServerNo(other.getServerNo());
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
        com.cloud.grpc.DHTOuterClass.getRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.cloud.grpc.DHTOuterClass.getRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long key_ ;
      /**
       * <code>int64 Key = 1;</code>
       */
      public long getKey() {
        return key_;
      }
      /**
       * <code>int64 Key = 1;</code>
       */
      public Builder setKey(long value) {
        
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 Key = 1;</code>
       */
      public Builder clearKey() {
        
        key_ = 0L;
        onChanged();
        return this;
      }

      private int serverNo_ ;
      /**
       * <code>int32 ServerNo = 2;</code>
       */
      public int getServerNo() {
        return serverNo_;
      }
      /**
       * <code>int32 ServerNo = 2;</code>
       */
      public Builder setServerNo(int value) {
        
        serverNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 ServerNo = 2;</code>
       */
      public Builder clearServerNo() {
        
        serverNo_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:getRequest)
    }

    // @@protoc_insertion_point(class_scope:getRequest)
    private static final com.cloud.grpc.DHTOuterClass.getRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.cloud.grpc.DHTOuterClass.getRequest();
    }

    public static com.cloud.grpc.DHTOuterClass.getRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<getRequest>
        PARSER = new com.google.protobuf.AbstractParser<getRequest>() {
      @java.lang.Override
      public getRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new getRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<getRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<getRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.cloud.grpc.DHTOuterClass.getRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface getResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:getResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes Val = 1;</code>
     */
    com.google.protobuf.ByteString getVal();

    /**
     * <code>int32 version = 2;</code>
     */
    int getVersion();
  }
  /**
   * Protobuf type {@code getResponse}
   */
  public  static final class getResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:getResponse)
      getResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use getResponse.newBuilder() to construct.
    private getResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private getResponse() {
      val_ = com.google.protobuf.ByteString.EMPTY;
      version_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private getResponse(
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
            case 10: {

              val_ = input.readBytes();
              break;
            }
            case 16: {

              version_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return com.cloud.grpc.DHTOuterClass.internal_static_getResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cloud.grpc.DHTOuterClass.internal_static_getResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cloud.grpc.DHTOuterClass.getResponse.class, com.cloud.grpc.DHTOuterClass.getResponse.Builder.class);
    }

    public static final int VAL_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString val_;
    /**
     * <code>bytes Val = 1;</code>
     */
    public com.google.protobuf.ByteString getVal() {
      return val_;
    }

    public static final int VERSION_FIELD_NUMBER = 2;
    private int version_;
    /**
     * <code>int32 version = 2;</code>
     */
    public int getVersion() {
      return version_;
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
      if (!val_.isEmpty()) {
        output.writeBytes(1, val_);
      }
      if (version_ != 0) {
        output.writeInt32(2, version_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!val_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, val_);
      }
      if (version_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, version_);
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
      if (!(obj instanceof com.cloud.grpc.DHTOuterClass.getResponse)) {
        return super.equals(obj);
      }
      com.cloud.grpc.DHTOuterClass.getResponse other = (com.cloud.grpc.DHTOuterClass.getResponse) obj;

      boolean result = true;
      result = result && getVal()
          .equals(other.getVal());
      result = result && (getVersion()
          == other.getVersion());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + getVal().hashCode();
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.cloud.grpc.DHTOuterClass.getResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.getResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.getResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.getResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.getResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.getResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.getResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.getResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.getResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.getResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.getResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.getResponse parseFrom(
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
    public static Builder newBuilder(com.cloud.grpc.DHTOuterClass.getResponse prototype) {
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
     * Protobuf type {@code getResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:getResponse)
        com.cloud.grpc.DHTOuterClass.getResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cloud.grpc.DHTOuterClass.internal_static_getResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cloud.grpc.DHTOuterClass.internal_static_getResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cloud.grpc.DHTOuterClass.getResponse.class, com.cloud.grpc.DHTOuterClass.getResponse.Builder.class);
      }

      // Construct using com.cloud.grpc.DHTOuterClass.getResponse.newBuilder()
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
        val_ = com.google.protobuf.ByteString.EMPTY;

        version_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cloud.grpc.DHTOuterClass.internal_static_getResponse_descriptor;
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.getResponse getDefaultInstanceForType() {
        return com.cloud.grpc.DHTOuterClass.getResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.getResponse build() {
        com.cloud.grpc.DHTOuterClass.getResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.getResponse buildPartial() {
        com.cloud.grpc.DHTOuterClass.getResponse result = new com.cloud.grpc.DHTOuterClass.getResponse(this);
        result.val_ = val_;
        result.version_ = version_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.cloud.grpc.DHTOuterClass.getResponse) {
          return mergeFrom((com.cloud.grpc.DHTOuterClass.getResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cloud.grpc.DHTOuterClass.getResponse other) {
        if (other == com.cloud.grpc.DHTOuterClass.getResponse.getDefaultInstance()) return this;
        if (other.getVal() != com.google.protobuf.ByteString.EMPTY) {
          setVal(other.getVal());
        }
        if (other.getVersion() != 0) {
          setVersion(other.getVersion());
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
        com.cloud.grpc.DHTOuterClass.getResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.cloud.grpc.DHTOuterClass.getResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString val_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes Val = 1;</code>
       */
      public com.google.protobuf.ByteString getVal() {
        return val_;
      }
      /**
       * <code>bytes Val = 1;</code>
       */
      public Builder setVal(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        val_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes Val = 1;</code>
       */
      public Builder clearVal() {
        
        val_ = getDefaultInstance().getVal();
        onChanged();
        return this;
      }

      private int version_ ;
      /**
       * <code>int32 version = 2;</code>
       */
      public int getVersion() {
        return version_;
      }
      /**
       * <code>int32 version = 2;</code>
       */
      public Builder setVersion(int value) {
        
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 version = 2;</code>
       */
      public Builder clearVersion() {
        
        version_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:getResponse)
    }

    // @@protoc_insertion_point(class_scope:getResponse)
    private static final com.cloud.grpc.DHTOuterClass.getResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.cloud.grpc.DHTOuterClass.getResponse();
    }

    public static com.cloud.grpc.DHTOuterClass.getResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<getResponse>
        PARSER = new com.google.protobuf.AbstractParser<getResponse>() {
      @java.lang.Override
      public getResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new getResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<getResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<getResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.cloud.grpc.DHTOuterClass.getResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface putRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:putRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 Key = 1;</code>
     */
    long getKey();

    /**
     * <code>bytes Val = 2;</code>
     */
    com.google.protobuf.ByteString getVal();

    /**
     * <code>int32 version = 3;</code>
     */
    int getVersion();

    /**
     * <code>int32 ServerNo = 4;</code>
     */
    int getServerNo();
  }
  /**
   * Protobuf type {@code putRequest}
   */
  public  static final class putRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:putRequest)
      putRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use putRequest.newBuilder() to construct.
    private putRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private putRequest() {
      key_ = 0L;
      val_ = com.google.protobuf.ByteString.EMPTY;
      version_ = 0;
      serverNo_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private putRequest(
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

              key_ = input.readInt64();
              break;
            }
            case 18: {

              val_ = input.readBytes();
              break;
            }
            case 24: {

              version_ = input.readInt32();
              break;
            }
            case 32: {

              serverNo_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return com.cloud.grpc.DHTOuterClass.internal_static_putRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cloud.grpc.DHTOuterClass.internal_static_putRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cloud.grpc.DHTOuterClass.putRequest.class, com.cloud.grpc.DHTOuterClass.putRequest.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private long key_;
    /**
     * <code>int64 Key = 1;</code>
     */
    public long getKey() {
      return key_;
    }

    public static final int VAL_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString val_;
    /**
     * <code>bytes Val = 2;</code>
     */
    public com.google.protobuf.ByteString getVal() {
      return val_;
    }

    public static final int VERSION_FIELD_NUMBER = 3;
    private int version_;
    /**
     * <code>int32 version = 3;</code>
     */
    public int getVersion() {
      return version_;
    }

    public static final int SERVERNO_FIELD_NUMBER = 4;
    private int serverNo_;
    /**
     * <code>int32 ServerNo = 4;</code>
     */
    public int getServerNo() {
      return serverNo_;
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
      if (key_ != 0L) {
        output.writeInt64(1, key_);
      }
      if (!val_.isEmpty()) {
        output.writeBytes(2, val_);
      }
      if (version_ != 0) {
        output.writeInt32(3, version_);
      }
      if (serverNo_ != 0) {
        output.writeInt32(4, serverNo_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (key_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, key_);
      }
      if (!val_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, val_);
      }
      if (version_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, version_);
      }
      if (serverNo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, serverNo_);
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
      if (!(obj instanceof com.cloud.grpc.DHTOuterClass.putRequest)) {
        return super.equals(obj);
      }
      com.cloud.grpc.DHTOuterClass.putRequest other = (com.cloud.grpc.DHTOuterClass.putRequest) obj;

      boolean result = true;
      result = result && (getKey()
          == other.getKey());
      result = result && getVal()
          .equals(other.getVal());
      result = result && (getVersion()
          == other.getVersion());
      result = result && (getServerNo()
          == other.getServerNo());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getKey());
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + getVal().hashCode();
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion();
      hash = (37 * hash) + SERVERNO_FIELD_NUMBER;
      hash = (53 * hash) + getServerNo();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.cloud.grpc.DHTOuterClass.putRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.putRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.putRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.putRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.putRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.putRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.putRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.putRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.putRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.putRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.putRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.putRequest parseFrom(
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
    public static Builder newBuilder(com.cloud.grpc.DHTOuterClass.putRequest prototype) {
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
     * Protobuf type {@code putRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:putRequest)
        com.cloud.grpc.DHTOuterClass.putRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cloud.grpc.DHTOuterClass.internal_static_putRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cloud.grpc.DHTOuterClass.internal_static_putRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cloud.grpc.DHTOuterClass.putRequest.class, com.cloud.grpc.DHTOuterClass.putRequest.Builder.class);
      }

      // Construct using com.cloud.grpc.DHTOuterClass.putRequest.newBuilder()
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
        key_ = 0L;

        val_ = com.google.protobuf.ByteString.EMPTY;

        version_ = 0;

        serverNo_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cloud.grpc.DHTOuterClass.internal_static_putRequest_descriptor;
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.putRequest getDefaultInstanceForType() {
        return com.cloud.grpc.DHTOuterClass.putRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.putRequest build() {
        com.cloud.grpc.DHTOuterClass.putRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.putRequest buildPartial() {
        com.cloud.grpc.DHTOuterClass.putRequest result = new com.cloud.grpc.DHTOuterClass.putRequest(this);
        result.key_ = key_;
        result.val_ = val_;
        result.version_ = version_;
        result.serverNo_ = serverNo_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.cloud.grpc.DHTOuterClass.putRequest) {
          return mergeFrom((com.cloud.grpc.DHTOuterClass.putRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cloud.grpc.DHTOuterClass.putRequest other) {
        if (other == com.cloud.grpc.DHTOuterClass.putRequest.getDefaultInstance()) return this;
        if (other.getKey() != 0L) {
          setKey(other.getKey());
        }
        if (other.getVal() != com.google.protobuf.ByteString.EMPTY) {
          setVal(other.getVal());
        }
        if (other.getVersion() != 0) {
          setVersion(other.getVersion());
        }
        if (other.getServerNo() != 0) {
          setServerNo(other.getServerNo());
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
        com.cloud.grpc.DHTOuterClass.putRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.cloud.grpc.DHTOuterClass.putRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long key_ ;
      /**
       * <code>int64 Key = 1;</code>
       */
      public long getKey() {
        return key_;
      }
      /**
       * <code>int64 Key = 1;</code>
       */
      public Builder setKey(long value) {
        
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 Key = 1;</code>
       */
      public Builder clearKey() {
        
        key_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString val_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes Val = 2;</code>
       */
      public com.google.protobuf.ByteString getVal() {
        return val_;
      }
      /**
       * <code>bytes Val = 2;</code>
       */
      public Builder setVal(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        val_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes Val = 2;</code>
       */
      public Builder clearVal() {
        
        val_ = getDefaultInstance().getVal();
        onChanged();
        return this;
      }

      private int version_ ;
      /**
       * <code>int32 version = 3;</code>
       */
      public int getVersion() {
        return version_;
      }
      /**
       * <code>int32 version = 3;</code>
       */
      public Builder setVersion(int value) {
        
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 version = 3;</code>
       */
      public Builder clearVersion() {
        
        version_ = 0;
        onChanged();
        return this;
      }

      private int serverNo_ ;
      /**
       * <code>int32 ServerNo = 4;</code>
       */
      public int getServerNo() {
        return serverNo_;
      }
      /**
       * <code>int32 ServerNo = 4;</code>
       */
      public Builder setServerNo(int value) {
        
        serverNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 ServerNo = 4;</code>
       */
      public Builder clearServerNo() {
        
        serverNo_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:putRequest)
    }

    // @@protoc_insertion_point(class_scope:putRequest)
    private static final com.cloud.grpc.DHTOuterClass.putRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.cloud.grpc.DHTOuterClass.putRequest();
    }

    public static com.cloud.grpc.DHTOuterClass.putRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<putRequest>
        PARSER = new com.google.protobuf.AbstractParser<putRequest>() {
      @java.lang.Override
      public putRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new putRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<putRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<putRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.cloud.grpc.DHTOuterClass.putRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface putResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:putResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 Success = 1;</code>
     */
    int getSuccess();
  }
  /**
   * Protobuf type {@code putResponse}
   */
  public  static final class putResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:putResponse)
      putResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use putResponse.newBuilder() to construct.
    private putResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private putResponse() {
      success_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private putResponse(
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

              success_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return com.cloud.grpc.DHTOuterClass.internal_static_putResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cloud.grpc.DHTOuterClass.internal_static_putResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cloud.grpc.DHTOuterClass.putResponse.class, com.cloud.grpc.DHTOuterClass.putResponse.Builder.class);
    }

    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int success_;
    /**
     * <code>int32 Success = 1;</code>
     */
    public int getSuccess() {
      return success_;
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
      if (success_ != 0) {
        output.writeInt32(1, success_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (success_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, success_);
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
      if (!(obj instanceof com.cloud.grpc.DHTOuterClass.putResponse)) {
        return super.equals(obj);
      }
      com.cloud.grpc.DHTOuterClass.putResponse other = (com.cloud.grpc.DHTOuterClass.putResponse) obj;

      boolean result = true;
      result = result && (getSuccess()
          == other.getSuccess());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + getSuccess();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.cloud.grpc.DHTOuterClass.putResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.putResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.putResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.putResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.putResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cloud.grpc.DHTOuterClass.putResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.putResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.putResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.putResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.putResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cloud.grpc.DHTOuterClass.putResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cloud.grpc.DHTOuterClass.putResponse parseFrom(
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
    public static Builder newBuilder(com.cloud.grpc.DHTOuterClass.putResponse prototype) {
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
     * Protobuf type {@code putResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:putResponse)
        com.cloud.grpc.DHTOuterClass.putResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cloud.grpc.DHTOuterClass.internal_static_putResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cloud.grpc.DHTOuterClass.internal_static_putResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cloud.grpc.DHTOuterClass.putResponse.class, com.cloud.grpc.DHTOuterClass.putResponse.Builder.class);
      }

      // Construct using com.cloud.grpc.DHTOuterClass.putResponse.newBuilder()
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
        success_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cloud.grpc.DHTOuterClass.internal_static_putResponse_descriptor;
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.putResponse getDefaultInstanceForType() {
        return com.cloud.grpc.DHTOuterClass.putResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.putResponse build() {
        com.cloud.grpc.DHTOuterClass.putResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.cloud.grpc.DHTOuterClass.putResponse buildPartial() {
        com.cloud.grpc.DHTOuterClass.putResponse result = new com.cloud.grpc.DHTOuterClass.putResponse(this);
        result.success_ = success_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.cloud.grpc.DHTOuterClass.putResponse) {
          return mergeFrom((com.cloud.grpc.DHTOuterClass.putResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cloud.grpc.DHTOuterClass.putResponse other) {
        if (other == com.cloud.grpc.DHTOuterClass.putResponse.getDefaultInstance()) return this;
        if (other.getSuccess() != 0) {
          setSuccess(other.getSuccess());
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
        com.cloud.grpc.DHTOuterClass.putResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.cloud.grpc.DHTOuterClass.putResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int success_ ;
      /**
       * <code>int32 Success = 1;</code>
       */
      public int getSuccess() {
        return success_;
      }
      /**
       * <code>int32 Success = 1;</code>
       */
      public Builder setSuccess(int value) {
        
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 Success = 1;</code>
       */
      public Builder clearSuccess() {
        
        success_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:putResponse)
    }

    // @@protoc_insertion_point(class_scope:putResponse)
    private static final com.cloud.grpc.DHTOuterClass.putResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.cloud.grpc.DHTOuterClass.putResponse();
    }

    public static com.cloud.grpc.DHTOuterClass.putResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<putResponse>
        PARSER = new com.google.protobuf.AbstractParser<putResponse>() {
      @java.lang.Override
      public putResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new putResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<putResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<putResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.cloud.grpc.DHTOuterClass.putResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_putRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_putRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_putResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_putResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tDHT.proto\"+\n\ngetRequest\022\013\n\003Key\030\001 \001(\003\022\020" +
      "\n\010ServerNo\030\002 \001(\005\"+\n\013getResponse\022\013\n\003Val\030\001" +
      " \001(\014\022\017\n\007version\030\002 \001(\005\"I\n\nputRequest\022\013\n\003K" +
      "ey\030\001 \001(\003\022\013\n\003Val\030\002 \001(\014\022\017\n\007version\030\003 \001(\005\022\020" +
      "\n\010ServerNo\030\004 \001(\005\"\036\n\013putResponse\022\017\n\007Succe" +
      "ss\030\001 \001(\0052I\n\003DHT\022 \n\003get\022\013.getRequest\032\014.ge" +
      "tResponse\022 \n\003put\022\013.putRequest\032\014.putRespo" +
      "nseB\020\n\016com.cloud.grpcb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_getRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_getRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getRequest_descriptor,
        new java.lang.String[] { "Key", "ServerNo", });
    internal_static_getResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_getResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getResponse_descriptor,
        new java.lang.String[] { "Val", "Version", });
    internal_static_putRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_putRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_putRequest_descriptor,
        new java.lang.String[] { "Key", "Val", "Version", "ServerNo", });
    internal_static_putResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_putResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_putResponse_descriptor,
        new java.lang.String[] { "Success", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
