/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;

/**
 * Describes Windows Configuration of the OS Profile.
 */
public class WindowsConfiguration {
    /**
     * Gets or sets whether VM Agent should be provisioned on the Virtual
     * Machine.
     */
    private Boolean provisionVMAgent;

    /**
     * Gets or sets whether Windows updates are automatically installed on the
     * VM.
     */
    private Boolean enableAutomaticUpdates;

    /**
     * Gets or sets the Time Zone of the VM.
     */
    private String timeZone;

    /**
     * Gets or sets the additional base-64 encoded XML formatted information
     * that can be included in the Unattend.xml file.
     */
    private List<AdditionalUnattendContent> additionalUnattendContent;

    /**
     * Gets or sets the Windows Remote Management configuration of the VM.
     */
    private WinRMConfiguration winRM;

    /**
     * Get the provisionVMAgent value.
     *
     * @return the provisionVMAgent value
     */
    public Boolean getProvisionVMAgent() {
        return this.provisionVMAgent;
    }

    /**
     * Set the provisionVMAgent value.
     *
     * @param provisionVMAgent the provisionVMAgent value to set
     */
    public void setProvisionVMAgent(Boolean provisionVMAgent) {
        this.provisionVMAgent = provisionVMAgent;
    }

    /**
     * Get the enableAutomaticUpdates value.
     *
     * @return the enableAutomaticUpdates value
     */
    public Boolean getEnableAutomaticUpdates() {
        return this.enableAutomaticUpdates;
    }

    /**
     * Set the enableAutomaticUpdates value.
     *
     * @param enableAutomaticUpdates the enableAutomaticUpdates value to set
     */
    public void setEnableAutomaticUpdates(Boolean enableAutomaticUpdates) {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
    }

    /**
     * Get the timeZone value.
     *
     * @return the timeZone value
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone value.
     *
     * @param timeZone the timeZone value to set
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * Get the additionalUnattendContent value.
     *
     * @return the additionalUnattendContent value
     */
    public List<AdditionalUnattendContent> getAdditionalUnattendContent() {
        return this.additionalUnattendContent;
    }

    /**
     * Set the additionalUnattendContent value.
     *
     * @param additionalUnattendContent the additionalUnattendContent value to set
     */
    public void setAdditionalUnattendContent(List<AdditionalUnattendContent> additionalUnattendContent) {
        this.additionalUnattendContent = additionalUnattendContent;
    }

    /**
     * Get the winRM value.
     *
     * @return the winRM value
     */
    public WinRMConfiguration getWinRM() {
        return this.winRM;
    }

    /**
     * Set the winRM value.
     *
     * @param winRM the winRM value to set
     */
    public void setWinRM(WinRMConfiguration winRM) {
        this.winRM = winRM;
    }

}
