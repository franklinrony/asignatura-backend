package net.academiadecodigo.asignatura.backend.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import net.academiadecodigo.asignatura.backend.entities.Municipio;

public interface MunicipioRepository extends JpaRepository<Municipio, BigDecimal> {

}
