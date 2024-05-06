package com.restaurante.infrastructure.adapters.out.database;

import org.springframework.stereotype.Service;

import com.restaurante.aplication.exceptions.RestauranteException;
import com.restaurante.domain.models.Owner;
import com.restaurante.infrastructure.adapters.out.database.mappers.OwnerMapper;
import com.restaurante.infrastructure.adapters.out.database.repository.OwnerRepository;
import com.restaurante.infrastructure.ports.out.OwnerPort;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class OwnerAdapter implements OwnerPort {
	private final OwnerRepository repository;
	private final OwnerMapper mapper;

	@Override
	public Owner registrar(Owner dueno) {
		Owner response = null;
		try {
			response = mapper.mapperDomain(repository.save(mapper.mapperEntity(dueno)));
		} catch (Exception e) {
			log.error("Owner:REGISTRAR", e);
			throw new RestauranteException("Ocurrió un error al registrar dueño.");
		}
		return response;
	}

}
