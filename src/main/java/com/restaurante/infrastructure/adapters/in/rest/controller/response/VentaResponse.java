package com.restaurante.infrastructure.adapters.in.rest.controller.response;


import lombok.Data;

@Data
public class VentaResponse {
	private Long id;
	private Double valor;
	private String fecha;
	private String hora;
	private Long idRestaurante;
}
