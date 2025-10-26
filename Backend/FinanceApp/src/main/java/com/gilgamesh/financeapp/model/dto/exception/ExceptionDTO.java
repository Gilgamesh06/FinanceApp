package com.gilgamesh.financeapp.model.dto.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionDTO {

    private int statusCode;

    private String message;

    private LocalDateTime date;

}
