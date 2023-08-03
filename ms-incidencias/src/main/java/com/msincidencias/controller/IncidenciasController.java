package com.msincidencias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msincidencias.entity.Incidencias;
import com.msincidencias.logic.IncidenciasLogic;
import com.msincidencias.request.IncidenciasRequest;

@RestController
@RequestMapping("incidencias")
public class IncidenciasController {
	
	@Autowired
	IncidenciasLogic service;
	
	@GetMapping("consultar")
	public ResponseEntity<List<Incidencias>> consultar(){
		List<Incidencias> lista = service.consultar();
		return new ResponseEntity<List<Incidencias>>(lista, HttpStatus.OK);
	}
	
	@PostMapping("reportar")
	public ResponseEntity <Incidencias> reportar(@RequestBody IncidenciasRequest request){
		Incidencias incidencia = service.reportar(request);
		return new ResponseEntity<Incidencias>(incidencia, HttpStatus.OK);
		
	}

}
