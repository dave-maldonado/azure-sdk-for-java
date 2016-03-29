/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;

import java.util.List;

/**
 * Tag details.
 */
public class TagDetails {
    /**
     * Gets or sets the tag ID.
     */
    private String id;

    /**
     * Gets or sets the tag name.
     */
    private String tagName;

    /**
     * Gets or sets the tag count.
     */
    private TagCount count;

    /**
     * Gets or sets the list of tag values.
     */
    private List<TagValue> values;

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
     * Get the tagName value.
     *
     * @return the tagName value
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * Set the tagName value.
     *
     * @param tagName the tagName value to set
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public TagCount getCount() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     */
    public void setCount(TagCount count) {
        this.count = count;
    }

    /**
     * Get the values value.
     *
     * @return the values value
     */
    public List<TagValue> getValues() {
        return this.values;
    }

    /**
     * Set the values value.
     *
     * @param values the values value to set
     */
    public void setValues(List<TagValue> values) {
        this.values = values;
    }

}
