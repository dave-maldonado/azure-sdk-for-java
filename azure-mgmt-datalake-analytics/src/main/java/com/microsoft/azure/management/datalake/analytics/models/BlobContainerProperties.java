/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Storage blob container properties information.
 */
public class BlobContainerProperties {
    /**
     * Gets or sets the last modified time of the blob container.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * Get the lastModifiedTime value.
     *
     * @return the lastModifiedTime value
     */
    public DateTime getLastModifiedTime() {
        return this.lastModifiedTime;
    }

}
