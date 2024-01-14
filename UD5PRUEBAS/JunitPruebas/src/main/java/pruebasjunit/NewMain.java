/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasjunit;

/**
 *
 * @author Jordi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Coche c0 = new Coche ("Audi TT", 1000);
        Coche.impuesto = 20f;
        System.out.println(c0.modelo + " - Precio final: "+ c0.precioFinal(10f));
        Coche c1 = new Coche ("BMW 320", 10000);
        Coche.impuesto = 20f;
        System.out.println(c1.modelo + " - Precio final: "+ c1.precioFinal(10f));
        Coche c2 = new Coche ("Tesla", 10000);
        Coche.impuesto = 20f;
        System.out.println(c2.modelo + " - Precio final: "+ c2.precioFinal(110f));
    }
    
}
