package net.academiadecodigo.asignatura.backend.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import net.academiadecodigo.asignatura.backend.entities.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, BigDecimal> {

}
