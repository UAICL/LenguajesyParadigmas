/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;

/**
 *
 * @author mat
 */
public class Mamifero extends Animal {
    private int meses_gestacion;
    private boolean pelaje; // tiene o no tiene pelaje
    public Patas P; 
    public Dueno D;
    
    public void Hacer_Ruido(){
        System.out.println("-- Siii");
    }
    
    @Override
    public void Comer(){
        System.out.println("Estoy comiendo de todo porque soy mamifero");
    }
    
    public Mamifero(boolean vivo_muerto, int sexo, String dieta, int Edad){
        super(vivo_muerto, sexo, dieta, Edad); // llama al constructor de la clase padre
        this.P = new Patas(); // relacion por composicion (al borrarlo se elimina tambien el objeto relacionado por composicion)
        System.out.println("- Se ha creado un nuevo mamifero");
    }
    
    
}
