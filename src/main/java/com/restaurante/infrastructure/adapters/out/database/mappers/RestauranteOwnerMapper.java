package com.restaurante.infrastructure.adapters.out.database.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.restaurante.domain.models.RestauranteOwner;
import com.restaurante.infrastructure.adapters.out.database.entities.RestauranteOwnerEntity;

@Mapper(componentModel = "spring")
public interface RestauranteOwnerMapper {
	@Mapping(source = "idRestaurante", target = "restauranteEntity.id")
	@Mapping(source = "idDueno", target = "ownerEntity.id")
	RestauranteOwnerEntity mapperEntity(RestauranteOwner request);

	@Mapping(source = "idRestaurante", target = "restauranteEntity.id")
	@Mapping(source = "idDueno", target = "ownerEntity.id")
	List<RestauranteOwnerEntity> mapperEntity(List<RestauranteOwner> request);

	@Mapping(source = "restauranteEntity.id", target = "idRestaurante")
	@Mapping(source = "ownerEntity.id", target = "idDueno")
	RestauranteOwner mapperDomain(RestauranteOwnerEntity request);
	
	@Mapping(source = "restauranteEntity.id", target = "idRestaurante")
	@Mapping(source = "ownerEntity.id", target = "idDueno")
	List<RestauranteOwner> mapperDomain(List<RestauranteOwnerEntity> request);
}
