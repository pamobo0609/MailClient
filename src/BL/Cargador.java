/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author Jose Pablo MB
 */
public class Cargador extends Thread{
    public static void loadBar(JProgressBar barra){
        barra.setValue(0);
        int cont = 0;
        while(cont < 100){
            try {
                Thread.sleep(100);
                cont++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Cargador.class.getName()).log(Level.SEVERE, null, ex);
            }
            barra.setValue(cont);
        }
    }
    //rebebarrantes.hp@outlook.com
}
