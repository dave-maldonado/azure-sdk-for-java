/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * LoadBalancer resource.
 */
@JsonFlatten
public class LoadBalancer extends Resource {
    /**
     * Gets or sets frontend IP addresses of the load balancer.
     */
    @JsonProperty(value = "properties.frontendIPConfigurations")
    private List<FrontendIPConfiguration> frontendIPConfigurations;

    /**
     * Gets or sets Pools of backend IP addresseses.
     */
    @JsonProperty(value = "properties.backendAddressPools")
    private List<BackendAddressPool> backendAddressPools;

    /**
     * Gets or sets loadbalancing rules.
     */
    @JsonProperty(value = "properties.loadBalancingRules")
    private List<LoadBalancingRule> loadBalancingRules;

    /**
     * Gets or sets list of Load balancer probes.
     */
    @JsonProperty(value = "properties.probes")
    private List<Probe> probes;

    /**
     * Gets or sets list of inbound rules.
     */
    @JsonProperty(value = "properties.inboundNatRules")
    private List<InboundNatRule> inboundNatRules;

    /**
     * Gets or sets inbound NAT pools.
     */
    @JsonProperty(value = "properties.inboundNatPools")
    private List<InboundNatPool> inboundNatPools;

    /**
     * Gets or sets outbound NAT rules.
     */
    @JsonProperty(value = "properties.outboundNatRules")
    private List<OutboundNatRule> outboundNatRules;

    /**
     * Gets or sets resource guid property of the Load balancer resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    private String etag;

    /**
     * Get the frontendIPConfigurations value.
     *
     * @return the frontendIPConfigurations value
     */
    public List<FrontendIPConfiguration> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    /**
     * Set the frontendIPConfigurations value.
     *
     * @param frontendIPConfigurations the frontendIPConfigurations value to set
     */
    public void setFrontendIPConfigurations(List<FrontendIPConfiguration> frontendIPConfigurations) {
        this.frontendIPConfigurations = frontendIPConfigurations;
    }

    /**
     * Get the backendAddressPools value.
     *
     * @return the backendAddressPools value
     */
    public List<BackendAddressPool> getBackendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools value.
     *
     * @param backendAddressPools the backendAddressPools value to set
     */
    public void setBackendAddressPools(List<BackendAddressPool> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
    }

    /**
     * Get the loadBalancingRules value.
     *
     * @return the loadBalancingRules value
     */
    public List<LoadBalancingRule> getLoadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Set the loadBalancingRules value.
     *
     * @param loadBalancingRules the loadBalancingRules value to set
     */
    public void setLoadBalancingRules(List<LoadBalancingRule> loadBalancingRules) {
        this.loadBalancingRules = loadBalancingRules;
    }

    /**
     * Get the probes value.
     *
     * @return the probes value
     */
    public List<Probe> getProbes() {
        return this.probes;
    }

    /**
     * Set the probes value.
     *
     * @param probes the probes value to set
     */
    public void setProbes(List<Probe> probes) {
        this.probes = probes;
    }

    /**
     * Get the inboundNatRules value.
     *
     * @return the inboundNatRules value
     */
    public List<InboundNatRule> getInboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Set the inboundNatRules value.
     *
     * @param inboundNatRules the inboundNatRules value to set
     */
    public void setInboundNatRules(List<InboundNatRule> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
    }

    /**
     * Get the inboundNatPools value.
     *
     * @return the inboundNatPools value
     */
    public List<InboundNatPool> getInboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Set the inboundNatPools value.
     *
     * @param inboundNatPools the inboundNatPools value to set
     */
    public void setInboundNatPools(List<InboundNatPool> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
    }

    /**
     * Get the outboundNatRules value.
     *
     * @return the outboundNatRules value
     */
    public List<OutboundNatRule> getOutboundNatRules() {
        return this.outboundNatRules;
    }

    /**
     * Set the outboundNatRules value.
     *
     * @param outboundNatRules the outboundNatRules value to set
     */
    public void setOutboundNatRules(List<OutboundNatRule> outboundNatRules) {
        this.outboundNatRules = outboundNatRules;
    }

    /**
     * Get the resourceGuid value.
     *
     * @return the resourceGuid value
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid value.
     *
     * @param resourceGuid the resourceGuid value to set
     */
    public void setResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

}
