package com.restaurante.infrastructure.adapters.in.rest.controller.response;

import lombok.Data;

@Data
public class OwnerResponse{
	private Long id;
	private String documento;
	private String nombre;
	private String estado;	
}
