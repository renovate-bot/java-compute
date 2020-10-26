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

public interface HttpFaultInjectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HttpFaultInjection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The specification for how client requests are aborted as part of fault injection.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
   *
   * @return Whether the abort field is set.
   */
  boolean hasAbort();
  /**
   *
   *
   * <pre>
   * The specification for how client requests are aborted as part of fault injection.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
   *
   * @return The abort.
   */
  com.google.cloud.compute.v1.HttpFaultAbort getAbort();
  /**
   *
   *
   * <pre>
   * The specification for how client requests are aborted as part of fault injection.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
   */
  com.google.cloud.compute.v1.HttpFaultAbortOrBuilder getAbortOrBuilder();

  /**
   *
   *
   * <pre>
   * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
   *
   * @return Whether the delay field is set.
   */
  boolean hasDelay();
  /**
   *
   *
   * <pre>
   * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
   *
   * @return The delay.
   */
  com.google.cloud.compute.v1.HttpFaultDelay getDelay();
  /**
   *
   *
   * <pre>
   * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
   */
  com.google.cloud.compute.v1.HttpFaultDelayOrBuilder getDelayOrBuilder();
}
