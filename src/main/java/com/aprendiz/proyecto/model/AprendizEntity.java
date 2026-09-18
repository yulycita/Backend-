package com.aprendiz.proyecto.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity (name = "aprendiz")

public class AprendizEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    @Column(name = "genero")
    private String genero;

    @Column(name = "programa")
    private String programa;

    @Column(name = "ficha")
    private String ficha;

    @Column(name = "numero_documento")
    private String numeroDocumento;
}
