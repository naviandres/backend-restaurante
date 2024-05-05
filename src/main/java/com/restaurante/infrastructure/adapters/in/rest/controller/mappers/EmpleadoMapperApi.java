package com.restaurante.infrastructure.adapters.in.rest.controller.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.restaurante.domain.models.Empleado;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.EmpleadoResponse;

@Mapper(componentModel = "spring")
public interface EmpleadoMapperApi {
	List<EmpleadoResponse> mapperResponse(List<Empleado> request);
}
