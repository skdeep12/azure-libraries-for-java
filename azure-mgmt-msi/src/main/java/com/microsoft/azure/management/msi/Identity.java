/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.msi;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.graphrbac.BuiltInRole;
import com.microsoft.azure.management.graphrbac.RoleAssignment;
import com.microsoft.azure.management.msi.implementation.IdentityInner;
import com.microsoft.azure.management.msi.implementation.MSIManager;
import com.microsoft.azure.management.resources.fluentcore.arm.models.GroupableResource;
import com.microsoft.azure.management.resources.fluentcore.arm.models.Resource;
import com.microsoft.azure.management.resources.fluentcore.model.Appliable;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;
import com.microsoft.azure.management.resources.fluentcore.model.Updatable;


/**
 * An immutable client-side representation of an Azure Managed Service Identity (MSI) Identity resource.
 */
@Fluent
@Beta(Beta.SinceVersion.V1_5_1)
public interface Identity
        extends GroupableResource<MSIManager, IdentityInner>,
        Refreshable<Identity>,
        Updatable<Identity.Update> {
    /**
     * @return id of the Azure Active Directory tenant to which the identity belongs to
     */
    String tenantId();

    /**
     * @return id of the Azure Active Directory service principal object associated with the identity
     */
    String principalId();

    /**
     * @return id of the Azure Active Directory application associated with the identity
     */
    String clientId();

    /**
     * @return the url that can be queried to obtain the identity credentials
     */
     String clientSecretUrl();

    /**
     * Container interface for all the definitions related to identity.
     */
    interface Definition extends
            DefinitionStages.Blank,
            DefinitionStages.WithGroup,
            DefinitionStages.WithCreate {
    }

    /**
     * Grouping of identity definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of an identity definition.
         */
        interface Blank extends GroupableResource.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the identity definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResource.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the identity definition allowing to set access role (permission) for it
         * to access a resource.
         */
        @Beta(Beta.SinceVersion.V1_5_1)
        interface WithAccess {
            /**
             * Specifies that the identity should have the given access (described by the role)
             * on an ARM resource. An applications running on an Azure service with this identity
             * can use this permission to access the resource.
             *
             * @param resource the resource to access
             * @param role access role to assigned to the identity
             * @return the next stage of the definition
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            WithCreate withAccessTo(Resource resource, BuiltInRole role);

            /**
             * Specifies that the identity should have the given access (described by the role)
             * on an ARM resource identified by the given resource id. An applications running
             * on an Azure service with this identity can use this permission to access the resource.
             *
             * @param resourceId id of the resource to access
             * @param role access role to assigned to the identity
             * @return the next stage of the definition
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            WithCreate withAccessTo(String resourceId, BuiltInRole role);

            /**
             * Specifies that the identity should have the given access (described by the role)
             * on the resource group that identity resides. An applications running on an Azure
             * service with this identity can use this permission to access the resource group.
             *
             * @param role access role to assigned to the identity
             * @return the next stage of the definition
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            WithCreate withAccessToCurrentResourceGroup(BuiltInRole role);

            /**
             * Specifies that the identity should have the given access (described by the role
             * definition) on an ARM resource. An applications running on an Azure service with
             * this identity can use this permission to access the resource.
             *
             * @param resource scope of the access represented as ARM resource
             * @param roleDefinitionId access role definition to assigned to the identity
             * @return the next stage of the definition
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            WithCreate withAccessTo(Resource resource, String roleDefinitionId);

            /**
             * Specifies that the identity should have the given access (described by the role
             * definition) on an ARM resource identified by the given resource id. An applications
             * running on an Azure service with this identity can use this permission to access
             * the resource.
             *
             * @param resourceId id of the resource to access
             * @param roleDefinitionId access role definition to assigned to the identity
             * @return the next stage of the definition
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            WithCreate withAccessTo(String resourceId, String roleDefinitionId);

            /**
             * Specifies that the identity should have the given access (described by the role
             * definition) on the resource group that identity resides. An applications running
             * on an Azure service with this identity can use this permission to access the
             * resource group.
             *
             * @param roleDefinitionId access role definition to assigned to the identity
             * @return the next stage of the definition
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            WithCreate withAccessToCurrentResourceGroup(String roleDefinitionId);
        }

        /**
         * The stage of the identity definition which contains all the minimum required inputs for
         * the resource to be created but also allows for any other optional settings to be specified.
         */
        interface WithCreate extends
                Resource.DefinitionWithTags<WithCreate>,
                Creatable<Identity>,
                DefinitionStages.WithAccess {
        }
    }

    /**
     * Grouping of identity update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the identity update allowing to set access role (permission) for it
         * to access a resource or remove an assigned role.
         */
        @Beta(Beta.SinceVersion.V1_5_1)
        interface WithAccess {
            /**
             * Specifies that the identity should have the given access (described by the role)
             * on an ARM resource. An applications running on an Azure service with this identity
             * can use this permission to access the resource.
             *
             * @param resource the resource to access
             * @param role access role to assigned to the identity
             * @return the next stage of the update
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            Update withAccessTo(Resource resource, BuiltInRole role);

            /**
             * Specifies that the identity should have the given access (described by the role)
             * on an ARM resource identified by the given resource id. An applications running
             * on an Azure service with this identity can use this permission to access the resource.
             *
             * @param resourceId id of the resource to access
             * @param role access role to assigned to the identity
             * @return the next stage of the update
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            Update withAccessTo(String resourceId, BuiltInRole role);

            /**
             * Specifies that the identity should have the given access (described by the role)
             * on the resource group that identity resides. An applications running on an Azure
             * service with this identity can use this permission to access the resource group.
             *
             * @param role access role to assigned to the identity
             * @return the next stage of the update
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            Update withAccessToCurrentResourceGroup(BuiltInRole role);

            /**
             * Specifies that the identity should have the given access (described by the role
             * definition) on an ARM resource. An applications running on an Azure service with
             * this identity can use this permission to access the resource.
             *
             * @param resource scope of the access represented as ARM resource
             * @param roleDefinitionId access role definition to assigned to the identity
             * @return the next stage of the update
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            Update withAccessTo(Resource resource, String roleDefinitionId);

            /**
             * Specifies that the identity should have the given access (described by the role
             * definition) on an ARM resource identified by the given resource id. An applications
             * running on an Azure service with this identity can use this permission to access
             * the resource.
             *
             * @param resourceId id of the resource to access
             * @param roleDefinitionId access role definition to assigned to the identity
             * @return the next stage of the update
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            Update withAccessTo(String resourceId, String roleDefinitionId);

            /**
             * Specifies that the identity should have the given access (described by the role
             * definition) on the resource group that identity resides. An applications running
             * on an Azure service with this identity can use this permission to access the
             * resource group.
             *
             * @param roleDefinitionId access role definition to assigned to the identity
             * @return the next stage of the update
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            Update withAccessToCurrentResourceGroup(String roleDefinitionId);

            /**
             * Specifies that an access role assigned to the identity should be removed.
             *
             * @param roleAssignment describes an existing role assigned to the identity
             * @return the next stage of the update
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            Update withoutAccess(RoleAssignment roleAssignment);

            /**
             * Specifies that an access role assigned to the identity should be removed.
             *
             * @param resourceId id of the resource that identity has access
             * @param role the access role assigned to the identity
             * @return the next stage of the update
             */
            @Beta(Beta.SinceVersion.V1_5_1)
            Update withoutAccessTo(String resourceId, BuiltInRole role);
        }
    }

    /**
     * The template for an identity update operation, containing all the settings that can be modified.
     */
    interface Update extends
            Appliable<Identity>,
            UpdateStages.WithAccess,
            Resource.UpdateWithTags<Update> {
    }
}
