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

import static com.google.cloud.compute.v1.FirewallsClient.ListPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteFirewallRequest;
import com.google.cloud.compute.v1.Firewall;
import com.google.cloud.compute.v1.FirewallList;
import com.google.cloud.compute.v1.GetFirewallRequest;
import com.google.cloud.compute.v1.InsertFirewallRequest;
import com.google.cloud.compute.v1.ListFirewallsRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchFirewallRequest;
import com.google.cloud.compute.v1.UpdateFirewallRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Compute Engine API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class FirewallsStub implements BackgroundResource {

  public UnaryCallable<DeleteFirewallRequest, Operation> deleteCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteCallable()");
  }

  public UnaryCallable<GetFirewallRequest, Firewall> getCallable() {
    throw new UnsupportedOperationException("Not implemented: getCallable()");
  }

  public UnaryCallable<InsertFirewallRequest, Operation> insertCallable() {
    throw new UnsupportedOperationException("Not implemented: insertCallable()");
  }

  public UnaryCallable<ListFirewallsRequest, ListPagedResponse> listPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listPagedCallable()");
  }

  public UnaryCallable<ListFirewallsRequest, FirewallList> listCallable() {
    throw new UnsupportedOperationException("Not implemented: listCallable()");
  }

  public UnaryCallable<PatchFirewallRequest, Operation> patchCallable() {
    throw new UnsupportedOperationException("Not implemented: patchCallable()");
  }

  public UnaryCallable<UpdateFirewallRequest, Operation> updateCallable() {
    throw new UnsupportedOperationException("Not implemented: updateCallable()");
  }

  @Override
  public abstract void close();
}
