/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._zoologico;

/**
 *
 * @author mat
 */
public class App {

    public static void main(String[] args) {
        /*
        Animal jirafa = new Animal(true, 10, "femenino");
        jirafa.Caminar();
        jirafa.Caminar(4);
        jirafa.Caminar("Dolly");
        jirafa.Caminar("Lucy", 2);
        jirafa.Caminar("Lucy", "Femenino", 3);
        */
        
        Perro boby = new Perro(true, true, 8, "masculino" );
        boby.Caminar();        
        
        Gato chester = new Gato(7, true, 1, "Masculino"); 
        chester.Caminar();
        
        chester.Atacar(boby);
        chester.Atacar(chester);
        
        CachorroDeGato m = new CachorroDeGato(7, true, 0, "Masculino");
        chester.Atacar(m);
        
        
    }
}
