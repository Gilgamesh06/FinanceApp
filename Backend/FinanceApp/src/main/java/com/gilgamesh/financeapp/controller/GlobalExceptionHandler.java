package com.gilgamesh.financeapp.controller;

import com.gilgamesh.financeapp.Exception.UserExistException;
import com.gilgamesh.financeapp.model.dto.exception.ExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

/**
 * Clase GlobalExceptionHandler
 * Centraliza las excepciones
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Metodo que responde a la excepcion UserExistHandler
     * @param ex -> UserExistHandler excepcion que se genera al registrar un usuario existente
     * @return ExceptionDTO -> DTO que contiene el mensaje de erro y el statusCode
     */
    @ExceptionHandler(UserExistException.class)
    public ResponseEntity<ExceptionDTO> UserExistHandler(UserExistException ex){
        ExceptionDTO exception = ExceptionDTO.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .date(LocalDateTime.now())
                .build();
        return ResponseEntity.badRequest()
                .body(exception);
    }
}
