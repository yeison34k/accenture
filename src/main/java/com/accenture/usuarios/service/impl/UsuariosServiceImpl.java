/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.usuarios.service.impl;

import com.accenture.usuarios.DAO.DAOUsuario;
import com.accenture.usuarios.Mapper.UsuarioRequest;
import com.accenture.usuarios.Mapper.UsuarioResponse;
import com.accenture.usuarios.Entity.Usuario;
import com.accenture.usuarios.service.UsuariosService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yeison Aristizabal
 * @version 1.0
 * @descripcion Implementaciòn de la interfaz UsuariosService, donde se contruira toda la logica de negocio
 * 
 */
@Service
public class UsuariosServiceImpl implements UsuariosService {
    @Autowired
    private DAOUsuario daoUsuario;
    
    @Autowired
    private Mapper mapper;
    /**
     * {@inheritDoc}  
     */
    @Override
    public UsuarioResponse guardar(UsuarioRequest usuarioRequest) {
        Usuario usuario = mapper.map(usuarioRequest, Usuario.class);
        Usuario updatedUsuario = daoUsuario.save(usuario);
        UsuarioResponse usuarioResponse = mapper.map(updatedUsuario, UsuarioResponse.class);
        return usuarioResponse;
    }

    /**
     * {@inheritDoc}  
     */
    @Override
    public Usuario getUsuario(Long id) {
        Usuario ususario = daoUsuario.findOne(id);
        return ususario;
    }

    /**
     * {@inheritDoc}  
     */
    @Override
    public Map eliminar(Long id) {
        Map res = new HashMap();
        daoUsuario.delete(id);
        Usuario us = this.getUsuario(id);
        
        if(us != null) {
            res.put("message", "El registro no puede ser eliminado");
            res.put("success", false);
        } else {
            res.put("message", "Se elimino el registro correctamente");
            res.put("success", true);
        }
        
        return res;
    }

    /**
     * {@inheritDoc}  
     */
    @Override
    public List<Usuario> listarUsuarios() {
        return daoUsuario.findAll();    
    }
}
