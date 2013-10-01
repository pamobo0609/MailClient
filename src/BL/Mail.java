/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;
import javax.mail.internet.MimeBodyPart;
/**
 *
 * @author Jose Pablo MB
 */
public class Mail {
    private String para;
    private String asunto;
    private String cc;
    private MimeBodyPart archivo;
    private String cuerpo;
    
    public Mail(){}

    public Mail(String para, String asunto, String cc, String cuerpo,MimeBodyPart archivo) {
        this.para = para;
        this.asunto = asunto;
        this.cc = cc;
        this.cuerpo = cuerpo;
        this.archivo = archivo;
    }

    public MimeBodyPart getArchivo() {
        return archivo;
    }

    public void setArchivo(MimeBodyPart archivo) {
        this.archivo = archivo;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return "Mail{" + "para=" + para + ", asunto=" + asunto + ", cc=" + cc + ", archivo=" + archivo + ", cuerpo=" + cuerpo + '}';
    }
}
