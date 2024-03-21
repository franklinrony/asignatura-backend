package net.academiadecodigo.asignatura.backend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.academiadecodigo.asignatura.backend.dto.DepartamentoDto;
import net.academiadecodigo.asignatura.backend.entities.Departamento;
import net.academiadecodigo.asignatura.backend.mappers.DepartamentoMapper;
import net.academiadecodigo.asignatura.backend.repository.DepartamentoRepository;
@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	private DepartamentoRepository departamentoRepository;
	@Autowired
	private DepartamentoMapper departamentoMapper;
	
	
	@Override
	public DepartamentoDto registrar(DepartamentoDto obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartamentoDto modificar(DepartamentoDto obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DepartamentoDto> listar() throws ServiceException {
		List<Departamento> departamentos=departamentoRepository.findAll();
		return departamentos.stream().map(e-> departamentoMapper.toDTO(e)).collect(Collectors.toList());


	}

	@Override
	public Optional<DepartamentoDto> leerPorId(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean eliminar(DepartamentoDto obj) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

}
