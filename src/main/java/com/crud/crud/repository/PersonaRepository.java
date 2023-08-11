package com.crud.crud.repository;

import com.crud.crud.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PersonaRepository extends JpaRepository<Persona,Long> {

}
