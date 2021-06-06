package ru.vladigeras.micronaut.service.impl;

import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.toList;
import java.util.List;
import javax.inject.Singleton;
import lombok.RequiredArgsConstructor;
import ru.vladigeras.micronaut.mapper.CarMapper;
import ru.vladigeras.micronaut.model.dto.Car;
import ru.vladigeras.micronaut.model.dto.CreateCarRequest;
import ru.vladigeras.micronaut.repository.CarRepository;
import ru.vladigeras.micronaut.service.CarService;

@RequiredArgsConstructor
@Singleton
public class CarServiceImpl implements CarService {

	private final CarRepository carRepository;
	private final CarMapper carMapper;

	@Override
	public List<Car> get(String name) {
		var result = nonNull(name) ? carRepository.findByName(name)
			: carRepository.findAll();
		return result.stream().map(carMapper::map).collect(toList());
	}

	@Override
	public void save(CreateCarRequest createCarRequest) {
		carRepository.save(carMapper.map(createCarRequest));
	}

	@Override
	public void delete(String id) {
		carRepository.deleteById(id);
	}
}
