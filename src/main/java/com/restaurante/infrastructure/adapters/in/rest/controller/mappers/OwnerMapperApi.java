package com.restaurante.infrastructure.adapters.in.rest.controller.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.restaurante.domain.models.Owner;
import com.restaurante.infrastructure.adapters.in.rest.controller.request.OwnerRequest;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.OwnerResponse;

@Mapper(componentModel = "spring")
public interface OwnerMapperApi {

	@Mapping(target = "id", ignore = true)
	Owner mapperModel(OwnerRequest request);

	OwnerResponse mapperResponse(Owner request);
}
