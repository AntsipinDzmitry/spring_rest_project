package com.dmitryantipin.spring.rest.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Since I am not using a web xml file, I create a class responsible for the web dispatcher servlet

public class myWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{myConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
