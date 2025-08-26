#include <stdlib.h> // esta en la carpeta del sistema /usr/include
#include <stdio.h>
#include "modulo.h" // esta en la carpeta del proyecto


int main(void) {
    int valor = funcion1(5, 10); // Esta funcion esta en modulo 
    printf("El valor retornado por la funcion1 es: %d\n", valor); 

    // vector con memoria dinámica
    int* vector = (int*)malloc(sizeof(int) * 10 );
    vector[0] = 10;
    vector[1] = 20;
    vector[9] = 999;
    
    free(vector);
    // aca vector ya no es accesible.
    
    
    int filas = 10;
    int columnas = 10;
    // matriz con memoria dinámica. Una matriz es un arreglo de arreglos, por eso se utiliza doble puntero
    int** matriz = malloc(sizeof(int*) * filas);
    for(int i=0; i<filas; i++){
        matriz[i] = malloc(sizeof(int) * columnas);
    }

    matriz[0][0] = 9;
    matriz[0][1] = 88;

    // libero la memoria de la matriz
    for(int i=0; i<filas; i=i+4){
        free(matriz[i]);
    }
    free(matriz);


    int variable;
    printf("Esta variable esta en la direccion %p ", &variable);

    return 0;
}