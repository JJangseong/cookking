package com.cookking.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by minsang on 2021/09/26.
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    // TODO : 크로스도메인 = com.cookking.*
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*");
    }
}