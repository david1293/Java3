package com.fer.controller;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author T107
 */

@Controller
@RequestMapping("/")


public class ControladorHola {
 
    
    //PRIMERO HACEMOS EL GET 
    @RequestMapping(value="/hola",method =RequestMethod.GET,headers={"Accept=text/html"})
 
    public @ResponseBody String holaConGet(){
    

   return"Este es mi primer controller con un get"; 

            }
    
    //crear un metodo get para los usuarios que me devuelva todos
    
    @RequestMapping(value="/usuario",method = RequestMethod.GET, headers = {"Accept=Aplication/json"})
    public @ResponseBody String obtenerTodos() throws IOException{
        //vamos a utilizar la implementacion 
    ObjectMapper mapper = new ObjectMapper();
    
    return mapper.writeValueAsString(GenerarUsuarios.obtenerUsuarios());
    }

}
