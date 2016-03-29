/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.PublicIPAddress;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in PublicIPAddressesOperations.
 */
public interface PublicIPAddressesOperations {
    /**
     * The delete publicIpAddress operation deletes the specified publicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String publicIpAddressName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete publicIpAddress operation deletes the specified publicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String publicIpAddressName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The delete publicIpAddress operation deletes the specified publicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String publicIpAddressName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The delete publicIpAddress operation deletes the specified publicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String publicIpAddressName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get publicIpAddress operation retreives information about the specified pubicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PublicIPAddress object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PublicIPAddress> get(String resourceGroupName, String publicIpAddressName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get publicIpAddress operation retreives information about the specified pubicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String publicIpAddressName, final ServiceCallback<PublicIPAddress> serviceCallback) throws IllegalArgumentException;
    /**
     * The Get publicIpAddress operation retreives information about the specified pubicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PublicIPAddress object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PublicIPAddress> get(String resourceGroupName, String publicIpAddressName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get publicIpAddress operation retreives information about the specified pubicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String publicIpAddressName, String expand, final ServiceCallback<PublicIPAddress> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put PublicIPAddress operation creates/updates a stable/dynamic PublicIP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the publicIpAddress.
     * @param parameters Parameters supplied to the create/update PublicIPAddress operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the PublicIPAddress object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PublicIPAddress> createOrUpdate(String resourceGroupName, String publicIpAddressName, PublicIPAddress parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put PublicIPAddress operation creates/updates a stable/dynamic PublicIP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the publicIpAddress.
     * @param parameters Parameters supplied to the create/update PublicIPAddress operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String publicIpAddressName, PublicIPAddress parameters, final ServiceCallback<PublicIPAddress> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put PublicIPAddress operation creates/updates a stable/dynamic PublicIP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the publicIpAddress.
     * @param parameters Parameters supplied to the create/update PublicIPAddress operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PublicIPAddress object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PublicIPAddress> beginCreateOrUpdate(String resourceGroupName, String publicIpAddressName, PublicIPAddress parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put PublicIPAddress operation creates/updates a stable/dynamic PublicIP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the publicIpAddress.
     * @param parameters Parameters supplied to the create/update PublicIPAddress operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String publicIpAddressName, PublicIPAddress parameters, final ServiceCallback<PublicIPAddress> serviceCallback) throws IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PublicIPAddress&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<PublicIPAddress>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllAsync(final ListOperationCallback<PublicIPAddress> serviceCallback) throws IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PublicIPAddress&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<PublicIPAddress>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final ListOperationCallback<PublicIPAddress> serviceCallback) throws IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PublicIPAddress&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<PublicIPAddress>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<PublicIPAddress> serviceCallback) throws IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PublicIPAddress&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<PublicIPAddress>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<PublicIPAddress> serviceCallback) throws IllegalArgumentException;

}
