package net.academiadecodigo.asignatura.backend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.academiadecodigo.asignatura.backend.dto.MunicipioDto;
import net.academiadecodigo.asignatura.backend.entities.Municipio;
import net.academiadecodigo.asignatura.backend.mappers.MunicipioMapper;
import net.academiadecodigo.asignatura.backend.repository.MunicipioRepository;
@Service
public class MunicipioServiceImpl implements MunicipioService {

	@Autowired
	private MunicipioRepository municipioRepository;
	@Autowired
	private MunicipioMapper municipioMapper;
	
	@Override
	public MunicipioDto registrar(MunicipioDto obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MunicipioDto modificar(MunicipioDto obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MunicipioDto> listar() throws ServiceException {
		List<Municipio> municipios= municipioRepository.findAll();
		return municipios.stream().map(e-> municipioMapper.toDTO(e)).collect(Collectors.toList());

	}

	@Override
	public Optional<MunicipioDto> leerPorId(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean eliminar(MunicipioDto obj) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

}
