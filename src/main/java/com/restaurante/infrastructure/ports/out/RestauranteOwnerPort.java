package com.restaurante.infrastructure.ports.out;

import java.util.List;

import com.restaurante.domain.models.Restaurante;
import com.restaurante.domain.models.RestauranteOwner;

public interface RestauranteOwnerPort {
	RestauranteOwner registrar( RestauranteOwner restauranteOwner);

	List<RestauranteOwner> registrarAll( List<RestauranteOwner> restauranteOwner);
	
	List<Restaurante> restaurantesByOwner(Long idOwer);
}
