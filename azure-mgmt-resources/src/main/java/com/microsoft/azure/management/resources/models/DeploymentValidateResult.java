/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Information from validate template deployment response.
 */
public class DeploymentValidateResult {
    /**
     * Gets or sets validation error.
     */
    private ResourceManagementErrorWithDetails error;

    /**
     * Gets or sets the template deployment properties.
     */
    private DeploymentPropertiesExtended properties;

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ResourceManagementErrorWithDetails getError() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     */
    public void setError(ResourceManagementErrorWithDetails error) {
        this.error = error;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public DeploymentPropertiesExtended getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(DeploymentPropertiesExtended properties) {
        this.properties = properties;
    }

}
