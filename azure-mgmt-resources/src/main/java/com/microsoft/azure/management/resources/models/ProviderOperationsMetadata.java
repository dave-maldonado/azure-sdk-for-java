/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;

import java.util.List;

/**
 * Provider Operations metadata.
 */
public class ProviderOperationsMetadata {
    /**
     * Gets or sets the provider id.
     */
    private String id;

    /**
     * Gets or sets the provider name.
     */
    private String name;

    /**
     * Gets or sets the provider type.
     */
    private String type;

    /**
     * Gets or sets the provider display name.
     */
    private String displayName;

    /**
     * Gets or sets the provider resource types.
     */
    private List<ResourceType> resourceTypes;

    /**
     * Gets or sets the provider operations.
     */
    private List<ProviderOperation> operations;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
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
     * Get the type value.
     *
     * @return the type value
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Get the resourceTypes value.
     *
     * @return the resourceTypes value
     */
    public List<ResourceType> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Set the resourceTypes value.
     *
     * @param resourceTypes the resourceTypes value to set
     */
    public void setResourceTypes(List<ResourceType> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    /**
     * Get the operations value.
     *
     * @return the operations value
     */
    public List<ProviderOperation> getOperations() {
        return this.operations;
    }

    /**
     * Set the operations value.
     *
     * @param operations the operations value to set
     */
    public void setOperations(List<ProviderOperation> operations) {
        this.operations = operations;
    }

}
