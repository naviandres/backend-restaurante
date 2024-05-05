package com.restaurante.infrastructure.adapters.out.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "RESTAURANTE_DUENO")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteOwnerEntity {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_RESTAURANTE", foreignKey = @ForeignKey(name = "FK_RESTAURANTE_DUENO_RESTAURANTE"))
	private RestauranteEntity restauranteEntity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_DUENO", foreignKey = @ForeignKey(name = "FK_RESTAURANTE_DUENO_DUENO"))
	private OwnerEntity ownerEntity;

	@Column(name = "COMISION", nullable = false)
	private Double comision;

}
