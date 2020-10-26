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
package com.google.cloud.compute.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.RegionsStub;
import com.google.cloud.compute.v1.stub.RegionsStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: The Regions API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (RegionsClient regionsClient = RegionsClient.create()) {
 *   String project = "";
 *   String region = "";
 *   Region response = regionsClient.get(project, region);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the regionsClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of RegionsSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * RegionsSettings regionsSettings =
 *     RegionsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionsClient regionsClient =
 *     RegionsClient.create(regionsSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RegionsSettings regionsSettings =
 *     RegionsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RegionsClient regionsClient =
 *     RegionsClient.create(regionsSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RegionsClient implements BackgroundResource {
  private final RegionsSettings settings;
  private final RegionsStub stub;

  /** Constructs an instance of RegionsClient with default settings. */
  public static final RegionsClient create() throws IOException {
    return create(RegionsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RegionsClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RegionsClient create(RegionsSettings settings) throws IOException {
    return new RegionsClient(settings);
  }

  /**
   * Constructs an instance of RegionsClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use RegionsSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final RegionsClient create(RegionsStub stub) {
    return new RegionsClient(stub);
  }

  /**
   * Constructs an instance of RegionsClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected RegionsClient(RegionsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((RegionsStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected RegionsClient(RegionsStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegionsSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RegionsStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Region resource. Gets a list of available regions by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionsClient regionsClient = RegionsClient.create()) {
   *   String project = "";
   *   String region = "";
   *   Region response = regionsClient.get(project, region);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Region get(String project, String region) {
    GetRegionRequest request =
        GetRegionRequest.newBuilder().setProject(project).setRegion(region).build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Region resource. Gets a list of available regions by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionsClient regionsClient = RegionsClient.create()) {
   *   String project = "";
   *   String region = "";
   *   GetRegionRequest request = GetRegionRequest.newBuilder()
   *     .setProject(project)
   *     .setRegion(region)
   *     .build();
   *   Region response = regionsClient.get(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Region get(GetRegionRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Region resource. Gets a list of available regions by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionsClient regionsClient = RegionsClient.create()) {
   *   String project = "";
   *   String region = "";
   *   GetRegionRequest request = GetRegionRequest.newBuilder()
   *     .setProject(project)
   *     .setRegion(region)
   *     .build();
   *   ApiFuture&lt;Region&gt; future = regionsClient.getCallable().futureCall(request);
   *   // Do something
   *   Region response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetRegionRequest, Region> getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of region resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionsClient regionsClient = RegionsClient.create()) {
   *   String project = "";
   *   for (Region element : regionsClient.list(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project) {
    ListRegionsRequest request = ListRegionsRequest.newBuilder().setProject(project).build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of region resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionsClient regionsClient = RegionsClient.create()) {
   *   String project = "";
   *   ListRegionsRequest request = ListRegionsRequest.newBuilder()
   *     .setProject(project)
   *     .build();
   *   for (Region element : regionsClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListRegionsRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of region resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionsClient regionsClient = RegionsClient.create()) {
   *   String project = "";
   *   ListRegionsRequest request = ListRegionsRequest.newBuilder()
   *     .setProject(project)
   *     .build();
   *   ApiFuture&lt;ListPagedResponse&gt; future = regionsClient.listPagedCallable().futureCall(request);
   *   // Do something
   *   for (Region element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListRegionsRequest, ListPagedResponse> listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of region resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionsClient regionsClient = RegionsClient.create()) {
   *   String project = "";
   *   ListRegionsRequest request = ListRegionsRequest.newBuilder()
   *     .setProject(project)
   *     .build();
   *   while (true) {
   *     RegionList response = regionsClient.listCallable().call(request);
   *     for (Region element : response.getItemsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListRegionsRequest, RegionList> listCallable() {
    return stub.listCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListPagedResponse
      extends AbstractPagedListResponse<
          ListRegionsRequest, RegionList, Region, ListPage, ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<ListRegionsRequest, RegionList, Region> context,
        ApiFuture<RegionList> futureResponse) {
      ApiFuture<ListPage> futurePage =
          ListPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListPage, ListPagedResponse>() {
            @Override
            public ListPagedResponse apply(ListPage input) {
              return new ListPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListPagedResponse(ListPage page) {
      super(page, ListFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPage
      extends AbstractPage<ListRegionsRequest, RegionList, Region, ListPage> {

    private ListPage(
        PageContext<ListRegionsRequest, RegionList, Region> context, RegionList response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<ListRegionsRequest, RegionList, Region> context, RegionList response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<ListRegionsRequest, RegionList, Region> context,
        ApiFuture<RegionList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRegionsRequest, RegionList, Region, ListPage, ListFixedSizeCollection> {

    private ListFixedSizeCollection(List<ListPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFixedSizeCollection createEmptyCollection() {
      return new ListFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFixedSizeCollection createCollection(List<ListPage> pages, int collectionSize) {
      return new ListFixedSizeCollection(pages, collectionSize);
    }
  }
}
