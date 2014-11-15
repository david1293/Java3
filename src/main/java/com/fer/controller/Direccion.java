
package com.fer.controller;

/**
 *
 * @author Flores Caravantes Ferando David
 */
public class Direccion {
    
    private String calle;
    private Long cp;
    private String colonia;
    private String estado;

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", cp=" + cp + ", colonia=" + colonia + ", estado=" + estado + '}';
    }

    public Direccion(String calle, Long cp, String colonia, String estado) {
        this.calle = calle;
        this.cp = cp;
        this.colonia = colonia;
        this.estado = estado;
    }

    public Direccion() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Long getCp() {
        return cp;
    }

    public void setCp(Long cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

   
}
