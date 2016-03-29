/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.compute.models.VirtualMachineExtensionImage;
import com.microsoft.azure.management.compute.models.VirtualMachineImageResource;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineExtensionImagesOperations.
 */
public interface VirtualMachineExtensionImagesOperations {
    /**
     * Gets a virtual machine extension image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param version the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineExtensionImage object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualMachineExtensionImage> get(String location, String publisherName, String type, String version) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a virtual machine extension image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String location, String publisherName, String type, String version, final ServiceCallback<VirtualMachineExtensionImage> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location the String value
     * @param publisherName the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> listTypes(String location, String publisherName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTypesAsync(String location, String publisherName, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> listVersions(String location, String publisherName, String type) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listVersionsAsync(String location, String publisherName, String type, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> listVersions(String location, String publisherName, String type, VirtualMachineImageResource filter, Integer top, String orderby) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listVersionsAsync(String location, String publisherName, String type, VirtualMachineImageResource filter, Integer top, String orderby, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException;

}
