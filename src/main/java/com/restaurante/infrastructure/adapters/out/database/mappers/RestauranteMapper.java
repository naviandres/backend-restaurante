package com.restaurante.infrastructure.adapters.out.database.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.restaurante.domain.models.Restaurante;
import com.restaurante.infrastructure.adapters.out.database.entities.RestauranteEntity;

@Mapper(componentModel = "spring")
public interface RestauranteMapper {
	RestauranteEntity mapperEntity(Restaurante restaurante);
	
	@Mapping(target = "owners", ignore = true)
	Restaurante mapperDomain(RestauranteEntity restaurante);

	List<Restaurante> mapperDomain(List<RestauranteEntity> restaurante);
}
