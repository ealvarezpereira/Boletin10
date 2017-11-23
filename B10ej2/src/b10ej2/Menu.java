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
    
    public void home(){
        
        String a = JOptionPane.showInputDialog("**** MENU ****\n1.- Empezar\n0.-Salir");
        var = Integer.parseInt(a);
        
       while (var > 0){
            switch (var){

               case 1: jgo.cuerpoJuego();
                   break;
               case 0: JOptionPane.showMessageDialog(null, "Saliendo...");
                   break;
               default: JOptionPane.showMessageDialog(null, "Número inválido");
                   break;
            }           
            String b = JOptionPane.showInputDialog("**** MENU ****\n1.- Empezar\n0.-Salir");
            var = Integer.parseInt(b);
       }
    }
}
