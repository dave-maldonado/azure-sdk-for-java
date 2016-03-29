/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * IpConfiguration for Virtual network gateway.
 */
@JsonFlatten
public class VirtualNetworkGatewayIPConfiguration extends SubResource {
    /**
     * Gets or sets the privateIPAddress of the IP Configuration.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIPAddress;

    /**
     * Gets or sets PrivateIP allocation method (Static/Dynamic). Possible
     * values include: 'Static', 'Dynamic'.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private String privateIPAllocationMethod;

    /**
     * Gets or sets the reference of the subnet resource.
     */
    @JsonProperty(value = "properties.subnet")
    private SubResource subnet;

    /**
     * Gets or sets the reference of the PublicIP resource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private SubResource publicIPAddress;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Get the privateIPAddress value.
     *
     * @return the privateIPAddress value
     */
    public String getPrivateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * Set the privateIPAddress value.
     *
     * @param privateIPAddress the privateIPAddress value to set
     */
    public void setPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
    }

    /**
     * Get the privateIPAllocationMethod value.
     *
     * @return the privateIPAllocationMethod value
     */
    public String getPrivateIPAllocationMethod() {
        return this.privateIPAllocationMethod;
    }

    /**
     * Set the privateIPAllocationMethod value.
     *
     * @param privateIPAllocationMethod the privateIPAllocationMethod value to set
     */
    public void setPrivateIPAllocationMethod(String privateIPAllocationMethod) {
        this.privateIPAllocationMethod = privateIPAllocationMethod;
    }

    /**
     * Get the subnet value.
     *
     * @return the subnet value
     */
    public SubResource getSubnet() {
        return this.subnet;
    }

    /**
     * Set the subnet value.
     *
     * @param subnet the subnet value to set
     */
    public void setSubnet(SubResource subnet) {
        this.subnet = subnet;
    }

    /**
     * Get the publicIPAddress value.
     *
     * @return the publicIPAddress value
     */
    public SubResource getPublicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * Set the publicIPAddress value.
     *
     * @param publicIPAddress the publicIPAddress value to set
     */
    public void setPublicIPAddress(SubResource publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
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
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
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
