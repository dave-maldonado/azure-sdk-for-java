/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;


/**
 * Http logs to file system configuration.
 */
public class FileSystemHttpLogsConfig {
    /**
     * Maximum size in megabytes that http log files can use.
     * When reached old log files will be removed to make space
     * for new ones.
     * Value can range between 25 and 100.
     */
    private Integer retentionInMb;

    /**
     * Retention in days.
     * Remove files older than X days.
     * 0 or lower means no retention.
     */
    private Integer retentionInDays;

    /**
     * Enabled.
     */
    private Boolean enabled;

    /**
     * Get the retentionInMb value.
     *
     * @return the retentionInMb value
     */
    public Integer getRetentionInMb() {
        return this.retentionInMb;
    }

    /**
     * Set the retentionInMb value.
     *
     * @param retentionInMb the retentionInMb value to set
     */
    public void setRetentionInMb(Integer retentionInMb) {
        this.retentionInMb = retentionInMb;
    }

    /**
     * Get the retentionInDays value.
     *
     * @return the retentionInDays value
     */
    public Integer getRetentionInDays() {
        return this.retentionInDays;
    }

    /**
     * Set the retentionInDays value.
     *
     * @param retentionInDays the retentionInDays value to set
     */
    public void setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}
