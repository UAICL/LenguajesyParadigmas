/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._zoologico;

/**
 *
 * @author mat
 */
public class Gato extends Animal implements Atacante{
    private int vidas;

    public Gato(int vidas, boolean vive, int edad, String genero) {
        super(vive, edad, genero);
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    public void Atacar(Animal atacado){
        System.out.println("Estoy atacando a un "+ atacado.getClass().getSimpleName()  +   "!!");
        
        if(atacado.getClass().getSimpleName().equals("Perro")) {
            System.out.println("Voy a atacar a un perro al lomo porque es de mayor tamaño que yo");
        }
        if(atacado.getClass().getSimpleName() == "Gato") {
            System.out.println("Ataco con arañasos al otro gato");
        }
        
        //if("jose" == "jose")
        //if("jose".equals("jose"))
        
    }
    
    
    
}
