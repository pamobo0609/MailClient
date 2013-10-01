/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
 * @author Jose Pablo MB
 */
public class Contacto {
    private String correoElectronico;
    private String apodo;

    public Contacto(String correoElectronico, String apodo) {
        this.correoElectronico = correoElectronico;
        this.apodo = apodo;
    }
    
    public Contacto(){}

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Contacto{" + "correoElectronico=" + correoElectronico + ", apodo=" + apodo + '}';
    }        
}
