package com.crud.crud.service;

import com.crud.crud.model.Persona;
import com.crud.crud.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona newPerson(Persona newPersona) {
        return personaRepository.save(newPersona);
    }

    @Override
    public Iterable<Persona> getAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona modifyPerson(Persona persona) {
        Optional<Persona> personaEncontrada = this.personaRepository.findById(persona.getNumDocumento());
        if(personaEncontrada.get() != null){
            personaEncontrada.get().setNombre(persona.getNombre());
            personaEncontrada.get().setApellido(persona.getApellido());
            personaEncontrada.get().setCorreo(persona.getCorreo());
            return this.newPerson(personaEncontrada.get());
        }
        return null;
    }

    @Override
    public Boolean delete(Long idepersona) {
        personaRepository.deleteById(idepersona);
        return true;
    }
}
