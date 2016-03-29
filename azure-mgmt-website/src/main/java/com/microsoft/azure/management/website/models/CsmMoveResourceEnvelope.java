/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import java.util.List;

/**
 * Class containing a list of the resources that need to be moved and the
 * resource group they should be moved to.
 */
public class CsmMoveResourceEnvelope {
    /**
     * The targetResourceGroup property.
     */
    private String targetResourceGroup;

    /**
     * The resources property.
     */
    private List<String> resources;

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

}
