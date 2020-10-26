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
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest}
 */
public final class ProjectsSetDefaultNetworkTierRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest)
    ProjectsSetDefaultNetworkTierRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProjectsSetDefaultNetworkTierRequest.newBuilder() to construct.
  private ProjectsSetDefaultNetworkTierRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProjectsSetDefaultNetworkTierRequest() {
    networkTier_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProjectsSetDefaultNetworkTierRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ProjectsSetDefaultNetworkTierRequest(
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
          case -155784552:
            {
              int rawValue = input.readEnum();

              networkTier_ = rawValue;
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
        .internal_static_google_cloud_compute_v1_ProjectsSetDefaultNetworkTierRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ProjectsSetDefaultNetworkTierRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.class,
            com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Default network tier to be set.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier}
   */
  public enum NetworkTier implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_NETWORK_TIER = 0;</code>
     */
    UNDEFINED_NETWORK_TIER(0),
    /** <code>PREMIUM = 399530551;</code> */
    PREMIUM(399530551),
    /** <code>STANDARD = 484642493;</code> */
    STANDARD(484642493),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_NETWORK_TIER = 0;</code>
     */
    public static final int UNDEFINED_NETWORK_TIER_VALUE = 0;
    /** <code>PREMIUM = 399530551;</code> */
    public static final int PREMIUM_VALUE = 399530551;
    /** <code>STANDARD = 484642493;</code> */
    public static final int STANDARD_VALUE = 484642493;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NetworkTier valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NetworkTier forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_NETWORK_TIER;
        case 399530551:
          return PREMIUM;
        case 484642493:
          return STANDARD;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NetworkTier> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<NetworkTier> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NetworkTier>() {
          public NetworkTier findValueByNumber(int number) {
            return NetworkTier.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final NetworkTier[] VALUES = values();

    public static NetworkTier valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private NetworkTier(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier)
  }

  public static final int NETWORK_TIER_FIELD_NUMBER = 517397843;
  private int networkTier_;
  /**
   *
   *
   * <pre>
   * Default network tier to be set.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier network_tier = 517397843;
   * </code>
   *
   * @return The enum numeric value on the wire for networkTier.
   */
  @java.lang.Override
  public int getNetworkTierValue() {
    return networkTier_;
  }
  /**
   *
   *
   * <pre>
   * Default network tier to be set.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier network_tier = 517397843;
   * </code>
   *
   * @return The networkTier.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier
      getNetworkTier() {
    @SuppressWarnings("deprecation")
    com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier result =
        com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier.valueOf(
            networkTier_);
    return result == null
        ? com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier.UNRECOGNIZED
        : result;
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
    if (networkTier_
        != com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier
            .UNDEFINED_NETWORK_TIER
            .getNumber()) {
      output.writeEnum(517397843, networkTier_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (networkTier_
        != com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier
            .UNDEFINED_NETWORK_TIER
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(517397843, networkTier_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest other =
        (com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest) obj;

    if (networkTier_ != other.networkTier_) return false;
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
    hash = (37 * hash) + NETWORK_TIER_FIELD_NUMBER;
    hash = (53 * hash) + networkTier_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parseFrom(
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
      com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest)
      com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsSetDefaultNetworkTierRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsSetDefaultNetworkTierRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.class,
              com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.newBuilder()
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
      networkTier_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsSetDefaultNetworkTierRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest build() {
      com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest buildPartial() {
      com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest result =
          new com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest(this);
      result.networkTier_ = networkTier_;
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
      if (other instanceof com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest) {
        return mergeFrom((com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest other) {
      if (other
          == com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.getDefaultInstance())
        return this;
      if (other.networkTier_ != 0) {
        setNetworkTierValue(other.getNetworkTierValue());
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
      com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int networkTier_ = 0;
    /**
     *
     *
     * <pre>
     * Default network tier to be set.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier network_tier = 517397843;
     * </code>
     *
     * @return The enum numeric value on the wire for networkTier.
     */
    @java.lang.Override
    public int getNetworkTierValue() {
      return networkTier_;
    }
    /**
     *
     *
     * <pre>
     * Default network tier to be set.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier network_tier = 517397843;
     * </code>
     *
     * @param value The enum numeric value on the wire for networkTier to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkTierValue(int value) {

      networkTier_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Default network tier to be set.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier network_tier = 517397843;
     * </code>
     *
     * @return The networkTier.
     */
    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier
        getNetworkTier() {
      @SuppressWarnings("deprecation")
      com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier result =
          com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier.valueOf(
              networkTier_);
      return result == null
          ? com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier
              .UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Default network tier to be set.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier network_tier = 517397843;
     * </code>
     *
     * @param value The networkTier to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkTier(
        com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier value) {
      if (value == null) {
        throw new NullPointerException();
      }

      networkTier_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Default network tier to be set.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest.NetworkTier network_tier = 517397843;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNetworkTier() {

      networkTier_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest)
  private static final com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest();
  }

  public static com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProjectsSetDefaultNetworkTierRequest> PARSER =
      new com.google.protobuf.AbstractParser<ProjectsSetDefaultNetworkTierRequest>() {
        @java.lang.Override
        public ProjectsSetDefaultNetworkTierRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProjectsSetDefaultNetworkTierRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ProjectsSetDefaultNetworkTierRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectsSetDefaultNetworkTierRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
