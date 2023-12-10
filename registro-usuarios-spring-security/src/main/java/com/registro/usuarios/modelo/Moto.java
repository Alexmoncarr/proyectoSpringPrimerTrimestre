/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.registro.usuarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author aleja
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "La marca no puede estar en blanco")
    private String marca;

    @NotBlank(message = "El modelo no puede estar en blanco")
    private String modelo;
    @Column(name = "anyo", nullable = false, columnDefinition = "INT DEFAULT 0")
    @NotNull(message = "El año no puede estar en blanco")
    @PositiveOrZero(message = "El año debe ser un número positivo o cero")
    private Integer anyo;
    @NotBlank(message = "La cilindrada no puede estar en blanco")
    @Size(min = 2, max = 4, message = "La cilindrada debe tener entre 2 y 4 caracteres")
    private String cilindrada;

}
