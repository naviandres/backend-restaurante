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

@Table(name = "DUENO")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OwnerEntity {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "DOCUMENTO", length = 50, nullable = false)
	private String documento;

	@Column(name = "NOMBRE", length = 50, nullable = false)
	private String nombre;
	
	@Column(name = "ESTADO", length = 25, nullable = false)
	private String estado;
}
