/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b10ej1;

//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Juego {

    //El código que está comentado está hecho sin el JOptionPane. Funciona bien.
    int var;
    //Scanner sc = new Scanner(System.in);

    public void cuerpoJuego() {

        //System.out.println("Jugador 1. Elija un número entre 1 y 50");
        //int numero1 =  sc.nextInt();
        JOptionPane.showMessageDialog(null, "Jugador 1. Elija un número entre 1 y 50");
        String a = JOptionPane.showInputDialog("Ingrese un numero: ");
        int numero1 = Integer.parseInt(a);

        /*while (numero1>50 || numero1<1){
           System.out.println("Error, no puede ser mayor de 50 ni menor de 1. Vuelva a introducirlo");
           numero1 = sc.nextInt();
       }*/
        while (numero1 > 50 || numero1 < 1) {
            System.out.println("");
            String b = JOptionPane.showInputDialog("Error, no puede ser mayor de 50 ni menor de 1.");
            numero1 = Integer.parseInt(b);
        }

        //System.out.println("Jugador 1. Elija el número de intentos");
        //var = sc.nextInt();
        String c = JOptionPane.showInputDialog("Elija el número de intentos");
        int intentos = Integer.parseInt(c);

        //System.out.println("Jugador 2. Pulse enter para iniciar");
        //String espacio = sc.nextLine();
        //System.out.println("Comencemos!");
        JOptionPane.showMessageDialog(null, "Comencemos!");

        while (intentos != 0) {
            //System.out.println("Número de intentos: "+var+"\nIntroduzca un número:");
            //int numero2 = sc.nextInt();
            String d = JOptionPane.showInputDialog("Número de intentos: " + intentos + "\nIntroduzca un número:");
            int numero2 = Integer.parseInt(d);

            if (numero1 == numero2) {
                //System.out.println("Has acertado el número!");
                JOptionPane.showMessageDialog(null, "Has acertado el número!");
            } else if (numero1 > numero2) {
                //System.out.println("El número que has elegido es menor que el que debes adivinar. Prueba de nuevo");
                JOptionPane.showMessageDialog(null, "El número es mayor que " + numero2);
            } else {
                //System.out.println("El número que has elegido es mayor que el que debes adivinar. Prueba de nuevo");
                JOptionPane.showMessageDialog(null, "El número es menor que " + numero2);
            }
            if (numero1 != numero2) {
                intentos--;
            }
            if (intentos == 0) {
                JOptionPane.showMessageDialog(null, "Has perdido!" + "\nEl número era " + numero1);
            }
            if (numero1 == numero2) {
                intentos = 0;
            }
        }
    }
}
