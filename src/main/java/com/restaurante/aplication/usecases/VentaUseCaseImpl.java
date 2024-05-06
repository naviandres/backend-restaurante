package com.restaurante.aplication.usecases;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurante.domain.models.Venta;
import com.restaurante.infrastructure.adapters.out.database.VentaAdapter;
import com.restaurante.infrastructure.ports.in.VentaUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VentaUseCaseImpl implements VentaUseCase{

	private final VentaAdapter port;

	@Override
	public Venta registrar(Venta venta) {
		
		return port.registrar(venta);
	}

	@Override
	public List<Venta> ventasByRestaurante(Long idRestaurante) {
		return port.ventasByRestaurante(idRestaurante);
	}

	@Override
	public Double totalVentas() {
		return port.totalVentas();
	}
}
