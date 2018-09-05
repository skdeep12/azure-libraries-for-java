/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.v2.management.trafficmanager;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.models.HasName;
import com.microsoft.azure.v2.management.resources.fluentcore.model.HasInner;

import java.util.List;

/**
 * Type representing Geographic Hierarchy region (location).
 */
@Fluent
public interface GeographicLocation extends HasName, HasInner<Region> {
    /**
     * @return the location code.
     */
    String code();
    /**
     * @return list of immediate child locations grouped under this location in the Geographic Hierarchy.
     */
    List<GeographicLocation> childLocations();
    /**
     * @return list of all descendant locations grouped under this location in the Geographic Hierarchy.
     */
    List<GeographicLocation> descendantLocations();
}