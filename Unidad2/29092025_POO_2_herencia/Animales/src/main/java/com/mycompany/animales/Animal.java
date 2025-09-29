/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;

/**
 *
 * @author mat
 */
public class Animal {
    private boolean vive;
    private int sexo;
    private String dieta;
    private int Edad;
    
    public Animal(boolean vom, int s, String dieta, int Edad){
        this.vive = vom;
        this.sexo = s;
        this.dieta = dieta;
        this.Edad = Edad;
        System.out.println("+ Se ha creado un nuevo animal");
    }
    
    protected void Comer(){
        System.out.println("Estoy comiendo como un Animal");
    }
    public void Dormir(){
        System.out.println("Estoy durmiendo como un Animal");
    }
    
    // Seters y Geters 
    public void set_vive(boolean vive){
        this.vive = vive;
    }
    
    public void set_sexo(int sexo){
        if(sexo != 0 && sexo != 1) 
            this.sexo = 2;
        else 
            this.sexo = sexo;
    }
    
    public void set_dieta(String dieta){
        this.dieta = dieta;
    }
    
    public void set_Edad(int Edad){
        this.Edad = Edad;
    }
    
    public int get_Edad(){
        return this.Edad;
    }
    
    public int get_sexo(){
        return this.sexo;
    }
    public String get_string_sexo(){
        switch (this.sexo) {
            case 0:
                return "Masculino";
            case 1:
                return "Femenino";
            default:
                return "No binario";
        }
    }
    
    
    
}
