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
 * Informational metadata about Partner attachments from Partners to display to customers. These fields are propagated from PARTNER_PROVIDER attachments to their corresponding PARTNER attachments.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata}
 */
public final class InterconnectAttachmentPartnerMetadata
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)
    InterconnectAttachmentPartnerMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InterconnectAttachmentPartnerMetadata.newBuilder() to construct.
  private InterconnectAttachmentPartnerMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InterconnectAttachmentPartnerMetadata() {
    interconnectName_ = "";
    partnerName_ = "";
    portalUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InterconnectAttachmentPartnerMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InterconnectAttachmentPartnerMetadata(
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
          case 5978338:
            {
              java.lang.String s = input.readStringRequireUtf8();

              portalUrl_ = s;
              break;
            }
          case 1293982994:
            {
              java.lang.String s = input.readStringRequireUtf8();

              partnerName_ = s;
              break;
            }
          case 1972223202:
            {
              java.lang.String s = input.readStringRequireUtf8();

              interconnectName_ = s;
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
        .internal_static_google_cloud_compute_v1_InterconnectAttachmentPartnerMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectAttachmentPartnerMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.class,
            com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.Builder.class);
  }

  public static final int INTERCONNECT_NAME_FIELD_NUMBER = 246527900;
  private volatile java.lang.Object interconnectName_;
  /**
   *
   *
   * <pre>
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>string interconnect_name = 246527900;</code>
   *
   * @return The interconnectName.
   */
  @java.lang.Override
  public java.lang.String getInterconnectName() {
    java.lang.Object ref = interconnectName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      interconnectName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>string interconnect_name = 246527900;</code>
   *
   * @return The bytes for interconnectName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInterconnectNameBytes() {
    java.lang.Object ref = interconnectName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      interconnectName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTNER_NAME_FIELD_NUMBER = 161747874;
  private volatile java.lang.Object partnerName_;
  /**
   *
   *
   * <pre>
   * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>string partner_name = 161747874;</code>
   *
   * @return The partnerName.
   */
  @java.lang.Override
  public java.lang.String getPartnerName() {
    java.lang.Object ref = partnerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partnerName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>string partner_name = 161747874;</code>
   *
   * @return The bytes for partnerName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPartnerNameBytes() {
    java.lang.Object ref = partnerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      partnerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORTAL_URL_FIELD_NUMBER = 747292;
  private volatile java.lang.Object portalUrl_;
  /**
   *
   *
   * <pre>
   * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>string portal_url = 747292;</code>
   *
   * @return The portalUrl.
   */
  @java.lang.Override
  public java.lang.String getPortalUrl() {
    java.lang.Object ref = portalUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      portalUrl_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>string portal_url = 747292;</code>
   *
   * @return The bytes for portalUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPortalUrlBytes() {
    java.lang.Object ref = portalUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      portalUrl_ = b;
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
    if (!getPortalUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 747292, portalUrl_);
    }
    if (!getPartnerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 161747874, partnerName_);
    }
    if (!getInterconnectNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 246527900, interconnectName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPortalUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(747292, portalUrl_);
    }
    if (!getPartnerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(161747874, partnerName_);
    }
    if (!getInterconnectNameBytes().isEmpty()) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(246527900, interconnectName_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata other =
        (com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata) obj;

    if (!getInterconnectName().equals(other.getInterconnectName())) return false;
    if (!getPartnerName().equals(other.getPartnerName())) return false;
    if (!getPortalUrl().equals(other.getPortalUrl())) return false;
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
    hash = (37 * hash) + INTERCONNECT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getInterconnectName().hashCode();
    hash = (37 * hash) + PARTNER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPartnerName().hashCode();
    hash = (37 * hash) + PORTAL_URL_FIELD_NUMBER;
    hash = (53 * hash) + getPortalUrl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
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
      com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata prototype) {
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
   * Informational metadata about Partner attachments from Partners to display to customers. These fields are propagated from PARTNER_PROVIDER attachments to their corresponding PARTNER attachments.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)
      com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectAttachmentPartnerMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectAttachmentPartnerMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.class,
              com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.newBuilder()
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
      interconnectName_ = "";

      partnerName_ = "";

      portalUrl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectAttachmentPartnerMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata build() {
      com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata buildPartial() {
      com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata result =
          new com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata(this);
      result.interconnectName_ = interconnectName_;
      result.partnerName_ = partnerName_;
      result.portalUrl_ = portalUrl_;
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
      if (other instanceof com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata) {
        return mergeFrom((com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata other) {
      if (other
          == com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.getDefaultInstance())
        return this;
      if (!other.getInterconnectName().isEmpty()) {
        interconnectName_ = other.interconnectName_;
        onChanged();
      }
      if (!other.getPartnerName().isEmpty()) {
        partnerName_ = other.partnerName_;
        onChanged();
      }
      if (!other.getPortalUrl().isEmpty()) {
        portalUrl_ = other.portalUrl_;
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
      com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object interconnectName_ = "";
    /**
     *
     *
     * <pre>
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string interconnect_name = 246527900;</code>
     *
     * @return The interconnectName.
     */
    public java.lang.String getInterconnectName() {
      java.lang.Object ref = interconnectName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        interconnectName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string interconnect_name = 246527900;</code>
     *
     * @return The bytes for interconnectName.
     */
    public com.google.protobuf.ByteString getInterconnectNameBytes() {
      java.lang.Object ref = interconnectName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        interconnectName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string interconnect_name = 246527900;</code>
     *
     * @param value The interconnectName to set.
     * @return This builder for chaining.
     */
    public Builder setInterconnectName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      interconnectName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string interconnect_name = 246527900;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInterconnectName() {

      interconnectName_ = getDefaultInstance().getInterconnectName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string interconnect_name = 246527900;</code>
     *
     * @param value The bytes for interconnectName to set.
     * @return This builder for chaining.
     */
    public Builder setInterconnectNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      interconnectName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object partnerName_ = "";
    /**
     *
     *
     * <pre>
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string partner_name = 161747874;</code>
     *
     * @return The partnerName.
     */
    public java.lang.String getPartnerName() {
      java.lang.Object ref = partnerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partnerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string partner_name = 161747874;</code>
     *
     * @return The bytes for partnerName.
     */
    public com.google.protobuf.ByteString getPartnerNameBytes() {
      java.lang.Object ref = partnerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        partnerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string partner_name = 161747874;</code>
     *
     * @param value The partnerName to set.
     * @return This builder for chaining.
     */
    public Builder setPartnerName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      partnerName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string partner_name = 161747874;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPartnerName() {

      partnerName_ = getDefaultInstance().getPartnerName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string partner_name = 161747874;</code>
     *
     * @param value The bytes for partnerName to set.
     * @return This builder for chaining.
     */
    public Builder setPartnerNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      partnerName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object portalUrl_ = "";
    /**
     *
     *
     * <pre>
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string portal_url = 747292;</code>
     *
     * @return The portalUrl.
     */
    public java.lang.String getPortalUrl() {
      java.lang.Object ref = portalUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        portalUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string portal_url = 747292;</code>
     *
     * @return The bytes for portalUrl.
     */
    public com.google.protobuf.ByteString getPortalUrlBytes() {
      java.lang.Object ref = portalUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        portalUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string portal_url = 747292;</code>
     *
     * @param value The portalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPortalUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      portalUrl_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string portal_url = 747292;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPortalUrl() {

      portalUrl_ = getDefaultInstance().getPortalUrl();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>string portal_url = 747292;</code>
     *
     * @param value The bytes for portalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPortalUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      portalUrl_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)
  private static final com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata();
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterconnectAttachmentPartnerMetadata> PARSER =
      new com.google.protobuf.AbstractParser<InterconnectAttachmentPartnerMetadata>() {
        @java.lang.Override
        public InterconnectAttachmentPartnerMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InterconnectAttachmentPartnerMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InterconnectAttachmentPartnerMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectAttachmentPartnerMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}