package com.restaurante.domain.models;


import lombok.Data;

@Data
public class Owner {
	private Long id;
	private String documento;
	private String nombre;
	private String estado;
	
}
