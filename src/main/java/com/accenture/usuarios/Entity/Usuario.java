/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.usuarios.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Yesion aristizabal
 * @version 1.0
 * @descripcion Entidad encargada de describir la tabla de ususarios en la base de datos mongodb
 */
@Data
@Document(collection = "usuario")
public class Usuario {
    @Id
    private Long id;
    private Character activo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    private Character sexo;
    private String ciudad;

    public Usuario() {
    }

    public Usuario(Long id, Character activo, String nombre, String apellidos, 
            String telefono, String correo, Character sexo, String ciudad) {
        this.id = id;
        this.activo = activo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.sexo = sexo;
        this.ciudad = ciudad;
    }
}
