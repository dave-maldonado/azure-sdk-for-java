/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;

import java.util.List;

/**
 * Parameters of move resources.
 */
public class ResourcesMoveInfo {
    /**
     * Gets or sets the ids of the resources.
     */
    private List<String> resources;

    /**
     * The target resource group.
     */
    private String targetResourceGroup;

    /**
     * Get the resources value.
     *
     * @return the resources value
     */
    public List<String> getResources() {
        return this.resources;
    }

    /**
     * Set the resources value.
     *
     * @param resources the resources value to set
     */
    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    /**
     * Get the targetResourceGroup value.
     *
     * @return the targetResourceGroup value
     */
    public String getTargetResourceGroup() {
        return this.targetResourceGroup;
    }

    /**
     * Set the targetResourceGroup value.
     *
     * @param targetResourceGroup the targetResourceGroup value to set
     */
    public void setTargetResourceGroup(String targetResourceGroup) {
        this.targetResourceGroup = targetResourceGroup;
    }

}
