/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncalcula2;

import javax.swing.JOptionPane;

/**
 *
 * @author micaelr
 */
public class Vista {
    public static void menu(Modelo contenedor){
        int opcion = 0;
        do{
            switch(Integer.parseInt(JOptionPane.showInputDialog("****MENU****\n"
                    + "1.- SUMA\n"
                    + "2.- RESTA\n"
                    + "3.- MULTIPLICACION\n"
                    + "4.- DIVISION\n"
                    + "5.- SALIR\n"))){
                case 1:
                    contenedor.setOperacion(0);
                    logic.realizarOperacion(contenedor);
                    Vista.Imprimir(contenedor);
                    break;
                case 2:
                    contenedor.setOperacion(1);
                     logic.realizarOperacion(contenedor);
                     Vista.Imprimir(contenedor);
                    break;
                case 3:
                    contenedor.setOperacion(2);
                     logic.realizarOperacion(contenedor);
                     Vista.Imprimir(contenedor);
                    break;
                case 4:
                    contenedor.setOperacion(3);
                     logic.realizarOperacion(contenedor);
                     Vista.Imprimir(contenedor);
                    break;
                case 5:
                    System.exit(opcion);
                    break;
            }
            
        }while(opcion < 6 );
    }
    public static void Imprimir(Modelo contenedor){
        if (contenedor.getOperacion() == 0){
            JOptionPane.showMessageDialog(null, "La suma de "+contenedor.getNum1()+" + "+contenedor.getNum2()+" es = "+contenedor.getResultado());
        }else if(contenedor.getOperacion() == 1){
            JOptionPane.showMessageDialog(null, "La resta de "+contenedor.getNum1()+" - "+contenedor.getNum2()+" es = "+contenedor.getResultado());
        }else if(contenedor.getOperacion() == 2){
            JOptionPane.showMessageDialog(null, "La multiplicacion de "+contenedor.getNum1()+" * "+contenedor.getNum2()+" es = "+contenedor.getResultado());
        }else if(contenedor.getOperacion()== 3){
            JOptionPane.showMessageDialog(null, "La division de "+contenedor.getNum1()+" / "+contenedor.getNum2()+" es = "+contenedor.getResultado());
        }
    }
}
