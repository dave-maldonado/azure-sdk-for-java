/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.resources.models.FeatureResult;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in FeaturesOperations.
 */
public interface FeaturesOperations {
    /**
     * Gets a list of previewed features for all the providers in the current subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;FeatureResult&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<FeatureResult>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of previewed features for all the providers in the current subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllAsync(final ListOperationCallback<FeatureResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of previewed features of a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;FeatureResult&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<FeatureResult>> list(final String resourceProviderNamespace) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of previewed features of a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceProviderNamespace, final ListOperationCallback<FeatureResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all features under the subscription.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param featureName Previewed feature name in the resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeatureResult object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeatureResult> get(String resourceProviderNamespace, String featureName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all features under the subscription.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param featureName Previewed feature name in the resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceProviderNamespace, String featureName, final ServiceCallback<FeatureResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Registers for a previewed feature of a resource provider.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param featureName Previewed feature name in the resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeatureResult object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeatureResult> register(String resourceProviderNamespace, String featureName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Registers for a previewed feature of a resource provider.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param featureName Previewed feature name in the resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall registerAsync(String resourceProviderNamespace, String featureName, final ServiceCallback<FeatureResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of previewed features for all the providers in the current subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;FeatureResult&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<FeatureResult>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of previewed features for all the providers in the current subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<FeatureResult> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of previewed features of a resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;FeatureResult&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<FeatureResult>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of previewed features of a resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<FeatureResult> serviceCallback) throws IllegalArgumentException;

}
