package ru.vladigeras.micronaut.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "cars")
public class CarEntity implements Serializable {

	private static final long serialVersionUID = 6846482823816820577L;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String id;

	@Column(name = "title")
	private String name;

	@Column(name = "created_at")
	private OffsetDateTime createdAt;

	@Column(name = "price")
	private BigDecimal price;

	@PrePersist
	void onCreate() {
		createdAt = OffsetDateTime.now();
	}
}
