package com.restaurante.infrastructure.adapters.in.rest.controller.request;




import lombok.Data;

@Data
public class VentaRequest {
	private Double valor;
	private Long idRestaurante;
}
