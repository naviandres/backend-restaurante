package com.restaurante.infrastructure.adapters.in.rest.controller.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.restaurante.domain.models.Venta;
import com.restaurante.infrastructure.adapters.in.rest.controller.request.VentaRequest;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.ReporteVentasResponse;
import com.restaurante.infrastructure.adapters.in.rest.controller.response.VentaResponse;

@Mapper(componentModel = "spring")
public interface VentaMapperApi {

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "fecha", ignore = true)
	@Mapping(target = "hora", ignore = true)
	Venta mapperModel(VentaRequest request);

	VentaResponse mapperResponse(Venta request);

	List<VentaResponse> mapperResponse(List<Venta> request);

	@Mapping(target = "total", source = "totalVentas")
	ReporteVentasResponse mapperResponse(Double totalVentas);
}
