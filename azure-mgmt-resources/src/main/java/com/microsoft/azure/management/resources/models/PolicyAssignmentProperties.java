/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Policy Assignment properties.
 */
public class PolicyAssignmentProperties {
    /**
     * Gets or sets the policy assignment scope.
     */
    private String scope;

    /**
     * Gets or sets the policy assignment display name.
     */
    private String displayName;

    /**
     * Gets or sets the policy definition Id.
     */
    private String policyDefinitionId;

    /**
     * Get the scope value.
     *
     * @return the scope value
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * Set the scope value.
     *
     * @param scope the scope value to set
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Get the policyDefinitionId value.
     *
     * @return the policyDefinitionId value
     */
    public String getPolicyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the policyDefinitionId value.
     *
     * @param policyDefinitionId the policyDefinitionId value to set
     */
    public void setPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

}
