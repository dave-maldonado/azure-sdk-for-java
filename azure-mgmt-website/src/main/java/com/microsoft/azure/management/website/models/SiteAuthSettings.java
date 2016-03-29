/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import java.util.List;

/**
 * Configuration settings for the Azure App Service Authentication /
 * Authorization feature.
 */
public class SiteAuthSettings {
    /**
     * Gets or sets a value indicating whether the Authentication /
     * Authorization feature is enabled for the current app.
     */
    private Boolean enabled;

    /**
     * Gets or sets the relative path prefix used by platform HTTP APIs.
     * Changing this value is not recommended except for
     * compatibility reasons.
     */
    private String httpApiPrefixPath;

    /**
     * Gets or sets the action to take when an unauthenticated client attempts
     * to access the app. Possible values include: 'RedirectToLoginPage',
     * 'AllowAnonymous'.
     */
    private UnauthenticatedClientAction unauthenticatedClientAction;

    /**
     * Gets or sets a value indicating whether to durably store
     * platform-specific security tokens
     * obtained during login flows. This capability is disabled by
     * default.
     */
    private Boolean tokenStoreEnabled;

    /**
     * Gets or sets a collection of external URLs that can be redirected to as
     * part of logging in
     * or logging out of the web app. Note that the query string
     * part of the URL is ignored.
     * This is an advanced setting typically only needed by
     * Windows Store application backends.
     * Note that URLs within the current domain are always
     * implicitly allowed.
     */
    private List<String> allowedExternalRedirectUrls;

    /**
     * Gets or sets the default authentication provider to use when multiple
     * providers are configured.
     * This setting is only needed if multiple providers are
     * configured and the unauthenticated client
     * action is set to "RedirectToLoginPage". Possible values
     * include: 'AzureActiveDirectory', 'Facebook', 'Google',
     * 'MicrosoftAccount', 'Twitter'.
     */
    private BuiltInAuthenticationProvider defaultProvider;

    /**
     * Gets or sets the Client ID of this relying party application, known as
     * the client_id.
     * This setting is required for enabling OpenID Connection
     * authentication with Azure Active Directory or
     * other 3rd party OpenID Connect providers.
     * More information on OpenID Connect:
     * http://openid.net/specs/openid-connect-core-1_0.html.
     */
    private String clientId;

    /**
     * Gets or sets the Client Secret of this relying party application (in
     * Azure Active Directory, this is also referred to as the Key).
     * This setting is optional. If no client secret is
     * configured, the OpenID Connect implicit auth flow is used to
     * authenticate end users.
     * Otherwise, the OpenID Connect Authorization Code Flow is
     * used to authenticate end users.
     * More information on OpenID Connect:
     * http://openid.net/specs/openid-connect-core-1_0.html.
     */
    private String clientSecret;

    /**
     * Gets or sets the OpenID Connect Issuer URI that represents the entity
     * which issues access tokens for this application.
     * When using Azure Active Directory, this value is the URI of
     * the directory tenant, e.g. https://sts.windows.net/{tenant-guid}/.
     * This URI is a case-sensitive identifier for the token
     * issuer.
     * More information on OpenID Connect Discovery:
     * http://openid.net/specs/openid-connect-discovery-1_0.html.
     */
    private String issuer;

    /**
     * Gets or sets a list of allowed audience values to consider when
     * validating JWTs issued by
     * Azure Active Directory. Note that the
     * {Microsoft.Web.Hosting.Administration.SiteAuthSettings.ClientId} value
     * is always considered an
     * allowed audience, regardless of this setting.
     */
    private List<String> allowedAudiences;

    /**
     * Gets or sets a list of login parameters to send to the OpenID Connect
     * authorization endpoint when
     * a user logs in. Each parameter must be in the form
     * "key=value".
     */
    private List<String> additionalLoginParams;

    /**
     * The aadClientId property.
     */
    private String aadClientId;

    /**
     * The openIdIssuer property.
     */
    private String openIdIssuer;

    /**
     * Gets or sets the OpenID Connect Client ID for the Google web
     * application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation:
     * https://developers.google.com/identity/sign-in/web/.
     */
    private String googleClientId;

    /**
     * Gets or sets the client secret associated with the Google web
     * application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation:
     * https://developers.google.com/identity/sign-in/web/.
     */
    private String googleClientSecret;

    /**
     * Gets or sets the OAuth 2.0 scopes that will be requested as part of
     * Google Sign-In authentication.
     * This setting is optional. If not specified, "openid",
     * "profile", and "email" are used as default scopes.
     * Google Sign-In documentation:
     * https://developers.google.com/identity/sign-in/web/.
     */
    private List<String> googleOAuthScopes;

    /**
     * Gets or sets the App ID of the Facebook app used for login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation:
     * https://developers.facebook.com/docs/facebook-login.
     */
    private String facebookAppId;

    /**
     * Gets or sets the App Secret of the Facebook app used for Facebook
     * Login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation:
     * https://developers.facebook.com/docs/facebook-login.
     */
    private String facebookAppSecret;

    /**
     * Gets or sets the OAuth 2.0 scopes that will be requested as part of
     * Facebook Login authentication.
     * This setting is optional.
     * Facebook Login documentation:
     * https://developers.facebook.com/docs/facebook-login.
     */
    private List<String> facebookOAuthScopes;

    /**
     * Gets or sets the OAuth 1.0a consumer key of the Twitter application
     * used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation:
     * https://dev.twitter.com/web/sign-in.
     */
    private String twitterConsumerKey;

    /**
     * Gets or sets the OAuth 1.0a consumer secret of the Twitter application
     * used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation:
     * https://dev.twitter.com/web/sign-in.
     */
    private String twitterConsumerSecret;

    /**
     * Gets or sets the OAuth 2.0 client ID that was created for the app used
     * for authentication.
     * This setting is required for enabling Microsoft Account
     * authentication.
     * Microsoft Account OAuth documentation:
     * https://dev.onedrive.com/auth/msa_oauth.htm.
     */
    private String microsoftAccountClientId;

    /**
     * Gets or sets the OAuth 2.0 client secret that was created for the app
     * used for authentication.
     * This setting is required for enabling Microsoft Account
     * authentication.
     * Microsoft Account OAuth documentation:
     * https://dev.onedrive.com/auth/msa_oauth.htm.
     */
    private String microsoftAccountClientSecret;

    /**
     * Gets or sets the OAuth 2.0 scopes that will be requested as part of
     * Microsoft Account authentication.
     * This setting is optional. If not specified, "wl.basic" is
     * used as the default scope.
     * Microsoft Account Scopes and permissions documentation:
     * https://msdn.microsoft.com/en-us/library/dn631845.aspx.
     */
    private List<String> microsoftAccountOAuthScopes;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get the httpApiPrefixPath value.
     *
     * @return the httpApiPrefixPath value
     */
    public String getHttpApiPrefixPath() {
        return this.httpApiPrefixPath;
    }

    /**
     * Set the httpApiPrefixPath value.
     *
     * @param httpApiPrefixPath the httpApiPrefixPath value to set
     */
    public void setHttpApiPrefixPath(String httpApiPrefixPath) {
        this.httpApiPrefixPath = httpApiPrefixPath;
    }

    /**
     * Get the unauthenticatedClientAction value.
     *
     * @return the unauthenticatedClientAction value
     */
    public UnauthenticatedClientAction getUnauthenticatedClientAction() {
        return this.unauthenticatedClientAction;
    }

    /**
     * Set the unauthenticatedClientAction value.
     *
     * @param unauthenticatedClientAction the unauthenticatedClientAction value to set
     */
    public void setUnauthenticatedClientAction(UnauthenticatedClientAction unauthenticatedClientAction) {
        this.unauthenticatedClientAction = unauthenticatedClientAction;
    }

    /**
     * Get the tokenStoreEnabled value.
     *
     * @return the tokenStoreEnabled value
     */
    public Boolean getTokenStoreEnabled() {
        return this.tokenStoreEnabled;
    }

    /**
     * Set the tokenStoreEnabled value.
     *
     * @param tokenStoreEnabled the tokenStoreEnabled value to set
     */
    public void setTokenStoreEnabled(Boolean tokenStoreEnabled) {
        this.tokenStoreEnabled = tokenStoreEnabled;
    }

    /**
     * Get the allowedExternalRedirectUrls value.
     *
     * @return the allowedExternalRedirectUrls value
     */
    public List<String> getAllowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls;
    }

    /**
     * Set the allowedExternalRedirectUrls value.
     *
     * @param allowedExternalRedirectUrls the allowedExternalRedirectUrls value to set
     */
    public void setAllowedExternalRedirectUrls(List<String> allowedExternalRedirectUrls) {
        this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
    }

    /**
     * Get the defaultProvider value.
     *
     * @return the defaultProvider value
     */
    public BuiltInAuthenticationProvider getDefaultProvider() {
        return this.defaultProvider;
    }

    /**
     * Set the defaultProvider value.
     *
     * @param defaultProvider the defaultProvider value to set
     */
    public void setDefaultProvider(BuiltInAuthenticationProvider defaultProvider) {
        this.defaultProvider = defaultProvider;
    }

    /**
     * Get the clientId value.
     *
     * @return the clientId value
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId value.
     *
     * @param clientId the clientId value to set
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Get the clientSecret value.
     *
     * @return the clientSecret value
     */
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret value.
     *
     * @param clientSecret the clientSecret value to set
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
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
     * Get the allowedAudiences value.
     *
     * @return the allowedAudiences value
     */
    public List<String> getAllowedAudiences() {
        return this.allowedAudiences;
    }

    /**
     * Set the allowedAudiences value.
     *
     * @param allowedAudiences the allowedAudiences value to set
     */
    public void setAllowedAudiences(List<String> allowedAudiences) {
        this.allowedAudiences = allowedAudiences;
    }

    /**
     * Get the additionalLoginParams value.
     *
     * @return the additionalLoginParams value
     */
    public List<String> getAdditionalLoginParams() {
        return this.additionalLoginParams;
    }

    /**
     * Set the additionalLoginParams value.
     *
     * @param additionalLoginParams the additionalLoginParams value to set
     */
    public void setAdditionalLoginParams(List<String> additionalLoginParams) {
        this.additionalLoginParams = additionalLoginParams;
    }

    /**
     * Get the aadClientId value.
     *
     * @return the aadClientId value
     */
    public String getAadClientId() {
        return this.aadClientId;
    }

    /**
     * Set the aadClientId value.
     *
     * @param aadClientId the aadClientId value to set
     */
    public void setAadClientId(String aadClientId) {
        this.aadClientId = aadClientId;
    }

    /**
     * Get the openIdIssuer value.
     *
     * @return the openIdIssuer value
     */
    public String getOpenIdIssuer() {
        return this.openIdIssuer;
    }

    /**
     * Set the openIdIssuer value.
     *
     * @param openIdIssuer the openIdIssuer value to set
     */
    public void setOpenIdIssuer(String openIdIssuer) {
        this.openIdIssuer = openIdIssuer;
    }

    /**
     * Get the googleClientId value.
     *
     * @return the googleClientId value
     */
    public String getGoogleClientId() {
        return this.googleClientId;
    }

    /**
     * Set the googleClientId value.
     *
     * @param googleClientId the googleClientId value to set
     */
    public void setGoogleClientId(String googleClientId) {
        this.googleClientId = googleClientId;
    }

    /**
     * Get the googleClientSecret value.
     *
     * @return the googleClientSecret value
     */
    public String getGoogleClientSecret() {
        return this.googleClientSecret;
    }

    /**
     * Set the googleClientSecret value.
     *
     * @param googleClientSecret the googleClientSecret value to set
     */
    public void setGoogleClientSecret(String googleClientSecret) {
        this.googleClientSecret = googleClientSecret;
    }

    /**
     * Get the googleOAuthScopes value.
     *
     * @return the googleOAuthScopes value
     */
    public List<String> getGoogleOAuthScopes() {
        return this.googleOAuthScopes;
    }

    /**
     * Set the googleOAuthScopes value.
     *
     * @param googleOAuthScopes the googleOAuthScopes value to set
     */
    public void setGoogleOAuthScopes(List<String> googleOAuthScopes) {
        this.googleOAuthScopes = googleOAuthScopes;
    }

    /**
     * Get the facebookAppId value.
     *
     * @return the facebookAppId value
     */
    public String getFacebookAppId() {
        return this.facebookAppId;
    }

    /**
     * Set the facebookAppId value.
     *
     * @param facebookAppId the facebookAppId value to set
     */
    public void setFacebookAppId(String facebookAppId) {
        this.facebookAppId = facebookAppId;
    }

    /**
     * Get the facebookAppSecret value.
     *
     * @return the facebookAppSecret value
     */
    public String getFacebookAppSecret() {
        return this.facebookAppSecret;
    }

    /**
     * Set the facebookAppSecret value.
     *
     * @param facebookAppSecret the facebookAppSecret value to set
     */
    public void setFacebookAppSecret(String facebookAppSecret) {
        this.facebookAppSecret = facebookAppSecret;
    }

    /**
     * Get the facebookOAuthScopes value.
     *
     * @return the facebookOAuthScopes value
     */
    public List<String> getFacebookOAuthScopes() {
        return this.facebookOAuthScopes;
    }

    /**
     * Set the facebookOAuthScopes value.
     *
     * @param facebookOAuthScopes the facebookOAuthScopes value to set
     */
    public void setFacebookOAuthScopes(List<String> facebookOAuthScopes) {
        this.facebookOAuthScopes = facebookOAuthScopes;
    }

    /**
     * Get the twitterConsumerKey value.
     *
     * @return the twitterConsumerKey value
     */
    public String getTwitterConsumerKey() {
        return this.twitterConsumerKey;
    }

    /**
     * Set the twitterConsumerKey value.
     *
     * @param twitterConsumerKey the twitterConsumerKey value to set
     */
    public void setTwitterConsumerKey(String twitterConsumerKey) {
        this.twitterConsumerKey = twitterConsumerKey;
    }

    /**
     * Get the twitterConsumerSecret value.
     *
     * @return the twitterConsumerSecret value
     */
    public String getTwitterConsumerSecret() {
        return this.twitterConsumerSecret;
    }

    /**
     * Set the twitterConsumerSecret value.
     *
     * @param twitterConsumerSecret the twitterConsumerSecret value to set
     */
    public void setTwitterConsumerSecret(String twitterConsumerSecret) {
        this.twitterConsumerSecret = twitterConsumerSecret;
    }

    /**
     * Get the microsoftAccountClientId value.
     *
     * @return the microsoftAccountClientId value
     */
    public String getMicrosoftAccountClientId() {
        return this.microsoftAccountClientId;
    }

    /**
     * Set the microsoftAccountClientId value.
     *
     * @param microsoftAccountClientId the microsoftAccountClientId value to set
     */
    public void setMicrosoftAccountClientId(String microsoftAccountClientId) {
        this.microsoftAccountClientId = microsoftAccountClientId;
    }

    /**
     * Get the microsoftAccountClientSecret value.
     *
     * @return the microsoftAccountClientSecret value
     */
    public String getMicrosoftAccountClientSecret() {
        return this.microsoftAccountClientSecret;
    }

    /**
     * Set the microsoftAccountClientSecret value.
     *
     * @param microsoftAccountClientSecret the microsoftAccountClientSecret value to set
     */
    public void setMicrosoftAccountClientSecret(String microsoftAccountClientSecret) {
        this.microsoftAccountClientSecret = microsoftAccountClientSecret;
    }

    /**
     * Get the microsoftAccountOAuthScopes value.
     *
     * @return the microsoftAccountOAuthScopes value
     */
    public List<String> getMicrosoftAccountOAuthScopes() {
        return this.microsoftAccountOAuthScopes;
    }

    /**
     * Set the microsoftAccountOAuthScopes value.
     *
     * @param microsoftAccountOAuthScopes the microsoftAccountOAuthScopes value to set
     */
    public void setMicrosoftAccountOAuthScopes(List<String> microsoftAccountOAuthScopes) {
        this.microsoftAccountOAuthScopes = microsoftAccountOAuthScopes;
    }

}
