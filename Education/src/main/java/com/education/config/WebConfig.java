package com.education.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000", "http://localhost:3001")  // Specify your frontend's origin
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")  // Allow specific HTTP methods
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
