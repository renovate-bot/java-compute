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

public interface FileContentBufferOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.FileContentBuffer)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The raw content in the secure keys file.
   * </pre>
   *
   * <code>string content = 414659705;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * The raw content in the secure keys file.
   * </pre>
   *
   * <code>string content = 414659705;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * The file type of source file.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.FileContentBuffer.FileType file_type = 294346781;</code>
   *
   * @return The enum numeric value on the wire for fileType.
   */
  int getFileTypeValue();
  /**
   *
   *
   * <pre>
   * The file type of source file.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.FileContentBuffer.FileType file_type = 294346781;</code>
   *
   * @return The fileType.
   */
  com.google.cloud.compute.v1.FileContentBuffer.FileType getFileType();
}
