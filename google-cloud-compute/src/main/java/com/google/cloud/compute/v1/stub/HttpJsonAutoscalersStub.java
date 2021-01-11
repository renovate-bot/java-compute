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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.AutoscalersClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.AutoscalersClient.ListPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.FieldsExtractor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AggregatedListAutoscalersRequest;
import com.google.cloud.compute.v1.Autoscaler;
import com.google.cloud.compute.v1.AutoscalerAggregatedList;
import com.google.cloud.compute.v1.AutoscalerList;
import com.google.cloud.compute.v1.DeleteAutoscalerRequest;
import com.google.cloud.compute.v1.GetAutoscalerRequest;
import com.google.cloud.compute.v1.InsertAutoscalerRequest;
import com.google.cloud.compute.v1.ListAutoscalersRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchAutoscalerRequest;
import com.google.cloud.compute.v1.UpdateAutoscalerRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * REST stub implementation for Google Compute Engine API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonAutoscalersStub extends AutoscalersStub {

  @InternalApi
  public static final ApiMethodDescriptor<
          AggregatedListAutoscalersRequest, AutoscalerAggregatedList>
      aggregatedListMethodDescriptor =
          ApiMethodDescriptor
              .<AggregatedListAutoscalersRequest, AutoscalerAggregatedList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Autoscalers.AggregatedList")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<AggregatedListAutoscalersRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/aggregated/autoscalers",
                          new FieldsExtractor<
                              AggregatedListAutoscalersRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                AggregatedListAutoscalersRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<AggregatedListAutoscalersRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              AggregatedListAutoscalersRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                AggregatedListAutoscalersRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<AggregatedListAutoscalersRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putQueryParam(fields, "filter", request.getFilter());
                              serializer.putQueryParam(
                                  fields, "includeAllScopes", request.getIncludeAllScopes());
                              serializer.putQueryParam(
                                  fields, "maxResults", request.getMaxResults());
                              serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                              serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                              serializer.putQueryParam(
                                  fields,
                                  "returnPartialSuccess",
                                  request.getReturnPartialSuccess());
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<AggregatedListAutoscalersRequest, String>() {
                            @Override
                            public String extract(AggregatedListAutoscalersRequest request) {
                              return "";
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<AutoscalerAggregatedList>newBuilder()
                      .setDefaultInstance(AutoscalerAggregatedList.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<DeleteAutoscalerRequest, Operation>
      deleteMethodDescriptor =
          ApiMethodDescriptor.<DeleteAutoscalerRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Autoscalers.Delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteAutoscalerRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/zones/{zone}/autoscalers/{autoscaler}",
                          new FieldsExtractor<DeleteAutoscalerRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(DeleteAutoscalerRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<DeleteAutoscalerRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "zone", request.getZone());
                              serializer.putPathParam(
                                  fields, "autoscaler", request.getAutoscaler());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              DeleteAutoscalerRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                DeleteAutoscalerRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<DeleteAutoscalerRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<DeleteAutoscalerRequest, String>() {
                            @Override
                            public String extract(DeleteAutoscalerRequest request) {
                              return "";
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<GetAutoscalerRequest, Autoscaler> getMethodDescriptor =
      ApiMethodDescriptor.<GetAutoscalerRequest, Autoscaler>newBuilder()
          .setFullMethodName("google.cloud.compute.v1.Autoscalers.Get")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetAutoscalerRequest>newBuilder()
                  .setPath(
                      "/compute/v1/projects/{project}/zones/{zone}/autoscalers/{autoscaler}",
                      new FieldsExtractor<GetAutoscalerRequest, Map<String, String>>() {
                        @Override
                        public Map<String, String> extract(GetAutoscalerRequest request) {
                          Map<String, String> fields = new HashMap<>();
                          ProtoRestSerializer<GetAutoscalerRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putPathParam(fields, "project", request.getProject());
                          serializer.putPathParam(fields, "zone", request.getZone());
                          serializer.putPathParam(fields, "autoscaler", request.getAutoscaler());
                          return fields;
                        }
                      })
                  .setQueryParamsExtractor(
                      new FieldsExtractor<GetAutoscalerRequest, Map<String, List<String>>>() {
                        @Override
                        public Map<String, List<String>> extract(GetAutoscalerRequest request) {
                          Map<String, List<String>> fields = new HashMap<>();
                          ProtoRestSerializer<GetAutoscalerRequest> serializer =
                              ProtoRestSerializer.create();

                          return fields;
                        }
                      })
                  .setRequestBodyExtractor(
                      new FieldsExtractor<GetAutoscalerRequest, String>() {
                        @Override
                        public String extract(GetAutoscalerRequest request) {
                          return "";
                        }
                      })
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Autoscaler>newBuilder()
                  .setDefaultInstance(Autoscaler.getDefaultInstance())
                  .build())
          .build();

  @InternalApi
  public static final ApiMethodDescriptor<InsertAutoscalerRequest, Operation>
      insertMethodDescriptor =
          ApiMethodDescriptor.<InsertAutoscalerRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Autoscalers.Insert")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<InsertAutoscalerRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/zones/{zone}/autoscalers",
                          new FieldsExtractor<InsertAutoscalerRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(InsertAutoscalerRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<InsertAutoscalerRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "zone", request.getZone());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              InsertAutoscalerRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                InsertAutoscalerRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<InsertAutoscalerRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<InsertAutoscalerRequest, String>() {
                            @Override
                            public String extract(InsertAutoscalerRequest request) {
                              return ProtoRestSerializer.create()
                                  .toBody("autoscalerResource", request.getAutoscalerResource());
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<ListAutoscalersRequest, AutoscalerList>
      listMethodDescriptor =
          ApiMethodDescriptor.<ListAutoscalersRequest, AutoscalerList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Autoscalers.List")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListAutoscalersRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/zones/{zone}/autoscalers",
                          new FieldsExtractor<ListAutoscalersRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(ListAutoscalersRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<ListAutoscalersRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "zone", request.getZone());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<ListAutoscalersRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                ListAutoscalersRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<ListAutoscalersRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putQueryParam(fields, "filter", request.getFilter());
                              serializer.putQueryParam(
                                  fields, "maxResults", request.getMaxResults());
                              serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                              serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                              serializer.putQueryParam(
                                  fields,
                                  "returnPartialSuccess",
                                  request.getReturnPartialSuccess());
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<ListAutoscalersRequest, String>() {
                            @Override
                            public String extract(ListAutoscalersRequest request) {
                              return "";
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<AutoscalerList>newBuilder()
                      .setDefaultInstance(AutoscalerList.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<PatchAutoscalerRequest, Operation> patchMethodDescriptor =
      ApiMethodDescriptor.<PatchAutoscalerRequest, Operation>newBuilder()
          .setFullMethodName("google.cloud.compute.v1.Autoscalers.Patch")
          .setHttpMethod(HttpMethods.PATCH)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<PatchAutoscalerRequest>newBuilder()
                  .setPath(
                      "/compute/v1/projects/{project}/zones/{zone}/autoscalers",
                      new FieldsExtractor<PatchAutoscalerRequest, Map<String, String>>() {
                        @Override
                        public Map<String, String> extract(PatchAutoscalerRequest request) {
                          Map<String, String> fields = new HashMap<>();
                          ProtoRestSerializer<PatchAutoscalerRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putPathParam(fields, "project", request.getProject());
                          serializer.putPathParam(fields, "zone", request.getZone());
                          return fields;
                        }
                      })
                  .setQueryParamsExtractor(
                      new FieldsExtractor<PatchAutoscalerRequest, Map<String, List<String>>>() {
                        @Override
                        public Map<String, List<String>> extract(PatchAutoscalerRequest request) {
                          Map<String, List<String>> fields = new HashMap<>();
                          ProtoRestSerializer<PatchAutoscalerRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putQueryParam(fields, "autoscaler", request.getAutoscaler());
                          serializer.putQueryParam(fields, "requestId", request.getRequestId());
                          return fields;
                        }
                      })
                  .setRequestBodyExtractor(
                      new FieldsExtractor<PatchAutoscalerRequest, String>() {
                        @Override
                        public String extract(PatchAutoscalerRequest request) {
                          return ProtoRestSerializer.create()
                              .toBody("autoscalerResource", request.getAutoscalerResource());
                        }
                      })
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Operation>newBuilder()
                  .setDefaultInstance(Operation.getDefaultInstance())
                  .build())
          .build();

  @InternalApi
  public static final ApiMethodDescriptor<UpdateAutoscalerRequest, Operation>
      updateMethodDescriptor =
          ApiMethodDescriptor.<UpdateAutoscalerRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Autoscalers.Update")
              .setHttpMethod(HttpMethods.PUT)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateAutoscalerRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/zones/{zone}/autoscalers",
                          new FieldsExtractor<UpdateAutoscalerRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(UpdateAutoscalerRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<UpdateAutoscalerRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "zone", request.getZone());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              UpdateAutoscalerRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                UpdateAutoscalerRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<UpdateAutoscalerRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putQueryParam(
                                  fields, "autoscaler", request.getAutoscaler());
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<UpdateAutoscalerRequest, String>() {
                            @Override
                            public String extract(UpdateAutoscalerRequest request) {
                              return ProtoRestSerializer.create()
                                  .toBody("autoscalerResource", request.getAutoscalerResource());
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AggregatedListAutoscalersRequest, AutoscalerAggregatedList>
      aggregatedListCallable;
  private final UnaryCallable<AggregatedListAutoscalersRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable;
  private final UnaryCallable<DeleteAutoscalerRequest, Operation> deleteCallable;
  private final UnaryCallable<GetAutoscalerRequest, Autoscaler> getCallable;
  private final UnaryCallable<InsertAutoscalerRequest, Operation> insertCallable;
  private final UnaryCallable<ListAutoscalersRequest, AutoscalerList> listCallable;
  private final UnaryCallable<ListAutoscalersRequest, ListPagedResponse> listPagedCallable;
  private final UnaryCallable<PatchAutoscalerRequest, Operation> patchCallable;
  private final UnaryCallable<UpdateAutoscalerRequest, Operation> updateCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonAutoscalersStub create(AutoscalersStubSettings settings)
      throws IOException {
    return new HttpJsonAutoscalersStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonAutoscalersStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonAutoscalersStub(AutoscalersStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonAutoscalersStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonAutoscalersStub(
        AutoscalersStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonAutoscalersStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonAutoscalersStub(AutoscalersStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonAutoscalersCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonAutoscalersStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonAutoscalersStub(
      AutoscalersStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AggregatedListAutoscalersRequest, AutoscalerAggregatedList>
        aggregatedListTransportSettings =
            HttpJsonCallSettings
                .<AggregatedListAutoscalersRequest, AutoscalerAggregatedList>newBuilder()
                .setMethodDescriptor(aggregatedListMethodDescriptor)
                .build();
    HttpJsonCallSettings<DeleteAutoscalerRequest, Operation> deleteTransportSettings =
        HttpJsonCallSettings.<DeleteAutoscalerRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetAutoscalerRequest, Autoscaler> getTransportSettings =
        HttpJsonCallSettings.<GetAutoscalerRequest, Autoscaler>newBuilder()
            .setMethodDescriptor(getMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertAutoscalerRequest, Operation> insertTransportSettings =
        HttpJsonCallSettings.<InsertAutoscalerRequest, Operation>newBuilder()
            .setMethodDescriptor(insertMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListAutoscalersRequest, AutoscalerList> listTransportSettings =
        HttpJsonCallSettings.<ListAutoscalersRequest, AutoscalerList>newBuilder()
            .setMethodDescriptor(listMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchAutoscalerRequest, Operation> patchTransportSettings =
        HttpJsonCallSettings.<PatchAutoscalerRequest, Operation>newBuilder()
            .setMethodDescriptor(patchMethodDescriptor)
            .build();
    HttpJsonCallSettings<UpdateAutoscalerRequest, Operation> updateTransportSettings =
        HttpJsonCallSettings.<UpdateAutoscalerRequest, Operation>newBuilder()
            .setMethodDescriptor(updateMethodDescriptor)
            .build();

    this.aggregatedListCallable =
        callableFactory.createUnaryCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
    this.aggregatedListPagedCallable =
        callableFactory.createPagedCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
    this.deleteCallable =
        callableFactory.createUnaryCallable(
            deleteTransportSettings, settings.deleteSettings(), clientContext);
    this.getCallable =
        callableFactory.createUnaryCallable(
            getTransportSettings, settings.getSettings(), clientContext);
    this.insertCallable =
        callableFactory.createUnaryCallable(
            insertTransportSettings, settings.insertSettings(), clientContext);
    this.listCallable =
        callableFactory.createUnaryCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.listPagedCallable =
        callableFactory.createPagedCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.patchCallable =
        callableFactory.createUnaryCallable(
            patchTransportSettings, settings.patchSettings(), clientContext);
    this.updateCallable =
        callableFactory.createUnaryCallable(
            updateTransportSettings, settings.updateSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<AggregatedListAutoscalersRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    return aggregatedListPagedCallable;
  }

  public UnaryCallable<AggregatedListAutoscalersRequest, AutoscalerAggregatedList>
      aggregatedListCallable() {
    return aggregatedListCallable;
  }

  public UnaryCallable<DeleteAutoscalerRequest, Operation> deleteCallable() {
    return deleteCallable;
  }

  public UnaryCallable<GetAutoscalerRequest, Autoscaler> getCallable() {
    return getCallable;
  }

  public UnaryCallable<InsertAutoscalerRequest, Operation> insertCallable() {
    return insertCallable;
  }

  public UnaryCallable<ListAutoscalersRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  public UnaryCallable<ListAutoscalersRequest, AutoscalerList> listCallable() {
    return listCallable;
  }

  public UnaryCallable<PatchAutoscalerRequest, Operation> patchCallable() {
    return patchCallable;
  }

  public UnaryCallable<UpdateAutoscalerRequest, Operation> updateCallable() {
    return updateCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}