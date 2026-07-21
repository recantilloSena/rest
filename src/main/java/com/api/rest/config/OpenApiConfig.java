package com.api.rest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Mi API REST")
                .version("1.0.0")
                .description("Descripción de mi API")
                .contact(new Contact()
                    .name("ADSO 19")
                    .email("adso19_cnca@email.com")));
    }
}
