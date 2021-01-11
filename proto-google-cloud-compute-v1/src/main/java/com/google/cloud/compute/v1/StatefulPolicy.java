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
 * Protobuf type {@code google.cloud.compute.v1.StatefulPolicy}
 */
public final class StatefulPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.StatefulPolicy)
    StatefulPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StatefulPolicy.newBuilder() to construct.
  private StatefulPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StatefulPolicy() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StatefulPolicy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StatefulPolicy(
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
          case 21072210:
            {
              com.google.cloud.compute.v1.StatefulPolicyPreservedState.Builder subBuilder = null;
              if (preservedState_ != null) {
                subBuilder = preservedState_.toBuilder();
              }
              preservedState_ =
                  input.readMessage(
                      com.google.cloud.compute.v1.StatefulPolicyPreservedState.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(preservedState_);
                preservedState_ = subBuilder.buildPartial();
              }

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
        .internal_static_google_cloud_compute_v1_StatefulPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_StatefulPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.StatefulPolicy.class,
            com.google.cloud.compute.v1.StatefulPolicy.Builder.class);
  }

  public static final int PRESERVED_STATE_FIELD_NUMBER = 2634026;
  private com.google.cloud.compute.v1.StatefulPolicyPreservedState preservedState_;
  /**
   * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
   *
   * @return Whether the preservedState field is set.
   */
  @java.lang.Override
  public boolean hasPreservedState() {
    return preservedState_ != null;
  }
  /**
   * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
   *
   * @return The preservedState.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.StatefulPolicyPreservedState getPreservedState() {
    return preservedState_ == null
        ? com.google.cloud.compute.v1.StatefulPolicyPreservedState.getDefaultInstance()
        : preservedState_;
  }
  /**
   * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.StatefulPolicyPreservedStateOrBuilder
      getPreservedStateOrBuilder() {
    return getPreservedState();
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
    if (preservedState_ != null) {
      output.writeMessage(2634026, getPreservedState());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (preservedState_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2634026, getPreservedState());
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
    if (!(obj instanceof com.google.cloud.compute.v1.StatefulPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.StatefulPolicy other =
        (com.google.cloud.compute.v1.StatefulPolicy) obj;

    if (hasPreservedState() != other.hasPreservedState()) return false;
    if (hasPreservedState()) {
      if (!getPreservedState().equals(other.getPreservedState())) return false;
    }
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
    if (hasPreservedState()) {
      hash = (37 * hash) + PRESERVED_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getPreservedState().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.StatefulPolicy parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.StatefulPolicy prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.StatefulPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.StatefulPolicy)
      com.google.cloud.compute.v1.StatefulPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_StatefulPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_StatefulPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.StatefulPolicy.class,
              com.google.cloud.compute.v1.StatefulPolicy.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.StatefulPolicy.newBuilder()
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
      if (preservedStateBuilder_ == null) {
        preservedState_ = null;
      } else {
        preservedState_ = null;
        preservedStateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_StatefulPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.StatefulPolicy getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.StatefulPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.StatefulPolicy build() {
      com.google.cloud.compute.v1.StatefulPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.StatefulPolicy buildPartial() {
      com.google.cloud.compute.v1.StatefulPolicy result =
          new com.google.cloud.compute.v1.StatefulPolicy(this);
      if (preservedStateBuilder_ == null) {
        result.preservedState_ = preservedState_;
      } else {
        result.preservedState_ = preservedStateBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.compute.v1.StatefulPolicy) {
        return mergeFrom((com.google.cloud.compute.v1.StatefulPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.StatefulPolicy other) {
      if (other == com.google.cloud.compute.v1.StatefulPolicy.getDefaultInstance()) return this;
      if (other.hasPreservedState()) {
        mergePreservedState(other.getPreservedState());
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
      com.google.cloud.compute.v1.StatefulPolicy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.StatefulPolicy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.compute.v1.StatefulPolicyPreservedState preservedState_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.StatefulPolicyPreservedState,
            com.google.cloud.compute.v1.StatefulPolicyPreservedState.Builder,
            com.google.cloud.compute.v1.StatefulPolicyPreservedStateOrBuilder>
        preservedStateBuilder_;
    /**
     * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
     *
     * @return Whether the preservedState field is set.
     */
    public boolean hasPreservedState() {
      return preservedStateBuilder_ != null || preservedState_ != null;
    }
    /**
     * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
     *
     * @return The preservedState.
     */
    public com.google.cloud.compute.v1.StatefulPolicyPreservedState getPreservedState() {
      if (preservedStateBuilder_ == null) {
        return preservedState_ == null
            ? com.google.cloud.compute.v1.StatefulPolicyPreservedState.getDefaultInstance()
            : preservedState_;
      } else {
        return preservedStateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
     */
    public Builder setPreservedState(
        com.google.cloud.compute.v1.StatefulPolicyPreservedState value) {
      if (preservedStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        preservedState_ = value;
        onChanged();
      } else {
        preservedStateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
     */
    public Builder setPreservedState(
        com.google.cloud.compute.v1.StatefulPolicyPreservedState.Builder builderForValue) {
      if (preservedStateBuilder_ == null) {
        preservedState_ = builderForValue.build();
        onChanged();
      } else {
        preservedStateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
     */
    public Builder mergePreservedState(
        com.google.cloud.compute.v1.StatefulPolicyPreservedState value) {
      if (preservedStateBuilder_ == null) {
        if (preservedState_ != null) {
          preservedState_ =
              com.google.cloud.compute.v1.StatefulPolicyPreservedState.newBuilder(preservedState_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          preservedState_ = value;
        }
        onChanged();
      } else {
        preservedStateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
     */
    public Builder clearPreservedState() {
      if (preservedStateBuilder_ == null) {
        preservedState_ = null;
        onChanged();
      } else {
        preservedState_ = null;
        preservedStateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
     */
    public com.google.cloud.compute.v1.StatefulPolicyPreservedState.Builder
        getPreservedStateBuilder() {

      onChanged();
      return getPreservedStateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
     */
    public com.google.cloud.compute.v1.StatefulPolicyPreservedStateOrBuilder
        getPreservedStateOrBuilder() {
      if (preservedStateBuilder_ != null) {
        return preservedStateBuilder_.getMessageOrBuilder();
      } else {
        return preservedState_ == null
            ? com.google.cloud.compute.v1.StatefulPolicyPreservedState.getDefaultInstance()
            : preservedState_;
      }
    }
    /**
     * <code>.google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.StatefulPolicyPreservedState,
            com.google.cloud.compute.v1.StatefulPolicyPreservedState.Builder,
            com.google.cloud.compute.v1.StatefulPolicyPreservedStateOrBuilder>
        getPreservedStateFieldBuilder() {
      if (preservedStateBuilder_ == null) {
        preservedStateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.StatefulPolicyPreservedState,
                com.google.cloud.compute.v1.StatefulPolicyPreservedState.Builder,
                com.google.cloud.compute.v1.StatefulPolicyPreservedStateOrBuilder>(
                getPreservedState(), getParentForChildren(), isClean());
        preservedState_ = null;
      }
      return preservedStateBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.StatefulPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.StatefulPolicy)
  private static final com.google.cloud.compute.v1.StatefulPolicy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.StatefulPolicy();
  }

  public static com.google.cloud.compute.v1.StatefulPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatefulPolicy> PARSER =
      new com.google.protobuf.AbstractParser<StatefulPolicy>() {
        @java.lang.Override
        public StatefulPolicy parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StatefulPolicy(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StatefulPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatefulPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.StatefulPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}