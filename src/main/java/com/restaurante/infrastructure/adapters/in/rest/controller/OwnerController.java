package com.restaurante.infrastructure.adapters.in.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.infrastructure.adapters.in.rest.api.OwnerApi;
import com.restaurante.infrastructure.adapters.in.rest.controller.mappers.OwnerMapperApi;
import com.restaurante.infrastructure.adapters.in.rest.controller.request.OwnerRequest;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.OwnerResponse;
import com.restaurante.ports.in.OwnerUseCase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/api/owner")
public class OwnerController implements OwnerApi {

	private final OwnerUseCase useCaseDueno;
	private final OwnerMapperApi mapperDueno;

	@Override
	public ResponseEntity<OwnerResponse> registrar(OwnerRequest request) {
		OwnerResponse response = null;
		try {
			response = mapperDueno.mapperResponse(useCaseDueno.registrar(mapperDueno.mapperModel(request)));
			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception   e) {
			log.error("OwnerController:registrar", e);

			throw e;

		} 
	}

}
