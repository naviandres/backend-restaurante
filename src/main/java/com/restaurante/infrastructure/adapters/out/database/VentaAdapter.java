package com.restaurante.infrastructure.adapters.out.database;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurante.aplication.exceptions.RestauranteException;
import com.restaurante.domain.models.Venta;
import com.restaurante.infrastructure.adapters.out.database.mappers.VentaMapper;
import com.restaurante.infrastructure.adapters.out.database.repository.VentaRepository;
import com.restaurante.infrastructure.ports.out.VentaPort;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class VentaAdapter implements VentaPort {
	private final VentaRepository repository;
	private final VentaMapper mapper;

	@Override
	public Venta registrar(Venta venta) {
		Venta response = null;
		try {
			response = mapper.mapperDomain(repository.save(mapper.mapperEntity(venta)));
		} catch (Exception e) {
			log.error("RestauranteOwner:registrar", e);
			throw new RestauranteException("Ocurrió un error al registrar venta.");
		}
		return response;
	}

	@Override
	public List<Venta> ventasByRestaurante(Long idRestaurante) {
		List<Venta> response = null;
		try {
			response = mapper.mapperDomain(repository.findSalesByRestaurant(idRestaurante));
		} catch (Exception e) {
			log.error("RestauranteOwner:registrar", e);
			throw new RestauranteException("Ocurrió un error al buscar ventas por restaurante.");
		}
		return response;
	}

	@Override
	public Double totalVentas() {
		Double total = 0.0;
		try {
			 total = repository.totalSales();
		} catch (Exception e) {
			throw new RestauranteException("Ocurrió un error al obtener total ventas.");
		}
		return total;
	}

}
