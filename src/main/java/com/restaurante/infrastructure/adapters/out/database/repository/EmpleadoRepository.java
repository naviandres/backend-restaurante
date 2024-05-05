package com.restaurante.infrastructure.adapters.out.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.restaurante.infrastructure.adapters.out.database.entities.EmpleadoEntity;


public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long>{

	
	 @Query("SELECT e FROM EmpleadoEntity e WHERE e.restauranteEntity.id = :idRestaurante")
	 List<EmpleadoEntity> findEmployesByRestaurant(Long idRestaurante);
}
