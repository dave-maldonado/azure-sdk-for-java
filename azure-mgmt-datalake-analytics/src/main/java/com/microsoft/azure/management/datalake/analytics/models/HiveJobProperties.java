/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The HiveJobProperties model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Hive")
public class HiveJobProperties extends JobProperties {
    /**
     * Gets or sets the statement information for each statement in the script.
     */
    private List<HiveJobStatementInfo> statementInfo;

    /**
     * Gets or sets the Hive logs location.
     */
    private String logsLocation;

    /**
     * Gets or sets the runtime version of the U-SQL engine to use.
     */
    private String warehouseLocation;

    /**
     * Gets or sets the number of statements that will be run based on the
     * script.
     */
    private Integer statementCount;

    /**
     * Gets or sets the number of statements that have been run based on the
     * script.
     */
    private Integer executedStatementCount;

    /**
     * Get the statementInfo value.
     *
     * @return the statementInfo value
     */
    public List<HiveJobStatementInfo> getStatementInfo() {
        return this.statementInfo;
    }

    /**
     * Set the statementInfo value.
     *
     * @param statementInfo the statementInfo value to set
     */
    public void setStatementInfo(List<HiveJobStatementInfo> statementInfo) {
        this.statementInfo = statementInfo;
    }

    /**
     * Get the logsLocation value.
     *
     * @return the logsLocation value
     */
    public String getLogsLocation() {
        return this.logsLocation;
    }

    /**
     * Set the logsLocation value.
     *
     * @param logsLocation the logsLocation value to set
     */
    public void setLogsLocation(String logsLocation) {
        this.logsLocation = logsLocation;
    }

    /**
     * Get the warehouseLocation value.
     *
     * @return the warehouseLocation value
     */
    public String getWarehouseLocation() {
        return this.warehouseLocation;
    }

    /**
     * Set the warehouseLocation value.
     *
     * @param warehouseLocation the warehouseLocation value to set
     */
    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    /**
     * Get the statementCount value.
     *
     * @return the statementCount value
     */
    public Integer getStatementCount() {
        return this.statementCount;
    }

    /**
     * Set the statementCount value.
     *
     * @param statementCount the statementCount value to set
     */
    public void setStatementCount(Integer statementCount) {
        this.statementCount = statementCount;
    }

    /**
     * Get the executedStatementCount value.
     *
     * @return the executedStatementCount value
     */
    public Integer getExecutedStatementCount() {
        return this.executedStatementCount;
    }

    /**
     * Set the executedStatementCount value.
     *
     * @param executedStatementCount the executedStatementCount value to set
     */
    public void setExecutedStatementCount(Integer executedStatementCount) {
        this.executedStatementCount = executedStatementCount;
    }

}
