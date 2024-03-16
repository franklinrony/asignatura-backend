package net.academiadecodigo.asignatura.backend.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.academiadecodigo.asignatura.backend.entities.Profesor;
import net.academiadecodigo.asignatura.backend.repository.ProfesorRepository;
@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	private ProfesorRepository profesorRepsoitory;
	
	@Override
	public Profesor registrar(Profesor obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesor modificar(Profesor obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profesor> listar() throws ServiceException {
		return profesorRepsoitory.findAll();
	}

	@Override
	public Optional<Profesor> leerPorId(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean eliminar(Profesor obj) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

}
