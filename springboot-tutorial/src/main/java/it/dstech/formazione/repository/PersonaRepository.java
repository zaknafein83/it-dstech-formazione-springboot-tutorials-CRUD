package it.dstech.formazione.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.formazione.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
