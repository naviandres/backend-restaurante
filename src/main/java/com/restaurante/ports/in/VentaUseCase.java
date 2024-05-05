package com.restaurante.ports.in;

import java.util.List;

import com.restaurante.domain.models.Venta;

public interface VentaUseCase {
	Venta registrar( Venta venta);

	List<Venta> ventasByRestaurante(Long idRestaurante);
	
	Double totalVentas();
}
