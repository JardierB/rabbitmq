package com.producers.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Producer Service API",
                version = "1.0",
                description = "Documentação da API de produtores"
        )
)
public class SwaggerConfig {


}
