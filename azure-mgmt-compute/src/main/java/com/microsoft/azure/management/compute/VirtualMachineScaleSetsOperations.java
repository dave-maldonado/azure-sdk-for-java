/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.compute.models.PageImpl;
import com.microsoft.azure.management.compute.models.VirtualMachineScaleSet;
import com.microsoft.azure.management.compute.models.VirtualMachineScaleSetInstanceView;
import com.microsoft.azure.management.compute.models.VirtualMachineScaleSetSku;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineScaleSetsOperations.
 */
public interface VirtualMachineScaleSetsOperations {
    /**
     * The operation to create or update a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @param parameters Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualMachineScaleSet object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualMachineScaleSet> createOrUpdate(String resourceGroupName, String name, VirtualMachineScaleSet parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to create or update a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @param parameters Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String name, VirtualMachineScaleSet parameters, final ServiceCallback<VirtualMachineScaleSet> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to create or update a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @param parameters Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineScaleSet object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualMachineScaleSet> beginCreateOrUpdate(String resourceGroupName, String name, VirtualMachineScaleSet parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to create or update a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @param parameters Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String name, VirtualMachineScaleSet parameters, final ServiceCallback<VirtualMachineScaleSet> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to deallocate virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> deallocate(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to deallocate virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deallocateAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * The operation to deallocate virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> deallocate(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to deallocate virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deallocateAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to deallocate virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDeallocate(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to deallocate virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeallocateAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * The operation to deallocate virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDeallocate(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to deallocate virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeallocateAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to delete a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to delete a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to delete a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to delete a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to get a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineScaleSet object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualMachineScaleSet> get(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to get a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<VirtualMachineScaleSet> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to delete virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> deleteInstances(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to delete virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteInstancesAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to delete virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDeleteInstances(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to delete virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteInstancesAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to get a virtual machine scale set instance view.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineScaleSetInstanceView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualMachineScaleSetInstanceView> getInstanceView(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to get a virtual machine scale set instance view.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getInstanceViewAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<VirtualMachineScaleSetInstanceView> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to list virtual machine scale sets under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineScaleSet&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<VirtualMachineScaleSet>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to list virtual machine scale sets under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final ListOperationCallback<VirtualMachineScaleSet> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the list of Virtual Machine Scale Sets in the subscription. Use nextLink property in the response to get the next page of Virtual Machine Scale Sets. Do this till nextLink is not null to fetch all the Virtual Machine Scale Sets.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineScaleSet&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<VirtualMachineScaleSet>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the list of Virtual Machine Scale Sets in the subscription. Use nextLink property in the response to get the next page of Virtual Machine Scale Sets. Do this till nextLink is not null to fetch all the Virtual Machine Scale Sets.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllAsync(final ListOperationCallback<VirtualMachineScaleSet> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to list available skus for a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineScaleSetSku&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<VirtualMachineScaleSetSku>> listSkus(final String resourceGroupName, final String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to list available skus for a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSkusAsync(final String resourceGroupName, final String vmScaleSetName, final ListOperationCallback<VirtualMachineScaleSetSku> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to power off (stop) virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> powerOff(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to power off (stop) virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall powerOffAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * The operation to power off (stop) virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> powerOff(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to power off (stop) virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall powerOffAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to power off (stop) virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginPowerOff(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to power off (stop) virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginPowerOffAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * The operation to power off (stop) virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginPowerOff(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to power off (stop) virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginPowerOffAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to restart virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> restart(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to restart virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall restartAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * The operation to restart virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> restart(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to restart virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall restartAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to restart virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginRestart(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to restart virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginRestartAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * The operation to restart virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginRestart(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to restart virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginRestartAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to start virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> start(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to start virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall startAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * The operation to start virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> start(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to start virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall startAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to start virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginStart(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to start virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginStartAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * The operation to start virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginStart(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to start virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginStartAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to manually upgrade virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> updateInstances(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to manually upgrade virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateInstancesAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to manually upgrade virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginUpdateInstances(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to manually upgrade virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceIds Gets or sets the virtual machine scale set instance ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginUpdateInstancesAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to re-image virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> reimage(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to re-image virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall reimageAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to re-image virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginReimage(String resourceGroupName, String vmScaleSetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to re-image virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginReimageAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to list virtual machine scale sets under a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineScaleSet&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<VirtualMachineScaleSet>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to list virtual machine scale sets under a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<VirtualMachineScaleSet> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the list of Virtual Machine Scale Sets in the subscription. Use nextLink property in the response to get the next page of Virtual Machine Scale Sets. Do this till nextLink is not null to fetch all the Virtual Machine Scale Sets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineScaleSet&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<VirtualMachineScaleSet>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the list of Virtual Machine Scale Sets in the subscription. Use nextLink property in the response to get the next page of Virtual Machine Scale Sets. Do this till nextLink is not null to fetch all the Virtual Machine Scale Sets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<VirtualMachineScaleSet> serviceCallback) throws IllegalArgumentException;

    /**
     * The operation to list available skus for a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineScaleSetSku&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<VirtualMachineScaleSetSku>> listSkusNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to list available skus for a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSkusNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<VirtualMachineScaleSetSku> serviceCallback) throws IllegalArgumentException;

}
