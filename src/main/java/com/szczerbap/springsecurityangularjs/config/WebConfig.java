package com.szczerbap.springsecurityangularjs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Przemek on 28.09.2017.
 */
@Configuration
@ComponentScan({"com.szczerbap.springsecurityangularjs"})
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
        registry.addResourceHandler("/partials/**").addResourceLocations("/static/partials/");
        registry.addResourceHandler("/controller/**").addResourceLocations("/app/controller/");
    }


}
