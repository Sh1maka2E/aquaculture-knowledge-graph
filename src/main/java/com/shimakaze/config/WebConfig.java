package com.shimakaze.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 22:07:15
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    /**
     * 静态资源映射
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/knowledge-graph/**").addResourceLocations("classpath:/knowledge-graph/");
    }
}
