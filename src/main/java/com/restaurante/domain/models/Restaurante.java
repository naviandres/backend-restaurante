package com.restaurante.domain.models;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurante {
	private Long id;
	private String nombre;
	private String direccion;
	private String ciudad;
	private String estado;
	private Double valor;
	private List<RestauranteOwner> owners;
}
