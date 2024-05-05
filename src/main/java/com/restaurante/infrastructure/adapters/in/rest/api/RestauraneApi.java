package com.restaurante.infrastructure.adapters.in.rest.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.infrastructure.adapters.in.rest.controller.request.RestauranteRequest;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.RestauranteResponse;

@RestController
public interface RestauraneApi {
	
	@PostMapping("/registrar")
	public ResponseEntity<RestauranteResponse> registrar(@RequestBody RestauranteRequest request);
	
	@GetMapping("/restaurantes-owner")
	public ResponseEntity<List<RestauranteResponse>> restaurantesOwner(@RequestParam  Long idOwner);
}
