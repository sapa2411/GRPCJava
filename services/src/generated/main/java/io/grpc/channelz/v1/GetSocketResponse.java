// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

/**
 * Protobuf type {@code grpc.channelz.v1.GetSocketResponse}
 */
public  final class GetSocketResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.channelz.v1.GetSocketResponse)
    GetSocketResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSocketResponse.newBuilder() to construct.
  private GetSocketResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSocketResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetSocketResponse(
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
            io.grpc.channelz.v1.Socket.Builder subBuilder = null;
            if (socket_ != null) {
              subBuilder = socket_.toBuilder();
            }
            socket_ = input.readMessage(io.grpc.channelz.v1.Socket.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(socket_);
              socket_ = subBuilder.buildPartial();
            }

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
    return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetSocketResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetSocketResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.channelz.v1.GetSocketResponse.class, io.grpc.channelz.v1.GetSocketResponse.Builder.class);
  }

  public static final int SOCKET_FIELD_NUMBER = 1;
  private io.grpc.channelz.v1.Socket socket_;
  /**
   * <pre>
   * The Socket that corresponds to the requested socket_id.  This field
   * should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Socket socket = 1;</code>
   */
  public boolean hasSocket() {
    return socket_ != null;
  }
  /**
   * <pre>
   * The Socket that corresponds to the requested socket_id.  This field
   * should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Socket socket = 1;</code>
   */
  public io.grpc.channelz.v1.Socket getSocket() {
    return socket_ == null ? io.grpc.channelz.v1.Socket.getDefaultInstance() : socket_;
  }
  /**
   * <pre>
   * The Socket that corresponds to the requested socket_id.  This field
   * should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Socket socket = 1;</code>
   */
  public io.grpc.channelz.v1.SocketOrBuilder getSocketOrBuilder() {
    return getSocket();
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
    if (socket_ != null) {
      output.writeMessage(1, getSocket());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (socket_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSocket());
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
    if (!(obj instanceof io.grpc.channelz.v1.GetSocketResponse)) {
      return super.equals(obj);
    }
    io.grpc.channelz.v1.GetSocketResponse other = (io.grpc.channelz.v1.GetSocketResponse) obj;

    boolean result = true;
    result = result && (hasSocket() == other.hasSocket());
    if (hasSocket()) {
      result = result && getSocket()
          .equals(other.getSocket());
    }
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
    if (hasSocket()) {
      hash = (37 * hash) + SOCKET_FIELD_NUMBER;
      hash = (53 * hash) + getSocket().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.channelz.v1.GetSocketResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.GetSocketResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetSocketResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.GetSocketResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetSocketResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.GetSocketResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetSocketResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.GetSocketResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetSocketResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.GetSocketResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetSocketResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.GetSocketResponse parseFrom(
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
  public static Builder newBuilder(io.grpc.channelz.v1.GetSocketResponse prototype) {
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
   * Protobuf type {@code grpc.channelz.v1.GetSocketResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.channelz.v1.GetSocketResponse)
      io.grpc.channelz.v1.GetSocketResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetSocketResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetSocketResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.channelz.v1.GetSocketResponse.class, io.grpc.channelz.v1.GetSocketResponse.Builder.class);
    }

    // Construct using io.grpc.channelz.v1.GetSocketResponse.newBuilder()
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
      if (socketBuilder_ == null) {
        socket_ = null;
      } else {
        socket_ = null;
        socketBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetSocketResponse_descriptor;
    }

    @java.lang.Override
    public io.grpc.channelz.v1.GetSocketResponse getDefaultInstanceForType() {
      return io.grpc.channelz.v1.GetSocketResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.channelz.v1.GetSocketResponse build() {
      io.grpc.channelz.v1.GetSocketResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.channelz.v1.GetSocketResponse buildPartial() {
      io.grpc.channelz.v1.GetSocketResponse result = new io.grpc.channelz.v1.GetSocketResponse(this);
      if (socketBuilder_ == null) {
        result.socket_ = socket_;
      } else {
        result.socket_ = socketBuilder_.build();
      }
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
      if (other instanceof io.grpc.channelz.v1.GetSocketResponse) {
        return mergeFrom((io.grpc.channelz.v1.GetSocketResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.channelz.v1.GetSocketResponse other) {
      if (other == io.grpc.channelz.v1.GetSocketResponse.getDefaultInstance()) return this;
      if (other.hasSocket()) {
        mergeSocket(other.getSocket());
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
      io.grpc.channelz.v1.GetSocketResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.channelz.v1.GetSocketResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grpc.channelz.v1.Socket socket_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.channelz.v1.Socket, io.grpc.channelz.v1.Socket.Builder, io.grpc.channelz.v1.SocketOrBuilder> socketBuilder_;
    /**
     * <pre>
     * The Socket that corresponds to the requested socket_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Socket socket = 1;</code>
     */
    public boolean hasSocket() {
      return socketBuilder_ != null || socket_ != null;
    }
    /**
     * <pre>
     * The Socket that corresponds to the requested socket_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Socket socket = 1;</code>
     */
    public io.grpc.channelz.v1.Socket getSocket() {
      if (socketBuilder_ == null) {
        return socket_ == null ? io.grpc.channelz.v1.Socket.getDefaultInstance() : socket_;
      } else {
        return socketBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Socket that corresponds to the requested socket_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Socket socket = 1;</code>
     */
    public Builder setSocket(io.grpc.channelz.v1.Socket value) {
      if (socketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        socket_ = value;
        onChanged();
      } else {
        socketBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Socket that corresponds to the requested socket_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Socket socket = 1;</code>
     */
    public Builder setSocket(
        io.grpc.channelz.v1.Socket.Builder builderForValue) {
      if (socketBuilder_ == null) {
        socket_ = builderForValue.build();
        onChanged();
      } else {
        socketBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Socket that corresponds to the requested socket_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Socket socket = 1;</code>
     */
    public Builder mergeSocket(io.grpc.channelz.v1.Socket value) {
      if (socketBuilder_ == null) {
        if (socket_ != null) {
          socket_ =
            io.grpc.channelz.v1.Socket.newBuilder(socket_).mergeFrom(value).buildPartial();
        } else {
          socket_ = value;
        }
        onChanged();
      } else {
        socketBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Socket that corresponds to the requested socket_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Socket socket = 1;</code>
     */
    public Builder clearSocket() {
      if (socketBuilder_ == null) {
        socket_ = null;
        onChanged();
      } else {
        socket_ = null;
        socketBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Socket that corresponds to the requested socket_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Socket socket = 1;</code>
     */
    public io.grpc.channelz.v1.Socket.Builder getSocketBuilder() {
      
      onChanged();
      return getSocketFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Socket that corresponds to the requested socket_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Socket socket = 1;</code>
     */
    public io.grpc.channelz.v1.SocketOrBuilder getSocketOrBuilder() {
      if (socketBuilder_ != null) {
        return socketBuilder_.getMessageOrBuilder();
      } else {
        return socket_ == null ?
            io.grpc.channelz.v1.Socket.getDefaultInstance() : socket_;
      }
    }
    /**
     * <pre>
     * The Socket that corresponds to the requested socket_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Socket socket = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.channelz.v1.Socket, io.grpc.channelz.v1.Socket.Builder, io.grpc.channelz.v1.SocketOrBuilder> 
        getSocketFieldBuilder() {
      if (socketBuilder_ == null) {
        socketBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.channelz.v1.Socket, io.grpc.channelz.v1.Socket.Builder, io.grpc.channelz.v1.SocketOrBuilder>(
                getSocket(),
                getParentForChildren(),
                isClean());
        socket_ = null;
      }
      return socketBuilder_;
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


    // @@protoc_insertion_point(builder_scope:grpc.channelz.v1.GetSocketResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.channelz.v1.GetSocketResponse)
  private static final io.grpc.channelz.v1.GetSocketResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.channelz.v1.GetSocketResponse();
  }

  public static io.grpc.channelz.v1.GetSocketResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSocketResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetSocketResponse>() {
    @java.lang.Override
    public GetSocketResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetSocketResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetSocketResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSocketResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.channelz.v1.GetSocketResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

