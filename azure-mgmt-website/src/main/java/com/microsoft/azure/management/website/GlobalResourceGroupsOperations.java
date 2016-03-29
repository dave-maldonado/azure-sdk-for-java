/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.CsmMoveResourceEnvelope;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in GlobalResourceGroupsOperations.
 */
public interface GlobalResourceGroupsOperations {
    /**
     *
     * @param resourceGroupName the String value
     * @param moveResourceEnvelope the CsmMoveResourceEnvelope value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> moveResources(String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param moveResourceEnvelope the CsmMoveResourceEnvelope value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall moveResourcesAsync(String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

}
