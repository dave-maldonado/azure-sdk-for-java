/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents database connection string information.
 */
public class ConnStringInfo {
    /**
     * Name of connection string.
     */
    private String name;

    /**
     * Connection string value.
     */
    private String connectionString;

    /**
     * Type of database. Possible values include: 'MySql', 'SQLServer',
     * 'SQLAzure', 'Custom'.
     */
    @JsonProperty(required = true)
    private DatabaseServerType type;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the connectionString value.
     *
     * @return the connectionString value
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString value.
     *
     * @param connectionString the connectionString value to set
     */
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public DatabaseServerType getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     */
    public void setType(DatabaseServerType type) {
        this.type = type;
    }

}
