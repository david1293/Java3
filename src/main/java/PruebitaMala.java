
import com.fer.controller.Trabajador;
import com.fer.controller.UtilidadesHibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T
 */
public class PruebitaMala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //pasos para la transaccion
          SessionFactory factory= UtilidadesHibernate.getSessionFactory();
                  //ABRIR LA SESION
                 Session sesion= factory.openSession();
                 
                 //importante: empezar la sesion
                 
                  Transaction t=  sesion.beginTransaction();
                  //operacion
                 sesion.save(new Trabajador("David","Flores","Caravantes"));
                 
                  //se libera el candado
                  t.commit();
    //cerramos session factory
                  factory.close();
                  
    
    }
    
    

    private static class utilidadesHibernate {

        public utilidadesHibernate() {
        }
    }
    
}
