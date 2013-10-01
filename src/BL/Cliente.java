/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.util.ArrayList;

/**
 *
 * @author Jose Pablo MB
 */
public class Cliente {
    private ArrayList<Mail> bandejaEntrada;
    private ArrayList<Mail> elementosEnviados;
    private ArrayList<Mail> borradores;
    private ArrayList<Mail> thrash;
    private ArrayList<Contacto> contactos;

    public Cliente() {
    }

    public Cliente(ArrayList<Mail> bandejaEntrada, ArrayList<Mail> elementosEnviados, ArrayList<Mail> borradores, ArrayList<Mail> thrash, ArrayList<Contacto> contactos) {
        this.bandejaEntrada = bandejaEntrada;
        this.elementosEnviados = elementosEnviados;
        this.borradores = borradores;
        this.thrash = thrash;
        this.contactos = contactos;
    }

    public ArrayList<Mail> getBandejaEntrada() {
        return bandejaEntrada;
    }

    public void setBandejaEntrada(ArrayList<Mail> bandejaEntrada) {
        this.bandejaEntrada = bandejaEntrada;
    }

    public ArrayList<Mail> getElementosEnviados() {
        return elementosEnviados;
    }

    public void setElementosEnviados(ArrayList<Mail> elementosEnviados) {
        this.elementosEnviados = elementosEnviados;
    }

    public ArrayList<Mail> getBorradores() {
        return borradores;
    }

    public void setBorradores(ArrayList<Mail> borradores) {
        this.borradores = borradores;
    }

    public ArrayList<Mail> getThrash() {
        return thrash;
    }

    public void setThrash(ArrayList<Mail> thrash) {
        this.thrash = thrash;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "bandejaEntrada=" + bandejaEntrada + ", elementosEnviados=" + elementosEnviados + ", borradores=" + borradores + ", thrash=" + thrash + ", contactos=" + contactos + '}';
    }        
}
