// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.SkuDescriptionInner;
import org.junit.jupiter.api.Test;

public final class SkuDescriptionInnerTests {
    @Test
    public void testDeserialize() {
        SkuDescriptionInner model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"bpg\",\"name\":\"ytxhp\",\"tier\":\"bzpfzab\",\"locations\":[\"uhxwtctyqiklbbov\"],\"locationInfo\":[{\"location\":\"zbhvgyuguosv\",\"zones\":[\"ss\",\"qukkfp\",\"gmgsxnkjzkde\"]},{\"location\":\"lpvlopw\",\"zones\":[\"ghxpkdw\",\"baiuebbaumny\"]},{\"location\":\"upedeojnabckhs\",\"zones\":[\"psiebtfhvpes\",\"pskrdqmh\",\"jdhtldwkyzxu\",\"tkncwsc\"]}],\"restrictions\":[]}")
                .toObject(SkuDescriptionInner.class);
    }

    @Test
    public void testSerialize() {
        SkuDescriptionInner model = new SkuDescriptionInner();
        model = BinaryData.fromObject(model).toObject(SkuDescriptionInner.class);
    }
}
