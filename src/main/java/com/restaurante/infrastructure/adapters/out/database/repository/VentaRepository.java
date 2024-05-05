package com.restaurante.infrastructure.adapters.out.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.restaurante.infrastructure.adapters.out.database.entities.VentaEntity;

public interface VentaRepository extends JpaRepository<VentaEntity, Long> {

	@Query("SELECT e FROM VentaEntity e WHERE e.restauranteEntity.id = :idRestaurante")
	List<VentaEntity> findSalesByRestaurant(Long idRestaurante);

	@Query("SELECT SUM(v.valor) FROM VentaEntity v")
	Double totalSales();
}
