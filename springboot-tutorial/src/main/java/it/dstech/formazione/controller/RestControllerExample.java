package it.dstech.formazione.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.dstech.formazione.model.Persona;
import it.dstech.formazione.service.PersonaServiceDAO;

@RestController
public class RestControllerExample {

	@Autowired
	private PersonaServiceDAO personaService;

	@RequestMapping("/")
	public List<Persona> getAllPeople() {
		return personaService.findAll();
	}
	
	@RequestMapping(value = ("/"), method = RequestMethod.POST)
	public boolean addNewPersona(@RequestBody Persona persona) {
		return personaService.add(persona);
	}
	
	@RequestMapping(value = ("/"), method = RequestMethod.DELETE)
	public boolean removePersona(@RequestBody Persona persona) {
		personaService.remove(persona);
		return true;
	}
	
	
	
}
