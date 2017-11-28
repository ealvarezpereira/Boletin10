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
public class Juego {

    int cond; //Esta variable es para la condicion de las pistas del if
    String c; //Esta variable es para los showInputDialog

    public void cuerpoJuego() {

        int numr = (int) (Math.random() * 50) + 1;

        System.out.println("Solución: "+numr); //-> Muestra la solución al número random (Modo prueba, no seas tramposo)
        c = JOptionPane.showInputDialog("Elija el número de intentos (Máximo 10)");
        int intentos = Integer.parseInt(c);
        
        while (intentos == 0 || intentos > 10){
            JOptionPane.showMessageDialog(null, "Número inválido");
            c = JOptionPane.showInputDialog("Elija el número de intentos (Máximo 10)");
            intentos = Integer.parseInt(c);
        }
        
        JOptionPane.showMessageDialog(null, "Comencemos!");

        while (intentos != 0) {

            c = JOptionPane.showInputDialog("Número de intentos: " + intentos + "\nIntroduzca un número:");
            int numero2 = Integer.parseInt(c);

            //Aquí calculo la distancia entre el numero random y el introducido.
            //Esto está hecho así para que la distancia nunca de un número negativo.
            if (numr > numero2) {
                //Si el numero random es mayor que el numero introducido que al numero random le reste el introducido 
                cond = numr - numero2;
            } else if (numr < numero2) {
                //Si el numero introducido es mayor que el numero random que al numero introducido le reste el random
                cond = numero2 - numr;
            }

            if (numr == numero2) {
                JOptionPane.showMessageDialog(null, "Has acertado el número!" + "\nEl número era " + numr); //Si aciertas
            } else if (cond > 20) {
                JOptionPane.showMessageDialog(null, "Estás muy lejos! Prueba de nuevo"); //Si la distancia se pasa de 20
            } else if ((cond >= 10) && (cond <= 20)) {
                JOptionPane.showMessageDialog(null, "Estás lejos! Prueba de nuevo"); //Si la distancia esta entre 10 y 20
            } else if ((cond < 10) && (cond > 5)) {
                JOptionPane.showMessageDialog(null, "Estás cerca! Prueba de nuevo"); //Si la distancia esta entre 10 y 5 
            } else if (cond <= 5) {
                JOptionPane.showMessageDialog(null, "Estás muy cerca! Prueba de nuevo"); //Si la distancia es igual o menor de 5
            }

            if (numr != numero2) {

                intentos--;
            }
            if (intentos == 0) {
                JOptionPane.showMessageDialog(null, "Has perdido!" + "\nEl número era " + numr);
            }

            if (numr == numero2) {
                intentos = 0;
            }
        }
    }
}
