/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;


/**
 * Represents a legal agreement for top level domain.
 */
public class TldLegalAgreement {
    /**
     * Unique identifier for the agreement.
     */
    private String agreementKey;

    /**
     * Agreement title.
     */
    private String title;

    /**
     * Agreement details.
     */
    private String content;

    /**
     * Url where a copy of the agreement details is hosted.
     */
    private String url;

    /**
     * Get the agreementKey value.
     *
     * @return the agreementKey value
     */
    public String getAgreementKey() {
        return this.agreementKey;
    }

    /**
     * Set the agreementKey value.
     *
     * @param agreementKey the agreementKey value to set
     */
    public void setAgreementKey(String agreementKey) {
        this.agreementKey = agreementKey;
    }

    /**
     * Get the title value.
     *
     * @return the title value
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title value.
     *
     * @param title the title value to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the content value.
     *
     * @return the content value
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content value.
     *
     * @param content the content value to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
