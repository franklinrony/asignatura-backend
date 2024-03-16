package net.academiadecodigo.asignatura.backend.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.academiadecodigo.asignatura.backend.entities.Asignatura;
import net.academiadecodigo.asignatura.backend.repository.AsignaturaRepository;
@Service
public class AsignaturaServiceImpl implements AsignaturaService {

	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Override
	public Asignatura registrar(
			Asignatura obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Asignatura modificar(Asignatura obj) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Asignatura> listar() throws ServiceException {
		
		return asignaturaRepository.findAll();
	}

	@Override
	public Optional<Asignatura> leerPorId(Integer id)
			throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean eliminar(Asignatura obj) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}

}
