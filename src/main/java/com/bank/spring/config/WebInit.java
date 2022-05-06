package com.bank.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
//        return new Class[]{JpaConfig.class};
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{JpaConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
