package ru.vladigeras.micronaut.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.vladigeras.micronaut.model.dto.Car;
import ru.vladigeras.micronaut.model.dto.CreateCarRequest;
import ru.vladigeras.micronaut.model.entity.CarEntity;

@Mapper
public interface CarMapper {

	@Mapping(target = "id", source = "id")
	@Mapping(target = "createdAt", source = "createdAt")
	@Mapping(target = "name", source = "name")
	@Mapping(target = "price", source = "price")
	@BeanMapping(ignoreByDefault = true)
	Car map(CarEntity car);

	@Mapping(target = "name", source = "name")
	@Mapping(target = "price", source = "price")
	@BeanMapping(ignoreByDefault = true)
	CarEntity map(CreateCarRequest car);
}
