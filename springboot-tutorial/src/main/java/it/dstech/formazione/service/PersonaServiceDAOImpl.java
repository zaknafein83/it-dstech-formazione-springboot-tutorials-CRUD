package it.dstech.formazione.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.formazione.model.Persona;
import it.dstech.formazione.repository.PersonaRepository;

@Service
public class PersonaServiceDAOImpl implements PersonaServiceDAO {

	@Autowired
	private PersonaRepository personaRepos;

	@Override
	public boolean add(Persona t) {
		Persona save = personaRepos.save(t);
		return save != null;
	}

	@Override
	public List<Persona> findAll() {
		return personaRepos.findAll();
	}

	@Override
	public void remove(Persona t) {
		personaRepos.delete(t);
	}

}
