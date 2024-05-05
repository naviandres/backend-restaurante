package com.restaurante.infrastructure.adapters.in.rest.controller.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
	private boolean error;
	private String mensaje;
}
