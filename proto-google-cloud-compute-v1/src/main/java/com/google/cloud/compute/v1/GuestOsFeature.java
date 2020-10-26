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
 * Guest OS features.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.GuestOsFeature}
 */
public final class GuestOsFeature extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.GuestOsFeature)
    GuestOsFeatureOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GuestOsFeature.newBuilder() to construct.
  private GuestOsFeature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GuestOsFeature() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GuestOsFeature();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GuestOsFeature(
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
          case 28604880:
            {
              int rawValue = input.readEnum();

              type_ = rawValue;
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
        .internal_static_google_cloud_compute_v1_GuestOsFeature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_GuestOsFeature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.GuestOsFeature.class,
            com.google.cloud.compute.v1.GuestOsFeature.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The ID of a supported feature. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.GuestOsFeature.Type}
   */
  public enum Type implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_TYPE = 0;</code>
     */
    UNDEFINED_TYPE(0),
    /** <code>FEATURE_TYPE_UNSPECIFIED = 531767259;</code> */
    FEATURE_TYPE_UNSPECIFIED(531767259),
    /** <code>MULTI_IP_SUBNET = 151776719;</code> */
    MULTI_IP_SUBNET(151776719),
    /** <code>SECURE_BOOT = 376811194;</code> */
    SECURE_BOOT(376811194),
    /** <code>SEV_CAPABLE = 87083793;</code> */
    SEV_CAPABLE(87083793),
    /** <code>UEFI_COMPATIBLE = 195865408;</code> */
    UEFI_COMPATIBLE(195865408),
    /** <code>VIRTIO_SCSI_MULTIQUEUE = 201597069;</code> */
    VIRTIO_SCSI_MULTIQUEUE(201597069),
    /** <code>WINDOWS = 456863331;</code> */
    WINDOWS(456863331),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_TYPE = 0;</code>
     */
    public static final int UNDEFINED_TYPE_VALUE = 0;
    /** <code>FEATURE_TYPE_UNSPECIFIED = 531767259;</code> */
    public static final int FEATURE_TYPE_UNSPECIFIED_VALUE = 531767259;
    /** <code>MULTI_IP_SUBNET = 151776719;</code> */
    public static final int MULTI_IP_SUBNET_VALUE = 151776719;
    /** <code>SECURE_BOOT = 376811194;</code> */
    public static final int SECURE_BOOT_VALUE = 376811194;
    /** <code>SEV_CAPABLE = 87083793;</code> */
    public static final int SEV_CAPABLE_VALUE = 87083793;
    /** <code>UEFI_COMPATIBLE = 195865408;</code> */
    public static final int UEFI_COMPATIBLE_VALUE = 195865408;
    /** <code>VIRTIO_SCSI_MULTIQUEUE = 201597069;</code> */
    public static final int VIRTIO_SCSI_MULTIQUEUE_VALUE = 201597069;
    /** <code>WINDOWS = 456863331;</code> */
    public static final int WINDOWS_VALUE = 456863331;

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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_TYPE;
        case 531767259:
          return FEATURE_TYPE_UNSPECIFIED;
        case 151776719:
          return MULTI_IP_SUBNET;
        case 376811194:
          return SECURE_BOOT;
        case 87083793:
          return SEV_CAPABLE;
        case 195865408:
          return UEFI_COMPATIBLE;
        case 201597069:
          return VIRTIO_SCSI_MULTIQUEUE;
        case 456863331:
          return WINDOWS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Type> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Type>() {
          public Type findValueByNumber(int number) {
            return Type.forNumber(number);
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
      return com.google.cloud.compute.v1.GuestOsFeature.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.GuestOsFeature.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 3575610;
  private int type_;
  /**
   *
   *
   * <pre>
   * The ID of a supported feature. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.GuestOsFeature.Type type = 3575610;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * The ID of a supported feature. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.GuestOsFeature.Type type = 3575610;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.GuestOsFeature.Type getType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.compute.v1.GuestOsFeature.Type result =
        com.google.cloud.compute.v1.GuestOsFeature.Type.valueOf(type_);
    return result == null ? com.google.cloud.compute.v1.GuestOsFeature.Type.UNRECOGNIZED : result;
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
    if (type_ != com.google.cloud.compute.v1.GuestOsFeature.Type.UNDEFINED_TYPE.getNumber()) {
      output.writeEnum(3575610, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.cloud.compute.v1.GuestOsFeature.Type.UNDEFINED_TYPE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3575610, type_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.GuestOsFeature)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.GuestOsFeature other =
        (com.google.cloud.compute.v1.GuestOsFeature) obj;

    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GuestOsFeature parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.GuestOsFeature prototype) {
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
   * Guest OS features.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.GuestOsFeature}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.GuestOsFeature)
      com.google.cloud.compute.v1.GuestOsFeatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GuestOsFeature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GuestOsFeature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.GuestOsFeature.class,
              com.google.cloud.compute.v1.GuestOsFeature.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.GuestOsFeature.newBuilder()
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
      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GuestOsFeature_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GuestOsFeature getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.GuestOsFeature.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GuestOsFeature build() {
      com.google.cloud.compute.v1.GuestOsFeature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GuestOsFeature buildPartial() {
      com.google.cloud.compute.v1.GuestOsFeature result =
          new com.google.cloud.compute.v1.GuestOsFeature(this);
      result.type_ = type_;
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
      if (other instanceof com.google.cloud.compute.v1.GuestOsFeature) {
        return mergeFrom((com.google.cloud.compute.v1.GuestOsFeature) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.GuestOsFeature other) {
      if (other == com.google.cloud.compute.v1.GuestOsFeature.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
      com.google.cloud.compute.v1.GuestOsFeature parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.GuestOsFeature) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * The ID of a supported feature. Read  Enabling guest operating system features to see a list of available options.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GuestOsFeature.Type type = 3575610;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * The ID of a supported feature. Read  Enabling guest operating system features to see a list of available options.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GuestOsFeature.Type type = 3575610;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {

      type_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of a supported feature. Read  Enabling guest operating system features to see a list of available options.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GuestOsFeature.Type type = 3575610;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.compute.v1.GuestOsFeature.Type getType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.compute.v1.GuestOsFeature.Type result =
          com.google.cloud.compute.v1.GuestOsFeature.Type.valueOf(type_);
      return result == null ? com.google.cloud.compute.v1.GuestOsFeature.Type.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The ID of a supported feature. Read  Enabling guest operating system features to see a list of available options.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GuestOsFeature.Type type = 3575610;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.compute.v1.GuestOsFeature.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of a supported feature. Read  Enabling guest operating system features to see a list of available options.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GuestOsFeature.Type type = 3575610;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {

      type_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.GuestOsFeature)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.GuestOsFeature)
  private static final com.google.cloud.compute.v1.GuestOsFeature DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.GuestOsFeature();
  }

  public static com.google.cloud.compute.v1.GuestOsFeature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuestOsFeature> PARSER =
      new com.google.protobuf.AbstractParser<GuestOsFeature>() {
        @java.lang.Override
        public GuestOsFeature parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GuestOsFeature(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GuestOsFeature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuestOsFeature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.GuestOsFeature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
