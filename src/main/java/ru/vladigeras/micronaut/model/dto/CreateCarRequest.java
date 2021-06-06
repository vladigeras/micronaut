package ru.vladigeras.micronaut.model.dto;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateCarRequest {

	private String name;
	private BigDecimal price;
}
