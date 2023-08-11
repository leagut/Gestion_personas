package com.crud.crud.service;

import com.crud.crud.model.Persona;

public interface PersonaService {
    Persona newPerson(Persona newPersona);
    Iterable<Persona>getAll();
    Persona modifyPerson(Persona persona);
    Boolean delete(Long idepersona);
}
