// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

/** Samples for SapVirtualInstances Start. */
public final class SapVirtualInstancesStartSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/preview/2022-11-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Start.json
     */
    /**
     * Sample code: SAPVirtualInstances_Start.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPVirtualInstancesStart(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapVirtualInstances().start("test-rg", "X00", com.azure.core.util.Context.NONE);
    }
}
