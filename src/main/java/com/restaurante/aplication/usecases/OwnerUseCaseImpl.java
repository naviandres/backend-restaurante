package com.restaurante.aplication.usecases;

import org.springframework.stereotype.Service;

import com.restaurante.domain.models.Owner;
import com.restaurante.infrastructure.adapters.out.database.OwnerAdapter;
import com.restaurante.ports.in.OwnerUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OwnerUseCaseImpl implements OwnerUseCase {

	private final OwnerAdapter port;

	@Override
	public Owner registrar(Owner dueno) {
		return port.registrar(dueno);
	}

}
