/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacioncalcula2;

/**
 *
 * @author mpereirasalgado
 */
public class logic {
    public static float realizarOperacion(Modelo contenedor){
        float opRealizada = 0;
        if (contenedor.getOperacion() == 0){
            contenedor.setResultado(contenedor.getNum1()+contenedor.getNum2());
            opRealizada = contenedor.getResultado();
        }else if(contenedor.getOperacion() == 1){
            contenedor.setResultado(contenedor.getNum1()-contenedor.getNum2());
            opRealizada = contenedor.getResultado();
        }else if(contenedor.getOperacion() == 2){
            contenedor.setResultado(contenedor.getNum1()*contenedor.getNum2());
            opRealizada = contenedor.getResultado();
        }else if(contenedor.getOperacion()== 3){
            contenedor.setResultado(contenedor.getNum1()/contenedor.getNum2());
            opRealizada = contenedor.getResultado();
        }
        
        return opRealizada;
    }
    
}
