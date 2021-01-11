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

public interface HttpFaultAbortOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HttpFaultAbort)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HTTP status code used to abort the request.
   * The value must be between 200 and 599 inclusive.
   * </pre>
   *
   * <code>uint32 http_status = 200514441;</code>
   *
   * @return The httpStatus.
   */
  int getHttpStatus();

  /**
   *
   *
   * <pre>
   * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
   * The value must be between 0.0 and 100.0 inclusive.
   * </pre>
   *
   * <code>double percentage = 151909018;</code>
   *
   * @return The percentage.
   */
  double getPercentage();
}