package com.gilgamesh.financeapp.auth.controller;

import com.gilgamesh.financeapp.auth.dto.register.InfoRegisterDTO;
import com.gilgamesh.financeapp.auth.dto.register.RegisterDTO;
import com.gilgamesh.financeapp.auth.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/v1/")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    /**
     * Metodo register -> Permite registrar a un nuevo usuario
     * @param register DTO -> RegisterDTO contiene los atributos para crear Persona y Usuario
     * @return ResponseEntity -> status 201 y retorna un InfoRegisterDTO
     */
    @PostMapping("/register")
    public ResponseEntity<InfoRegisterDTO> register(@RequestBody RegisterDTO register){
        InfoRegisterDTO info = authService.registerUsuario(register);
        return new ResponseEntity(info, HttpStatus.CREATED);
    }


}
