package com.restaurante.infrastructure.adapters.out.database;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurante.aplication.exceptions.RestauranteException;
import com.restaurante.domain.models.Empleado;
import com.restaurante.infrastructure.adapters.out.database.mappers.EmpleadoMapper;
import com.restaurante.infrastructure.adapters.out.database.repository.EmpleadoRepository;
import com.restaurante.infrastructure.ports.out.EmpleadoPort;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class EmpleadoAdapter implements EmpleadoPort {
	private final EmpleadoRepository repository;
	private final EmpleadoMapper mapper;

	@Override
	public List<Empleado> empleadosByRestaurante(Long idRestaurante) {
		List<Empleado> response = null;
		try {
			response = mapper.mapperDomain(repository.findEmployesByRestaurant(idRestaurante));
		} catch (Exception e) {
			log.error("Empleado:empleadosByRestaurante", e);
			throw new RestauranteException("Ocurrió un error al obtener restaurante.");
		}

		return response;
	}

}
