package com.restaurante.infrastructure.ports.in;

import java.util.List;

import com.restaurante.domain.models.Empleado;

public interface EmpleadoUseCase {
	List<Empleado> empleadosByRestaurante(Long idRestaurante);

}
