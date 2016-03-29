/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.UUID;

/**
 * A Data Lake Analytics catalog entity identifier object.
 */
public class EntityId {
    /**
     * Gets or sets the name of the external table associated with this
     * database, schema and table.
     */
    private DdlName name;

    /**
     * Gets or sets the version of the external data source.
     */
    private UUID version;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public DdlName getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(DdlName name) {
        this.name = name;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public UUID getVersion() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     */
    public void setVersion(UUID version) {
        this.version = version;
    }

}
