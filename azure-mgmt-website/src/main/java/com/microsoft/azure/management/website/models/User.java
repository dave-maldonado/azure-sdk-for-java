/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Represents user crendentials used for publishing activity.
 */
@JsonFlatten
public class User extends Resource {
    /**
     * Username (internal).
     */
    @JsonProperty(value = "properties.name")
    private String userName;

    /**
     * Username used for publishing.
     */
    @JsonProperty(value = "properties.publishingUserName")
    private String publishingUserName;

    /**
     * Password used for publishing.
     */
    @JsonProperty(value = "properties.publishingPassword")
    private String publishingPassword;

    /**
     * Get the userName value.
     *
     * @return the userName value
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Set the userName value.
     *
     * @param userName the userName value to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Get the publishingUserName value.
     *
     * @return the publishingUserName value
     */
    public String getPublishingUserName() {
        return this.publishingUserName;
    }

    /**
     * Set the publishingUserName value.
     *
     * @param publishingUserName the publishingUserName value to set
     */
    public void setPublishingUserName(String publishingUserName) {
        this.publishingUserName = publishingUserName;
    }

    /**
     * Get the publishingPassword value.
     *
     * @return the publishingPassword value
     */
    public String getPublishingPassword() {
        return this.publishingPassword;
    }

    /**
     * Set the publishingPassword value.
     *
     * @param publishingPassword the publishingPassword value to set
     */
    public void setPublishingPassword(String publishingPassword) {
        this.publishingPassword = publishingPassword;
    }

}
