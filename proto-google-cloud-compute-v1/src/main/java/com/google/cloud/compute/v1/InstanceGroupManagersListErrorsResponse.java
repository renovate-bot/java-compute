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
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse}
 */
public final class InstanceGroupManagersListErrorsResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse)
    InstanceGroupManagersListErrorsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceGroupManagersListErrorsResponse.newBuilder() to construct.
  private InstanceGroupManagersListErrorsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupManagersListErrorsResponse() {
    items_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupManagersListErrorsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InstanceGroupManagersListErrorsResponse(
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
          case 638380202:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          case 804208130:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                items_ =
                    new java.util.ArrayList<
                        com.google.cloud.compute.v1.InstanceManagedByIgmError>();
                mutable_bitField0_ |= 0x00000001;
              }
              items_.add(
                  input.readMessage(
                      com.google.cloud.compute.v1.InstanceManagedByIgmError.parser(),
                      extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagersListErrorsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagersListErrorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse.class,
            com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 100526016;
  private java.util.List<com.google.cloud.compute.v1.InstanceManagedByIgmError> items_;
  /**
   *
   *
   * <pre>
   * [Output Only] The list of errors of the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.InstanceManagedByIgmError> getItemsList() {
    return items_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The list of errors of the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.InstanceManagedByIgmErrorOrBuilder>
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The list of errors of the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The list of errors of the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceManagedByIgmError getItems(int index) {
    return items_.get(index);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The list of errors of the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceManagedByIgmErrorOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 79797525;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>string next_page_token = 79797525;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>string next_page_token = 79797525;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 79797525, nextPageToken_);
    }
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(100526016, items_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(79797525, nextPageToken_);
    }
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(100526016, items_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse other =
        (com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse) obj;

    if (!getItemsList().equals(other.getItemsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse parseFrom(
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
      com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse)
      com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagersListErrorsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagersListErrorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse.class,
              com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getItemsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagersListErrorsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse build() {
      com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse result =
          new com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse(this);
      int from_bitField0_ = bitField0_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse) {
        return mergeFrom(
            (com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse other) {
      if (other
          == com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse
              .getDefaultInstance()) return this;
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getItemsFieldBuilder()
                    : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.compute.v1.InstanceManagedByIgmError> items_ =
        java.util.Collections.emptyList();

    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.InstanceManagedByIgmError>(items_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.InstanceManagedByIgmError,
            com.google.cloud.compute.v1.InstanceManagedByIgmError.Builder,
            com.google.cloud.compute.v1.InstanceManagedByIgmErrorOrBuilder>
        itemsBuilder_;

    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.InstanceManagedByIgmError> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public com.google.cloud.compute.v1.InstanceManagedByIgmError getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public Builder setItems(
        int index, com.google.cloud.compute.v1.InstanceManagedByIgmError value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public Builder setItems(
        int index, com.google.cloud.compute.v1.InstanceManagedByIgmError.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public Builder addItems(com.google.cloud.compute.v1.InstanceManagedByIgmError value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public Builder addItems(
        int index, com.google.cloud.compute.v1.InstanceManagedByIgmError value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public Builder addItems(
        com.google.cloud.compute.v1.InstanceManagedByIgmError.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public Builder addItems(
        int index, com.google.cloud.compute.v1.InstanceManagedByIgmError.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.InstanceManagedByIgmError>
            values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public com.google.cloud.compute.v1.InstanceManagedByIgmError.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public com.google.cloud.compute.v1.InstanceManagedByIgmErrorOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.InstanceManagedByIgmErrorOrBuilder>
        getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public com.google.cloud.compute.v1.InstanceManagedByIgmError.Builder addItemsBuilder() {
      return getItemsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.InstanceManagedByIgmError.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public com.google.cloud.compute.v1.InstanceManagedByIgmError.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.compute.v1.InstanceManagedByIgmError.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The list of errors of the managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.InstanceManagedByIgmError.Builder>
        getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.InstanceManagedByIgmError,
            com.google.cloud.compute.v1.InstanceManagedByIgmError.Builder,
            com.google.cloud.compute.v1.InstanceManagedByIgmErrorOrBuilder>
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.InstanceManagedByIgmError,
                com.google.cloud.compute.v1.InstanceManagedByIgmError.Builder,
                com.google.cloud.compute.v1.InstanceManagedByIgmErrorOrBuilder>(
                items_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
     * </pre>
     *
     * <code>string next_page_token = 79797525;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
     * </pre>
     *
     * <code>string next_page_token = 79797525;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
     * </pre>
     *
     * <code>string next_page_token = 79797525;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
     * </pre>
     *
     * <code>string next_page_token = 79797525;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
     * </pre>
     *
     * <code>string next_page_token = 79797525;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse)
  private static final com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse();
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupManagersListErrorsResponse> PARSER =
      new com.google.protobuf.AbstractParser<InstanceGroupManagersListErrorsResponse>() {
        @java.lang.Override
        public InstanceGroupManagersListErrorsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InstanceGroupManagersListErrorsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InstanceGroupManagersListErrorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupManagersListErrorsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
