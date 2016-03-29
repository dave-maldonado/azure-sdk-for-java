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
 * RouteTable resource.
 */
@JsonFlatten
public class RouteTable extends Resource {
    /**
     * Gets or sets Routes in a Route Table.
     */
    @JsonProperty(value = "properties.routes")
    private List<Route> routes;

    /**
     * Gets collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets")
    private List<Subnet> subnets;

    /**
     * Gets or sets Provisioning state of the resource
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
     * Get the routes value.
     *
     * @return the routes value
     */
    public List<Route> getRoutes() {
        return this.routes;
    }

    /**
     * Set the routes value.
     *
     * @param routes the routes value to set
     */
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    /**
     * Get the subnets value.
     *
     * @return the subnets value
     */
    public List<Subnet> getSubnets() {
        return this.subnets;
    }

    /**
     * Set the subnets value.
     *
     * @param subnets the subnets value to set
     */
    public void setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
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
