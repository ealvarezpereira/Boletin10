/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b10ej2;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Menu {

    Juego jgo = new Juego();
    int var;

    public void home() {
        //El showConfirmDialog sirve para que te aparezcan los botones
        var = JOptionPane.showConfirmDialog(null, "¿Jugamos?");

        while (var == JOptionPane.YES_OPTION) {
            switch (var) {
                                //Si pulsas el boton sí que llame al juego
                case JOptionPane.YES_OPTION:
                    jgo.cuerpoJuego();
                    break;      //Si pulsas el boton no que salga del juego
                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
            var = JOptionPane.showConfirmDialog(null, "¿Jugamos?");
        }
    }
}
