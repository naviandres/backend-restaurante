package com.restaurante.infrastructure.adapters.in.rest.controller.request;

import lombok.Data;

@Data
public class RestauranteOwnerRequest {
	private Long idRestaurante;
	private Long idDueno;
	private double comision;
}
