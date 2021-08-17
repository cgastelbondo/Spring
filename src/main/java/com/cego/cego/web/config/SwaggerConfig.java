package com.cego.cego.web.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket Api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cego.cego.web.controller"))
                .build()
                .apiInfo(getapiinfo());
    }

    private ApiInfo getapiinfo(){
        return new ApiInfo(
                "SAGA",
                "API REST Ejemplo",
                "1.0.0",
                "",
                new Contact("Atencion Ciudadano", "https://Admin@cfjcs.net", "centrodefusion.jina@armada.mil.co"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList()
        );

    }

}
