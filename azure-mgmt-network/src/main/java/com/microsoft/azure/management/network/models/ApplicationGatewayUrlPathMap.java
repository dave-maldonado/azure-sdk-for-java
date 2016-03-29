/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;

import com.microsoft.azure.SubResource;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * UrlPathMap of application gateway.
 */
@JsonFlatten
public class ApplicationGatewayUrlPathMap extends SubResource {
    /**
     * Gets or sets default backend address pool resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultBackendAddressPool")
    private SubResource defaultBackendAddressPool;

    /**
     * Gets or sets default backend http settings resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultBackendHttpSettings")
    private SubResource defaultBackendHttpSettings;

    /**
     * Gets or sets path rule of URL path map resource.
     */
    @JsonProperty(value = "properties.pathRules")
    private List<ApplicationGatewayPathRule> pathRules;

    /**
     * Gets or sets Provisioning state of the backend http settings resource
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
     * Get the defaultBackendAddressPool value.
     *
     * @return the defaultBackendAddressPool value
     */
    public SubResource getDefaultBackendAddressPool() {
        return this.defaultBackendAddressPool;
    }

    /**
     * Set the defaultBackendAddressPool value.
     *
     * @param defaultBackendAddressPool the defaultBackendAddressPool value to set
     */
    public void setDefaultBackendAddressPool(SubResource defaultBackendAddressPool) {
        this.defaultBackendAddressPool = defaultBackendAddressPool;
    }

    /**
     * Get the defaultBackendHttpSettings value.
     *
     * @return the defaultBackendHttpSettings value
     */
    public SubResource getDefaultBackendHttpSettings() {
        return this.defaultBackendHttpSettings;
    }

    /**
     * Set the defaultBackendHttpSettings value.
     *
     * @param defaultBackendHttpSettings the defaultBackendHttpSettings value to set
     */
    public void setDefaultBackendHttpSettings(SubResource defaultBackendHttpSettings) {
        this.defaultBackendHttpSettings = defaultBackendHttpSettings;
    }

    /**
     * Get the pathRules value.
     *
     * @return the pathRules value
     */
    public List<ApplicationGatewayPathRule> getPathRules() {
        return this.pathRules;
    }

    /**
     * Set the pathRules value.
     *
     * @param pathRules the pathRules value to set
     */
    public void setPathRules(List<ApplicationGatewayPathRule> pathRules) {
        this.pathRules = pathRules;
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
