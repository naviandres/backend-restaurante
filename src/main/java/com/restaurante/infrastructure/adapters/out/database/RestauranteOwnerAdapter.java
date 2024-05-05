package com.restaurante.infrastructure.adapters.out.database;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurante.aplication.exceptions.RestauranteException;
import com.restaurante.domain.models.Restaurante;
import com.restaurante.domain.models.RestauranteOwner;
import com.restaurante.infrastructure.adapters.out.database.mappers.RestauranteMapper;
import com.restaurante.infrastructure.adapters.out.database.mappers.RestauranteOwnerMapper;
import com.restaurante.infrastructure.adapters.out.database.repository.RestauranteOwnerRepository;
import com.restaurante.ports.out.RestauranteOwnerPort;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class RestauranteOwnerAdapter implements RestauranteOwnerPort {
	private final RestauranteOwnerRepository repository;
	private final RestauranteOwnerMapper mapper;
	private final RestauranteMapper mapperRestaurante;

	@Override
	public RestauranteOwner registrar(RestauranteOwner restauranteOwner) {
		RestauranteOwner response = null;
		try {
			response = mapper.mapperDomain(repository.save(mapper.mapperEntity(restauranteOwner)));
		} catch (Exception e) {
			log.error("RestauranteOwner:registrar", e);
			throw new RestauranteException("Ocurrió un error al registrar restaurnate-owner.");

		}
		return response;
	}

	@Override
	public List<RestauranteOwner> registrarAll(List<RestauranteOwner> restauranteOwner) {
		List<RestauranteOwner> response = null;
		try {
			response = mapper.mapperDomain(repository.saveAll(mapper.mapperEntity(restauranteOwner)));
		} catch (Exception e) {
			log.error("RestauranteOwner:registrarAll", e);
			new RestauranteException("Ocurrió un error al obenet restaurnate-dueño.");
		}
		return response;
	}

	@Override
	public List<Restaurante> restaurantesByOwner(Long idOwer) {
		List<Restaurante> response = null;
		try {
			response = mapperRestaurante.mapperDomain(repository.findRestaurantstnByOwner(idOwer));
		} catch (Exception e) {
			log.error("RestauranteOwner:restaurantesByOwner", e);
			new RestauranteException("Ocurrió un error al obtener restaurantes por dueño.");

		}
		return response;
	}

}
