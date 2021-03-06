/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.monitor.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.monitor.ActivityLogAlerts;
import com.microsoft.azure.management.monitor.AlertRules;
import com.microsoft.azure.management.monitor.MetricAlerts;

/**
 * Implementation for {@link MetricAlerts}.
 */
@LangDefinition
class AlertRulesImpl
        implements AlertRules {

    private final MetricAlerts metricAlerts;
    private final ActivityLogAlerts activityLogAlerts;

    AlertRulesImpl(final MonitorManager monitorManager) {
        metricAlerts = new MetricAlertsImpl(monitorManager);
        activityLogAlerts = new ActivityLogAlertsImpl(monitorManager);
    }

    @Override
    public MetricAlerts metricAlerts() {
        return metricAlerts;
    }

    @Override
    public ActivityLogAlerts activityLogAlerts() {
        return activityLogAlerts;
    }

    @Override
    public MonitorManager manager() {
        return this.metricAlerts.manager();
    }
}
