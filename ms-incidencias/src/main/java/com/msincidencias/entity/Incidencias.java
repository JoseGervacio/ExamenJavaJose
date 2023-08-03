package com.msincidencias.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="INCIDENCIAS")
public class Incidencias implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Incidencias() {}
	
	public Incidencias(int idIncidencia) {
		super();
		this.idIncidencia = idIncidencia;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="inc_auto")
	@SequenceGenerator(name="inc_auto", sequenceName="INCIDENCIAS_SEQ", allocationSize=1)
	@Column(name="ID_INCIDENCIA", columnDefinition="NUMBER")
	private int idIncidencia;
	
	@Column(name="FECHA_INCIDENCIA", columnDefinition="DATE")
	private LocalDateTime fecha;
	
	@Column(name="ID_OPERADOR", columnDefinition="NUMBER")
	private int idOperador;
	
	@Column(name="ID_EQUIPO", columnDefinition="NUMBER")
	private int idEquipo;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
