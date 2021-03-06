/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile of network configuration.
 */
public class ContainerServiceNetworkProfile {
    /**
     * Network plugin used for building Kubernetes network. Possible values
     * include: 'azure', 'kubenet'.
     */
    @JsonProperty(value = "networkPlugin")
    private NetworkPlugin networkPlugin;

    /**
     * Network policy used for building Kubernetes network. Possible values
     * include: 'calico'.
     */
    @JsonProperty(value = "networkPolicy")
    private NetworkPolicy networkPolicy;

    /**
     * A CIDR notation IP range from which to assign pod IPs when kubenet is
     * used.
     */
    @JsonProperty(value = "podCidr")
    private String podCidr;

    /**
     * A CIDR notation IP range from which to assign service cluster IPs. It
     * must not overlap with any Subnet IP ranges.
     */
    @JsonProperty(value = "serviceCidr")
    private String serviceCidr;

    /**
     * An IP address assigned to the Kubernetes DNS service. It must be within
     * the Kubernetes service address range specified in serviceCidr.
     */
    @JsonProperty(value = "dnsServiceIP")
    private String dnsServiceIP;

    /**
     * A CIDR notation IP range assigned to the Docker bridge network. It must
     * not overlap with any Subnet IP ranges or the Kubernetes service address
     * range.
     */
    @JsonProperty(value = "dockerBridgeCidr")
    private String dockerBridgeCidr;

    /**
     * Get the networkPlugin value.
     *
     * @return the networkPlugin value
     */
    public NetworkPlugin networkPlugin() {
        return this.networkPlugin;
    }

    /**
     * Set the networkPlugin value.
     *
     * @param networkPlugin the networkPlugin value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withNetworkPlugin(NetworkPlugin networkPlugin) {
        this.networkPlugin = networkPlugin;
        return this;
    }

    /**
     * Get the networkPolicy value.
     *
     * @return the networkPolicy value
     */
    public NetworkPolicy networkPolicy() {
        return this.networkPolicy;
    }

    /**
     * Set the networkPolicy value.
     *
     * @param networkPolicy the networkPolicy value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withNetworkPolicy(NetworkPolicy networkPolicy) {
        this.networkPolicy = networkPolicy;
        return this;
    }

    /**
     * Get the podCidr value.
     *
     * @return the podCidr value
     */
    public String podCidr() {
        return this.podCidr;
    }

    /**
     * Set the podCidr value.
     *
     * @param podCidr the podCidr value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withPodCidr(String podCidr) {
        this.podCidr = podCidr;
        return this;
    }

    /**
     * Get the serviceCidr value.
     *
     * @return the serviceCidr value
     */
    public String serviceCidr() {
        return this.serviceCidr;
    }

    /**
     * Set the serviceCidr value.
     *
     * @param serviceCidr the serviceCidr value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }

    /**
     * Get the dnsServiceIP value.
     *
     * @return the dnsServiceIP value
     */
    public String dnsServiceIP() {
        return this.dnsServiceIP;
    }

    /**
     * Set the dnsServiceIP value.
     *
     * @param dnsServiceIP the dnsServiceIP value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withDnsServiceIP(String dnsServiceIP) {
        this.dnsServiceIP = dnsServiceIP;
        return this;
    }

    /**
     * Get the dockerBridgeCidr value.
     *
     * @return the dockerBridgeCidr value
     */
    public String dockerBridgeCidr() {
        return this.dockerBridgeCidr;
    }

    /**
     * Set the dockerBridgeCidr value.
     *
     * @param dockerBridgeCidr the dockerBridgeCidr value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withDockerBridgeCidr(String dockerBridgeCidr) {
        this.dockerBridgeCidr = dockerBridgeCidr;
        return this;
    }

}
