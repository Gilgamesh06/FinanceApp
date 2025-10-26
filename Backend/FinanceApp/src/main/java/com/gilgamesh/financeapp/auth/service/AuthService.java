package com.gilgamesh.financeapp.auth.service;

import com.gilgamesh.financeapp.auth.dto.register.InfoRegisterDTO;
import com.gilgamesh.financeapp.auth.dto.register.RegisterDTO;
import com.gilgamesh.financeapp.model.entity.Persona;
import com.gilgamesh.financeapp.model.entity.Usuario;
import com.gilgamesh.financeapp.service.PersonaService;
import com.gilgamesh.financeapp.service.UsuarioService;
import org.springframework.stereotype.Service;

/**
 * Clase AuthService
 * Esta clase contiene los metodos para Realizar Register y Login
 */
@Service
public class AuthService {

    private final PersonaService personaService;
    private final UsuarioService usuarioService;

    public AuthService(PersonaService personaService,
                       UsuarioService usuarioService){
        this.personaService = personaService;
        this.usuarioService = usuarioService;
    }

    /**
     * Metodo toDTO -> Mapea un objeto Usuario a un InfoRegisterDTO
     * @param usuario Objeto que provee el atributo usarname
     * @return InfoRegisterDTO -> DTO resultante
     */
    protected InfoRegisterDTO toDTO(Usuario usuario){
        return InfoRegisterDTO.builder()
                .estado(true)
                .mensaje("Se creo Exitosamente el usuario: "+ usuario.getUsername())
                .build();
    }

    /**
     * Metodo registerUsuaario -> Registra un nuevo usuario
     * @param register DTO -> RegisterDTO contiene los atributos para crear Persona y Usuario
     * @return InfoRegisterDTO contiene informacion del usuario registrado
     */
    public InfoRegisterDTO registerUsuario(RegisterDTO register){
        Persona persona = personaService.savePersona(register);
        Usuario usuario = usuarioService.saveUsuario(register,persona);
        return toDTO(usuario);
    }
}
