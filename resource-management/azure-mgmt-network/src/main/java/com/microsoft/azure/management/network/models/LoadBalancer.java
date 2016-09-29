/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* LoadBalancer resource
*/
public class LoadBalancer extends TopLevelResource {
    private ArrayList<BackendAddressPool> backendAddressPools;
    
    /**
    * Optional. Gets or sets Pools of backend IP addresseses
    * @return The BackendAddressPools value.
    */
    public ArrayList<BackendAddressPool> getBackendAddressPools() {
        return this.backendAddressPools;
    }
    
    /**
    * Optional. Gets or sets Pools of backend IP addresseses
    * @param backendAddressPoolsValue The BackendAddressPools value.
    */
    public void setBackendAddressPools(final ArrayList<BackendAddressPool> backendAddressPoolsValue) {
        this.backendAddressPools = backendAddressPoolsValue;
    }
    
    private ArrayList<FrontendIpConfiguration> frontendIpConfigurations;
    
    /**
    * Optional. Gets or sets frontend IP addresses of the load balancer
    * @return The FrontendIpConfigurations value.
    */
    public ArrayList<FrontendIpConfiguration> getFrontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }
    
    /**
    * Optional. Gets or sets frontend IP addresses of the load balancer
    * @param frontendIpConfigurationsValue The FrontendIpConfigurations value.
    */
    public void setFrontendIpConfigurations(final ArrayList<FrontendIpConfiguration> frontendIpConfigurationsValue) {
        this.frontendIpConfigurations = frontendIpConfigurationsValue;
    }
    
    private ArrayList<InboundNatPool> inboundNatPools;
    
    /**
    * Optional. Gets or sets inbound NAT pools
    * @return The InboundNatPools value.
    */
    public ArrayList<InboundNatPool> getInboundNatPools() {
        return this.inboundNatPools;
    }
    
    /**
    * Optional. Gets or sets inbound NAT pools
    * @param inboundNatPoolsValue The InboundNatPools value.
    */
    public void setInboundNatPools(final ArrayList<InboundNatPool> inboundNatPoolsValue) {
        this.inboundNatPools = inboundNatPoolsValue;
    }
    
    private ArrayList<InboundNatRule> inboundNatRules;
    
    /**
    * Optional. Gets or sets list of inbound rules
    * @return The InboundNatRules value.
    */
    public ArrayList<InboundNatRule> getInboundNatRules() {
        return this.inboundNatRules;
    }
    
    /**
    * Optional. Gets or sets list of inbound rules
    * @param inboundNatRulesValue The InboundNatRules value.
    */
    public void setInboundNatRules(final ArrayList<InboundNatRule> inboundNatRulesValue) {
        this.inboundNatRules = inboundNatRulesValue;
    }
    
    private ArrayList<LoadBalancingRule> loadBalancingRules;
    
    /**
    * Optional. Gets or sets loadbalancing rules
    * @return The LoadBalancingRules value.
    */
    public ArrayList<LoadBalancingRule> getLoadBalancingRules() {
        return this.loadBalancingRules;
    }
    
    /**
    * Optional. Gets or sets loadbalancing rules
    * @param loadBalancingRulesValue The LoadBalancingRules value.
    */
    public void setLoadBalancingRules(final ArrayList<LoadBalancingRule> loadBalancingRulesValue) {
        this.loadBalancingRules = loadBalancingRulesValue;
    }
    
    private ArrayList<OutboundNatRule> outboundNatRules;
    
    /**
    * Optional. Gets or sets outbound NAT rules
    * @return The OutboundNatRules value.
    */
    public ArrayList<OutboundNatRule> getOutboundNatRules() {
        return this.outboundNatRules;
    }
    
    /**
    * Optional. Gets or sets outbound NAT rules
    * @param outboundNatRulesValue The OutboundNatRules value.
    */
    public void setOutboundNatRules(final ArrayList<OutboundNatRule> outboundNatRulesValue) {
        this.outboundNatRules = outboundNatRulesValue;
    }
    
    private ArrayList<Probe> probes;
    
    /**
    * Optional. Gets or sets list of Load balancer probes
    * @return The Probes value.
    */
    public ArrayList<Probe> getProbes() {
        return this.probes;
    }
    
    /**
    * Optional. Gets or sets list of Load balancer probes
    * @param probesValue The Probes value.
    */
    public void setProbes(final ArrayList<Probe> probesValue) {
        this.probes = probesValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets Provisioning state of the PublicIP resource
    * Updating/Deleting/Failed
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets Provisioning state of the PublicIP resource
    * Updating/Deleting/Failed
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    private String resourceGuid;
    
    /**
    * Optional. Gets or sets resource guid property of the Load balancer
    * resource
    * @return The ResourceGuid value.
    */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    
    /**
    * Optional. Gets or sets resource guid property of the Load balancer
    * resource
    * @param resourceGuidValue The ResourceGuid value.
    */
    public void setResourceGuid(final String resourceGuidValue) {
        this.resourceGuid = resourceGuidValue;
    }
    
    /**
    * Initializes a new instance of the LoadBalancer class.
    *
    */
    public LoadBalancer() {
        super();
        this.setBackendAddressPools(new LazyArrayList<BackendAddressPool>());
        this.setFrontendIpConfigurations(new LazyArrayList<FrontendIpConfiguration>());
        this.setInboundNatPools(new LazyArrayList<InboundNatPool>());
        this.setInboundNatRules(new LazyArrayList<InboundNatRule>());
        this.setLoadBalancingRules(new LazyArrayList<LoadBalancingRule>());
        this.setOutboundNatRules(new LazyArrayList<OutboundNatRule>());
        this.setProbes(new LazyArrayList<Probe>());
    }
    
    /**
    * Initializes a new instance of the LoadBalancer class with required
    * arguments.
    *
    * @param location Gets or sets the location of the resource.
    */
    public LoadBalancer(String location) {
        this();
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setLocation(location);
    }
}