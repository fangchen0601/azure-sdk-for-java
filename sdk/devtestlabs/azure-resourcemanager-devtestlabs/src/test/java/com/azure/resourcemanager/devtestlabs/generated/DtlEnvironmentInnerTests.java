// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.DtlEnvironmentInner;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentDeploymentProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DtlEnvironmentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DtlEnvironmentInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"deploymentProperties\":{\"armTemplateId\":\"xgkn\",\"parameters\":[]},\"armTemplateDisplayName\":\"inzqodfvpgs\",\"resourceGroupId\":\"xgsg\",\"createdByUser\":\"fgzdjtxvz\",\"provisioningState\":\"bqvgaqv\",\"uniqueIdentifier\":\"a\"},\"location\":\"cqusr\",\"tags\":{\"wsdtutnwl\":\"t\",\"vekdxukuqgsjjxu\":\"uycvuzhyrmewip\",\"hvvmuvgpmun\":\"dxgketwzhhzjhfj\"},\"id\":\"qsxvmhf\",\"name\":\"uzjyihsasbhudypo\",\"type\":\"yue\"}")
                .toObject(DtlEnvironmentInner.class);
        Assertions.assertEquals("cqusr", model.location());
        Assertions.assertEquals("t", model.tags().get("wsdtutnwl"));
        Assertions.assertEquals("xgkn", model.deploymentProperties().armTemplateId());
        Assertions.assertEquals("inzqodfvpgs", model.armTemplateDisplayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DtlEnvironmentInner model =
            new DtlEnvironmentInner()
                .withLocation("cqusr")
                .withTags(
                    mapOf("wsdtutnwl", "t", "vekdxukuqgsjjxu", "uycvuzhyrmewip", "hvvmuvgpmun", "dxgketwzhhzjhfj"))
                .withDeploymentProperties(
                    new EnvironmentDeploymentProperties().withArmTemplateId("xgkn").withParameters(Arrays.asList()))
                .withArmTemplateDisplayName("inzqodfvpgs");
        model = BinaryData.fromObject(model).toObject(DtlEnvironmentInner.class);
        Assertions.assertEquals("cqusr", model.location());
        Assertions.assertEquals("t", model.tags().get("wsdtutnwl"));
        Assertions.assertEquals("xgkn", model.deploymentProperties().armTemplateId());
        Assertions.assertEquals("inzqodfvpgs", model.armTemplateDisplayName());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
