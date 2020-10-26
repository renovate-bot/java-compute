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

public interface UsageExportLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UsageExportLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
   * </pre>
   *
   * <code>string bucket_name = 283610048;</code>
   *
   * @return The bucketName.
   */
  java.lang.String getBucketName();
  /**
   *
   *
   * <pre>
   * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
   * </pre>
   *
   * <code>string bucket_name = 283610048;</code>
   *
   * @return The bytes for bucketName.
   */
  com.google.protobuf.ByteString getBucketNameBytes();

  /**
   *
   *
   * <pre>
   * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
   * </pre>
   *
   * <code>string report_name_prefix = 320198715;</code>
   *
   * @return The reportNamePrefix.
   */
  java.lang.String getReportNamePrefix();
  /**
   *
   *
   * <pre>
   * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
   * </pre>
   *
   * <code>string report_name_prefix = 320198715;</code>
   *
   * @return The bytes for reportNamePrefix.
   */
  com.google.protobuf.ByteString getReportNamePrefixBytes();
}
