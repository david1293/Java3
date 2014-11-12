package com.fer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author T107
 */

@Controller
@RequestMapping("/")


public class ControladorHola {
 
    
    //PRIMERO HACEMOS EL GET 
    @RequestMapping(value="/hola",method =RequestMethod.GET,headers={"Accept=text/html"})
 
    public @ReponseBody String holaConGet(){
    

   return"Este es mi primer controller con un get"; 

            }

}
