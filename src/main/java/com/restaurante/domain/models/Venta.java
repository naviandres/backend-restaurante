package com.restaurante.domain.models;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Venta {
	private Long id;
	private Double valor;
	private LocalDate fecha;
	private String hora;
	private Long idRestaurante;
}
