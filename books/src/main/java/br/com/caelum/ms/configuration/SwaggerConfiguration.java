package br.com.caelum.ms.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
class SwaggerConfiguration {

    @Bean
    Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .paths(PathSelectors.ant("/books/**"))
            .build();
    }

}
