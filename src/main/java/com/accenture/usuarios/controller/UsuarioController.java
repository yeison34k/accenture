/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.usuarios.controller;

import com.accenture.usuarios.Mapper.UsuarioRequest;
import com.accenture.usuarios.Mapper.UsuarioResponse;
import com.accenture.usuarios.Entity.Usuario;
import com.accenture.usuarios.service.UsuariosService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yeison Aristizabal
 * @version 1.0
 * @descripcion Esta clase esta diseñada para ser el punto de acceso a la aplicaciòn, contiene mètodos bàsicos (CRUD)
 */
@RestController
public class UsuarioController {
    
    final static Logger logger = Logger.getLogger(UsuarioController.class);
    
    
    @Autowired
    private  UsuariosService usuariosService;
    
    /**
     * @author Yeison Aristizabal
     * @param usuarioRequest Objeto que describe la informaciòn del usuario a guradar o modificar 
     * @return Guardar usuario
     */
    @RequestMapping(value = "/usuario/guardarOModificar", method = RequestMethod.POST)
    public UsuarioResponse updateOrSave(@RequestBody @Valid UsuarioRequest usuarioRequest) {
        try {
            return usuariosService.guardar(usuarioRequest);
        } catch (Exception e) {
            logger.error("Error guardando el registro", e);
            return null;
        }
    }

    /**
     * @author Yeison Aristizabal
     * @param id id del usuario que se desea consultar
     * @return Cargar usuario apartir del codigo
     */
    @RequestMapping(value = "/usuario/get/{id}", method = RequestMethod.GET)
    public Usuario usuarioGetById(@PathVariable Long id) {
        try {
            Usuario usuario = usuariosService.getUsuario(id);
            return usuario;
        } catch (Exception e) {
            logger.error("Problemas consultando el registro", e);
            return null;
        }
    }

    /**
     * @author Yeison Aristizabal
     * @param id es el codigo del usuario que se desea eliminar
     * @return Eliminar usuario a partir del codigo
     */
    @RequestMapping(value = "/usuario/eliminar/{id}", method = RequestMethod.GET)
    public Map eliminarById(@PathVariable Long id) {
        Map res = new HashMap();
        try {
            res = usuariosService.eliminar(id);
        } catch (Exception e) {
            logger.error("Porblemas eliminando el registro", e);
            res.put("message", "Problemas al momento de remover el registro.");
            res.put("succes", false);
        }
        return res;
    }

    /**
     * @author Yeison Aristizabal
     * @return Listar todos los usuarios que se encuentran en la base de datos
     */
    @RequestMapping(value = "/usuario/listar", method = RequestMethod.GET)
    public List<Usuario> listarTodos() {
        try {
            logger.error("Porblemas listando el registro");
            return usuariosService.listarUsuarios();
        } catch (Exception e) {
            logger.error("Problemas listando los registros", e);
            return null;
        }
    }
}
