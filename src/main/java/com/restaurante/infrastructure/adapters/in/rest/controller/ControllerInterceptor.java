package com.restaurante.infrastructure.adapters.in.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.restaurante.aplication.exceptions.RestauranteException;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.ErrorResponse;

@RestControllerAdvice
public class ControllerInterceptor {

	@ExceptionHandler(RestauranteException.class)
	public ResponseEntity<ErrorResponse> handleRestauranteException(RestauranteException ex, WebRequest request) {

		ErrorResponse response = new ErrorResponse(true, ex.getMessage());
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleException(Exception ex, WebRequest request) {

		ErrorResponse response = new ErrorResponse(true, "Error al procesar solicitud");
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
