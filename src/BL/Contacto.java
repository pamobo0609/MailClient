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
    
    public boolean agregarContacto(){
        if(Cliente.getInstancia().getContactos().indexOf(correoElectronico) == -1){
            Cliente.getInstancia().getContactos().add(this);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean editarContacto() {
        int donde = Cliente.getInstancia().getContactos().indexOf(correoElectronico);
        Cliente.getInstancia().getContactos().remove(donde);        
        Cliente.getInstancia().getContactos().add(this);        
        return true;
    }
    
}
