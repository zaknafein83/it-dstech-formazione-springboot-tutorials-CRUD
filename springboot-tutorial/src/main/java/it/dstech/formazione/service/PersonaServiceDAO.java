package it.dstech.formazione.service;

import java.util.List;

import it.dstech.formazione.model.Persona;

public interface PersonaServiceDAO {
	boolean add(Persona t);

	List<Persona > findAll();

	void remove(Persona t);

}
