/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.jpc.calculadoranb;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordi
 */
public class RestaTest {
    
    public RestaTest() {
    }

    @Test
    public void testGetResta() {
        System.out.println("getResta");
        double a = 3.0;
        double b = 2.0;
        Resta instance = new Resta();
        double expResult = 1.0;
        double result = instance.getResta(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDecrementa() {
        System.out.println("decrementa");
        double a = 2.0;
        Resta instance = new Resta();
        double expResult = 1.0;
        double result = instance.decrementa(a);
        assertEquals(expResult, result, 0);
    }
    
}
