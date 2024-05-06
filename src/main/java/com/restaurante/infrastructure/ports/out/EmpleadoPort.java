package com.restaurante.infrastructure.ports.out;

import java.util.List;

import com.restaurante.domain.models.Empleado;


public interface EmpleadoPort {
	List<Empleado> empleadosByRestaurante(Long idRestaurante);
}
