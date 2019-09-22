package com.accenture;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.accenture.usuarios.Mapper.UsuarioResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author Yesion Aristizabal
 * Pruebas Main 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MainAccentureJUnitTest {
    
//    public MainAccentureJUnitTest() {
//    }
//    
//    @Autowired
//    private WebApplicationContext wac;
//    private MockMvc mockMvc;
//    
//    @Before
//    public void setup() throws Exception {
//        mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//    }
//    
//    /**
//     * Send GET Request with Path Variable
//     *
//     * @throws Exception
//     */
//    @Test
//    public void givenSedeURIWithPathVariable_whenMockMVC_thenResponseOK() throws Exception {
//        this.mockMvc
//                .perform(get("/usuario/listar"))
//                .andDo(print()).andExpect(status().isOk())
//                .andExpect(content().contentType("application/json;charset=UTF-8"));
//    }
//
//    /**
//     * Enviar POST 
//     * @throws Exception
//     */
//    @Test
//    public void validoIngresoDatosAlGuardarUsuario() throws Exception {
//        String nombre = "NombrePruebas" + new Date().getTime();
//        String apellido = "ApellidoPruebas" + new Date().getTime();
//        
//        UsuarioResponse usuario = new UsuarioResponse();
//        usuario.setNombre(nombre);
//        usuario.setActivo('s');
//        usuario.setApellidos(apellido);
//        usuario.setCorreo(nombre.toLowerCase()+ "@gmail.com");
//        usuario.setTelefono("+571564246");
//        usuario.setSexo('m');
//        
//        //pruebo servicio rest
//        this.mockMvc.perform(post("/usuario/guardarOModificar.json")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(asJsonString(usuario)))
//                .andDo(print()).andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
//                .andExpect(jsonPath("$.nombre").value(nombre))
//                .andExpect(jsonPath("$.apellido").value(apellido));
//    }
//
//    /**
//     * converts a Java object into JSON representation
//     * @param obj
//     * @return 
//     */
//    public static String asJsonString(final Object obj) {
//        try {
//            return new ObjectMapper().writeValueAsString(obj);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}
