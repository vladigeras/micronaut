package ru.vladigeras.micronaut.service;

import java.util.List;
import ru.vladigeras.micronaut.model.dto.Car;
import ru.vladigeras.micronaut.model.dto.CreateCarRequest;

public interface CarService {

	List<Car> get(String name);

	void save(CreateCarRequest createCarRequest);

	void delete(String id);
}
