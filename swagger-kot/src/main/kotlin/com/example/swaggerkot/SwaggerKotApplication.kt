package com.example.swaggerkot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
class SwaggerKotApplication

fun main(args: Array<String>) {
	runApplication<SwaggerKotApplication>(*args)

	@Bean
	fun userAPI(): Docket? {
		return Docket(DocumentationType.SWAGGER_2).select()
			.apis(RequestHandlerSelectors.any())
			.paths(PathSelectors.any()).build()
	}
}
