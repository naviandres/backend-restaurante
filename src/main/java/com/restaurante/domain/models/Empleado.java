package com.restaurante.domain.models;

import lombok.Data;

@Data
public class Empleado {
	private Long id;
	private String documento;
	private String nombre;
	private Double sueldo;
	private String estado;
	private Long idRestaurante;
}
