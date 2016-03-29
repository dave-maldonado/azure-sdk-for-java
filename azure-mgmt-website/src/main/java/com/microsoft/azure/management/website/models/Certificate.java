/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * App certificate.
 */
@JsonFlatten
public class Certificate extends Resource {
    /**
     * Friendly name of the certificate.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Subject name of the certificate.
     */
    @JsonProperty(value = "properties.subjectName")
    private String subjectName;

    /**
     * Host names the certificate applies to.
     */
    @JsonProperty(value = "properties.hostNames")
    private List<String> hostNames;

    /**
     * Pfx blob.
     */
    @JsonProperty(value = "properties.pfxBlob")
    private String pfxBlob;

    /**
     * App name.
     */
    @JsonProperty(value = "properties.siteName")
    private String siteName;

    /**
     * Self link.
     */
    @JsonProperty(value = "properties.selfLink")
    private String selfLink;

    /**
     * Certificate issuer.
     */
    @JsonProperty(value = "properties.issuer")
    private String issuer;

    /**
     * Certificate issue Date.
     */
    @JsonProperty(value = "properties.issueDate")
    private DateTime issueDate;

    /**
     * Certificate expriration date.
     */
    @JsonProperty(value = "properties.expirationDate")
    private DateTime expirationDate;

    /**
     * Certificate password.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * Certificate thumbprint.
     */
    @JsonProperty(value = "properties.thumbprint")
    private String thumbprint;

    /**
     * Is the certificate valid?.
     */
    @JsonProperty(value = "properties.valid")
    private Boolean valid;

    /**
     * Raw bytes of .cer file.
     */
    @JsonProperty(value = "properties.cerBlob")
    private String cerBlob;

    /**
     * Public key hash.
     */
    @JsonProperty(value = "properties.publicKeyHash")
    private String publicKeyHash;

    /**
     * Specification for the hosting environment (App Service Environment) to
     * use for the certificate.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /**
     * Get the friendlyName value.
     *
     * @return the friendlyName value
     */
    public String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName value.
     *
     * @param friendlyName the friendlyName value to set
     */
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    /**
     * Get the subjectName value.
     *
     * @return the subjectName value
     */
    public String getSubjectName() {
        return this.subjectName;
    }

    /**
     * Set the subjectName value.
     *
     * @param subjectName the subjectName value to set
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * Get the hostNames value.
     *
     * @return the hostNames value
     */
    public List<String> getHostNames() {
        return this.hostNames;
    }

    /**
     * Set the hostNames value.
     *
     * @param hostNames the hostNames value to set
     */
    public void setHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
    }

    /**
     * Get the pfxBlob value.
     *
     * @return the pfxBlob value
     */
    public String getPfxBlob() {
        return this.pfxBlob;
    }

    /**
     * Set the pfxBlob value.
     *
     * @param pfxBlob the pfxBlob value to set
     */
    public void setPfxBlob(String pfxBlob) {
        this.pfxBlob = pfxBlob;
    }

    /**
     * Get the siteName value.
     *
     * @return the siteName value
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * Set the siteName value.
     *
     * @param siteName the siteName value to set
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * Get the selfLink value.
     *
     * @return the selfLink value
     */
    public String getSelfLink() {
        return this.selfLink;
    }

    /**
     * Set the selfLink value.
     *
     * @param selfLink the selfLink value to set
     */
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    /**
     * Get the issuer value.
     *
     * @return the issuer value
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * Set the issuer value.
     *
     * @param issuer the issuer value to set
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * Get the issueDate value.
     *
     * @return the issueDate value
     */
    public DateTime getIssueDate() {
        return this.issueDate;
    }

    /**
     * Set the issueDate value.
     *
     * @param issueDate the issueDate value to set
     */
    public void setIssueDate(DateTime issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Get the expirationDate value.
     *
     * @return the expirationDate value
     */
    public DateTime getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expirationDate value.
     *
     * @param expirationDate the expirationDate value to set
     */
    public void setExpirationDate(DateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the thumbprint value.
     *
     * @return the thumbprint value
     */
    public String getThumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint value.
     *
     * @param thumbprint the thumbprint value to set
     */
    public void setThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
    }

    /**
     * Get the valid value.
     *
     * @return the valid value
     */
    public Boolean getValid() {
        return this.valid;
    }

    /**
     * Set the valid value.
     *
     * @param valid the valid value to set
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * Get the cerBlob value.
     *
     * @return the cerBlob value
     */
    public String getCerBlob() {
        return this.cerBlob;
    }

    /**
     * Set the cerBlob value.
     *
     * @param cerBlob the cerBlob value to set
     */
    public void setCerBlob(String cerBlob) {
        this.cerBlob = cerBlob;
    }

    /**
     * Get the publicKeyHash value.
     *
     * @return the publicKeyHash value
     */
    public String getPublicKeyHash() {
        return this.publicKeyHash;
    }

    /**
     * Set the publicKeyHash value.
     *
     * @param publicKeyHash the publicKeyHash value to set
     */
    public void setPublicKeyHash(String publicKeyHash) {
        this.publicKeyHash = publicKeyHash;
    }

    /**
     * Get the hostingEnvironmentProfile value.
     *
     * @return the hostingEnvironmentProfile value
     */
    public HostingEnvironmentProfile getHostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set the hostingEnvironmentProfile value.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set
     */
    public void setHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
    }

}
