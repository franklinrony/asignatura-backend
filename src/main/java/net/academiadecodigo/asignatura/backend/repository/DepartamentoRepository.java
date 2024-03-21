package net.academiadecodigo.asignatura.backend.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.academiadecodigo.asignatura.backend.entities.Departamento;
@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, BigDecimal> {

}
