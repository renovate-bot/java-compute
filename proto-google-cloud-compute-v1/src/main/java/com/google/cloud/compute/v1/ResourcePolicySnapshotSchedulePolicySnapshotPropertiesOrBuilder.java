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

public interface ResourcePolicySnapshotSchedulePolicySnapshotPropertiesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySnapshotProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Chain name that the snapshot is created in.
   * </pre>
   *
   * <code>string chain_name = 68644169;</code>
   *
   * @return The chainName.
   */
  java.lang.String getChainName();
  /**
   *
   *
   * <pre>
   * Chain name that the snapshot is created in.
   * </pre>
   *
   * <code>string chain_name = 68644169;</code>
   *
   * @return The bytes for chainName.
   */
  com.google.protobuf.ByteString getChainNameBytes();

  /**
   *
   *
   * <pre>
   * Indication to perform a 'guest aware' snapshot.
   * </pre>
   *
   * <code>bool guest_flush = 117115357;</code>
   *
   * @return The guestFlush.
   */
  boolean getGuestFlush();

  /**
   *
   *
   * <pre>
   * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 59569818;</code>
   *
   * @return A list containing the storageLocations.
   */
  java.util.List<java.lang.String> getStorageLocationsList();
  /**
   *
   *
   * <pre>
   * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 59569818;</code>
   *
   * @return The count of storageLocations.
   */
  int getStorageLocationsCount();
  /**
   *
   *
   * <pre>
   * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 59569818;</code>
   *
   * @param index The index of the element to return.
   * @return The storageLocations at the given index.
   */
  java.lang.String getStorageLocations(int index);
  /**
   *
   *
   * <pre>
   * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 59569818;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the storageLocations at the given index.
   */
  com.google.protobuf.ByteString getStorageLocationsBytes(int index);
}