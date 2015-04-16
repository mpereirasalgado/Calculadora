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
        contenedor.setOperacion(opcion);
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
                break;
            case 2:
                contenedor.setOperacion(1);
                break;
            case 3:
                contenedor.setOperacion(2);
                break;
            case 4:
                contenedor.setOperacion(3);
                break;
            case 5:
                System.exit(opcion);
                break;
        }
        }while(opcion < 6 );
        
        
        
    }
    public static float realizarOperacion(Modelo contenedor){
        float resultado=0;
        if (contenedor.getOperacion() == 0){
            resultado=contenedor.getNum1()+contenedor.getNum2();
        }else if(contenedor.getOperacion() == 1){
            resultado=contenedor.getNum1()-contenedor.getNum2();
        }else if(contenedor.getOperacion() == 2){
            resultado=contenedor.getNum1()*contenedor.getNum2();
        }else if(contenedor.getOperacion()== 3){
            resultado=contenedor.getNum1()/contenedor.getNum2();
        }
        return resultado;
    }
    
}
