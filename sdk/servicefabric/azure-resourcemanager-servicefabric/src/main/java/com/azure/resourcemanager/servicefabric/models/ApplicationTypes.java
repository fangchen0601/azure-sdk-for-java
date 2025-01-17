// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ApplicationTypes. */
public interface ApplicationTypes {
    /**
     * Gets a Service Fabric application type name resource.
     *
     * <p>Get a Service Fabric application type name resource created or in the process of being created in the Service
     * Fabric cluster resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationTypeName The name of the application type name resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric application type name resource created or in the process of being created in the Service
     *     Fabric cluster resource along with {@link Response}.
     */
    Response<ApplicationTypeResource> getWithResponse(
        String resourceGroupName, String clusterName, String applicationTypeName, Context context);

    /**
     * Gets a Service Fabric application type name resource.
     *
     * <p>Get a Service Fabric application type name resource created or in the process of being created in the Service
     * Fabric cluster resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationTypeName The name of the application type name resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric application type name resource created or in the process of being created in the Service
     *     Fabric cluster resource.
     */
    ApplicationTypeResource get(String resourceGroupName, String clusterName, String applicationTypeName);

    /**
     * Deletes a Service Fabric application type name resource.
     *
     * <p>Delete a Service Fabric application type name resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationTypeName The name of the application type name resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String applicationTypeName);

    /**
     * Deletes a Service Fabric application type name resource.
     *
     * <p>Delete a Service Fabric application type name resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationTypeName The name of the application type name resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String applicationTypeName, Context context);

    /**
     * Gets the list of application type name resources created in the specified Service Fabric cluster resource.
     *
     * <p>Gets all application type name resources created or in the process of being created in the Service Fabric
     * cluster resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all application type name resources created or in the process of being created in the Service Fabric
     *     cluster resource along with {@link Response}.
     */
    Response<ApplicationTypeResourceList> listWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Gets the list of application type name resources created in the specified Service Fabric cluster resource.
     *
     * <p>Gets all application type name resources created or in the process of being created in the Service Fabric
     * cluster resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all application type name resources created or in the process of being created in the Service Fabric
     *     cluster resource.
     */
    ApplicationTypeResourceList list(String resourceGroupName, String clusterName);

    /**
     * Gets a Service Fabric application type name resource.
     *
     * <p>Get a Service Fabric application type name resource created or in the process of being created in the Service
     * Fabric cluster resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric application type name resource created or in the process of being created in the Service
     *     Fabric cluster resource along with {@link Response}.
     */
    ApplicationTypeResource getById(String id);

    /**
     * Gets a Service Fabric application type name resource.
     *
     * <p>Get a Service Fabric application type name resource created or in the process of being created in the Service
     * Fabric cluster resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric application type name resource created or in the process of being created in the Service
     *     Fabric cluster resource along with {@link Response}.
     */
    Response<ApplicationTypeResource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Service Fabric application type name resource.
     *
     * <p>Delete a Service Fabric application type name resource with the specified name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Service Fabric application type name resource.
     *
     * <p>Delete a Service Fabric application type name resource with the specified name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ApplicationTypeResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ApplicationTypeResource definition.
     */
    ApplicationTypeResource.DefinitionStages.Blank define(String name);
}
