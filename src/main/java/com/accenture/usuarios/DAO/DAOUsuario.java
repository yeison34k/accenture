/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.usuarios.DAO;

import com.accenture.usuarios.Entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Yeison Aristizabal
 * @version 1.0
 * @descripcion Clase contruidad para hacer la operaciones contra la base de datos, esta extiende de MongoRepository que contiene todos los metodos bàsicos (CRUD) y otros metodos adicionales para la construcciòn de nuevos codigos
 */
public interface DAOUsuario extends MongoRepository<Usuario, Long> {    
}
