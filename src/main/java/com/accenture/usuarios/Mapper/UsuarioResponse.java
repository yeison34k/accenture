/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.usuarios.Mapper;

import lombok.Data;

/**
 *
 * @author Yeison Aristizabal
 * @version 1.0
 * @descripcion Clase encargada de entregar el objeto de respuesta al cliente
 */
@Data
public class UsuarioResponse {
    private Long id;
    private Character activo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    private Character sexo;
    private String ciudad;
}
