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
        CuentaBancaria cuentarut_juanperez = new CuentaBancaria(1000, "Juan Perez", 1234560); 
        CuentaBancaria cuentacorriente_joseluis = new CuentaBancaria(999999999, "Jose Luis Rodriguez", 6781627);
        
        int dinero_en_efectivo = 10;
        
        cuentarut_juanperez.depositar(1000000); 
        dinero_en_efectivo += cuentarut_juanperez.retirar(200000);
        
        System.out.print("En mi bolsillo tengo en efectivo la suma de ");
        System.out.println(dinero_en_efectivo);
        
        
        System.out.println("Ingrese un valor");
        Scanner sc = new Scanner(System.in);
        int valoringresado = sc.nextInt();
        System.out.println("El valor ingresado es " + valoringresado);
        
        
        
        
        
        
        
    }
}
