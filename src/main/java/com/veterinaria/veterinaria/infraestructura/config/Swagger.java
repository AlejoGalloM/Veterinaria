package com.veterinaria.veterinaria.infraestructura.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger {

    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
            .apis(RequestHandlerSelectors.basePackage("com.veterinaria.veterinaria.infraestructura.controller"))
                .paths(PathSelectors.regex( "/.*"))
                .build().apiInfo(apiEndPointsInfo());

    }

    private ApiInfo apiEndPointsInfo(){
        return new ApiInfoBuilder().title("API de veterinaria")
                .description("Servicio para consultar información relacionada a la veterinaria")
                .contact(new Contact("SW 3", "www.veterinaria.com", "algo@gmail.com"))
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0.0")
                .build();
    }
}
