/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Operation.
 */
public class ProviderOperation {
    /**
     * Gets or sets the operation name.
     */
    private String name;

    /**
     * Gets or sets the operation display name.
     */
    private String displayName;

    /**
     * Gets or sets the operation description.
     */
    private String description;

    /**
     * Gets or sets the operation origin.
     */
    private String origin;

    /**
     * Gets or sets the operation properties.
     */
    private Object properties;

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

    /**
     * Get the origin value.
     *
     * @return the origin value
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Set the origin value.
     *
     * @param origin the origin value to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public Object getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(Object properties) {
        this.properties = properties;
    }

}
