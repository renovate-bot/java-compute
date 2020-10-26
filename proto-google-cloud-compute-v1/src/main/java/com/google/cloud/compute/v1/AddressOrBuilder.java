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

public interface AddressOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Address)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The static IP address represented by this resource.
   * </pre>
   *
   * <code>string address = 462920692;</code>
   *
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   *
   *
   * <pre>
   * The static IP address represented by this resource.
   * </pre>
   *
   * <code>string address = 462920692;</code>
   *
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString getAddressBytes();

  /**
   *
   *
   * <pre>
   * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Address.AddressType address_type = 264307877;</code>
   *
   * @return The enum numeric value on the wire for addressType.
   */
  int getAddressTypeValue();
  /**
   *
   *
   * <pre>
   * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Address.AddressType address_type = 264307877;</code>
   *
   * @return The addressType.
   */
  com.google.cloud.compute.v1.Address.AddressType getAddressType();

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
   * An optional description of this resource. Provide this field when you create the resource.
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
   * An optional description of this resource. Provide this field when you create the resource.
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
   * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Address.IpVersion ip_version = 294959552;</code>
   *
   * @return The enum numeric value on the wire for ipVersion.
   */
  int getIpVersionValue();
  /**
   *
   *
   * <pre>
   * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Address.IpVersion ip_version = 294959552;</code>
   *
   * @return The ipVersion.
   */
  com.google.cloud.compute.v1.Address.IpVersion getIpVersion();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#address for addresses.
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
   * [Output Only] Type of the resource. Always compute#address for addresses.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
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
   * The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
   * </pre>
   *
   * <code>string network = 232872494;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
   * </pre>
   *
   * <code>string network = 232872494;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Global forwarding rules can only be Premium Tier. Regional forwarding rules can be either Premium or Standard Tier. Standard Tier addresses applied to regional forwarding rules can be used with any external load balancer. Regional forwarding rules in Premium Tier can only be used with a network load balancer.
   * If this field is not specified, it is assumed to be PREMIUM.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Address.NetworkTier network_tier = 517397843;</code>
   *
   * @return The enum numeric value on the wire for networkTier.
   */
  int getNetworkTierValue();
  /**
   *
   *
   * <pre>
   * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Global forwarding rules can only be Premium Tier. Regional forwarding rules can be either Premium or Standard Tier. Standard Tier addresses applied to regional forwarding rules can be used with any external load balancer. Regional forwarding rules in Premium Tier can only be used with a network load balancer.
   * If this field is not specified, it is assumed to be PREMIUM.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Address.NetworkTier network_tier = 517397843;</code>
   *
   * @return The networkTier.
   */
  com.google.cloud.compute.v1.Address.NetworkTier getNetworkTier();

  /**
   *
   *
   * <pre>
   * The prefix length if the resource reprensents an IP range.
   * </pre>
   *
   * <code>int32 prefix_length = 453565747;</code>
   *
   * @return The prefixLength.
   */
  int getPrefixLength();

  /**
   *
   *
   * <pre>
   * The purpose of this resource, which can be one of the following values:
   * - `GCE_ENDPOINT` for addresses that are used by VM instances, alias IP ranges, internal load balancers, and similar resources.
   * - `DNS_RESOLVER` for a DNS resolver address in a subnetwork
   * - `VPC_PEERING` for addresses that are reserved for VPC peer networks.
   * - `NAT_AUTO` for addresses that are external IP addresses automatically reserved for Cloud NAT.
   * - `IPSEC_INTERCONNECT` for addresses created from a private IP range reserved for a VLAN attachment in an IPsec over Interconnect configuration. These addresses are regional resources.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Address.Purpose purpose = 316407070;</code>
   *
   * @return The enum numeric value on the wire for purpose.
   */
  int getPurposeValue();
  /**
   *
   *
   * <pre>
   * The purpose of this resource, which can be one of the following values:
   * - `GCE_ENDPOINT` for addresses that are used by VM instances, alias IP ranges, internal load balancers, and similar resources.
   * - `DNS_RESOLVER` for a DNS resolver address in a subnetwork
   * - `VPC_PEERING` for addresses that are reserved for VPC peer networks.
   * - `NAT_AUTO` for addresses that are external IP addresses automatically reserved for Cloud NAT.
   * - `IPSEC_INTERCONNECT` for addresses created from a private IP range reserved for a VLAN attachment in an IPsec over Interconnect configuration. These addresses are regional resources.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Address.Purpose purpose = 316407070;</code>
   *
   * @return The purpose.
   */
  com.google.cloud.compute.v1.Address.Purpose getPurpose();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the region where the regional address resides. This field is not applicable to global addresses. You must specify this field as part of the HTTP request URL.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the region where the regional address resides. This field is not applicable to global addresses. You must specify this field as part of the HTTP request URL.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
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
   * [Output Only] Server-defined URL for the resource.
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
   * [Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An address that is RESERVING is currently in the process of being reserved. A RESERVED address is currently reserved and available to use. An IN_USE address is currently being used by another resource and is not available.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Address.Status status = 181260274;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An address that is RESERVING is currently in the process of being reserved. A RESERVED address is currently reserved and available to use. An IN_USE address is currently being used by another resource and is not available.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Address.Status status = 181260274;</code>
   *
   * @return The status.
   */
  com.google.cloud.compute.v1.Address.Status getStatus();

  /**
   *
   *
   * <pre>
   * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
   * </pre>
   *
   * <code>string subnetwork = 307827694;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
   * </pre>
   *
   * <code>string subnetwork = 307827694;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The URLs of the resources that are using this address.
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   *
   * @return A list containing the users.
   */
  java.util.List<java.lang.String> getUsersList();
  /**
   *
   *
   * <pre>
   * [Output Only] The URLs of the resources that are using this address.
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   *
   * @return The count of users.
   */
  int getUsersCount();
  /**
   *
   *
   * <pre>
   * [Output Only] The URLs of the resources that are using this address.
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   *
   * @param index The index of the element to return.
   * @return The users at the given index.
   */
  java.lang.String getUsers(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] The URLs of the resources that are using this address.
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the users at the given index.
   */
  com.google.protobuf.ByteString getUsersBytes(int index);
}
