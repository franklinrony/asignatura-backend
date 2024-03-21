package net.academiadecodigo.asignatura.backend.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;

@Builder
public class MunicipioDto {
	private BigDecimal muniId;
	private String muniNombre;
	@JsonIgnore
	private DepartamentoDto departamento;
	
	
	
	public MunicipioDto() {
		super();
	}
	
	public MunicipioDto(BigDecimal muniId, String muniNombre, DepartamentoDto departamento) {
		super();
		this.muniId = muniId;
		this.muniNombre = muniNombre;
		this.departamento = departamento;
	}
	
	public BigDecimal getMuniId() {
		return muniId;
	}
	public void setMuniId(BigDecimal muniId) {
		this.muniId = muniId;
	}
	public String getMuniNombre() {
		return muniNombre;
	}
	public void setMuniNombre(String muniNombre) {
		this.muniNombre = muniNombre;
	}

	public DepartamentoDto getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DepartamentoDto departamento) {
		this.departamento = departamento;
	}
	
	
	
}
