package com.test.bpt.model;

import org.alfresco.service.namespace.QName;

/**
 * 
 * TODO: Change the name to something other than SampleContentModel
 *
 */
public class SampleContentModel {
    public final static String NAMESPACE_URI = "http://www.ixxus.co.uk/model/bptest/1.0";
    public final static String NAMESPACE_PREFIX = "bpt";

    public static final class SampleAspect {
        public static final QName ASPECT = bpt("sampleAspect");

        private SampleAspect() {
        }

        public static final class Prop {
            private Prop() {
            }
            
            public static final QName SAMPLE_ASPECT_PROPERTY = bpt("sampleAspectProperty");
        }
    }

    public static final class SampleType {
    	public static final QName TYPE = bpt("sampleType");

    	private SampleType() {
    	}

    	public static final class Prop {
            private Prop() {
            }
            
            public static final QName SAMPLE_TYPE_PROPERTY = bpt("sampleTypeProperty");
        }
    }
    
    public static QName bpt(final String qname) {
        return QName.createQName(NAMESPACE_URI, qname);
    }
}