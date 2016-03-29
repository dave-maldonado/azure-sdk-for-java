/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.Provider;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in ProvidersOperations.
 */
public interface ProvidersOperations {
    /**
     * Unregisters provider from a subscription.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Provider object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Provider> unregister(String resourceProviderNamespace) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Unregisters provider from a subscription.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall unregisterAsync(String resourceProviderNamespace, final ServiceCallback<Provider> serviceCallback) throws IllegalArgumentException;

    /**
     * Registers provider to be used with a subscription.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Provider object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Provider> register(String resourceProviderNamespace) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Registers provider to be used with a subscription.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall registerAsync(String resourceProviderNamespace, final ServiceCallback<Provider> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of resource providers.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Provider&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Provider>> list() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of resource providers.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final ListOperationCallback<Provider> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets a list of resource providers.
     *
     * @param top Query parameters. If null is passed returns all deployments.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Provider&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Provider>> list(final Integer top) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of resource providers.
     *
     * @param top Query parameters. If null is passed returns all deployments.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final Integer top, final ListOperationCallback<Provider> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a resource provider.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Provider object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Provider> get(String resourceProviderNamespace) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a resource provider.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceProviderNamespace, final ServiceCallback<Provider> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of resource providers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Provider&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<Provider>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of resource providers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<Provider> serviceCallback) throws IllegalArgumentException;

}
