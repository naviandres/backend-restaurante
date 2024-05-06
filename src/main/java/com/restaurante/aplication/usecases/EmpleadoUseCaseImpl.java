package com.restaurante.aplication.usecases;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurante.domain.models.Empleado;
import com.restaurante.infrastructure.adapters.out.database.EmpleadoAdapter;
import com.restaurante.infrastructure.ports.in.EmpleadoUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpleadoUseCaseImpl implements EmpleadoUseCase{
	
	private final EmpleadoAdapter port;

	
	@Override
	public List<Empleado> empleadosByRestaurante(Long idRestaurante) {
		return port.empleadosByRestaurante(idRestaurante);
	}


}
