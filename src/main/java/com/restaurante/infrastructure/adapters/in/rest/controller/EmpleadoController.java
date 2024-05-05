package com.restaurante.infrastructure.adapters.in.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.infrastructure.adapters.in.rest.api.EmpleadoApi;
import com.restaurante.infrastructure.adapters.in.rest.controller.mappers.EmpleadoMapperApi;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.EmpleadoResponse;
import com.restaurante.ports.in.EmpleadoUseCase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/api/empleado")
public class EmpleadoController implements EmpleadoApi {
	private final EmpleadoMapperApi mapperVenta;
	private final EmpleadoUseCase useCase;

	@Override
	public ResponseEntity<List<EmpleadoResponse>> ventasPorRestaurante(Long idRestaurante) {
		List<EmpleadoResponse> response = new ArrayList<EmpleadoResponse>();
		try {
			response = mapperVenta.mapperResponse(useCase.empleadosByRestaurante(idRestaurante));
			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception e) {
			log.error("EmpleadoController:ventasPorRestaurante", e);

			throw e;
		}
	}

}
