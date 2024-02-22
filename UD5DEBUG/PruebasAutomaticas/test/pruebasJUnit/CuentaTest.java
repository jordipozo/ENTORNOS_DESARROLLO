/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pruebasJUnit;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*; 




/**
 *
 * @author Jordi
 */
public class CuentaTest {
    
     
    
    public CuentaTest() {
     
    }
    

    /**
     * Test of getNumero method, of class Cuenta.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
       // Cuenta instance = null;
        Cuenta cuenta1 = new Cuenta("ES011234",100); 
        String expResult = "ES011234"; // Valor esperado del Número de cuenta
       // String result = instance.getNumero();
        String result = cuenta1.getNumero();
        assertEquals("Correcto",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class Cuenta.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
       // Cuenta instance = null;
        Cuenta cuenta1 = new Cuenta("ES011234",100); 
        float expResult = 100.0F; // Colocamos el valor esperado del saldo
       // float result = instance.getSaldo();
        float result = cuenta1.getSaldo();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Cuenta.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numCta = "ES011234";
        Cuenta cuenta1 = new Cuenta("ES011234",100); 
        cuenta1.setNumero(numCta);
        assertEquals(numCta, cuenta1.getNumero());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class Cuenta.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        float saldoCta = 100.0F;
        Cuenta cuenta1 = new Cuenta("ES011234",100); 
        cuenta1.setSaldo(saldoCta);
        assertEquals(saldoCta, cuenta1.getSaldo());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ingresarDinero method, of class Cuenta.
     */
    @Test
    public void testIngresarDinero() {
        System.out.println("ingresarDinero");
        Cuenta cuenta1 = new Cuenta("ES011234",100); 
        float importe = 400.0F;
        cuenta1.ingresarDinero(importe);
        assertEquals(500.0F,cuenta1.getSaldo());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of retirarDinero method, of class Cuenta.
     */
    @Test
    public void testRetirarDinero() {
        System.out.println("retirarDinero");
        Cuenta cuenta1 = new Cuenta("ES011234",100); 
        float importe = 20.0F;
        cuenta1.retirarDinero(importe);
        assertEquals(80.0F,cuenta1.getSaldo());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCuenta method, of class Cuenta.
     */
    @Test
    public void testMostrarCuenta() {
        Cuenta cuenta1 = new Cuenta("ES011234",100); 
        System.out.println("mostrarCuenta");
        cuenta1.mostrarCuenta();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
