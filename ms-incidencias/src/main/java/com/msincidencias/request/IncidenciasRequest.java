package com.msincidencias.request;

import java.time.LocalDateTime;

public class IncidenciasRequest {
	
	private int idIncidencia;
	private LocalDateTime fecha;
	private int idOperador;
	private int idEquipo;
	
	public IncidenciasRequest() {}

	public IncidenciasRequest(int idIncidencia, LocalDateTime fecha, int idOperador, int idEquipo) {
		super();
		this.idIncidencia = idIncidencia;
		this.fecha = fecha;
		this.idOperador = idOperador;
		this.idEquipo = idEquipo;
	}

	public int getIdIncidencia() {
		return idIncidencia;
	}

	public void setIdIncidencia(int idIncidencia) {
		this.idIncidencia = idIncidencia;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public int getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}
	
	

}
