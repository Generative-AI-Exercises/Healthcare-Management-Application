package com.apmanager.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
/**
 * Documentation of API REST in Swagger using SpringFox.
 * HTML: http://localhost:8080/swagger-ui/
 * @author Pedro Arango
 *
 */
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(infoDetails())
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo infoDetails() {
		return new ApiInfo("Appoinments Manager API REST"
				,"Docs for API REST",
				"1.0",
				"https://github.com/parangos12",
				new Contact("Pedro A.", "https://github.com/parangos12", "parangos@eafit.edu.co"),
				"OpenBootcamp",
				"https://campus.open-bootcamp.com/",
				Collections.emptyList()
				);
	}
	
}
