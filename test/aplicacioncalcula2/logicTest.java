/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacioncalcula2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mpereirasalgado
 */
public class logicTest {
    
    public logicTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of realizarOperacion method, of class logic.
     */
    @Test
    public void testRealizarOperacion() {
        System.out.println("realizarOperacion");
        Modelo contenedor = new Modelo(2,3,2,6);
        float expResult = 6F;
        float result = logic.realizarOperacion(contenedor);
        assertEquals(expResult, result, 6);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
