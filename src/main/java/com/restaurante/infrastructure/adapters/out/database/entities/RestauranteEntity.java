package com.restaurante.infrastructure.adapters.out.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "RESTAURANTE")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteEntity {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NOMBRE", length = 50, nullable = false)
	private String nombre;

	@Column(name = "DIRECCION", length = 100, nullable = false)
	private String direccion;
	
	@Column(name = "CIUDAD", length = 50, nullable = false)
	private String ciudad;
	
	@Column(name = "ESTADO", length = 25, nullable = false)
	private String estado;

	@Column(name = "VALOR", nullable = false)
	private Double valor;
}
