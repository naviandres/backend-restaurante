package com.restaurante.infrastructure.adapters.in.rest.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.restaurante.infrastructure.adapters.in.rest.controller.response.EmpleadoResponse;

public interface EmpleadoApi {
	@GetMapping("/empleados-restaurante")
	public ResponseEntity<List<EmpleadoResponse>> ventasPorRestaurante(@RequestParam  Long idRestaurante);
}
