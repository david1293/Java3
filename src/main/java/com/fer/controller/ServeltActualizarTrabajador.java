
package com.fer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.HbmBinder;

/**
 *
 * @author T107
 */
public class ServeltActualizarTrabajador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //2
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //3:abrir 
        SessionFactory factory= HibernateUtilidades.getSessionFactory();
        Session sesion=factory.openSession();
        Transaction tranza=sesion.beginTransaction(); 
       
        //4:
        String id= request.getParameter("id");
        String nombre= request.getParameter("nombre");
        String paterno= request.getParameter("paterno");
        String materno= request.getParameter("materno");
        
        Trabajador t=new Trabajador();
        t.setIdTrabajador(new Integer(id));
        t.setNombre(nombre);
        t.setPaterno(paterno);
        t.setMaterno(materno);
        sesion.update(t);
        tranza.commit();
        sesion.close();
        
        System.out.println("Trabajador actualizado");
    }
    }


