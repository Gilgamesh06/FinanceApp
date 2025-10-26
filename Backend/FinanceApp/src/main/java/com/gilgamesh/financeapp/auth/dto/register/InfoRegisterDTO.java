package com.gilgamesh.financeapp.auth.dto.register;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfoRegisterDTO {

    @NotNull(message = "El estado no puede ser nulo")
    private Boolean estado;

    @NotBlank(message = "El mensaje no puede ser vacio")
    private String mensaje;
}
