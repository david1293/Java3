
package com.fer.controller;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class GenerarUsuarios {
    public static ArrayList<Usuario> obtenerUsuarios(){
      ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        
        //primero creamos tres direcciones 
        Direccion d1=new Direccion("calle de la muerte",12345,"Azteca","Mexico");
        Direccion d2=new Direccion("calle de la amargura",54321,"San geronimo","Monterrey");
        Direccion d3=new Direccion("calle 13",12346,"regue","Guadalajara"); 
        
          //ahora asociamos la direcciones a los usuarios
        Usuario u1=new Usuario("Juan",42,45000,d1);
        Usuario u2=new Usuario("Paquita",64,67000,d2);
        Usuario u3=new Usuario("ludoviko",21,5000,d3);
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        return usuarios; 
            
        
        
        
        
    }
    
   }
