package com.restaurante.infrastructure.ports.out;

import com.restaurante.domain.models.Owner;

public interface OwnerPort {
	Owner registrar( Owner owner);

}
