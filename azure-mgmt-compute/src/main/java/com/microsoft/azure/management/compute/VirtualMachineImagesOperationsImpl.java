/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.compute.models.VirtualMachineImage;
import com.microsoft.azure.management.compute.models.VirtualMachineImageResource;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineImagesOperations.
 */
public final class VirtualMachineImagesOperationsImpl implements VirtualMachineImagesOperations {
    /** The Retrofit service to perform REST calls. */
    private VirtualMachineImagesService service;
    /** The service client containing this operation class. */
    private ComputeManagementClient client;

    /**
     * Initializes an instance of VirtualMachineImagesOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineImagesOperationsImpl(Retrofit retrofit, ComputeManagementClient client) {
        this.service = retrofit.create(VirtualMachineImagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualMachineImagesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineImagesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus/{skus}/versions/{version}")
        Call<ResponseBody> get(@Path("location") String location, @Path("publisherName") String publisherName, @Path("offer") String offer, @Path("skus") String skus, @Path("version") String version, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus/{skus}/versions")
        Call<ResponseBody> list(@Path("location") String location, @Path("publisherName") String publisherName, @Path("offer") String offer, @Path("skus") String skus, @Path("subscriptionId") String subscriptionId, @Query("$filter") VirtualMachineImageResource filter, @Query("$top") Integer top, @Query("$orderby") String orderby, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers")
        Call<ResponseBody> listOffers(@Path("location") String location, @Path("publisherName") String publisherName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers")
        Call<ResponseBody> listPublishers(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus")
        Call<ResponseBody> listSkus(@Path("location") String location, @Path("publisherName") String publisherName, @Path("offer") String offer, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }

    /**
     * Gets a virtual machine image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param version the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineImage object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VirtualMachineImage> get(String location, String publisherName, String offer, String skus, String version) throws CloudException, IOException, IllegalArgumentException {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (offer == null) {
            throw new IllegalArgumentException("Parameter offer is required and cannot be null.");
        }
        if (skus == null) {
            throw new IllegalArgumentException("Parameter skus is required and cannot be null.");
        }
        if (version == null) {
            throw new IllegalArgumentException("Parameter version is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(location, publisherName, offer, skus, version, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute());
    }

    /**
     * Gets a virtual machine image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getAsync(String location, String publisherName, String offer, String skus, String version, final ServiceCallback<VirtualMachineImage> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (location == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter location is required and cannot be null."));
            return null;
        }
        if (publisherName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
            return null;
        }
        if (offer == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter offer is required and cannot be null."));
            return null;
        }
        if (skus == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter skus is required and cannot be null."));
            return null;
        }
        if (version == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter version is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.get(location, publisherName, offer, skus, version, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VirtualMachineImage>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VirtualMachineImage> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VirtualMachineImage, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VirtualMachineImage>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of virtual machine images.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<VirtualMachineImageResource>> list(String location, String publisherName, String offer, String skus) throws CloudException, IOException, IllegalArgumentException {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (offer == null) {
            throw new IllegalArgumentException("Parameter offer is required and cannot be null.");
        }
        if (skus == null) {
            throw new IllegalArgumentException("Parameter skus is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        final VirtualMachineImageResource filter = null;
        final Integer top = null;
        final String orderby = null;
        Call<ResponseBody> call = service.list(location, publisherName, offer, skus, this.client.getSubscriptionId(), filter, top, orderby, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listDelegate(call.execute());
    }

    /**
     * Gets a list of virtual machine images.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listAsync(String location, String publisherName, String offer, String skus, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (location == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter location is required and cannot be null."));
            return null;
        }
        if (publisherName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
            return null;
        }
        if (offer == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter offer is required and cannot be null."));
            return null;
        }
        if (skus == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter skus is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        final VirtualMachineImageResource filter = null;
        final Integer top = null;
        final String orderby = null;
        Call<ResponseBody> call = service.list(location, publisherName, offer, skus, this.client.getSubscriptionId(), filter, top, orderby, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<VirtualMachineImageResource>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Gets a list of virtual machine images.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<VirtualMachineImageResource>> list(String location, String publisherName, String offer, String skus, VirtualMachineImageResource filter, Integer top, String orderby) throws CloudException, IOException, IllegalArgumentException {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (offer == null) {
            throw new IllegalArgumentException("Parameter offer is required and cannot be null.");
        }
        if (skus == null) {
            throw new IllegalArgumentException("Parameter skus is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(filter);
        Call<ResponseBody> call = service.list(location, publisherName, offer, skus, this.client.getSubscriptionId(), filter, top, orderby, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listDelegate(call.execute());
    }

    /**
     * Gets a list of virtual machine images.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listAsync(String location, String publisherName, String offer, String skus, VirtualMachineImageResource filter, Integer top, String orderby, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (location == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter location is required and cannot be null."));
            return null;
        }
        if (publisherName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
            return null;
        }
        if (offer == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter offer is required and cannot be null."));
            return null;
        }
        if (skus == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter skus is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(filter, serviceCallback);
        Call<ResponseBody> call = service.list(location, publisherName, offer, skus, this.client.getSubscriptionId(), filter, top, orderby, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<VirtualMachineImageResource>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<List<VirtualMachineImageResource>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<List<VirtualMachineImageResource>, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<List<VirtualMachineImageResource>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of virtual machine image offers.
     *
     * @param location the String value
     * @param publisherName the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<VirtualMachineImageResource>> listOffers(String location, String publisherName) throws CloudException, IOException, IllegalArgumentException {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listOffers(location, publisherName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listOffersDelegate(call.execute());
    }

    /**
     * Gets a list of virtual machine image offers.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listOffersAsync(String location, String publisherName, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (location == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter location is required and cannot be null."));
            return null;
        }
        if (publisherName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listOffers(location, publisherName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<VirtualMachineImageResource>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listOffersDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<List<VirtualMachineImageResource>> listOffersDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<List<VirtualMachineImageResource>, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<List<VirtualMachineImageResource>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of virtual machine image publishers.
     *
     * @param location the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<VirtualMachineImageResource>> listPublishers(String location) throws CloudException, IOException, IllegalArgumentException {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listPublishers(location, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listPublishersDelegate(call.execute());
    }

    /**
     * Gets a list of virtual machine image publishers.
     *
     * @param location the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listPublishersAsync(String location, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (location == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter location is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listPublishers(location, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<VirtualMachineImageResource>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listPublishersDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<List<VirtualMachineImageResource>> listPublishersDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<List<VirtualMachineImageResource>, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<List<VirtualMachineImageResource>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of virtual machine image skus.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<VirtualMachineImageResource>> listSkus(String location, String publisherName, String offer) throws CloudException, IOException, IllegalArgumentException {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (offer == null) {
            throw new IllegalArgumentException("Parameter offer is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSkus(location, publisherName, offer, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSkusDelegate(call.execute());
    }

    /**
     * Gets a list of virtual machine image skus.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSkusAsync(String location, String publisherName, String offer, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (location == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter location is required and cannot be null."));
            return null;
        }
        if (publisherName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
            return null;
        }
        if (offer == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter offer is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSkus(location, publisherName, offer, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<VirtualMachineImageResource>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSkusDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<List<VirtualMachineImageResource>> listSkusDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<List<VirtualMachineImageResource>, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<List<VirtualMachineImageResource>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
