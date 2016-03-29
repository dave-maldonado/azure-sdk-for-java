/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Resource provider operation information.
 */
public class ResourceProviderOperationDefinition {
    /**
     * Gets or sets the provider operation name.
     */
    private String name;

    /**
     * Gets or sets the display property of the provider operation.
     */
    private ResourceProviderOperationDisplayProperties display;

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
     * Get the display value.
     *
     * @return the display value
     */
    public ResourceProviderOperationDisplayProperties getDisplay() {
        return this.display;
    }

    /**
     * Set the display value.
     *
     * @param display the display value to set
     */
    public void setDisplay(ResourceProviderOperationDisplayProperties display) {
        this.display = display;
    }

}
