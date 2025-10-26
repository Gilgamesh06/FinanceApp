package com.gilgamesh.financeapp.service;

import com.gilgamesh.financeapp.Exception.UserExistException;
import com.gilgamesh.financeapp.auth.dto.register.RegisterDTO;
import com.gilgamesh.financeapp.model.entity.Persona;
import com.gilgamesh.financeapp.repository.PersonaRepository;

import java.util.Optional;

/**
 * Clase PersonaService
 * Contiene los metodos para: {Crear, Actualizar, Eliminar, Listar} Un Objeto de tipo Persona
 */
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    /**
     * Metodo toEntity -> Mapea un objeto RegisterDTO a un objeto Persona
     * @param register DTO -> RegisterDTO que contiene los atributos para crear Persona y Usuario
     * @return Persona -> Objeto final resultante al mapear
     */
    protected Persona toEntity(RegisterDTO register){
        return Persona.builder()
                .nombre(register.getNombre())
                .apellido(register.getApellido())
                .fechaNacimiento(register.getFechaNacimiento())
                .correo(register.getCorreo())
                .build();
    }

    /**
     * Metodo savePersona -> Permite almacenar un Objeto de tipo Persona
     * @param register DTO -> RegisterDTO que contiene los atributos para crear Persona y Usuario
     * @return Persona -> Objeto almacenado.
     */
    public Persona savePersona(RegisterDTO register){
        // Verificamos que el correo no exista (El correo es unico)
        Optional<Persona> personaOpt = personaRepository.findByCorreo(register.getCorreo());
        // Si el optional retorna vacio
        if(personaOpt.isEmpty()){
            // Crea el Objeto Persona y lo guarda
            Persona persona = toEntity(register);
            return personaRepository.save(persona);
        }else{
            // Si no es vacio retorna un UserExistException
            throw new UserExistException("El correo ya esta registrado: "+ register.getCorreo());
        }
    }

    /**
     * Metodo delete -> elimina una Persona
     * @param persona -> persona a eliminar
     */
    public void delete(Persona persona){
        personaRepository.delete(persona);
    }
}
