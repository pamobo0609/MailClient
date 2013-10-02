/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

/**
 *
 * @author Jose Pablo MB
 */
public class TOCorreo {
    private String correo;
    private String contrasena;
    private String apodo;
    private Boolean porDefecto;

    public TOCorreo() {
    }

    public TOCorreo(String correo, String contrasena, String apodo, Boolean porDefecto) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.apodo = apodo;
        this.porDefecto = porDefecto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Boolean getPorDefecto() {
        return porDefecto;
    }

    public void setPorDefecto(Boolean porDefecto) {
        this.porDefecto = porDefecto;
    }

    @Override
    public String toString() {
        return "TOCorreo{" + "correo=" + correo + ", contrasena=" + contrasena + ", apodo=" + apodo + ", porDefecto=" + porDefecto + '}';
    }    
}
