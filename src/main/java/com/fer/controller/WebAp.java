
package com.fer.controller;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 *
 * @author FCFD
 */
public class WebAp extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
      System.out.println(">>>>>>>>>>Cargando configuracion de clase de config");
      return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println(">>>>>>>><Crgando configuracion de servelt");
        return new Class<?>[]{WepApConfig.class};
    }
    
    @Override
    protected String[] getServletMappings() {
          System.out.println(">>>>>>>><Crgando configuracion de servelt");
        return new String[]{"/servicios/*"};
    }
  }