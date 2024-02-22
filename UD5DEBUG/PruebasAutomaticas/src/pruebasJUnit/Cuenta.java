/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasJUnit;

/**
 *
 * @author Jordi
 */
public class Cuenta {
    // Atributos
    private String numero; //Número cuenta bancaria
    private float  saldo;  //Saldo cuenta
    // Constructor
    public Cuenta (String numCta, float saldoCta){
        numero=numCta;
        saldo=saldoCta;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setNumero(String numCta){
        numero=numCta;
    }
    
    public void setSaldo(float saldoCta){
        saldo=saldoCta;
    }
    
    public void ingresarDinero(float importe){
        saldo = saldo + importe;
    }
    
    public void retirarDinero(float importe){
        saldo = saldo - importe;
    }
    
    public void mostrarCuenta(){
        System.out.println("Nº Cuenta: " + getNumero());
        System.err.println("Saldo actual: "+ getSaldo()+" €");
    }
}
