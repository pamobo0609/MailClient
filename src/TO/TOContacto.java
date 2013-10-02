/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

/**
 *
 * @author Jose Pablo MB
 */
public class TOContacto {
    private String correoElectronico;
    private String apodo;

    public TOContacto() {
    }

    public TOContacto(String correoElectronico, String apodo) {
        this.correoElectronico = correoElectronico;
        this.apodo = apodo;
    }

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
        return "TOContacto{" + "correoElectronico=" + correoElectronico + ", apodo=" + apodo + '}';
    }    
}
