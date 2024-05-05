package com.restaurante.infrastructure.adapters.out.database.entities;

import java.time.LocalDate;

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

@Table(name = "VENTA")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VentaEntity {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "VALOR", nullable = false)
	private Double valor;

	@Column(name = "FECHA", nullable = false)
	private LocalDate fecha;

	@Column(name = "HORA", length = 15, nullable = false)
	private String hora;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_RESTAURANTE", foreignKey = @ForeignKey(name = "FK_VENTA_RESTAURANTE"))
	private RestauranteEntity restauranteEntity;
}
