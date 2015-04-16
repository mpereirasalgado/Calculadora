//se introduce dos numeros tipo float
//se elige una operacion (+-*/)
//se muestra el resultado
//MVC
//trataremos vista(salida del programa)
//modelo(almacenamiento de datos)
//controlador(logica)
//CREAMOS UNA CLASE PRINCIPAL QUE SE LLAMA CALCULA2:
//CON MAIN, CON INTRODUCIRVALOR DENTRO DEL MAIN, ELEGIR OPERACION, HACER OPERACION, IMPRIMIR OPERACION, METODO REALIZA OPERACION, 
//CLASE QUE SE LLAMA MODELO SOLO CON ATRIBUTOS DE CLASE
//NUM1
//NUM2
//OPERACION
//RESULTADO
//METODOS GET/SET
//CLASE QUE SE LLAMA VISTA (NO SE INSTANCIA)
//STATIC IMPRIMIR(VOID)

package aplicacioncalcula2;

import javax.swing.JOptionPane;

/**
 *
 * @author mpereirasalgado
 */
public class AplicacionCalcula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo contenedor = new Modelo();
        contenedor.setNum1(Float.NaN);
        contenedor.setNum2(Float.NaN);
        do{
            swicht(Integer.parseInt(JOptionPane.showInputDialog("****MENU****\n")))
        }
        
    }
    public 
    
}
