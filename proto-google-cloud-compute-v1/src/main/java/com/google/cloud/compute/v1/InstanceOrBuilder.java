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

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Allows this instance to send and receive packets with non-matching destination or source IPs. This is required if you plan to use this instance to forward routes. For more information, see Enabling IP Forwarding.
   * </pre>
   *
   * <code>bool can_ip_forward = 467731324;</code>
   *
   * @return The canIpForward.
   */
  boolean getCanIpForward();

  /**
   * <code>
   * .google.cloud.compute.v1.ConfidentialInstanceConfig confidential_instance_config = 490637685;
   * </code>
   *
   * @return Whether the confidentialInstanceConfig field is set.
   */
  boolean hasConfidentialInstanceConfig();
  /**
   * <code>
   * .google.cloud.compute.v1.ConfidentialInstanceConfig confidential_instance_config = 490637685;
   * </code>
   *
   * @return The confidentialInstanceConfig.
   */
  com.google.cloud.compute.v1.ConfidentialInstanceConfig getConfidentialInstanceConfig();
  /**
   * <code>
   * .google.cloud.compute.v1.ConfidentialInstanceConfig confidential_instance_config = 490637685;
   * </code>
   */
  com.google.cloud.compute.v1.ConfidentialInstanceConfigOrBuilder
      getConfidentialInstanceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The CPU platform used by this instance.
   * </pre>
   *
   * <code>string cpu_platform = 410285354;</code>
   *
   * @return The cpuPlatform.
   */
  java.lang.String getCpuPlatform();
  /**
   *
   *
   * <pre>
   * [Output Only] The CPU platform used by this instance.
   * </pre>
   *
   * <code>string cpu_platform = 410285354;</code>
   *
   * @return The bytes for cpuPlatform.
   */
  com.google.protobuf.ByteString getCpuPlatformBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * Whether the resource should be protected against deletion.
   * </pre>
   *
   * <code>bool deletion_protection = 458014698;</code>
   *
   * @return The deletionProtection.
   */
  boolean getDeletionProtection();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance. Persistent disks must be created before you can assign them.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AttachedDisk disks = 95594102;</code>
   */
  java.util.List<com.google.cloud.compute.v1.AttachedDisk> getDisksList();
  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance. Persistent disks must be created before you can assign them.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AttachedDisk disks = 95594102;</code>
   */
  com.google.cloud.compute.v1.AttachedDisk getDisks(int index);
  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance. Persistent disks must be created before you can assign them.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AttachedDisk disks = 95594102;</code>
   */
  int getDisksCount();
  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance. Persistent disks must be created before you can assign them.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AttachedDisk disks = 95594102;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AttachedDiskOrBuilder>
      getDisksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance. Persistent disks must be created before you can assign them.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AttachedDisk disks = 95594102;</code>
   */
  com.google.cloud.compute.v1.AttachedDiskOrBuilder getDisksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Enables display device for the instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.DisplayDevice display_device = 258933875;</code>
   *
   * @return Whether the displayDevice field is set.
   */
  boolean hasDisplayDevice();
  /**
   *
   *
   * <pre>
   * Enables display device for the instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.DisplayDevice display_device = 258933875;</code>
   *
   * @return The displayDevice.
   */
  com.google.cloud.compute.v1.DisplayDevice getDisplayDevice();
  /**
   *
   *
   * <pre>
   * Enables display device for the instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.DisplayDevice display_device = 258933875;</code>
   */
  com.google.cloud.compute.v1.DisplayDeviceOrBuilder getDisplayDeviceOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies a fingerprint for this resource, which is essentially a hash of the instance's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update the instance. You must always provide an up-to-date fingerprint hash in order to update the instance.
   * To see the latest fingerprint, make get() request to the instance.
   * </pre>
   *
   * <code>string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();
  /**
   *
   *
   * <pre>
   * Specifies a fingerprint for this resource, which is essentially a hash of the instance's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update the instance. You must always provide an up-to-date fingerprint hash in order to update the instance.
   * To see the latest fingerprint, make get() request to the instance.
   * </pre>
   *
   * <code>string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * A list of the type and count of accelerator cards attached to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.AcceleratorConfig> getGuestAcceleratorsList();
  /**
   *
   *
   * <pre>
   * A list of the type and count of accelerator cards attached to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  com.google.cloud.compute.v1.AcceleratorConfig getGuestAccelerators(int index);
  /**
   *
   *
   * <pre>
   * A list of the type and count of accelerator cards attached to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  int getGuestAcceleratorsCount();
  /**
   *
   *
   * <pre>
   * A list of the type and count of accelerator cards attached to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AcceleratorConfigOrBuilder>
      getGuestAcceleratorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of the type and count of accelerator cards attached to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  com.google.cloud.compute.v1.AcceleratorConfigOrBuilder getGuestAcceleratorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
   * </pre>
   *
   * <code>string hostname = 237067315;</code>
   *
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   *
   *
   * <pre>
   * Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
   * </pre>
   *
   * <code>string hostname = 237067315;</code>
   *
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString getHostnameBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#instance for instances.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#instance for instances.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * A fingerprint for this request, which is essentially a hash of the label's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels.
   * To see the latest fingerprint, make get() request to the instance.
   * </pre>
   *
   * <code>string label_fingerprint = 178124825;</code>
   *
   * @return The labelFingerprint.
   */
  java.lang.String getLabelFingerprint();
  /**
   *
   *
   * <pre>
   * A fingerprint for this request, which is essentially a hash of the label's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels.
   * To see the latest fingerprint, make get() request to the instance.
   * </pre>
   *
   * <code>string label_fingerprint = 178124825;</code>
   *
   * @return The bytes for labelFingerprint.
   */
  com.google.protobuf.ByteString getLabelFingerprintBytes();

  /**
   *
   *
   * <pre>
   * Labels to apply to this instance. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to apply to this instance. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels to apply to this instance. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to apply to this instance. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels to apply to this instance. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * [Output Only] Last start timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string last_start_timestamp = 443830736;</code>
   *
   * @return The lastStartTimestamp.
   */
  java.lang.String getLastStartTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Last start timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string last_start_timestamp = 443830736;</code>
   *
   * @return The bytes for lastStartTimestamp.
   */
  com.google.protobuf.ByteString getLastStartTimestampBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Last stop timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string last_stop_timestamp = 412823010;</code>
   *
   * @return The lastStopTimestamp.
   */
  java.lang.String getLastStopTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Last stop timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string last_stop_timestamp = 412823010;</code>
   *
   * @return The bytes for lastStopTimestamp.
   */
  com.google.protobuf.ByteString getLastStopTimestampBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Last suspended timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string last_suspended_timestamp = 356275337;</code>
   *
   * @return The lastSuspendedTimestamp.
   */
  java.lang.String getLastSuspendedTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Last suspended timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string last_suspended_timestamp = 356275337;</code>
   *
   * @return The bytes for lastSuspendedTimestamp.
   */
  com.google.protobuf.ByteString getLastSuspendedTimestampBytes();

  /**
   *
   *
   * <pre>
   * Full or partial URL of the machine type resource to use for this instance, in the format: zones/zone/machineTypes/machine-type. This is provided by the client when the instance is created. For example, the following is a valid partial url to a predefined machine type:
   * zones/us-central1-f/machineTypes/n1-standard-1
   * To create a custom machine type, provide a URL to a machine type in the following format, where CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of memory is 5120 MB):
   * zones/zone/machineTypes/custom-CPUS-MEMORY
   * For example: zones/us-central1-f/machineTypes/custom-4-5120
   * For a full list of restrictions, read the Specifications for custom machine types.
   * </pre>
   *
   * <code>string machine_type = 227711026;</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Full or partial URL of the machine type resource to use for this instance, in the format: zones/zone/machineTypes/machine-type. This is provided by the client when the instance is created. For example, the following is a valid partial url to a predefined machine type:
   * zones/us-central1-f/machineTypes/n1-standard-1
   * To create a custom machine type, provide a URL to a machine type in the following format, where CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of memory is 5120 MB):
   * zones/zone/machineTypes/custom-CPUS-MEMORY
   * For example: zones/us-central1-f/machineTypes/custom-4-5120
   * For a full list of restrictions, read the Specifications for custom machine types.
   * </pre>
   *
   * <code>string machine_type = 227711026;</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * The metadata key/value pairs assigned to this instance. This includes custom metadata and predefined keys.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Metadata metadata = 86866735;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * The metadata key/value pairs assigned to this instance. This includes custom metadata and predefined keys.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Metadata metadata = 86866735;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.compute.v1.Metadata getMetadata();
  /**
   *
   *
   * <pre>
   * The metadata key/value pairs assigned to this instance. This includes custom metadata and predefined keys.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Metadata metadata = 86866735;</code>
   */
  com.google.cloud.compute.v1.MetadataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge".
   * </pre>
   *
   * <code>string min_cpu_platform = 242912759;</code>
   *
   * @return The minCpuPlatform.
   */
  java.lang.String getMinCpuPlatform();
  /**
   *
   *
   * <pre>
   * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge".
   * </pre>
   *
   * <code>string min_cpu_platform = 242912759;</code>
   *
   * @return The bytes for minCpuPlatform.
   */
  com.google.protobuf.ByteString getMinCpuPlatformBytes();

  /**
   *
   *
   * <pre>
   * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  java.util.List<com.google.cloud.compute.v1.NetworkInterface> getNetworkInterfacesList();
  /**
   *
   *
   * <pre>
   * An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  com.google.cloud.compute.v1.NetworkInterface getNetworkInterfaces(int index);
  /**
   *
   *
   * <pre>
   * An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  int getNetworkInterfacesCount();
  /**
   *
   *
   * <pre>
   * An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NetworkInterfaceOrBuilder>
      getNetworkInterfacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  com.google.cloud.compute.v1.NetworkInterfaceOrBuilder getNetworkInterfacesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The private IPv6 google access type for the VM. If not specified, use  INHERIT_FROM_SUBNETWORK as default.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.Instance.PrivateIpv6GoogleAccess private_ipv6_google_access = 48277006;
   * </code>
   *
   * @return The enum numeric value on the wire for privateIpv6GoogleAccess.
   */
  int getPrivateIpv6GoogleAccessValue();
  /**
   *
   *
   * <pre>
   * The private IPv6 google access type for the VM. If not specified, use  INHERIT_FROM_SUBNETWORK as default.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.Instance.PrivateIpv6GoogleAccess private_ipv6_google_access = 48277006;
   * </code>
   *
   * @return The privateIpv6GoogleAccess.
   */
  com.google.cloud.compute.v1.Instance.PrivateIpv6GoogleAccess getPrivateIpv6GoogleAccess();

  /**
   *
   *
   * <pre>
   * Specifies the reservations that this instance can consume from.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ReservationAffinity reservation_affinity = 157850683;</code>
   *
   * @return Whether the reservationAffinity field is set.
   */
  boolean hasReservationAffinity();
  /**
   *
   *
   * <pre>
   * Specifies the reservations that this instance can consume from.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ReservationAffinity reservation_affinity = 157850683;</code>
   *
   * @return The reservationAffinity.
   */
  com.google.cloud.compute.v1.ReservationAffinity getReservationAffinity();
  /**
   *
   *
   * <pre>
   * Specifies the reservations that this instance can consume from.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ReservationAffinity reservation_affinity = 157850683;</code>
   */
  com.google.cloud.compute.v1.ReservationAffinityOrBuilder getReservationAffinityOrBuilder();

  /**
   *
   *
   * <pre>
   * Resource policies applied to this instance.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @return A list containing the resourcePolicies.
   */
  java.util.List<java.lang.String> getResourcePoliciesList();
  /**
   *
   *
   * <pre>
   * Resource policies applied to this instance.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @return The count of resourcePolicies.
   */
  int getResourcePoliciesCount();
  /**
   *
   *
   * <pre>
   * Resource policies applied to this instance.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @param index The index of the element to return.
   * @return The resourcePolicies at the given index.
   */
  java.lang.String getResourcePolicies(int index);
  /**
   *
   *
   * <pre>
   * Resource policies applied to this instance.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourcePolicies at the given index.
   */
  com.google.protobuf.ByteString getResourcePoliciesBytes(int index);

  /**
   *
   *
   * <pre>
   * Sets the scheduling options for this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Scheduling scheduling = 386688404;</code>
   *
   * @return Whether the scheduling field is set.
   */
  boolean hasScheduling();
  /**
   *
   *
   * <pre>
   * Sets the scheduling options for this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Scheduling scheduling = 386688404;</code>
   *
   * @return The scheduling.
   */
  com.google.cloud.compute.v1.Scheduling getScheduling();
  /**
   *
   *
   * <pre>
   * Sets the scheduling options for this instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Scheduling scheduling = 386688404;</code>
   */
  com.google.cloud.compute.v1.SchedulingOrBuilder getSchedulingOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported.
   * Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 277537328;</code>
   */
  java.util.List<com.google.cloud.compute.v1.ServiceAccount> getServiceAccountsList();
  /**
   *
   *
   * <pre>
   * A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported.
   * Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 277537328;</code>
   */
  com.google.cloud.compute.v1.ServiceAccount getServiceAccounts(int index);
  /**
   *
   *
   * <pre>
   * A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported.
   * Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 277537328;</code>
   */
  int getServiceAccountsCount();
  /**
   *
   *
   * <pre>
   * A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported.
   * Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 277537328;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ServiceAccountOrBuilder>
      getServiceAccountsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported.
   * Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 277537328;</code>
   */
  com.google.cloud.compute.v1.ServiceAccountOrBuilder getServiceAccountsOrBuilder(int index);

  /**
   * <code>.google.cloud.compute.v1.ShieldedInstanceConfig shielded_instance_config = 12862901;
   * </code>
   *
   * @return Whether the shieldedInstanceConfig field is set.
   */
  boolean hasShieldedInstanceConfig();
  /**
   * <code>.google.cloud.compute.v1.ShieldedInstanceConfig shielded_instance_config = 12862901;
   * </code>
   *
   * @return The shieldedInstanceConfig.
   */
  com.google.cloud.compute.v1.ShieldedInstanceConfig getShieldedInstanceConfig();
  /**
   * <code>.google.cloud.compute.v1.ShieldedInstanceConfig shielded_instance_config = 12862901;
   * </code>
   */
  com.google.cloud.compute.v1.ShieldedInstanceConfigOrBuilder getShieldedInstanceConfigOrBuilder();

  /**
   * <code>
   * .google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy shielded_instance_integrity_policy = 163696919;
   * </code>
   *
   * @return Whether the shieldedInstanceIntegrityPolicy field is set.
   */
  boolean hasShieldedInstanceIntegrityPolicy();
  /**
   * <code>
   * .google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy shielded_instance_integrity_policy = 163696919;
   * </code>
   *
   * @return The shieldedInstanceIntegrityPolicy.
   */
  com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy getShieldedInstanceIntegrityPolicy();
  /**
   * <code>
   * .google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy shielded_instance_integrity_policy = 163696919;
   * </code>
   */
  com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicyOrBuilder
      getShieldedInstanceIntegrityPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Whether a VM has been restricted for start because Compute Engine has detected suspicious activity.
   * </pre>
   *
   * <code>bool start_restricted = 123693144;</code>
   *
   * @return The startRestricted.
   */
  boolean getStartRestricted();

  /**
   *
   *
   * <pre>
   * [Output Only] The status of the instance. One of the following values: PROVISIONING, STAGING, RUNNING, STOPPING, SUSPENDING, SUSPENDED, REPAIRING, and TERMINATED. For more information about the status of the instance, see  Instance life cycle.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Instance.Status status = 181260274;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the instance. One of the following values: PROVISIONING, STAGING, RUNNING, STOPPING, SUSPENDING, SUSPENDED, REPAIRING, and TERMINATED. For more information about the status of the instance, see  Instance life cycle.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Instance.Status status = 181260274;</code>
   *
   * @return The status.
   */
  com.google.cloud.compute.v1.Instance.Status getStatus();

  /**
   *
   *
   * <pre>
   * [Output Only] An optional, human-readable explanation of the status.
   * </pre>
   *
   * <code>string status_message = 297428154;</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * [Output Only] An optional, human-readable explanation of the status.
   * </pre>
   *
   * <code>string status_message = 297428154;</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();

  /**
   *
   *
   * <pre>
   * Tags to apply to this instance. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during instance creation. The tags can be later modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple tags can be specified via the 'tags.items' field.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Tags tags = 3552281;</code>
   *
   * @return Whether the tags field is set.
   */
  boolean hasTags();
  /**
   *
   *
   * <pre>
   * Tags to apply to this instance. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during instance creation. The tags can be later modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple tags can be specified via the 'tags.items' field.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Tags tags = 3552281;</code>
   *
   * @return The tags.
   */
  com.google.cloud.compute.v1.Tags getTags();
  /**
   *
   *
   * <pre>
   * Tags to apply to this instance. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during instance creation. The tags can be later modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple tags can be specified via the 'tags.items' field.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Tags tags = 3552281;</code>
   */
  com.google.cloud.compute.v1.TagsOrBuilder getTagsOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the zone where the instance resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>string zone = 3744684;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the zone where the instance resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>string zone = 3744684;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
