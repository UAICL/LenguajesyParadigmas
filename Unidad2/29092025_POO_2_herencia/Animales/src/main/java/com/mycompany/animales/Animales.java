/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animales;

/**
 *
 * @author mat
 */
public class Animales {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //Animal A1 = new Animal(true, 0, "Omnivoro", 5);
        //A1.Comer();
        //A1.Dormir();
        
        Mamifero M1 = new Mamifero(true, 0, "Carnivoro", 2);
        
        M1.Comer();
        
        M1.set_Edad(989); // M1.Edad = 989;
        M1.set_sexo(42); // M1.sexo = 42; 
        
        M1.Comer();
        
        System.out.println("Soy un mamifero que tiene " + M1.get_Edad() + " Años y soy del sexo " + M1.get_string_sexo());
        
        
        Patas p1 = new Patas();
        
    }
}
