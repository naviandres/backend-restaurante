package com.restaurante.infrastructure.adapters.in.rest.controller.response;

import lombok.Data;

@Data
public class RestauranteOwnerResponse {
	private Long id;
	private Long idRestaurante;
	private Long idDueno;
	private double comision;
}
