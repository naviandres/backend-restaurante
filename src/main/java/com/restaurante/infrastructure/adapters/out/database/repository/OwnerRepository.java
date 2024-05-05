package com.restaurante.infrastructure.adapters.out.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurante.infrastructure.adapters.out.database.entities.OwnerEntity;


public interface OwnerRepository extends JpaRepository<OwnerEntity, Long>{

}
