// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.keyvalue.web.repository;

/**
 * Protobuf type {@code helloworld.TestAndSetRequest}
 */
public final class TestAndSetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helloworld.TestAndSetRequest)
    TestAndSetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TestAndSetRequest.newBuilder() to construct.
  private TestAndSetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestAndSetRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TestAndSetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TestAndSetRequest(
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

            k_ = input.readInt64();
            break;
          }
          case 18: {
            com.keyvalue.web.repository.VTripla.Builder subBuilder = null;
            if (v_ != null) {
              subBuilder = v_.toBuilder();
            }
            v_ = input.readMessage(com.keyvalue.web.repository.VTripla.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(v_);
              v_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            vers_ = input.readInt64();
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
    return com.keyvalue.web.repository.HelloWorldProto.internal_static_helloworld_TestAndSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.keyvalue.web.repository.HelloWorldProto.internal_static_helloworld_TestAndSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.keyvalue.web.repository.TestAndSetRequest.class, com.keyvalue.web.repository.TestAndSetRequest.Builder.class);
  }

  public static final int K_FIELD_NUMBER = 1;
  private long k_;
  /**
   * <code>int64 k = 1;</code>
   * @return The k.
   */
  @java.lang.Override
  public long getK() {
    return k_;
  }

  public static final int V_FIELD_NUMBER = 2;
  private com.keyvalue.web.repository.VTripla v_;
  /**
   * <code>.helloworld.VTripla v = 2;</code>
   * @return Whether the v field is set.
   */
  @java.lang.Override
  public boolean hasV() {
    return v_ != null;
  }
  /**
   * <code>.helloworld.VTripla v = 2;</code>
   * @return The v.
   */
  @java.lang.Override
  public com.keyvalue.web.repository.VTripla getV() {
    return v_ == null ? com.keyvalue.web.repository.VTripla.getDefaultInstance() : v_;
  }
  /**
   * <code>.helloworld.VTripla v = 2;</code>
   */
  @java.lang.Override
  public com.keyvalue.web.repository.VTriplaOrBuilder getVOrBuilder() {
    return getV();
  }

  public static final int VERS_FIELD_NUMBER = 3;
  private long vers_;
  /**
   * <code>int64 vers = 3;</code>
   * @return The vers.
   */
  @java.lang.Override
  public long getVers() {
    return vers_;
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
    if (k_ != 0L) {
      output.writeInt64(1, k_);
    }
    if (v_ != null) {
      output.writeMessage(2, getV());
    }
    if (vers_ != 0L) {
      output.writeInt64(3, vers_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (k_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, k_);
    }
    if (v_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getV());
    }
    if (vers_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, vers_);
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
    if (!(obj instanceof com.keyvalue.web.repository.TestAndSetRequest)) {
      return super.equals(obj);
    }
    com.keyvalue.web.repository.TestAndSetRequest other = (com.keyvalue.web.repository.TestAndSetRequest) obj;

    if (getK()
        != other.getK()) return false;
    if (hasV() != other.hasV()) return false;
    if (hasV()) {
      if (!getV()
          .equals(other.getV())) return false;
    }
    if (getVers()
        != other.getVers()) return false;
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
    hash = (37 * hash) + K_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getK());
    if (hasV()) {
      hash = (37 * hash) + V_FIELD_NUMBER;
      hash = (53 * hash) + getV().hashCode();
    }
    hash = (37 * hash) + VERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVers());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.keyvalue.web.repository.TestAndSetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.keyvalue.web.repository.TestAndSetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.keyvalue.web.repository.TestAndSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.keyvalue.web.repository.TestAndSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.keyvalue.web.repository.TestAndSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.keyvalue.web.repository.TestAndSetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.keyvalue.web.repository.TestAndSetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.keyvalue.web.repository.TestAndSetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.keyvalue.web.repository.TestAndSetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.keyvalue.web.repository.TestAndSetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.keyvalue.web.repository.TestAndSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.keyvalue.web.repository.TestAndSetRequest parseFrom(
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
  public static Builder newBuilder(com.keyvalue.web.repository.TestAndSetRequest prototype) {
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
   * Protobuf type {@code helloworld.TestAndSetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.TestAndSetRequest)
      com.keyvalue.web.repository.TestAndSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.keyvalue.web.repository.HelloWorldProto.internal_static_helloworld_TestAndSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.keyvalue.web.repository.HelloWorldProto.internal_static_helloworld_TestAndSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.keyvalue.web.repository.TestAndSetRequest.class, com.keyvalue.web.repository.TestAndSetRequest.Builder.class);
    }

    // Construct using com.keyvalue.web.repository.TestAndSetRequest.newBuilder()
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
      k_ = 0L;

      if (vBuilder_ == null) {
        v_ = null;
      } else {
        v_ = null;
        vBuilder_ = null;
      }
      vers_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.keyvalue.web.repository.HelloWorldProto.internal_static_helloworld_TestAndSetRequest_descriptor;
    }

    @java.lang.Override
    public com.keyvalue.web.repository.TestAndSetRequest getDefaultInstanceForType() {
      return com.keyvalue.web.repository.TestAndSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.keyvalue.web.repository.TestAndSetRequest build() {
      com.keyvalue.web.repository.TestAndSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.keyvalue.web.repository.TestAndSetRequest buildPartial() {
      com.keyvalue.web.repository.TestAndSetRequest result = new com.keyvalue.web.repository.TestAndSetRequest(this);
      result.k_ = k_;
      if (vBuilder_ == null) {
        result.v_ = v_;
      } else {
        result.v_ = vBuilder_.build();
      }
      result.vers_ = vers_;
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
      if (other instanceof com.keyvalue.web.repository.TestAndSetRequest) {
        return mergeFrom((com.keyvalue.web.repository.TestAndSetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.keyvalue.web.repository.TestAndSetRequest other) {
      if (other == com.keyvalue.web.repository.TestAndSetRequest.getDefaultInstance()) return this;
      if (other.getK() != 0L) {
        setK(other.getK());
      }
      if (other.hasV()) {
        mergeV(other.getV());
      }
      if (other.getVers() != 0L) {
        setVers(other.getVers());
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
      com.keyvalue.web.repository.TestAndSetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.keyvalue.web.repository.TestAndSetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long k_ ;
    /**
     * <code>int64 k = 1;</code>
     * @return The k.
     */
    @java.lang.Override
    public long getK() {
      return k_;
    }
    /**
     * <code>int64 k = 1;</code>
     * @param value The k to set.
     * @return This builder for chaining.
     */
    public Builder setK(long value) {
      
      k_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 k = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearK() {
      
      k_ = 0L;
      onChanged();
      return this;
    }

    private com.keyvalue.web.repository.VTripla v_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.keyvalue.web.repository.VTripla, com.keyvalue.web.repository.VTripla.Builder, com.keyvalue.web.repository.VTriplaOrBuilder> vBuilder_;
    /**
     * <code>.helloworld.VTripla v = 2;</code>
     * @return Whether the v field is set.
     */
    public boolean hasV() {
      return vBuilder_ != null || v_ != null;
    }
    /**
     * <code>.helloworld.VTripla v = 2;</code>
     * @return The v.
     */
    public com.keyvalue.web.repository.VTripla getV() {
      if (vBuilder_ == null) {
        return v_ == null ? com.keyvalue.web.repository.VTripla.getDefaultInstance() : v_;
      } else {
        return vBuilder_.getMessage();
      }
    }
    /**
     * <code>.helloworld.VTripla v = 2;</code>
     */
    public Builder setV(com.keyvalue.web.repository.VTripla value) {
      if (vBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        v_ = value;
        onChanged();
      } else {
        vBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.helloworld.VTripla v = 2;</code>
     */
    public Builder setV(
        com.keyvalue.web.repository.VTripla.Builder builderForValue) {
      if (vBuilder_ == null) {
        v_ = builderForValue.build();
        onChanged();
      } else {
        vBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.helloworld.VTripla v = 2;</code>
     */
    public Builder mergeV(com.keyvalue.web.repository.VTripla value) {
      if (vBuilder_ == null) {
        if (v_ != null) {
          v_ =
            com.keyvalue.web.repository.VTripla.newBuilder(v_).mergeFrom(value).buildPartial();
        } else {
          v_ = value;
        }
        onChanged();
      } else {
        vBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.helloworld.VTripla v = 2;</code>
     */
    public Builder clearV() {
      if (vBuilder_ == null) {
        v_ = null;
        onChanged();
      } else {
        v_ = null;
        vBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.helloworld.VTripla v = 2;</code>
     */
    public com.keyvalue.web.repository.VTripla.Builder getVBuilder() {
      
      onChanged();
      return getVFieldBuilder().getBuilder();
    }
    /**
     * <code>.helloworld.VTripla v = 2;</code>
     */
    public com.keyvalue.web.repository.VTriplaOrBuilder getVOrBuilder() {
      if (vBuilder_ != null) {
        return vBuilder_.getMessageOrBuilder();
      } else {
        return v_ == null ?
            com.keyvalue.web.repository.VTripla.getDefaultInstance() : v_;
      }
    }
    /**
     * <code>.helloworld.VTripla v = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.keyvalue.web.repository.VTripla, com.keyvalue.web.repository.VTripla.Builder, com.keyvalue.web.repository.VTriplaOrBuilder> 
        getVFieldBuilder() {
      if (vBuilder_ == null) {
        vBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.keyvalue.web.repository.VTripla, com.keyvalue.web.repository.VTripla.Builder, com.keyvalue.web.repository.VTriplaOrBuilder>(
                getV(),
                getParentForChildren(),
                isClean());
        v_ = null;
      }
      return vBuilder_;
    }

    private long vers_ ;
    /**
     * <code>int64 vers = 3;</code>
     * @return The vers.
     */
    @java.lang.Override
    public long getVers() {
      return vers_;
    }
    /**
     * <code>int64 vers = 3;</code>
     * @param value The vers to set.
     * @return This builder for chaining.
     */
    public Builder setVers(long value) {
      
      vers_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 vers = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVers() {
      
      vers_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:helloworld.TestAndSetRequest)
  }

  // @@protoc_insertion_point(class_scope:helloworld.TestAndSetRequest)
  private static final com.keyvalue.web.repository.TestAndSetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.keyvalue.web.repository.TestAndSetRequest();
  }

  public static com.keyvalue.web.repository.TestAndSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestAndSetRequest>
      PARSER = new com.google.protobuf.AbstractParser<TestAndSetRequest>() {
    @java.lang.Override
    public TestAndSetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TestAndSetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TestAndSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestAndSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.keyvalue.web.repository.TestAndSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

