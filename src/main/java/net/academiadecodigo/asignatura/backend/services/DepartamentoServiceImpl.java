package net.academiadecodigo.asignatura.backend.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.academiadecodigo.asignatura.backend.entities.Departamento;
import net.academiadecodigo.asignatura.backend.repository.DepartamentoRepository;
@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	@Autowired
private DepartamentoRepository departamentoRepository;
	
	public DepartamentoServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Departamento registrar(Departamento obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departamento modificar(Departamento obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamento> listar() throws ServiceException {
		// TODO Auto-generated method stub
		return departamentoRepository.findAll();
	}

	@Override
	public Optional<Departamento> leerPorId(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean eliminar(Departamento obj) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

}
