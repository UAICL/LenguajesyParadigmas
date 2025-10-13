/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._zoologico;

/**
 *
 * @author mat
 */
public class Animal {
    private boolean vive;
    private int edad;
    private String genero;

    public Animal(boolean vive, int edad, String genero) {
        this.vive = vive;
        this.edad = edad;
        this.genero = genero;
        System.out.println("El objeto Animal ha sido creado");
    }
    
    public void Caminar(){
        System.out.println("El animal está caminando");
    }
    public void Caminar(int patas){
        System.out.println("El animal esta caminando en " + patas + " patas");
    }
    public void Caminar(String nombre){
        System.out.println("El animal llamado " + nombre + " esta caminando");
    }
    public void Caminar(String nombre, int patas){
        System.out.println("El animal llamado " + nombre + " esta caminando en " + patas + " patas" );
    }
    public void Caminar(String nombre, String otrocaminante, int patas){
        System.out.println("Este es el con 3 argumentos y esta caminando");
    }
    

    public boolean getVive() {
        return vive;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
}
