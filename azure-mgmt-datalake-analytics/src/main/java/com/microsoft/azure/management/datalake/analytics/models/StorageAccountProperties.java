/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Storage account properties information.
 */
public class StorageAccountProperties {
    /**
     * Gets or sets the access key associated with this Azure Storage account
     * that will be used to connect to it.
     */
    @JsonProperty(required = true)
    private String accessKey;

    /**
     * Gets or sets the optional suffix for the Data Lake account.
     */
    private String suffix;

    /**
     * Get the accessKey value.
     *
     * @return the accessKey value
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * Set the accessKey value.
     *
     * @param accessKey the accessKey value to set
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * Get the suffix value.
     *
     * @return the suffix value
     */
    public String getSuffix() {
        return this.suffix;
    }

    /**
     * Set the suffix value.
     *
     * @param suffix the suffix value to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

}
