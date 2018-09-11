/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application Gateway autoscale bounds on number of Application Gateway
 * instance.
 */
public class ApplicationGatewayAutoscaleBounds {
    /**
     * Lower bound on number of Application Gateway instances.
     */
    @JsonProperty(value = "min", required = true)
    private int min;

    /**
     * Upper bound on number of Application Gateway instances.
     */
    @JsonProperty(value = "max", required = true)
    private int max;

    /**
     * Get the min value.
     *
     * @return the min value
     */
    public int min() {
        return this.min;
    }

    /**
     * Set the min value.
     *
     * @param min the min value to set
     * @return the ApplicationGatewayAutoscaleBounds object itself.
     */
    public ApplicationGatewayAutoscaleBounds withMin(int min) {
        this.min = min;
        return this;
    }

    /**
     * Get the max value.
     *
     * @return the max value
     */
    public int max() {
        return this.max;
    }

    /**
     * Set the max value.
     *
     * @param max the max value to set
     * @return the ApplicationGatewayAutoscaleBounds object itself.
     */
    public ApplicationGatewayAutoscaleBounds withMax(int max) {
        this.max = max;
        return this;
    }

}