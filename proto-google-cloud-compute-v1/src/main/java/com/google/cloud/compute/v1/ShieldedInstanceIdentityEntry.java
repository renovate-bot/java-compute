/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * A Shielded Instance Identity Entry.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ShieldedInstanceIdentityEntry}
 */
public final class ShieldedInstanceIdentityEntry extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ShieldedInstanceIdentityEntry)
    ShieldedInstanceIdentityEntryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ShieldedInstanceIdentityEntry.newBuilder() to construct.
  private ShieldedInstanceIdentityEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ShieldedInstanceIdentityEntry() {
    ekCert_ = "";
    ekPub_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ShieldedInstanceIdentityEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ShieldedInstanceIdentityEntry(
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
          case 324099874:
            {
              java.lang.String s = input.readStringRequireUtf8();

              ekPub_ = s;
              break;
            }
          case 1453945066:
            {
              java.lang.String s = input.readStringRequireUtf8();

              ekCert_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ShieldedInstanceIdentityEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ShieldedInstanceIdentityEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.class,
            com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.Builder.class);
  }

  public static final int EK_CERT_FIELD_NUMBER = 181743133;
  private volatile java.lang.Object ekCert_;
  /**
   *
   *
   * <pre>
   * A PEM-encoded X.509 certificate. This field can be empty.
   * </pre>
   *
   * <code>string ek_cert = 181743133;</code>
   *
   * @return The ekCert.
   */
  @java.lang.Override
  public java.lang.String getEkCert() {
    java.lang.Object ref = ekCert_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ekCert_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A PEM-encoded X.509 certificate. This field can be empty.
   * </pre>
   *
   * <code>string ek_cert = 181743133;</code>
   *
   * @return The bytes for ekCert.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEkCertBytes() {
    java.lang.Object ref = ekCert_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ekCert_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EK_PUB_FIELD_NUMBER = 40512484;
  private volatile java.lang.Object ekPub_;
  /**
   *
   *
   * <pre>
   * A PEM-encoded public key.
   * </pre>
   *
   * <code>string ek_pub = 40512484;</code>
   *
   * @return The ekPub.
   */
  @java.lang.Override
  public java.lang.String getEkPub() {
    java.lang.Object ref = ekPub_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ekPub_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A PEM-encoded public key.
   * </pre>
   *
   * <code>string ek_pub = 40512484;</code>
   *
   * @return The bytes for ekPub.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEkPubBytes() {
    java.lang.Object ref = ekPub_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ekPub_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getEkPubBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 40512484, ekPub_);
    }
    if (!getEkCertBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 181743133, ekCert_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEkPubBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(40512484, ekPub_);
    }
    if (!getEkCertBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(181743133, ekCert_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry other =
        (com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry) obj;

    if (!getEkCert().equals(other.getEkCert())) return false;
    if (!getEkPub().equals(other.getEkPub())) return false;
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
    hash = (37 * hash) + EK_CERT_FIELD_NUMBER;
    hash = (53 * hash) + getEkCert().hashCode();
    hash = (37 * hash) + EK_PUB_FIELD_NUMBER;
    hash = (53 * hash) + getEkPub().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A Shielded Instance Identity Entry.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ShieldedInstanceIdentityEntry}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ShieldedInstanceIdentityEntry)
      com.google.cloud.compute.v1.ShieldedInstanceIdentityEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ShieldedInstanceIdentityEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ShieldedInstanceIdentityEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.class,
              com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      ekCert_ = "";

      ekPub_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ShieldedInstanceIdentityEntry_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry build() {
      com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry buildPartial() {
      com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry result =
          new com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry(this);
      result.ekCert_ = ekCert_;
      result.ekPub_ = ekPub_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry) {
        return mergeFrom((com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry other) {
      if (other == com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.getDefaultInstance())
        return this;
      if (!other.getEkCert().isEmpty()) {
        ekCert_ = other.ekCert_;
        onChanged();
      }
      if (!other.getEkPub().isEmpty()) {
        ekPub_ = other.ekPub_;
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
      com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ekCert_ = "";
    /**
     *
     *
     * <pre>
     * A PEM-encoded X.509 certificate. This field can be empty.
     * </pre>
     *
     * <code>string ek_cert = 181743133;</code>
     *
     * @return The ekCert.
     */
    public java.lang.String getEkCert() {
      java.lang.Object ref = ekCert_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ekCert_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded X.509 certificate. This field can be empty.
     * </pre>
     *
     * <code>string ek_cert = 181743133;</code>
     *
     * @return The bytes for ekCert.
     */
    public com.google.protobuf.ByteString getEkCertBytes() {
      java.lang.Object ref = ekCert_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ekCert_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded X.509 certificate. This field can be empty.
     * </pre>
     *
     * <code>string ek_cert = 181743133;</code>
     *
     * @param value The ekCert to set.
     * @return This builder for chaining.
     */
    public Builder setEkCert(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      ekCert_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded X.509 certificate. This field can be empty.
     * </pre>
     *
     * <code>string ek_cert = 181743133;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEkCert() {

      ekCert_ = getDefaultInstance().getEkCert();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded X.509 certificate. This field can be empty.
     * </pre>
     *
     * <code>string ek_cert = 181743133;</code>
     *
     * @param value The bytes for ekCert to set.
     * @return This builder for chaining.
     */
    public Builder setEkCertBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      ekCert_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ekPub_ = "";
    /**
     *
     *
     * <pre>
     * A PEM-encoded public key.
     * </pre>
     *
     * <code>string ek_pub = 40512484;</code>
     *
     * @return The ekPub.
     */
    public java.lang.String getEkPub() {
      java.lang.Object ref = ekPub_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ekPub_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded public key.
     * </pre>
     *
     * <code>string ek_pub = 40512484;</code>
     *
     * @return The bytes for ekPub.
     */
    public com.google.protobuf.ByteString getEkPubBytes() {
      java.lang.Object ref = ekPub_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ekPub_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded public key.
     * </pre>
     *
     * <code>string ek_pub = 40512484;</code>
     *
     * @param value The ekPub to set.
     * @return This builder for chaining.
     */
    public Builder setEkPub(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      ekPub_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded public key.
     * </pre>
     *
     * <code>string ek_pub = 40512484;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEkPub() {

      ekPub_ = getDefaultInstance().getEkPub();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded public key.
     * </pre>
     *
     * <code>string ek_pub = 40512484;</code>
     *
     * @param value The bytes for ekPub to set.
     * @return This builder for chaining.
     */
    public Builder setEkPubBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      ekPub_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ShieldedInstanceIdentityEntry)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ShieldedInstanceIdentityEntry)
  private static final com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry();
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShieldedInstanceIdentityEntry> PARSER =
      new com.google.protobuf.AbstractParser<ShieldedInstanceIdentityEntry>() {
        @java.lang.Override
        public ShieldedInstanceIdentityEntry parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ShieldedInstanceIdentityEntry(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ShieldedInstanceIdentityEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShieldedInstanceIdentityEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}