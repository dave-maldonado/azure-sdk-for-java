/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.ResourceProviderOperationDefinition;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in ResourceProviderOperationDetailsOperations.
 */
public interface ResourceProviderOperationDetailsOperations {
    /**
     * Gets a list of resource providers.
     *
     * @param resourceProviderNamespace Resource identity.
     * @param apiVersion the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ResourceProviderOperationDefinition&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<ResourceProviderOperationDefinition>> list(final String resourceProviderNamespace, final String apiVersion) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of resource providers.
     *
     * @param resourceProviderNamespace Resource identity.
     * @param apiVersion the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceProviderNamespace, final String apiVersion, final ListOperationCallback<ResourceProviderOperationDefinition> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of resource providers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ResourceProviderOperationDefinition&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ResourceProviderOperationDefinition>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of resource providers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ResourceProviderOperationDefinition> serviceCallback) throws IllegalArgumentException;

}
