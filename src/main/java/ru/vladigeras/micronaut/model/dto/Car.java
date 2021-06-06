package ru.vladigeras.micronaut.model.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Car {

	private String id;
	private OffsetDateTime createdAt;
	private String name;
	private BigDecimal price;
}
