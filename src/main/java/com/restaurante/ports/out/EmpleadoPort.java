package com.restaurante.ports.out;

import java.util.List;

import com.restaurante.domain.models.Empleado;


public interface EmpleadoPort {
	List<Empleado> empleadosByRestaurante(Long idRestaurante);
}
