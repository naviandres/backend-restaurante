package com.restaurante.infrastructure.adapters.out.database.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.restaurante.domain.models.Venta;
import com.restaurante.infrastructure.adapters.out.database.entities.VentaEntity;


@Mapper(componentModel = "spring")
public interface VentaMapper {
	
	@Mapping(source = "idRestaurante", target = "restauranteEntity.id")
	VentaEntity mapperEntity(Venta venta);
	
	@Mapping(source = "restauranteEntity.id", target = "idRestaurante")
	Venta mapperDomain(VentaEntity venta);
	
	@Mapping(source = "restauranteEntity.id", target = "idRestaurante")
	List<Venta> mapperDomain(List<VentaEntity> venta);
}
