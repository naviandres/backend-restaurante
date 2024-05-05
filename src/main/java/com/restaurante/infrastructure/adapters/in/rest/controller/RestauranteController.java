package com.restaurante.infrastructure.adapters.in.rest.controller;

import org.springframework.http.ResponseEntity;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.infrastructure.adapters.in.rest.api.RestauraneApi;
import com.restaurante.infrastructure.adapters.in.rest.controller.mappers.RestauranteMapperApi;
import com.restaurante.infrastructure.adapters.in.rest.controller.request.RestauranteRequest;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.RestauranteResponse;
import com.restaurante.ports.in.RestauranteUseCase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/api/restaurante")
public class RestauranteController implements RestauraneApi {

	private final RestauranteUseCase useCaseRestaurante;
	private final RestauranteMapperApi mapperRestaurante;

	@Override
	public ResponseEntity<RestauranteResponse> registrar(RestauranteRequest request) {
		RestauranteResponse response = null;
		try {
			response = mapperRestaurante
					.mapperResponse(useCaseRestaurante.registrar(mapperRestaurante.mapperModel(request)));
			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception e) {
			log.error("RestauranteController:registrar", e);

			throw e;
		}
	}

	@Override
	public ResponseEntity<List<RestauranteResponse>> restaurantesOwner(Long idOwner) {
		List<RestauranteResponse> response = null;
		try {
			response = mapperRestaurante.mapperResponse(useCaseRestaurante.restaurantesByOwner(idOwner));
			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception e) {
			log.error("RestauranteController:restaurantesOwner", e);

			throw e;
		}
	}

}
