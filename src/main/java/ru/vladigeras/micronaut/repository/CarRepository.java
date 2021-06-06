package ru.vladigeras.micronaut.repository;

import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import java.util.List;
import ru.vladigeras.micronaut.model.entity.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, String> {

	@Query(value = "SELECT c FROM CarEntity c WHERE c.name LIKE CONCAT('%',:name,'%')")
	@Executable
	List<CarEntity> findByName(String name);
}
