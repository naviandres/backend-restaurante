package com.restaurante.infrastructure.adapters.out.database;

import org.springframework.stereotype.Service;

import com.restaurante.aplication.exceptions.RestauranteException;
import com.restaurante.domain.models.Restaurante;
import com.restaurante.infrastructure.adapters.out.database.mappers.RestauranteMapper;
import com.restaurante.infrastructure.adapters.out.database.repository.RestauranteRepository;
import com.restaurante.infrastructure.ports.out.RestaurantePort;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class RestauranteAdapter implements RestaurantePort {

	private final RestauranteRepository repository;
	private final RestauranteMapper mapper;

	@Override
	public Restaurante registrar(Restaurante restaurante) {
		Restaurante response = null;
		try {
			 response = mapper.mapperDomain(repository.save(mapper.mapperEntity(restaurante)));
		} catch (Exception e) {
			log.error("Restaurante:registrar", e);
			throw new RestauranteException("Ocurrió un error al registrar restaurante.");

		}
		return response;
	}

}
