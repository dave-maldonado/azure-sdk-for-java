/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;


/**
 * Contains Stats associated with the peering.
 */
public class ExpressRouteCircuitStats {
    /**
     * Gets BytesIn of the peering.
     */
    private Integer bytesIn;

    /**
     * Gets BytesOut of the peering.
     */
    private Integer bytesOut;

    /**
     * Get the bytesIn value.
     *
     * @return the bytesIn value
     */
    public Integer getBytesIn() {
        return this.bytesIn;
    }

    /**
     * Set the bytesIn value.
     *
     * @param bytesIn the bytesIn value to set
     */
    public void setBytesIn(Integer bytesIn) {
        this.bytesIn = bytesIn;
    }

    /**
     * Get the bytesOut value.
     *
     * @return the bytesOut value
     */
    public Integer getBytesOut() {
        return this.bytesOut;
    }

    /**
     * Set the bytesOut value.
     *
     * @param bytesOut the bytesOut value to set
     */
    public void setBytesOut(Integer bytesOut) {
        this.bytesOut = bytesOut;
    }

}
