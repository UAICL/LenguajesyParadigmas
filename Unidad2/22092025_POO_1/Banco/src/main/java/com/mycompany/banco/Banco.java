/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

import java.util.Scanner;

/**
 *
 * @author mat
 */
public class Banco {

    public static void main(String[] args) {
        // Un objeto es una instancia de una clase. De una clase podriamos construir varios objetos.
        // Aca hay dos objetos de la misma clase
        CuentaBancaria cuentarut_juanperez = new CuentaBancaria(1000, "Juan Perez", 1234560); 
        CuentaBancaria cuentacorriente_joseluis = new CuentaBancaria(999999999, "Jose Luis Rodriguez", 6781627);
        
        int dinero_en_efectivo = 10;
        
        cuentarut_juanperez.depositar(1000000); 
        dinero_en_efectivo += cuentarut_juanperez.retirar(200000);
        
        System.out.print("En mi bolsillo tengo en efectivo la suma de ");
        System.out.println(dinero_en_efectivo);
        
        
        // Ejercicio: Utilizando la clase cuentabancaria y una variable llamada bolsillo,
        // Reciba por teclado la operacion que desea realizar (depositar o retirar) y cual sera el monto
        /*
        El esquema del menu es el siguiente: 
        
        while(valor ingresado sea distinto de cero)
            pedir operacion
            pedir monto
            mostrar dinero en el bolsillo
        */
        int bolsillo = 1000;
        CuentaBancaria cb = new CuentaBancaria(100000, "Juan Perez", 12345);
        
        System.out.println("Ejecute 0 para salir, 1 para depositar y 2 para retirar");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        while(op != 0){
            if(op == 1){
                System.out.println("Ingrese el monto a depositar");
                int monto = sc.nextInt();
                if(bolsillo >= monto){
                    cb.depositar(monto);
                    bolsillo -= monto;
                    System.out.println("En el bolsillo tengo " + bolsillo + " y en la cuenta tengo " + cb.monto );
                }
                else {
                    System.out.println("Operacion no permitida. No tienes dinero suficiente");
                }
            }
            if(op == 2){
                // codigo del retiro
                System.out.println("Ingrese el monto a retirar"); // sout
                int monto = sc.nextInt();
                bolsillo += cb.retirar(monto);
                System.out.println("En el bolsillo tengo " + bolsillo + " y en la cuenta tengo " + cb.monto );               
                
            }
            
            System.out.println("Ejecute 0 para salir, 1 para depositar y 2 para retirar");
            op = sc.nextInt();            
        }  
    }
}
