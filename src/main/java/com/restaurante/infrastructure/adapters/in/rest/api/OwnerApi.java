package com.restaurante.infrastructure.adapters.in.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.infrastructure.adapters.in.rest.controller.request.OwnerRequest;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.OwnerResponse;

@RestController
public interface OwnerApi {

	@PostMapping("/registrar")
	public ResponseEntity<OwnerResponse> registrar(@RequestBody OwnerRequest request);
}
