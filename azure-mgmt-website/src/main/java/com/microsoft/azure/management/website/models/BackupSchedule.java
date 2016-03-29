/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of a backup schedule. Describes how often should be the backup
 * performed and what should be the retention policy.
 */
public class BackupSchedule {
    /**
     * How often should be the backup executed (e.g. for weekly backup, this
     * should be set to 7 and FrequencyUnit should be set to Day).
     */
    private Integer frequencyInterval;

    /**
     * How often should be the backup executed (e.g. for weekly backup, this
     * should be set to Day and FrequencyInterval should be set to 7).
     * Possible values include: 'Day', 'Hour'.
     */
    @JsonProperty(required = true)
    private FrequencyUnit frequencyUnit;

    /**
     * True if the retention policy should always keep at least one backup in
     * the storage account, regardless how old it is; false otherwise.
     */
    private Boolean keepAtLeastOneBackup;

    /**
     * After how many days backups should be deleted.
     */
    private Integer retentionPeriodInDays;

    /**
     * When the schedule should start working.
     */
    private DateTime startTime;

    /**
     * The last time when this schedule was triggered.
     */
    private DateTime lastExecutionTime;

    /**
     * Get the frequencyInterval value.
     *
     * @return the frequencyInterval value
     */
    public Integer getFrequencyInterval() {
        return this.frequencyInterval;
    }

    /**
     * Set the frequencyInterval value.
     *
     * @param frequencyInterval the frequencyInterval value to set
     */
    public void setFrequencyInterval(Integer frequencyInterval) {
        this.frequencyInterval = frequencyInterval;
    }

    /**
     * Get the frequencyUnit value.
     *
     * @return the frequencyUnit value
     */
    public FrequencyUnit getFrequencyUnit() {
        return this.frequencyUnit;
    }

    /**
     * Set the frequencyUnit value.
     *
     * @param frequencyUnit the frequencyUnit value to set
     */
    public void setFrequencyUnit(FrequencyUnit frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
    }

    /**
     * Get the keepAtLeastOneBackup value.
     *
     * @return the keepAtLeastOneBackup value
     */
    public Boolean getKeepAtLeastOneBackup() {
        return this.keepAtLeastOneBackup;
    }

    /**
     * Set the keepAtLeastOneBackup value.
     *
     * @param keepAtLeastOneBackup the keepAtLeastOneBackup value to set
     */
    public void setKeepAtLeastOneBackup(Boolean keepAtLeastOneBackup) {
        this.keepAtLeastOneBackup = keepAtLeastOneBackup;
    }

    /**
     * Get the retentionPeriodInDays value.
     *
     * @return the retentionPeriodInDays value
     */
    public Integer getRetentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     * Set the retentionPeriodInDays value.
     *
     * @param retentionPeriodInDays the retentionPeriodInDays value to set
     */
    public void setRetentionPeriodInDays(Integer retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     */
    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Get the lastExecutionTime value.
     *
     * @return the lastExecutionTime value
     */
    public DateTime getLastExecutionTime() {
        return this.lastExecutionTime;
    }

    /**
     * Set the lastExecutionTime value.
     *
     * @param lastExecutionTime the lastExecutionTime value to set
     */
    public void setLastExecutionTime(DateTime lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }

}
