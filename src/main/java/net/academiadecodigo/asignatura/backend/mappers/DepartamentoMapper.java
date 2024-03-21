package net.academiadecodigo.asignatura.backend.mappers;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import net.academiadecodigo.asignatura.backend.dto.DepartamentoDto;
import net.academiadecodigo.asignatura.backend.dto.MunicipioDto;
import net.academiadecodigo.asignatura.backend.entities.Departamento;
import net.academiadecodigo.asignatura.backend.entities.Municipio;

@Mapper(componentModel = "spring")
public interface DepartamentoMapper extends GenericMapper<DepartamentoDto, Departamento>{
    DepartamentoMapper INSTANCE = Mappers.getMapper(DepartamentoMapper.class);
    
    @Mapping(target = "municipioList", source = "deptoMunicipios")
    @Override
	Departamento toEntity(DepartamentoDto departamentoDto);
    
    @InheritInverseConfiguration
    @Override
	DepartamentoDto toDTO(Departamento departamento);

	  default MunicipioDto map(Municipio municipio) {
	        // Implementa el mapeo de Municipio a MunicipioDto aquí
	        // Por ejemplo:
	        return MunicipioDto.builder()
	                .muniId(municipio.getMuniId())
	                .muniNombre(municipio.getMuniNombre())
	                .build();
	    }
}
