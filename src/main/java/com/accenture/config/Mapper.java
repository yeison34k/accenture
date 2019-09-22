/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Yeison Aristizabal
 * @version 1.0
 * @descripcion Definir configuraciòn para hacer la transformaciòn de entidades y dtos
 */
@Configuration
public class Mapper {
    
    @Bean
    public org.dozer.Mapper beanMapper() {
        return new DozerBeanMapper();
    }  
}
