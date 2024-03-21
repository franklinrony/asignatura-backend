package net.academiadecodigo.asignatura.backend.dto;

import java.math.BigDecimal;
import java.util.List;




public class DepartamentoDto {

	private BigDecimal deptId;
	private String deptNombre;
	private List<MunicipioDto> deptoMunicipios;
	
	public BigDecimal getDeptId() {
		return deptId;
	}
	public void setDeptId(BigDecimal deptId) {
		this.deptId = deptId;
	}
	public String getDeptNombre() {
		return deptNombre;
	}
	public void setDeptNombre(String deptNombre) {
		this.deptNombre = deptNombre;
	}
	public List<MunicipioDto> getDeptoMunicipios() {
		return deptoMunicipios;
	}
	public void setDeptoMunicipios(List<MunicipioDto> deptoMunicipios) {
		this.deptoMunicipios = deptoMunicipios;
	}
	
	
}
