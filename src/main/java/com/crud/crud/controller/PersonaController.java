package com.crud.crud.controller;

import com.crud.crud.model.Persona;
import com.crud.crud.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping("/nuevo")
    public Persona newPersona(@RequestBody Persona newPersona){
        return personaService.newPerson(newPersona);
    }

    @GetMapping("/mostrar")
    public Iterable<Persona>getAll(){
        return personaService.getAll();
    }


    @PostMapping("/update")
    public Persona updatePerson(@RequestBody Persona persona) {
        return this.personaService.modifyPerson(persona);
    }

    @PostMapping("/{id}")
    public boolean deletePersona(@RequestParam Long idPersona) {
        return this.personaService.delete(idPersona);
    }

}
