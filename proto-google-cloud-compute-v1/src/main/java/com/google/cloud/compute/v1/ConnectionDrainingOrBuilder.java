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

public interface ConnectionDrainingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ConnectionDraining)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The amount of time in seconds to allow existing connections to persist while on unhealthy backend VMs. Only applicable if the protocol is not UDP. The valid range is [0, 3600].
   * </pre>
   *
   * <code>int32 draining_timeout_sec = 225127070;</code>
   *
   * @return The drainingTimeoutSec.
   */
  int getDrainingTimeoutSec();
}
