package ru.vladigeras.micronaut.controller;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.QueryValue;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import java.util.List;
import javax.inject.Inject;
import ru.vladigeras.micronaut.model.dto.Car;
import ru.vladigeras.micronaut.model.dto.CreateCarRequest;
import ru.vladigeras.micronaut.service.CarService;

//@RequiredArgsConstructor
@Controller("/api/v1/cars")
public class CarController {

	@Inject
	private final CarService carService;

	public CarController(CarService carService) {
		this.carService = carService;
	}

	@Get
	@Operation(summary = "Get cars")
	public List<Car> get(@Parameter(name = "car name") @Nullable @QueryValue String name) {
		return carService.get(name);
	}

	@Post
	@Operation(summary = "Save car")
	void save(@Body CreateCarRequest createCarRequest) {
		carService.save(createCarRequest);
	}

	@Delete("/{id}")
	@Operation(summary = "Delete car")
	void delete(@PathVariable(name = "id") String id) {
		carService.delete(id);
	}
}