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
 * Represents a customer-supplied Signing Key used by Cloud CDN Signed URLs
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SignedUrlKey}
 */
public final class SignedUrlKey extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SignedUrlKey)
    SignedUrlKeyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SignedUrlKey.newBuilder() to construct.
  private SignedUrlKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SignedUrlKey() {
    keyName_ = "";
    keyValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SignedUrlKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SignedUrlKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SignedUrlKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SignedUrlKey.class,
            com.google.cloud.compute.v1.SignedUrlKey.Builder.class);
  }

  private int bitField0_;
  public static final int KEY_NAME_FIELD_NUMBER = 500938859;
  private volatile java.lang.Object keyName_;
  /**
   *
   *
   * <pre>
   * Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string key_name = 500938859;</code>
   *
   * @return Whether the keyName field is set.
   */
  @java.lang.Override
  public boolean hasKeyName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string key_name = 500938859;</code>
   *
   * @return The keyName.
   */
  @java.lang.Override
  public java.lang.String getKeyName() {
    java.lang.Object ref = keyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string key_name = 500938859;</code>
   *
   * @return The bytes for keyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyNameBytes() {
    java.lang.Object ref = keyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      keyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_VALUE_FIELD_NUMBER = 504106897;
  private volatile java.lang.Object keyValue_;
  /**
   *
   *
   * <pre>
   * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5 base64url encoded string.
   * </pre>
   *
   * <code>optional string key_value = 504106897;</code>
   *
   * @return Whether the keyValue field is set.
   */
  @java.lang.Override
  public boolean hasKeyValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5 base64url encoded string.
   * </pre>
   *
   * <code>optional string key_value = 504106897;</code>
   *
   * @return The keyValue.
   */
  @java.lang.Override
  public java.lang.String getKeyValue() {
    java.lang.Object ref = keyValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyValue_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5 base64url encoded string.
   * </pre>
   *
   * <code>optional string key_value = 504106897;</code>
   *
   * @return The bytes for keyValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyValueBytes() {
    java.lang.Object ref = keyValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      keyValue_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 500938859, keyName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 504106897, keyValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(500938859, keyName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(504106897, keyValue_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.SignedUrlKey)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SignedUrlKey other = (com.google.cloud.compute.v1.SignedUrlKey) obj;

    if (hasKeyName() != other.hasKeyName()) return false;
    if (hasKeyName()) {
      if (!getKeyName().equals(other.getKeyName())) return false;
    }
    if (hasKeyValue() != other.hasKeyValue()) return false;
    if (hasKeyValue()) {
      if (!getKeyValue().equals(other.getKeyValue())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasKeyName()) {
      hash = (37 * hash) + KEY_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getKeyName().hashCode();
    }
    if (hasKeyValue()) {
      hash = (37 * hash) + KEY_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getKeyValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SignedUrlKey parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.SignedUrlKey prototype) {
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
   * Represents a customer-supplied Signing Key used by Cloud CDN Signed URLs
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SignedUrlKey}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SignedUrlKey)
      com.google.cloud.compute.v1.SignedUrlKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SignedUrlKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SignedUrlKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SignedUrlKey.class,
              com.google.cloud.compute.v1.SignedUrlKey.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SignedUrlKey.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      keyName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      keyValue_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SignedUrlKey_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SignedUrlKey getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SignedUrlKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SignedUrlKey build() {
      com.google.cloud.compute.v1.SignedUrlKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SignedUrlKey buildPartial() {
      com.google.cloud.compute.v1.SignedUrlKey result =
          new com.google.cloud.compute.v1.SignedUrlKey(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.keyName_ = keyName_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.keyValue_ = keyValue_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.SignedUrlKey) {
        return mergeFrom((com.google.cloud.compute.v1.SignedUrlKey) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SignedUrlKey other) {
      if (other == com.google.cloud.compute.v1.SignedUrlKey.getDefaultInstance()) return this;
      if (other.hasKeyName()) {
        bitField0_ |= 0x00000001;
        keyName_ = other.keyName_;
        onChanged();
      }
      if (other.hasKeyValue()) {
        bitField0_ |= 0x00000002;
        keyValue_ = other.keyValue_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case -287456422:
              {
                keyName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case -287456422
            case -262112118:
              {
                keyValue_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case -262112118
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object keyName_ = "";
    /**
     *
     *
     * <pre>
     * Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * </pre>
     *
     * <code>optional string key_name = 500938859;</code>
     *
     * @return Whether the keyName field is set.
     */
    public boolean hasKeyName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * </pre>
     *
     * <code>optional string key_name = 500938859;</code>
     *
     * @return The keyName.
     */
    public java.lang.String getKeyName() {
      java.lang.Object ref = keyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * </pre>
     *
     * <code>optional string key_name = 500938859;</code>
     *
     * @return The bytes for keyName.
     */
    public com.google.protobuf.ByteString getKeyNameBytes() {
      java.lang.Object ref = keyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        keyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * </pre>
     *
     * <code>optional string key_name = 500938859;</code>
     *
     * @param value The keyName to set.
     * @return This builder for chaining.
     */
    public Builder setKeyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      keyName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * </pre>
     *
     * <code>optional string key_name = 500938859;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeyName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      keyName_ = getDefaultInstance().getKeyName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * </pre>
     *
     * <code>optional string key_name = 500938859;</code>
     *
     * @param value The bytes for keyName to set.
     * @return This builder for chaining.
     */
    public Builder setKeyNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      keyName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object keyValue_ = "";
    /**
     *
     *
     * <pre>
     * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5 base64url encoded string.
     * </pre>
     *
     * <code>optional string key_value = 504106897;</code>
     *
     * @return Whether the keyValue field is set.
     */
    public boolean hasKeyValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5 base64url encoded string.
     * </pre>
     *
     * <code>optional string key_value = 504106897;</code>
     *
     * @return The keyValue.
     */
    public java.lang.String getKeyValue() {
      java.lang.Object ref = keyValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5 base64url encoded string.
     * </pre>
     *
     * <code>optional string key_value = 504106897;</code>
     *
     * @return The bytes for keyValue.
     */
    public com.google.protobuf.ByteString getKeyValueBytes() {
      java.lang.Object ref = keyValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        keyValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5 base64url encoded string.
     * </pre>
     *
     * <code>optional string key_value = 504106897;</code>
     *
     * @param value The keyValue to set.
     * @return This builder for chaining.
     */
    public Builder setKeyValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      keyValue_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5 base64url encoded string.
     * </pre>
     *
     * <code>optional string key_value = 504106897;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeyValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      keyValue_ = getDefaultInstance().getKeyValue();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5 base64url encoded string.
     * </pre>
     *
     * <code>optional string key_value = 504106897;</code>
     *
     * @param value The bytes for keyValue to set.
     * @return This builder for chaining.
     */
    public Builder setKeyValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      keyValue_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SignedUrlKey)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SignedUrlKey)
  private static final com.google.cloud.compute.v1.SignedUrlKey DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SignedUrlKey();
  }

  public static com.google.cloud.compute.v1.SignedUrlKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignedUrlKey> PARSER =
      new com.google.protobuf.AbstractParser<SignedUrlKey>() {
        @java.lang.Override
        public SignedUrlKey parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<SignedUrlKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignedUrlKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SignedUrlKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
