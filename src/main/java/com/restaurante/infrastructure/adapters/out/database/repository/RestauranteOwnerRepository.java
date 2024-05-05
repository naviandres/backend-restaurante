package com.restaurante.infrastructure.adapters.out.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.restaurante.infrastructure.adapters.out.database.entities.RestauranteEntity;
import com.restaurante.infrastructure.adapters.out.database.entities.RestauranteOwnerEntity;


public interface RestauranteOwnerRepository extends JpaRepository<RestauranteOwnerEntity, Long>{

	 @Query("SELECT e.restauranteEntity FROM RestauranteOwnerEntity e WHERE e.ownerEntity.id = :idOwner")
	 List<RestauranteEntity> findRestaurantstnByOwner(Long idOwner);
}
