/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.usuarios.service;

import com.accenture.usuarios.Mapper.UsuarioRequest;
import com.accenture.usuarios.Mapper.UsuarioResponse;
import com.accenture.usuarios.Entity.Usuario;
import java.util.List;
import java.util.Map;

/**
 * Interfaz contruidad para definir los mètodos necesarios que me definen la lògica del negocio
 * @author Yeison Aristizabal
 * @version 1.0
 */
public interface UsuariosService {
    
    /**
     * Yeison aristizabal
     * @param usuario
     * @return Guardar un usuario
     */
    public UsuarioResponse guardar(UsuarioRequest usuario);
     
    /**
     * Yeison Aristizabal
     * @param id
     * @return Bucar un usuario  a partir del id
     */
    public Usuario getUsuario(Long id);
    
    /**
     * Yeison Aristizabal 
     * @param id 
     * @return Eliminar un usuario de la base de datos a partir del id
     */
    public Map eliminar(Long id);
    
    /**
     * Yeison Aristizabal
     * @return Listar Todos los usuarios almacenados en la base de datos
     */
    public List<Usuario> listarUsuarios();
}
