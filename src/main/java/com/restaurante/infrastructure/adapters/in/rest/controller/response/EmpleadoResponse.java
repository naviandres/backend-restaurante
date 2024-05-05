package com.restaurante.infrastructure.adapters.in.rest.controller.response;


import lombok.Data;

@Data
public class EmpleadoResponse{
	private Long id;
	private String documento;
	private String nombre;
	private Double sueldo;
	private String estado;
	private Long idRestaurante;
}
