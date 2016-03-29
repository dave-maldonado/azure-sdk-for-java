/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The compute long running operation response.
 */
public class DeleteOperationResult {
    /**
     * Gets the operation identifier.
     */
    @JsonProperty(required = true)
    private String operationId;

    /**
     * Gets the operation status. Possible values include: 'InProgress',
     * 'Succeeded', 'Failed'.
     */
    @JsonProperty(required = true)
    private OperationStatus status;

    /**
     * Gets the operation start time.
     */
    @JsonProperty(required = true)
    private DateTime startTime;

    /**
     * Gets the operation end time.
     */
    private DateTime endTime;

    /**
     * Gets or sets the operation error if any occurred.
     */
    private ApiError error;

    /**
     * Get the operationId value.
     *
     * @return the operationId value
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId value.
     *
     * @param operationId the operationId value to set
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public OperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     */
    public void setStatus(OperationStatus status) {
        this.status = status;
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
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     */
    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ApiError getError() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     */
    public void setError(ApiError error) {
        this.error = error;
    }

}
