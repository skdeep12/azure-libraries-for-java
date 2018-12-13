/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.management.network.EffectiveRoute;
import java.util.List;

/**
 * Response for list effective route API service call.
 */
public final class EffectiveRouteListResultInner {
    /**
     * A list of effective routes.
     */
    @JsonProperty(value = "value")
    private List<EffectiveRoute> value;

    /**
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public List<EffectiveRoute> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set.
     * @return the EffectiveRouteListResultInner object itself.
     */
    public EffectiveRouteListResultInner withValue(List<EffectiveRoute> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }
}