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

public interface LocalizedMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.LocalizedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The locale used following the specification defined at https://www.rfc-editor.org/rfc/bcp/bcp47.txt. Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>optional string locale = 513150554;</code>
   *
   * @return Whether the locale field is set.
   */
  boolean hasLocale();
  /**
   *
   *
   * <pre>
   * The locale used following the specification defined at https://www.rfc-editor.org/rfc/bcp/bcp47.txt. Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>optional string locale = 513150554;</code>
   *
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   *
   *
   * <pre>
   * The locale used following the specification defined at https://www.rfc-editor.org/rfc/bcp/bcp47.txt. Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>optional string locale = 513150554;</code>
   *
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString getLocaleBytes();

  /**
   *
   *
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   *
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   *
   *
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();
}
