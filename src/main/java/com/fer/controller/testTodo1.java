
package com.fer.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class testTodo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //paso 1 abrir la sessionFactory
            SessionFactory factoty= HibernateUtilidades.getSessionFactory();
            Session sesion=  factoty.openSession();
        //empezar una transaccion 
             Transaction tranza= sesion.beginTransaction();
        //haremos un insert 
             Trabajador t=new Trabajador("petra","rodriguez","gomez"); 
             
             sesion.save(t);
        //liberamos la transaccion 
             tranza.commit();
        //cerramos la sesion  
             sesion.close();
             
    }
    
    
}
