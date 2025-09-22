/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author mat
 */ 
public class CuentaBancaria {
    public int monto; 
    public String nombre_propietario;
    public int numero_cuenta;
    
    // Construictor es un metodo que tiene el mismo nombre de la clase y es el encargado de definir los atributos iniciales del objeto
    public CuentaBancaria(int monto, String nombre, int nocuenta) {
        System.out.println("Cuenta banciara creada");
        this.monto = monto;
        this.nombre_propietario = nombre;
        this.numero_cuenta = nocuenta;
        System.out.println("La cuenta quedo a nombre de " + this.nombre_propietario);
    }
    
    public int retirar(int monto){
        if(monto > 0){
            if(this.monto >= monto){
                this.monto = this.monto - monto;
                return monto;
            }
            else {
                System.out.println("Usted no cuenta con el dinero suficiente para esta transaccion");
            }
        }
        else {
            System.out.println("Usted no puede retirar saldo negativo");
        }
        return 0;
    }
    
    public void depositar(int monto){
        if(monto > 0){
            this.monto += monto;
            System.out.print("Se deposito en la cuenta la suma de ");
            System.out.println(monto);
        }
    }
  
}
