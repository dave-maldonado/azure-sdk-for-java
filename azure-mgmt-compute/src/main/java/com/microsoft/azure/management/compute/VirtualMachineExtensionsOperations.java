/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.compute.models.VirtualMachineExtension;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineExtensionsOperations.
 */
public interface VirtualMachineExtensionsOperations {
    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualMachineExtension object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualMachineExtension> createOrUpdate(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtension extensionParameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtension extensionParameters, final ServiceCallback<VirtualMachineExtension> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineExtension object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualMachineExtension> beginCreateOrUpdate(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtension extensionParameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtension extensionParameters, final ServiceCallback<VirtualMachineExtension> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String vmName, String vmExtensionName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String vmName, String vmExtensionName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String vmName, String vmExtensionName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String vmName, String vmExtensionName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineExtension object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualMachineExtension> get(String resourceGroupName, String vmName, String vmExtensionName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String vmName, String vmExtensionName, final ServiceCallback<VirtualMachineExtension> serviceCallback) throws IllegalArgumentException;
    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineExtension object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualMachineExtension> get(String resourceGroupName, String vmName, String vmExtensionName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String vmName, String vmExtensionName, String expand, final ServiceCallback<VirtualMachineExtension> serviceCallback) throws IllegalArgumentException;

}
