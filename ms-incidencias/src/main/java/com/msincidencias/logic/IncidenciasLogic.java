package com.msincidencias.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msincidencias.entity.Incidencias;
import com.msincidencias.repository.IncidenciasRepository;
import com.msincidencias.request.IncidenciasRequest;
import com.msincidencias.service.IncidenciasService;

@Service
public class IncidenciasLogic implements IncidenciasService {
	
	@Autowired
	IncidenciasRepository dao;

	@Override
	public Incidencias reportar(IncidenciasRequest request) {
		
		Incidencias incidencia = new Incidencias();
		
		incidencia.setFecha(request.getFecha());
		incidencia.setIdOperador(request.getIdOperador());
		incidencia.setIdEquipo(request.getIdEquipo());
		
		dao.save(incidencia);
		
		
		return incidencia;
	}

	@Override
	public List<Incidencias> consultar() {
		return dao.findAll();
	}
	
	

}
