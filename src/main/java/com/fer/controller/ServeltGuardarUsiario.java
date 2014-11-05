
package com.fer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author T107
 */
public class ServeltGuardarUsiario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        SessionFactory factory=  HibernateUtilidades.getSessionFactory();
        Session sesion= factory.openSession(); 
        Transaction tranza =sesion.beginTransaction();
       
        sesion.update(new Trabajador(2,"rata","de","dos patas")); //selecciona y actualiza 
        //sesion.delete(new Trabajador(1));//solo cojn poner el id elimina el usuario existente
        sesion.createCriteria(Trabajador.class).list();//clase trabajador 
        //buscar por todos
        ArrayList<Trabajador> tra=(ArrayList<Trabajador>)sesion.createCriteria(Trabajador.class).list();
        for(Trabajador tonto:tra){
            System.out.println(tonto); 
            }
        
       //buscar por id 
        sesion.createCriteria(Trabajador.class).add(Restrictions.idEq(3)).uniqueResult();
        
        
        sesion.save(new Trabajador(1,"david","flores","caravantes"));
        tranza.commit();                                                    
        sesion.close();
        System.out.println("ya esta guardado este trabajador");
    }
                                                                                                                                                    

}
