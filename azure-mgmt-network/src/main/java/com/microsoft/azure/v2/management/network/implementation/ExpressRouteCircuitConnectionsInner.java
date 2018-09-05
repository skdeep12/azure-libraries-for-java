/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.azure.v2.OperationStatus;
import com.microsoft.azure.v2.util.ServiceFutureUtil;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.OperationDescription;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.DELETE;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.ResumeOperation;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * ExpressRouteCircuitConnections.
 */
public final class ExpressRouteCircuitConnectionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ExpressRouteCircuitConnectionsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRouteCircuitConnectionsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ExpressRouteCircuitConnectionsInner(NetworkManagementClientImpl client) {
        this.service = AzureProxy.create(ExpressRouteCircuitConnectionsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ExpressRouteCircuitConnections to be used by the proxy service to
     * perform REST calls.
     */
    @Host("https://management.azure.com")
    private interface ExpressRouteCircuitConnectionsService {
        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<Void>> beginDelete(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("connectionName") String connectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<VoidResponse> delete(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("connectionName") String connectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<Void>> resumeDelete(OperationDescription operationDescription);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<ExpressRouteCircuitConnectionInner>> get(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("connectionName") String connectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<ExpressRouteCircuitConnectionInner>> beginCreateOrUpdate(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("connectionName") String connectionName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<ExpressRouteCircuitConnectionInner>> createOrUpdate(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("connectionName") String connectionName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/connections/{connectionName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<ExpressRouteCircuitConnectionInner>> resumeCreateOrUpdate(OperationDescription operationDescription);
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void beginDelete(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName) {
        beginDeleteAsync(resourceGroupName, circuitName, peeringName, connectionName).blockingLast();
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;Void&gt; object.
     */
    public ServiceFuture<Void> beginDeleteAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName, ServiceCallback<Void> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginDeleteAsync(resourceGroupName, circuitName, peeringName, connectionName), serviceCallback);
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> beginDeleteAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.beginDelete(resourceGroupName, circuitName, peeringName, connectionName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void delete(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName) {
        deleteAsync(resourceGroupName, circuitName, peeringName, connectionName).blockingAwait();
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> deleteAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(deleteAsync(resourceGroupName, circuitName, peeringName, connectionName), serviceCallback);
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> deleteWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.delete(resourceGroupName, circuitName, peeringName, connectionName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable deleteAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName) {
        return deleteWithRestResponseAsync(resourceGroupName, circuitName, peeringName, connectionName)
            .toCompletable();
    }

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> resumeDelete(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeDelete(operationDescription);
    }

    /**
     * Gets the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ExpressRouteCircuitConnectionInner object if successful.
     */
    public ExpressRouteCircuitConnectionInner get(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName) {
        return getAsync(resourceGroupName, circuitName, peeringName, connectionName).blockingGet();
    }

    /**
     * Gets the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<ExpressRouteCircuitConnectionInner> getAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName, ServiceCallback<ExpressRouteCircuitConnectionInner> serviceCallback) {
        return ServiceFuture.fromBody(getAsync(resourceGroupName, circuitName, peeringName, connectionName), serviceCallback);
    }

    /**
     * Gets the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<ExpressRouteCircuitConnectionInner>> getWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.get(resourceGroupName, circuitName, peeringName, connectionName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Gets the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<ExpressRouteCircuitConnectionInner> getAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName) {
        return getWithRestResponseAsync(resourceGroupName, circuitName, peeringName, connectionName)
            .flatMapMaybe((BodyResponse<ExpressRouteCircuitConnectionInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit circuit connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ExpressRouteCircuitConnectionInner object if successful.
     */
    public ExpressRouteCircuitConnectionInner beginCreateOrUpdate(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName, @NonNull ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, circuitName, peeringName, connectionName, expressRouteCircuitConnectionParameters).blockingLast().result();
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit circuit connection operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;ExpressRouteCircuitConnectionInner&gt; object.
     */
    public ServiceFuture<ExpressRouteCircuitConnectionInner> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName, @NonNull ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters, ServiceCallback<ExpressRouteCircuitConnectionInner> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginCreateOrUpdateAsync(resourceGroupName, circuitName, peeringName, connectionName, expressRouteCircuitConnectionParameters), serviceCallback);
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit circuit connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<ExpressRouteCircuitConnectionInner>> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName, @NonNull ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (expressRouteCircuitConnectionParameters == null) {
            throw new IllegalArgumentException("Parameter expressRouteCircuitConnectionParameters is required and cannot be null.");
        }
        Validator.validate(expressRouteCircuitConnectionParameters);
        final String apiVersion = "2018-06-01";
        return service.beginCreateOrUpdate(resourceGroupName, circuitName, peeringName, connectionName, this.client.subscriptionId(), expressRouteCircuitConnectionParameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit circuit connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ExpressRouteCircuitConnectionInner object if successful.
     */
    public ExpressRouteCircuitConnectionInner createOrUpdate(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName, @NonNull ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        return createOrUpdateAsync(resourceGroupName, circuitName, peeringName, connectionName, expressRouteCircuitConnectionParameters).blockingGet();
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit circuit connection operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<ExpressRouteCircuitConnectionInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName, @NonNull ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters, ServiceCallback<ExpressRouteCircuitConnectionInner> serviceCallback) {
        return ServiceFuture.fromBody(createOrUpdateAsync(resourceGroupName, circuitName, peeringName, connectionName, expressRouteCircuitConnectionParameters), serviceCallback);
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit circuit connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<ExpressRouteCircuitConnectionInner>> createOrUpdateWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName, @NonNull ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (expressRouteCircuitConnectionParameters == null) {
            throw new IllegalArgumentException("Parameter expressRouteCircuitConnectionParameters is required and cannot be null.");
        }
        Validator.validate(expressRouteCircuitConnectionParameters);
        final String apiVersion = "2018-06-01";
        return service.createOrUpdate(resourceGroupName, circuitName, peeringName, connectionName, this.client.subscriptionId(), expressRouteCircuitConnectionParameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit circuit connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<ExpressRouteCircuitConnectionInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String circuitName, @NonNull String peeringName, @NonNull String connectionName, @NonNull ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        return createOrUpdateWithRestResponseAsync(resourceGroupName, circuitName, peeringName, connectionName, expressRouteCircuitConnectionParameters)
            .flatMapMaybe((BodyResponse<ExpressRouteCircuitConnectionInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<ExpressRouteCircuitConnectionInner>> resumeCreateOrUpdate(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeCreateOrUpdate(operationDescription);
    }
}