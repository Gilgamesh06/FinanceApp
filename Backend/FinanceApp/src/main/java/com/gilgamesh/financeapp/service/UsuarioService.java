package com.gilgamesh.financeapp.service;

import com.gilgamesh.financeapp.Exception.UserExistException;
import com.gilgamesh.financeapp.auth.dto.register.RegisterDTO;
import com.gilgamesh.financeapp.model.entity.Persona;
import com.gilgamesh.financeapp.model.entity.Usuario;
import com.gilgamesh.financeapp.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Clase: UsuarioService
 * Esta clase contiene los metodos para {Crear, Actualizar, Eliminar, Buscar} un Usuario
 */
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PersonaService personaService;

    public UsuarioService(UsuarioRepository usuarioRepository,
                          PersonaService personaService){
        this.usuarioRepository = usuarioRepository;
        this.personaService = personaService;
    }

    /**
     * Metodo para mapear un RegisterDTO a una entidad Usuario
     * @param register DTO -> RegisterDTO para mapear
     * @param persona  Entity -> Para vincular con Usuario
     * @return Usuario -> objeto almacenar
     */
    protected Usuario toEntity(RegisterDTO register, Persona persona){
        return Usuario.builder()
                .username(register.getUsername())
                .password(register.getPassword())
                .persona(persona)
                .build();
    }

    /**
     * Metodo para guardar el Usuario
     * @param register DTO que contienen los datos para crear los objetos Persona y Usuario
     * @param persona Objeto Persona para vincular La entidad Usuario con Persoan
     * @return Usuario -> Objeto almacenado.
     */
    public Usuario saveUsuario(RegisterDTO register, Persona persona){
        // Verifica que el usuario con ese username no exista
        Optional<Usuario> usuarioOpt = usuarioRepository.findByUsername(register.getUsername());
        if(usuarioOpt.isEmpty()){
            // Si no existe crea el Usuario y lo guarda
            Usuario usuario = toEntity(register,persona);
            return usuarioRepository.save(usuario);
        }else {
            // Si existe el Usuario con ese username, elimina la persona y genera una exception
            personaService.delete(persona);
            throw new UserExistException("El username ya esta registrado: "+ register.getUsername());
        }

    }
}
