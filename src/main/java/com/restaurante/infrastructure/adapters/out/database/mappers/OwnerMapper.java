package com.restaurante.infrastructure.adapters.out.database.mappers;

import org.mapstruct.Mapper;

import com.restaurante.domain.models.Owner;
import com.restaurante.infrastructure.adapters.out.database.entities.OwnerEntity;



@Mapper(componentModel = "spring")
public interface OwnerMapper {
	OwnerEntity mapperEntity(Owner owner);
	Owner mapperDomain(OwnerEntity owner);
}
