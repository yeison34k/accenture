/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Yeison Aristizabal
 ** @version 1.0
 *  @descripcion Calse encargada de iniciar la aplicaciòn 
 * https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringApplication.html
 */
@SpringBootApplication
public class MainAccenture {

    /**
     * @param args los argumentos de la línea de comando
     * https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringApplication.html
     */
    public static void main(String[] args) {
        SpringApplication.run(MainAccenture.class, args);
    }
    
}
