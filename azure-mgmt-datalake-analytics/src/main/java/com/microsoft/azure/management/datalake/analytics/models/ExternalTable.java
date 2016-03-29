/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;


/**
 * A Data Lake Analytics catalog external table item.
 */
public class ExternalTable {
    /**
     * Gets or sets the name of the table associated with this database and
     * schema.
     */
    private String tableName;

    /**
     * Gets or sets the data source associated with this external table.
     */
    private EntityId dataSource;

    /**
     * Get the tableName value.
     *
     * @return the tableName value
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName value.
     *
     * @param tableName the tableName value to set
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Get the dataSource value.
     *
     * @return the dataSource value
     */
    public EntityId getDataSource() {
        return this.dataSource;
    }

    /**
     * Set the dataSource value.
     *
     * @param dataSource the dataSource value to set
     */
    public void setDataSource(EntityId dataSource) {
        this.dataSource = dataSource;
    }

}
