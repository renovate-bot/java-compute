/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.BackendServicesClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.BackendServicesClient.ListPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.compute.v1.stub.BackendServicesStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link BackendServicesClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (compute.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of addSignedUrlKey to 30 seconds:
 *
 * <pre>{@code
 * BackendServicesSettings.Builder backendServicesSettingsBuilder =
 *     BackendServicesSettings.newBuilder();
 * backendServicesSettingsBuilder
 *     .addSignedUrlKeySettings()
 *     .setRetrySettings(
 *         backendServicesSettingsBuilder
 *             .addSignedUrlKeySettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * BackendServicesSettings backendServicesSettings = backendServicesSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class BackendServicesSettings extends ClientSettings<BackendServicesSettings> {

  /** Returns the object with the settings used for calls to addSignedUrlKey. */
  public UnaryCallSettings<AddSignedUrlKeyBackendServiceRequest, Operation>
      addSignedUrlKeySettings() {
    return ((BackendServicesStubSettings) getStubSettings()).addSignedUrlKeySettings();
  }

  /** Returns the object with the settings used for calls to aggregatedList. */
  public PagedCallSettings<
          AggregatedListBackendServicesRequest,
          BackendServiceAggregatedList,
          AggregatedListPagedResponse>
      aggregatedListSettings() {
    return ((BackendServicesStubSettings) getStubSettings()).aggregatedListSettings();
  }

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteBackendServiceRequest, Operation> deleteSettings() {
    return ((BackendServicesStubSettings) getStubSettings()).deleteSettings();
  }

  /** Returns the object with the settings used for calls to deleteSignedUrlKey. */
  public UnaryCallSettings<DeleteSignedUrlKeyBackendServiceRequest, Operation>
      deleteSignedUrlKeySettings() {
    return ((BackendServicesStubSettings) getStubSettings()).deleteSignedUrlKeySettings();
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetBackendServiceRequest, BackendService> getSettings() {
    return ((BackendServicesStubSettings) getStubSettings()).getSettings();
  }

  /** Returns the object with the settings used for calls to getHealth. */
  public UnaryCallSettings<GetHealthBackendServiceRequest, BackendServiceGroupHealth>
      getHealthSettings() {
    return ((BackendServicesStubSettings) getStubSettings()).getHealthSettings();
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertBackendServiceRequest, Operation> insertSettings() {
    return ((BackendServicesStubSettings) getStubSettings()).insertSettings();
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<ListBackendServicesRequest, BackendServiceList, ListPagedResponse>
      listSettings() {
    return ((BackendServicesStubSettings) getStubSettings()).listSettings();
  }

  /** Returns the object with the settings used for calls to patch. */
  public UnaryCallSettings<PatchBackendServiceRequest, Operation> patchSettings() {
    return ((BackendServicesStubSettings) getStubSettings()).patchSettings();
  }

  /** Returns the object with the settings used for calls to setSecurityPolicy. */
  public UnaryCallSettings<SetSecurityPolicyBackendServiceRequest, Operation>
      setSecurityPolicySettings() {
    return ((BackendServicesStubSettings) getStubSettings()).setSecurityPolicySettings();
  }

  /** Returns the object with the settings used for calls to update. */
  public UnaryCallSettings<UpdateBackendServiceRequest, Operation> updateSettings() {
    return ((BackendServicesStubSettings) getStubSettings()).updateSettings();
  }

  public static final BackendServicesSettings create(BackendServicesStubSettings stub)
      throws IOException {
    return new BackendServicesSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return BackendServicesStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return BackendServicesStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return BackendServicesStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return BackendServicesStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return BackendServicesStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return BackendServicesStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return BackendServicesStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected BackendServicesSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for BackendServicesSettings. */
  public static class Builder extends ClientSettings.Builder<BackendServicesSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(BackendServicesStubSettings.newBuilder(clientContext));
    }

    protected Builder(BackendServicesSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(BackendServicesStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(BackendServicesStubSettings.newBuilder());
    }

    public BackendServicesStubSettings.Builder getStubSettingsBuilder() {
      return ((BackendServicesStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to addSignedUrlKey. */
    public UnaryCallSettings.Builder<AddSignedUrlKeyBackendServiceRequest, Operation>
        addSignedUrlKeySettings() {
      return getStubSettingsBuilder().addSignedUrlKeySettings();
    }

    /** Returns the builder for the settings used for calls to aggregatedList. */
    public PagedCallSettings.Builder<
            AggregatedListBackendServicesRequest,
            BackendServiceAggregatedList,
            AggregatedListPagedResponse>
        aggregatedListSettings() {
      return getStubSettingsBuilder().aggregatedListSettings();
    }

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteBackendServiceRequest, Operation> deleteSettings() {
      return getStubSettingsBuilder().deleteSettings();
    }

    /** Returns the builder for the settings used for calls to deleteSignedUrlKey. */
    public UnaryCallSettings.Builder<DeleteSignedUrlKeyBackendServiceRequest, Operation>
        deleteSignedUrlKeySettings() {
      return getStubSettingsBuilder().deleteSignedUrlKeySettings();
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetBackendServiceRequest, BackendService> getSettings() {
      return getStubSettingsBuilder().getSettings();
    }

    /** Returns the builder for the settings used for calls to getHealth. */
    public UnaryCallSettings.Builder<GetHealthBackendServiceRequest, BackendServiceGroupHealth>
        getHealthSettings() {
      return getStubSettingsBuilder().getHealthSettings();
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertBackendServiceRequest, Operation> insertSettings() {
      return getStubSettingsBuilder().insertSettings();
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListBackendServicesRequest, BackendServiceList, ListPagedResponse>
        listSettings() {
      return getStubSettingsBuilder().listSettings();
    }

    /** Returns the builder for the settings used for calls to patch. */
    public UnaryCallSettings.Builder<PatchBackendServiceRequest, Operation> patchSettings() {
      return getStubSettingsBuilder().patchSettings();
    }

    /** Returns the builder for the settings used for calls to setSecurityPolicy. */
    public UnaryCallSettings.Builder<SetSecurityPolicyBackendServiceRequest, Operation>
        setSecurityPolicySettings() {
      return getStubSettingsBuilder().setSecurityPolicySettings();
    }

    /** Returns the builder for the settings used for calls to update. */
    public UnaryCallSettings.Builder<UpdateBackendServiceRequest, Operation> updateSettings() {
      return getStubSettingsBuilder().updateSettings();
    }

    @Override
    public BackendServicesSettings build() throws IOException {
      return new BackendServicesSettings(this);
    }
  }
}
