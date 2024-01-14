/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pruebasjunit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author Jordi
 */
public class CocheTest {
    
    static Coche instance;
    
    public CocheTest() {
    }

    
    @BeforeAll // Codigo a ejecutar antes de todos los test
    public static void setUpClass() {
        // creamos una instancia coche que se va a utilizar en los 3 test
        instance =  new Coche ("Audi TT", 10000);
        Coche.impuesto = 20f;
    }
    
    @AfterAll // Codigo a ejecutar despues de todos los test
    public static void tearDownClass() {
    }
    
    @BeforeEach // Codigo a ejecutar antes de cada uno de los test
    public void setUp() {
        System.out.println("-----------------Comienzo del test------------");
    }
    
    @AfterEach // Codigo a ejecutar despues de cada uno de los test
    public void tearDown() {
        System.out.println("Hora: " +LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
    }

    /**
     * Test of precioFinal method, of class Coche.
     */
    @Test
    public void testPrecioFinal1() throws Exception {
        System.out.println("precioFinal1");
        float descuento = 10.0F;
        float expResult = 10800;
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.000001);
    }
    
    @Test
    public void testPrecioFinal2() throws Exception {
        System.out.println("precioFinal2");
        float descuento = 10.0F;
        instance.precioBase = 1000;
        float expResult = 1200;
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.000001);
    }
    
    @Test
    public void testPrecioFinal3() throws Exception {
        System.out.println("precioFinal3 descuento incorrecto");
        float descuento = 110.0F; //descuento incorrecto. Superior al 100
        assertThrows(Exception.class, new Executable() { // probamos que se ejecute la excepción
            @Override
            public void execute() throws Throwable {
                float result = instance.precioFinal(150f);
            }
        });
    }
    
}
