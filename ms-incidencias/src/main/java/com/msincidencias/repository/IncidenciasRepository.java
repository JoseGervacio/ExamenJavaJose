package com.msincidencias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msincidencias.entity.Incidencias;

@Repository
public interface IncidenciasRepository extends JpaRepository<Incidencias, Integer>{

}
