package com.gilgamesh.financeapp.auth.dto.register;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO {

    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    private String apellido;

    @NotBlank(message = "El correo no puede ser vacio")
    @Email(message = "El correo debe tenr un formato valido")
    private String correo;

    @NotNull(message = "La fecha de nacimiento no puede ser nula.")
    @Past(message = "La fecha debe ser anterior a la fecha actual")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;

    @NotBlank(message = "El nombre de usuario no puede ser vacio")
    private String username;

    @NotBlank(message = "La contraseña no puede ser vacio")
    @Size(min = 8, message = "La contraseña debe tener mini,o 8 caracteres")
    private String password;
}
