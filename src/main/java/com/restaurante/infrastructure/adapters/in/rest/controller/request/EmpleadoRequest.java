package com.restaurante.infrastructure.adapters.in.rest.controller.request;

import lombok.Data;

@Data
public class EmpleadoRequest {
	private String documento;
	private String nombre;
	private Double sueldo;
	private String estado;
	private Long idRestaurante;
}
