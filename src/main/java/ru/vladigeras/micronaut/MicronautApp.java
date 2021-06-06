package ru.vladigeras.micronaut;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
	info = @Info(
		title = "micronaut-app",
		version = "1.0.0"
	)
)
public class MicronautApp {

	public static void main(String[] args) {
		Micronaut.run(MicronautApp.class, args);
	}
}
