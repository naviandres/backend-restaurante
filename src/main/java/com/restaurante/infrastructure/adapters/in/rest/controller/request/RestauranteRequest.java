package com.restaurante.infrastructure.adapters.in.rest.controller.request;

import java.util.List;

import lombok.Data;

@Data
public class RestauranteRequest {
	private String nombre;
	private String direccion;
	private String ciudad;
	private String estado;
	private Double valor;
	
	private List<RestauranteOwnerRequest> owners;
}
