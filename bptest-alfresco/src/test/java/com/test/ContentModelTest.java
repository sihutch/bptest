package com.test;

import org.junit.Test;

import com.ixxus.test.AlfrescoTestUtils;

public class ContentModelTest {

    @Test
    public void testBootstrapModel() throws Exception {
        AlfrescoTestUtils.testBootstrapModel("alfresco/module/bptest/model/content-model.xml");
    }
}