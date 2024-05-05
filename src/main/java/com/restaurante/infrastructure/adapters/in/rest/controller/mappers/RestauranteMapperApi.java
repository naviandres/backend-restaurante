package com.restaurante.infrastructure.adapters.in.rest.controller.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.restaurante.domain.models.Restaurante;
import com.restaurante.infrastructure.adapters.in.rest.controller.request.RestauranteRequest;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.RestauranteResponse;

@Mapper(componentModel = "spring")
public interface RestauranteMapperApi {
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "owners.id", ignore = true)
	Restaurante mapperModel(RestauranteRequest request);

	RestauranteResponse mapperResponse(Restaurante request);
	
	List<RestauranteResponse> mapperResponse(List<Restaurante> request);

}
