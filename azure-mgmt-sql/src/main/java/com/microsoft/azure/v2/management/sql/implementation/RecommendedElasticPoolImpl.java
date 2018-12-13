/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.v2.management.sql.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.v2.management.resources.fluentcore.model.implementation.RefreshableWrapperImpl;
import com.microsoft.azure.v2.management.sql.ElasticPoolEdition;
import com.microsoft.azure.v2.management.sql.RecommendedElasticPool;
import com.microsoft.azure.v2.management.sql.RecommendedElasticPoolMetric;
import com.microsoft.azure.v2.management.sql.SqlDatabase;
import java.time.OffsetDateTime;

import io.reactivex.Maybe;
import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Implementation for RecommendedElasticPool and its parent interfaces.
 */
@LangDefinition
class RecommendedElasticPoolImpl
        extends RefreshableWrapperImpl<RecommendedElasticPoolInner, RecommendedElasticPool>
        implements RecommendedElasticPool {

    private final SqlServerImpl sqlServer;

    protected RecommendedElasticPoolImpl(RecommendedElasticPoolInner innerObject, SqlServerImpl sqlServer) {
        super(innerObject);
        this.sqlServer = sqlServer;
    }

    @Override
    protected Maybe<RecommendedElasticPoolInner> getInnerAsync() {
        return this.manager().inner().recommendedElasticPools().getAsync(
                this.resourceGroupName(), this.sqlServerName(), this.name());
    }

    @Override
    public SqlServerManager manager() {
        return this.sqlServer.manager();
    }

    @Override
    public String sqlServerName() {
        return this.sqlServer.name();
    }

    @Override
    public ElasticPoolEdition databaseEdition() {
        return this.inner().databaseEdition();
    }

    @Override
    public double dtu() {
        return this.inner().dtu();
    }

    @Override
    public double databaseDtuMin() {
        return this.inner().databaseDtuMin();
    }

    @Override
    public double databaseDtuMax() {
        return this.inner().databaseDtuMax();
    }

    @Override
    public double storageMB() {
        return this.inner().storageMB();
    }

    @Override
    public OffsetDateTime observationPeriodStart() {
        return this.inner().observationPeriodStart();
    }

    @Override
    public OffsetDateTime observationPeriodEnd() {
        return this.inner().observationPeriodEnd();
    }

    @Override
    public double maxObservedDtu() {
        return this.inner().maxObservedDtu();
    }

    @Override
    public double maxObservedStorageMB() {
        return this.inner().maxObservedStorageMB();
    }

    @Override
    public List<SqlDatabase> databases() {
        ArrayList<SqlDatabase> databases = new ArrayList<>();

        for (DatabaseInner databaseInner : this.inner().databasesProperty()) {
            databases.add(new SqlDatabaseImpl(databaseInner.name(), this.sqlServer, databaseInner, this.manager()));
        }

        return Collections.unmodifiableList(databases);
    }

    @Override
    public List<SqlDatabase> listDatabases() {
        List<SqlDatabase> databasesList = new ArrayList<>();
        List<DatabaseInner> databaseInners = this.sqlServer.manager().inner().databases().listByRecommendedElasticPool(
            this.sqlServer.resourceGroupName(),
            this.sqlServer.name(),
            this.name());
        if (databaseInners != null) {
            for (DatabaseInner inner : databaseInners) {
                databasesList.add(new SqlDatabaseImpl(inner.name(), this.sqlServer, inner, this.manager()));
            }
        }
        return Collections.unmodifiableList(databasesList);
    }

    @Override
    public Observable<SqlDatabase> listDatabasesAsync() {
        final RecommendedElasticPoolImpl self = this;
        return this.sqlServer.manager().inner().databases().listByRecommendedElasticPoolAsync(
            this.sqlServer.resourceGroupName(),
            this.sqlServer.name(),
            this.name())
                .flatMapObservable(list -> Observable.fromIterable(list))
                .map(databaseInner -> new SqlDatabaseImpl(databaseInner.name(), self.sqlServer, databaseInner, self.manager()));
    }

    @Override
    public SqlDatabase getDatabase(String databaseName) {
        DatabaseInner databaseInner = this.sqlServer.manager().inner().databases().getByRecommendedElasticPool(
            this.sqlServer.resourceGroupName(),
            this.sqlServer.name(),
            this.name(),
            databaseName);

        return new SqlDatabaseImpl(databaseInner.name(), this.sqlServer, databaseInner, this.manager());
    }

    @Override
    public Maybe<SqlDatabase> getDatabaseAsync(String databaseName) {
        final RecommendedElasticPoolImpl self = this;
        return this.sqlServer.manager().inner().databases().getByRecommendedElasticPoolAsync(
                this.sqlServer.resourceGroupName(),
                this.sqlServer.name(),
                this.name(),
                databaseName)
                .map(databaseInner -> new SqlDatabaseImpl(databaseInner.name(), self.sqlServer, databaseInner, self.manager()));
    }

    @Override
    public List<RecommendedElasticPoolMetric> listMetrics() {
        List<RecommendedElasticPoolMetric> recommendedElasticPoolMetrics = new ArrayList<>();
        List<RecommendedElasticPoolMetricInner> recommendedElasticPoolMetricInners = this.sqlServer.manager().inner()
            .recommendedElasticPools().listMetrics(
                        this.resourceGroupName(),
                        this.sqlServerName(),
                        this.name());
        if (recommendedElasticPoolMetricInners != null) {
            for (RecommendedElasticPoolMetricInner inner : recommendedElasticPoolMetricInners) {
                recommendedElasticPoolMetrics.add(new RecommendedElasticPoolMetricImpl(inner));
            }
        }
        return Collections.unmodifiableList(recommendedElasticPoolMetrics);
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String resourceGroupName() {
        return this.sqlServer.resourceGroupName();
    }
}