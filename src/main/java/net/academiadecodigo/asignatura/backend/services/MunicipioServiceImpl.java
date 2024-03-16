package net.academiadecodigo.asignatura.backend.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.academiadecodigo.asignatura.backend.entities.Municipio;
import net.academiadecodigo.asignatura.backend.repository.MunicipioRepository;
@Service
public class MunicipioServiceImpl implements MunicipioService {

	@Autowired
	private MunicipioRepository municipioRepository;
	
	@Override
	public Municipio registrar(Municipio obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Municipio modificar(Municipio obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Municipio> listar() throws ServiceException {
		return municipioRepository.findAll();
	}

	@Override
	public Optional<Municipio> leerPorId(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean eliminar(Municipio obj) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

}
