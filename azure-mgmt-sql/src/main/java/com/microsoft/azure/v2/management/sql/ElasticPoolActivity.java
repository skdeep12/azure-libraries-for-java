/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.v2.management.sql;

import com.microsoft.rest.v2.annotations.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.models.HasId;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.models.HasName;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.models.HasResourceGroup;
import com.microsoft.azure.v2.management.resources.fluentcore.model.HasInner;
import com.microsoft.azure.v2.management.sql.implementation.ElasticPoolActivityInner;
import java.time.OffsetDateTime;


/**
 * An immutable client-side representation of an Azure SQL ElasticPool's Activity.
 */
@Fluent
public interface ElasticPoolActivity extends
        HasInner<ElasticPoolActivityInner>,
        HasResourceGroup,
        HasName,
        HasId {
    /**
     * @return the time the operation finished (ISO8601 format)
     */
    OffsetDateTime endTime();

    /**
     * @return the error code if available
     */
    int errorCode();

    /**
     * @return the error message if available
     */
    String errorMessage();

    /**
     * @return the error severity if available
     */
    int errorSeverity();

    /**
     * @return the operation name
     */
    String operation();

    /**
     * @return the unique operation ID
     */
    String operationId();

    /**
     * @return the percentage complete if available
     */
    int percentComplete();

    /**
     * @return the requested max DTU per database if available
     */
    int requestedDatabaseDtuMax();

    /**
     * @return the requested min DTU per database if available
     */
    int requestedDatabaseDtuMin();

    /**
     * @return the requested DTU for the pool if available
     */
    int requestedDtu();

    /**
     * @return the requested name for the Elastic Pool if available
     */
    String requestedElasticPoolName();

    /**
     * @return the requested storage limit for the pool in GB if available
     */
    long requestedStorageLimitInGB();

    /**
     * @return the name of the Elastic Pool
     */
    String elasticPoolName();

    /**
     * @return the name of the Azure SQL Server the Elastic Pool is in
     */
    String serverName();

    /**
     * @return the time the operation started (ISO8601 format)
     */
    OffsetDateTime startTime();

    /**
     * @return the current state of the operation
     */
    String state();

    /**
     * @return the geo-location where the resource lives.
     */
    @Beta(since = "V1_7_0")
    String location();

    /**
     * @return the requested storage limit in MB.
     */
    @Beta(since = "V1_7_0")
    int requestedStorageLimitInMB();

    /**
     * @return he requested per database DTU guarantee.
     */
    @Beta(since = "V1_7_0")
    int requestedDatabaseDtuGuarantee();

    /**
     * @return the requested per database DTU cap.
     */
    @Beta(since = "V1_7_0")
    int requestedDatabaseDtuCap();

    /**
     * @return the requested DTU guarantee.
     */
    @Beta(since = "V1_7_0")
    int requestedDtuGuarantee();
}
