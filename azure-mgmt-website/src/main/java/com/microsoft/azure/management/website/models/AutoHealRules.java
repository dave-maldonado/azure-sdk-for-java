/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;


/**
 * AutoHealRules - describes the rules which can be defined for auto-heal.
 */
public class AutoHealRules {
    /**
     * Triggers - Conditions that describe when to execute the auto-heal
     * actions.
     */
    private AutoHealTriggers triggers;

    /**
     * Actions - Actions to be executed when a rule is triggered.
     */
    private AutoHealActions actions;

    /**
     * Get the triggers value.
     *
     * @return the triggers value
     */
    public AutoHealTriggers getTriggers() {
        return this.triggers;
    }

    /**
     * Set the triggers value.
     *
     * @param triggers the triggers value to set
     */
    public void setTriggers(AutoHealTriggers triggers) {
        this.triggers = triggers;
    }

    /**
     * Get the actions value.
     *
     * @return the actions value
     */
    public AutoHealActions getActions() {
        return this.actions;
    }

    /**
     * Set the actions value.
     *
     * @param actions the actions value to set
     */
    public void setActions(AutoHealActions actions) {
        this.actions = actions;
    }

}
