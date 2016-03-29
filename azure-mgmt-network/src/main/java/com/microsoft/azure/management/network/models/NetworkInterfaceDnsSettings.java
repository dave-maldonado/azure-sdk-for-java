/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;

import java.util.List;

/**
 * Dns Settings of a network interface.
 */
public class NetworkInterfaceDnsSettings {
    /**
     * Gets or sets list of DNS servers IP addresses.
     */
    private List<String> dnsServers;

    /**
     * Gets or sets list of Applied DNS servers IP addresses.
     */
    private List<String> appliedDnsServers;

    /**
     * Gets or sets the Internal DNS name.
     */
    private String internalDnsNameLabel;

    /**
     * Gets or sets full IDNS name in the form,
     * DnsName.VnetId.ZoneId.TopleveSuffix. This is set when the NIC is
     * associated to a VM.
     */
    private String internalFqdn;

    /**
     * Get the dnsServers value.
     *
     * @return the dnsServers value
     */
    public List<String> getDnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers value.
     *
     * @param dnsServers the dnsServers value to set
     */
    public void setDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
    }

    /**
     * Get the appliedDnsServers value.
     *
     * @return the appliedDnsServers value
     */
    public List<String> getAppliedDnsServers() {
        return this.appliedDnsServers;
    }

    /**
     * Set the appliedDnsServers value.
     *
     * @param appliedDnsServers the appliedDnsServers value to set
     */
    public void setAppliedDnsServers(List<String> appliedDnsServers) {
        this.appliedDnsServers = appliedDnsServers;
    }

    /**
     * Get the internalDnsNameLabel value.
     *
     * @return the internalDnsNameLabel value
     */
    public String getInternalDnsNameLabel() {
        return this.internalDnsNameLabel;
    }

    /**
     * Set the internalDnsNameLabel value.
     *
     * @param internalDnsNameLabel the internalDnsNameLabel value to set
     */
    public void setInternalDnsNameLabel(String internalDnsNameLabel) {
        this.internalDnsNameLabel = internalDnsNameLabel;
    }

    /**
     * Get the internalFqdn value.
     *
     * @return the internalFqdn value
     */
    public String getInternalFqdn() {
        return this.internalFqdn;
    }

    /**
     * Set the internalFqdn value.
     *
     * @param internalFqdn the internalFqdn value to set
     */
    public void setInternalFqdn(String internalFqdn) {
        this.internalFqdn = internalFqdn;
    }

}
