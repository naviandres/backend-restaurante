package com.restaurante.domain.models;

import lombok.Data;

@Data
public class RestauranteOwner {
	private Long id;
	private Long idRestaurante;
	private Long idDueno;
	private double comision;
}
