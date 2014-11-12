
package segundo.parcial;

/**
 *
 * @FCFD
 */
public class ServicioSuperficie {
    Superficie superficie;

    public ServicioSuperficie() {
    }

    public ServicioSuperficie(Superficie superficie) {
        this.superficie = superficie;
    }
    public String ServicioArea(){
        return superficie.calcularArea();
    }
}
