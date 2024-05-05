package com.restaurante.infrastructure.adapters.in.rest.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.infrastructure.adapters.in.rest.controller.request.VentaRequest;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.ReporteVentasResponse;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.VentaResponse;



@RestController

public interface VentaApi {

	@PostMapping("/registrar")
	public ResponseEntity<VentaResponse> registrar(@RequestBody VentaRequest request);
	
	@GetMapping("/ventas-restaurante")
	public ResponseEntity<List<VentaResponse>> ventasPorRestaurante(@RequestParam  Long idRestaurante);
	
	@GetMapping("/reporte")
	public ResponseEntity<ReporteVentasResponse> reporteVentas();
}
