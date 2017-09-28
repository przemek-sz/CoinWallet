package com.szczerbap.coinwallet.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Przemek on 28.09.2017.
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[] { RootConfig.class };
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[] { WebConfig.class };
        }

        @Override
        protected String[] getServletMappings() {
            return new String[] { "/" };
        }


}
