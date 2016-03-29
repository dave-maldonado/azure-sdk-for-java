/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.store.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Store content summary information.
 */
public class ContentSummary {
    /**
     * Gets the number of directories.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long directoryCount;

    /**
     * Gets the number of files.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long fileCount;

    /**
     * Gets the number of bytes used by the contet.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long length;

    /**
     * Gets the disk space consumed by the content.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long spaceConsumed;

    /**
     * Get the directoryCount value.
     *
     * @return the directoryCount value
     */
    public Long getDirectoryCount() {
        return this.directoryCount;
    }

    /**
     * Get the fileCount value.
     *
     * @return the fileCount value
     */
    public Long getFileCount() {
        return this.fileCount;
    }

    /**
     * Get the length value.
     *
     * @return the length value
     */
    public Long getLength() {
        return this.length;
    }

    /**
     * Get the spaceConsumed value.
     *
     * @return the spaceConsumed value
     */
    public Long getSpaceConsumed() {
        return this.spaceConsumed;
    }

}
