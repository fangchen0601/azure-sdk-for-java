// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DppTrackedResourceList model. */
@Fluent
public class DppTrackedResourceList {
    /*
     * The uri to fetch the next page of resources. Call ListNext() fetches next page of resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of DppTrackedResourceList class. */
    public DppTrackedResourceList() {
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of resources. Call ListNext() fetches next page of
     * resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of resources. Call ListNext() fetches next page of
     * resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the DppTrackedResourceList object itself.
     */
    public DppTrackedResourceList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
