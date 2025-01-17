// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.ImageListResult;
import org.junit.jupiter.api.Test;

public final class ImageListResultTests {
    @Test
    public void testDeserialize() {
        ImageListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"description\":\"tbzaqsqsycbkbfk\",\"publisher\":\"kdkexxp\",\"offer\":\"fmxa\",\"sku\":\"fjpgddtocjjxhvp\",\"provisioningState\":\"Creating\"},\"id\":\"hd\",\"name\":\"xibqeojnx\",\"type\":\"bzv\"},{\"properties\":{\"description\":\"t\",\"publisher\":\"deicbtwnpzao\",\"offer\":\"uhrhcffcyddgl\",\"sku\":\"t\",\"provisioningState\":\"Accepted\"},\"id\":\"pyeicxm\",\"name\":\"ciwqvhk\",\"type\":\"ixuigdtopbobj\"},{\"properties\":{\"description\":\"m\",\"publisher\":\"u\",\"offer\":\"a\",\"sku\":\"rzayv\",\"provisioningState\":\"TransientFailure\"},\"id\":\"dfgiot\",\"name\":\"ftutqxlngxlefgu\",\"type\":\"nxkrx\"},{\"properties\":{\"description\":\"i\",\"publisher\":\"thz\",\"offer\":\"qdrabhjybigehoqf\",\"sku\":\"wska\",\"provisioningState\":\"TransientFailure\"},\"id\":\"lcuiywgqywgndr\",\"name\":\"ynhz\",\"type\":\"pphrcgynco\"}],\"nextLink\":\"ecfvmm\"}")
                .toObject(ImageListResult.class);
    }

    @Test
    public void testSerialize() {
        ImageListResult model = new ImageListResult();
        model = BinaryData.fromObject(model).toObject(ImageListResult.class);
    }
}
