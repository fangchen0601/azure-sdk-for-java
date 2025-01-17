// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Availability group configuration. */
@Fluent
public final class AgConfiguration {
    /*
     * Replica configurations.
     */
    @JsonProperty(value = "replicas")
    private List<AgReplica> replicas;

    /**
     * Get the replicas property: Replica configurations.
     *
     * @return the replicas value.
     */
    public List<AgReplica> replicas() {
        return this.replicas;
    }

    /**
     * Set the replicas property: Replica configurations.
     *
     * @param replicas the replicas value to set.
     * @return the AgConfiguration object itself.
     */
    public AgConfiguration withReplicas(List<AgReplica> replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (replicas() != null) {
            replicas().forEach(e -> e.validate());
        }
    }
}
