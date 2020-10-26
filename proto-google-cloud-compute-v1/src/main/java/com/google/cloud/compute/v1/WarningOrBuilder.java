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

public interface WarningOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Warning)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Warning.Code code = 3059181;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   *
   *
   * <pre>
   * [Output Only] A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Warning.Code code = 3059181;</code>
   *
   * @return The code.
   */
  com.google.cloud.compute.v1.Warning.Code getCode();

  /**
   *
   *
   * <pre>
   * [Output Only] Metadata about this warning in key: value format. For example:
   * "data": [ { "key": "scope", "value": "zones/us-east1-d" }
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Data data = 3076010;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Data> getDataList();
  /**
   *
   *
   * <pre>
   * [Output Only] Metadata about this warning in key: value format. For example:
   * "data": [ { "key": "scope", "value": "zones/us-east1-d" }
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Data data = 3076010;</code>
   */
  com.google.cloud.compute.v1.Data getData(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] Metadata about this warning in key: value format. For example:
   * "data": [ { "key": "scope", "value": "zones/us-east1-d" }
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Data data = 3076010;</code>
   */
  int getDataCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Metadata about this warning in key: value format. For example:
   * "data": [ { "key": "scope", "value": "zones/us-east1-d" }
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Data data = 3076010;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.DataOrBuilder> getDataOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] Metadata about this warning in key: value format. For example:
   * "data": [ { "key": "scope", "value": "zones/us-east1-d" }
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Data data = 3076010;</code>
   */
  com.google.cloud.compute.v1.DataOrBuilder getDataOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] A human-readable description of the warning code.
   * </pre>
   *
   * <code>string message = 418054151;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * [Output Only] A human-readable description of the warning code.
   * </pre>
   *
   * <code>string message = 418054151;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();
}
