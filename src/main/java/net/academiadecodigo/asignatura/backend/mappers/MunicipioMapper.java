package net.academiadecodigo.asignatura.backend.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import net.academiadecodigo.asignatura.backend.dto.MunicipioDto;
import net.academiadecodigo.asignatura.backend.entities.Municipio;

@Mapper(componentModel = "spring")
public interface MunicipioMapper extends GenericMapper<MunicipioDto, Municipio> {
	@Mapping(target = "deptId", source = "departamento")
	@Override
	Municipio toEntity(MunicipioDto municipioDto);

	@InheritInverseConfiguration
	@Override
	MunicipioDto toDTO(Municipio municipio);

}
