package com.restaurante.infrastructure.adapters.in.rest.controller.response;

import java.util.List;


import lombok.Data;

@Data
public class RestauranteResponse {
	private Long id;
	private String nombre;
	private String direccion;
	private String ciudad;
	private String estado;
	private Double valor;
	
	private List<RestauranteOwnerResponse> owners;
}
