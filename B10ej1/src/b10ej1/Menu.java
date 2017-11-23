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
public class Menu {

    //Scanner sc = new Scanner(System.in);
    Juego jgo = new Juego();
    int var;

    public void menuu() {

        //System.out.println("**** MENU ****\n1.- Empezar\n2.-Salir");
        //var = sc.nextInt();
        String a = JOptionPane.showInputDialog("**** MENU ****\n1.- Empezar\n0.-Salir");
        var = Integer.parseInt(a);

        while (var > 0) {
            switch (var) {
                case 1:
                    jgo.cuerpoJuego();
                    break;
                case 0:
                    /*System.out.println("Saliendo...");*/ JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Número inválido");
                    break;
            }
            //System.out.println("**** MENU ****\n1.- Empezar\n2.-Salir");
            //var = sc.nextInt();
            String b = JOptionPane.showInputDialog("**** MENU ****\n1.- Empezar\n0.-Salir");
            var = Integer.parseInt(b);
        }
    }
}
