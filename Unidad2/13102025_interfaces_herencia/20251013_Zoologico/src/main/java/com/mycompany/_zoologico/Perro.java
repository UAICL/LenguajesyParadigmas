/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._zoologico;

/**
 *
 * @author mat
 */
public class Perro extends Animal implements Alimentable, Peludo  {
    private boolean cola;
    
    public Perro(boolean cola, boolean vive, int edad, String genero) {
        super(vive, edad, genero);
        this.cola = cola;
    }
    
    //@Override
    public void Caminar(){
        System.out.println("Estoy caminando como perro!");
    }
    
    public void Comer(){
        System.out.println("Estoy comiendo");
    }
    public void Comer(int cantidad){
        System.out.println("Estoy comiendo " + cantidad + " esta cantidad de alimento");
    }
    public void Pelechar(){
        System.out.println("Estoy botando mucho pelo!");
    }
    
    
    
}
