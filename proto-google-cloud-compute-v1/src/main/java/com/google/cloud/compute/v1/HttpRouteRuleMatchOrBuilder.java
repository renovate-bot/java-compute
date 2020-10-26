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

public interface HttpRouteRuleMatchOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HttpRouteRuleMatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL.
   * fullPathMatch must be between 1 and 1024 characters.
   * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
   * </pre>
   *
   * <code>string full_path_match = 214598875;</code>
   *
   * @return The fullPathMatch.
   */
  java.lang.String getFullPathMatch();
  /**
   *
   *
   * <pre>
   * For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL.
   * fullPathMatch must be between 1 and 1024 characters.
   * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
   * </pre>
   *
   * <code>string full_path_match = 214598875;</code>
   *
   * @return The bytes for fullPathMatch.
   */
  com.google.protobuf.ByteString getFullPathMatchBytes();

  /**
   *
   *
   * <pre>
   * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpHeaderMatch header_matches = 361903489;</code>
   */
  java.util.List<com.google.cloud.compute.v1.HttpHeaderMatch> getHeaderMatchesList();
  /**
   *
   *
   * <pre>
   * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpHeaderMatch header_matches = 361903489;</code>
   */
  com.google.cloud.compute.v1.HttpHeaderMatch getHeaderMatches(int index);
  /**
   *
   *
   * <pre>
   * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpHeaderMatch header_matches = 361903489;</code>
   */
  int getHeaderMatchesCount();
  /**
   *
   *
   * <pre>
   * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpHeaderMatch header_matches = 361903489;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.HttpHeaderMatchOrBuilder>
      getHeaderMatchesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpHeaderMatch header_matches = 361903489;</code>
   */
  com.google.cloud.compute.v1.HttpHeaderMatchOrBuilder getHeaderMatchesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
   * The default value is false.
   * ignoreCase must not be used with regexMatch.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>bool ignore_case = 464324989;</code>
   *
   * @return The ignoreCase.
   */
  boolean getIgnoreCase();

  /**
   *
   *
   * <pre>
   * Opaque filter criteria used by Loadbalancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to Loadbalancer, xDS clients present node metadata. When there is a match, the relevant routing configuration is made available to those proxies.
   * For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are specified, all of them need to be satisfied in order to be considered a match.
   * metadataFilters specified here will be applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to.
   * metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.MetadataFilter metadata_filters = 464725739;</code>
   */
  java.util.List<com.google.cloud.compute.v1.MetadataFilter> getMetadataFiltersList();
  /**
   *
   *
   * <pre>
   * Opaque filter criteria used by Loadbalancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to Loadbalancer, xDS clients present node metadata. When there is a match, the relevant routing configuration is made available to those proxies.
   * For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are specified, all of them need to be satisfied in order to be considered a match.
   * metadataFilters specified here will be applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to.
   * metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.MetadataFilter metadata_filters = 464725739;</code>
   */
  com.google.cloud.compute.v1.MetadataFilter getMetadataFilters(int index);
  /**
   *
   *
   * <pre>
   * Opaque filter criteria used by Loadbalancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to Loadbalancer, xDS clients present node metadata. When there is a match, the relevant routing configuration is made available to those proxies.
   * For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are specified, all of them need to be satisfied in order to be considered a match.
   * metadataFilters specified here will be applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to.
   * metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.MetadataFilter metadata_filters = 464725739;</code>
   */
  int getMetadataFiltersCount();
  /**
   *
   *
   * <pre>
   * Opaque filter criteria used by Loadbalancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to Loadbalancer, xDS clients present node metadata. When there is a match, the relevant routing configuration is made available to those proxies.
   * For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are specified, all of them need to be satisfied in order to be considered a match.
   * metadataFilters specified here will be applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to.
   * metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.MetadataFilter metadata_filters = 464725739;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.MetadataFilterOrBuilder>
      getMetadataFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Opaque filter criteria used by Loadbalancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to Loadbalancer, xDS clients present node metadata. When there is a match, the relevant routing configuration is made available to those proxies.
   * For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are specified, all of them need to be satisfied in order to be considered a match.
   * metadataFilters specified here will be applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to.
   * metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.MetadataFilter metadata_filters = 464725739;</code>
   */
  com.google.cloud.compute.v1.MetadataFilterOrBuilder getMetadataFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * For satisfying the matchRule condition, the request's path must begin with the specified prefixMatch. prefixMatch must begin with a /.
   * The value must be between 1 and 1024 characters.
   * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
   * </pre>
   *
   * <code>string prefix_match = 257898968;</code>
   *
   * @return The prefixMatch.
   */
  java.lang.String getPrefixMatch();
  /**
   *
   *
   * <pre>
   * For satisfying the matchRule condition, the request's path must begin with the specified prefixMatch. prefixMatch must begin with a /.
   * The value must be between 1 and 1024 characters.
   * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
   * </pre>
   *
   * <code>string prefix_match = 257898968;</code>
   *
   * @return The bytes for prefixMatch.
   */
  com.google.protobuf.ByteString getPrefixMatchBytes();

  /**
   *
   *
   * <pre>
   * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.HttpQueryParameterMatch query_parameter_matches = 286231270;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.HttpQueryParameterMatch>
      getQueryParameterMatchesList();
  /**
   *
   *
   * <pre>
   * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.HttpQueryParameterMatch query_parameter_matches = 286231270;
   * </code>
   */
  com.google.cloud.compute.v1.HttpQueryParameterMatch getQueryParameterMatches(int index);
  /**
   *
   *
   * <pre>
   * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.HttpQueryParameterMatch query_parameter_matches = 286231270;
   * </code>
   */
  int getQueryParameterMatchesCount();
  /**
   *
   *
   * <pre>
   * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.HttpQueryParameterMatch query_parameter_matches = 286231270;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.HttpQueryParameterMatchOrBuilder>
      getQueryParameterMatchesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.HttpQueryParameterMatch query_parameter_matches = 286231270;
   * </code>
   */
  com.google.cloud.compute.v1.HttpQueryParameterMatchOrBuilder getQueryParameterMatchesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * For satisfying the matchRule condition, the path of the request must satisfy the regular expression specified in regexMatch after removing any query parameters and anchor supplied with the original URL. For regular expression grammar please see en.cppreference.com/w/cpp/regex/ecmascript
   * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
   * Note that regexMatch only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * </pre>
   *
   * <code>string regex_match = 107387853;</code>
   *
   * @return The regexMatch.
   */
  java.lang.String getRegexMatch();
  /**
   *
   *
   * <pre>
   * For satisfying the matchRule condition, the path of the request must satisfy the regular expression specified in regexMatch after removing any query parameters and anchor supplied with the original URL. For regular expression grammar please see en.cppreference.com/w/cpp/regex/ecmascript
   * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
   * Note that regexMatch only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * </pre>
   *
   * <code>string regex_match = 107387853;</code>
   *
   * @return The bytes for regexMatch.
   */
  com.google.protobuf.ByteString getRegexMatchBytes();
}
