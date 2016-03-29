/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Resource provider operation's display properties.
 */
public class ResourceProviderOperationDisplayProperties {
    /**
     * Gets or sets operation description.
     */
    private String publisher;

    /**
     * Gets or sets operation provider.
     */
    private String provider;

    /**
     * Gets or sets operation resource.
     */
    private String resource;

    /**
     * Gets or sets operation.
     */
    private String operation;

    /**
     * Gets or sets operation description.
     */
    private String description;

    /**
     * Get the publisher value.
     *
     * @return the publisher value
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Set the publisher value.
     *
     * @param publisher the publisher value to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Get the provider value.
     *
     * @return the provider value
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * Set the provider value.
     *
     * @param provider the provider value to set
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * Set the resource value.
     *
     * @param resource the resource value to set
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * Get the operation value.
     *
     * @return the operation value
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * Set the operation value.
     *
     * @param operation the operation value to set
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
