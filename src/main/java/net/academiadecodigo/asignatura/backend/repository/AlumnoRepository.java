package net.academiadecodigo.asignatura.backend.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import net.academiadecodigo.asignatura.backend.entities.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, BigDecimal>{

}
