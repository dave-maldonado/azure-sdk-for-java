/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;


/**
 * Class that represents a VIP mapping.
 */
public class VirtualIPMapping {
    /**
     * Virtual IP address.
     */
    private String virtualIP;

    /**
     * Internal HTTP port.
     */
    private Integer internalHttpPort;

    /**
     * Internal HTTPS port.
     */
    private Integer internalHttpsPort;

    /**
     * Is VIP mapping in use.
     */
    private Boolean inUse;

    /**
     * Get the virtualIP value.
     *
     * @return the virtualIP value
     */
    public String getVirtualIP() {
        return this.virtualIP;
    }

    /**
     * Set the virtualIP value.
     *
     * @param virtualIP the virtualIP value to set
     */
    public void setVirtualIP(String virtualIP) {
        this.virtualIP = virtualIP;
    }

    /**
     * Get the internalHttpPort value.
     *
     * @return the internalHttpPort value
     */
    public Integer getInternalHttpPort() {
        return this.internalHttpPort;
    }

    /**
     * Set the internalHttpPort value.
     *
     * @param internalHttpPort the internalHttpPort value to set
     */
    public void setInternalHttpPort(Integer internalHttpPort) {
        this.internalHttpPort = internalHttpPort;
    }

    /**
     * Get the internalHttpsPort value.
     *
     * @return the internalHttpsPort value
     */
    public Integer getInternalHttpsPort() {
        return this.internalHttpsPort;
    }

    /**
     * Set the internalHttpsPort value.
     *
     * @param internalHttpsPort the internalHttpsPort value to set
     */
    public void setInternalHttpsPort(Integer internalHttpsPort) {
        this.internalHttpsPort = internalHttpsPort;
    }

    /**
     * Get the inUse value.
     *
     * @return the inUse value
     */
    public Boolean getInUse() {
        return this.inUse;
    }

    /**
     * Set the inUse value.
     *
     * @param inUse the inUse value to set
     */
    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }

}
