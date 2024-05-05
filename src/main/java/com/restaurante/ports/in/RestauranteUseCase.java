package com.restaurante.ports.in;

import java.util.List;

import com.restaurante.domain.models.Restaurante;

public interface RestauranteUseCase {
	Restaurante registrar( Restaurante restaurante);
	
	List<Restaurante> restaurantesByOwner(Long idOwer);

}
