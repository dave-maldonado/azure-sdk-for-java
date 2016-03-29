/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Resource filter.
 */
public class GenericResourceFilter {
    /**
     * Gets or sets the resource type.
     */
    private String resourceType;

    /**
     * Gets or sets the tag name.
     */
    private String tagname;

    /**
     * Gets or sets the tag value.
     */
    private String tagvalue;

    /**
     * Get the resourceType value.
     *
     * @return the resourceType value
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType value.
     *
     * @param resourceType the resourceType value to set
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Get the tagname value.
     *
     * @return the tagname value
     */
    public String getTagname() {
        return this.tagname;
    }

    /**
     * Set the tagname value.
     *
     * @param tagname the tagname value to set
     */
    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    /**
     * Get the tagvalue value.
     *
     * @return the tagvalue value
     */
    public String getTagvalue() {
        return this.tagvalue;
    }

    /**
     * Set the tagvalue value.
     *
     * @param tagvalue the tagvalue value to set
     */
    public void setTagvalue(String tagvalue) {
        this.tagvalue = tagvalue;
    }

}
