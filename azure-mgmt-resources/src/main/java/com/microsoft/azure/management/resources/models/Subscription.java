/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Subscription information.
 */
public class Subscription {
    /**
     * Gets or sets the ID of the resource (/subscriptions/SubscriptionId).
     */
    private String id;

    /**
     * Gets or sets the subscription Id.
     */
    private String subscriptionId;

    /**
     * Gets or sets the subscription display name.
     */
    private String displayName;

    /**
     * Gets or sets the subscription state.
     */
    private String state;

    /**
     * Gets or sets the subscription policies.
     */
    private SubscriptionPolicies subscriptionPolicies;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the subscriptionId value.
     *
     * @return the subscriptionId value
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId value.
     *
     * @param subscriptionId the subscriptionId value to set
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
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
     * Get the state value.
     *
     * @return the state value
     */
    public String getState() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Get the subscriptionPolicies value.
     *
     * @return the subscriptionPolicies value
     */
    public SubscriptionPolicies getSubscriptionPolicies() {
        return this.subscriptionPolicies;
    }

    /**
     * Set the subscriptionPolicies value.
     *
     * @param subscriptionPolicies the subscriptionPolicies value to set
     */
    public void setSubscriptionPolicies(SubscriptionPolicies subscriptionPolicies) {
        this.subscriptionPolicies = subscriptionPolicies;
    }

}
