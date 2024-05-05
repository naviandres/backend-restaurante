package com.restaurante.ports.out;

import java.util.List;

import com.restaurante.domain.models.Venta;

public interface VentaPort {
	Venta registrar( Venta venta);
	
	List<Venta> ventasByRestaurante(Long idRestaurante);
	
	Double totalVentas();
}
