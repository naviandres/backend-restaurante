package com.restaurante.infrastructure.adapters.in.rest.controller.request;

import lombok.Data;

@Data
public class OwnerRequest {
	private String documento;
	private String nombre;
	private String estado;	
}
