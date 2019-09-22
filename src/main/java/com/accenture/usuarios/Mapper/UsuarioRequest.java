/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.usuarios.Mapper;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Data;

/**
 *
 * @author Yesion Aristizabal
 * @version 1.0
 * @descripcion Clase usada para validar los datos ingresados
 */
@Data
public class UsuarioRequest {
    private Long id;
    
    private Character activo;
    
    @NotNull(message = "El nombre es requerido")
    private String nombre;

    private String apellido;

    @Pattern(regexp = "^\\+[0-9]*$", message = "El número de telefono sólo puede tener dígitos")
    private String telefono;
    
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "El correo debe tener el siguiente formato: ejemplo@ejemplo.com")
    private String correo;
    
    private Character sexo;
    
    private Long ciudad;
}
