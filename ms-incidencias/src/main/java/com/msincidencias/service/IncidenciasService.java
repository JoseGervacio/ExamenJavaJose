package com.msincidencias.service;

import java.util.List;

import com.msincidencias.entity.Incidencias;
import com.msincidencias.request.IncidenciasRequest;

public interface IncidenciasService {
	
	public Incidencias reportar(IncidenciasRequest request);
	public List<Incidencias> consultar();

}
