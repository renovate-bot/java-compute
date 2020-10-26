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

public interface NetworkEndpointWithHealthStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkEndpointWithHealthStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output only] The health status of network endpoint;
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthStatusForNetworkEndpoint healths = 258689431;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint> getHealthsList();
  /**
   *
   *
   * <pre>
   * [Output only] The health status of network endpoint;
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthStatusForNetworkEndpoint healths = 258689431;
   * </code>
   */
  com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint getHealths(int index);
  /**
   *
   *
   * <pre>
   * [Output only] The health status of network endpoint;
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthStatusForNetworkEndpoint healths = 258689431;
   * </code>
   */
  int getHealthsCount();
  /**
   *
   *
   * <pre>
   * [Output only] The health status of network endpoint;
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthStatusForNetworkEndpoint healths = 258689431;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.HealthStatusForNetworkEndpointOrBuilder>
      getHealthsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output only] The health status of network endpoint;
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthStatusForNetworkEndpoint healths = 258689431;
   * </code>
   */
  com.google.cloud.compute.v1.HealthStatusForNetworkEndpointOrBuilder getHealthsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * [Output only] The network endpoint;
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworkEndpoint network_endpoint = 56789126;</code>
   *
   * @return Whether the networkEndpoint field is set.
   */
  boolean hasNetworkEndpoint();
  /**
   *
   *
   * <pre>
   * [Output only] The network endpoint;
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworkEndpoint network_endpoint = 56789126;</code>
   *
   * @return The networkEndpoint.
   */
  com.google.cloud.compute.v1.NetworkEndpoint getNetworkEndpoint();
  /**
   *
   *
   * <pre>
   * [Output only] The network endpoint;
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworkEndpoint network_endpoint = 56789126;</code>
   */
  com.google.cloud.compute.v1.NetworkEndpointOrBuilder getNetworkEndpointOrBuilder();
}
