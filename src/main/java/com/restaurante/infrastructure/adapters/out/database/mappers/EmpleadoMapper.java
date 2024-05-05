package com.restaurante.infrastructure.adapters.out.database.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.restaurante.domain.models.Empleado;
import com.restaurante.infrastructure.adapters.out.database.entities.EmpleadoEntity;

@Mapper(componentModel = "spring")
public interface EmpleadoMapper {
	
	@Mapping(source = "restauranteEntity.id", target = "idRestaurante")
	List<Empleado> mapperDomain(List<EmpleadoEntity> empleados);
}
