package com.restaurante.infrastructure.adapters.in.rest.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.domain.models.Venta;
import com.restaurante.infrastructure.adapters.in.rest.api.VentaApi;
import com.restaurante.infrastructure.adapters.in.rest.controller.mappers.VentaMapperApi;
import com.restaurante.infrastructure.adapters.in.rest.controller.request.VentaRequest;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.ReporteVentasResponse;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.VentaResponse;
import com.restaurante.ports.in.VentaUseCase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/api/venta")
public class VentaController implements VentaApi {
	private final VentaUseCase useCaseVenta;
	private final VentaMapperApi mapperVenta;
	private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

	@Override
	public ResponseEntity<VentaResponse> registrar(VentaRequest request) {
		VentaResponse response = null;
		try {
			Venta venta = mapperVenta.mapperModel(request);
			venta.setFecha(LocalDate.now());
			venta.setHora(formato.format(LocalTime.now()));
			response = mapperVenta.mapperResponse(useCaseVenta.registrar(venta));
			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception e) {
			log.error("VentaController:registrar", e);

			throw e;
		}

	}

	@Override
	public ResponseEntity<List<VentaResponse>> ventasPorRestaurante(Long idRestaurante) {
		List<VentaResponse> response = null;
		try {
			response = mapperVenta.mapperResponse(useCaseVenta.ventasByRestaurante(idRestaurante));
			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception e) {
			log.error("VentaController:ventasPorRestaurante", e);

			throw e;
		}

	}

	@Override
	public ResponseEntity<ReporteVentasResponse> reporteVentas() {
		ReporteVentasResponse response = null;
		try {
			response = mapperVenta.mapperResponse(useCaseVenta.totalVentas());
			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception e) {
			log.error("VentaController:reporteVentas", e);

			throw e;
		}

	}
}
