package com.restaurante.aplication.usecases;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurante.domain.models.Restaurante;
import com.restaurante.domain.models.RestauranteOwner;
import com.restaurante.ports.in.RestauranteUseCase;
import com.restaurante.ports.out.RestauranteOwnerPort;
import com.restaurante.ports.out.RestaurantePort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestauranteUseCaseImpl implements RestauranteUseCase {

	private final RestaurantePort portRestaurante;
	private final RestauranteOwnerPort portRestauranteOwner;

	@Override
	@Transactional
	public Restaurante registrar(Restaurante restaurante) {

		List<RestauranteOwner> owners = restaurante.getOwners();
		Restaurante response = portRestaurante.registrar(restaurante);

		owners.stream().forEach(dueno -> dueno.setIdRestaurante(response.getId()));

		owners = portRestauranteOwner.registrarAll(owners);
		response.setOwners(owners);
		return response;
	}

	@Override
	public List<Restaurante> restaurantesByOwner(Long idOwer) {
		return portRestauranteOwner.restaurantesByOwner(idOwer);
	}

}
