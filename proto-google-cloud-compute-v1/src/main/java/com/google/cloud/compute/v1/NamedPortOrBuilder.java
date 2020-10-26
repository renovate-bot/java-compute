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

public interface NamedPortOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NamedPort)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The port number, which can be a value between 1 and 65535.
   * </pre>
   *
   * <code>int32 port = 3446913;</code>
   *
   * @return The port.
   */
  int getPort();
}
