package com.gilgamesh.financeapp.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "alerta")
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String estado;

    private Double procentaje;

    private LocalDateTime fecha;

    @OneToMany
    @JoinColumn(name = "ahorro_id", referencedColumnName = "id", nullable = false)
    private Ahorro ahorro;
}
