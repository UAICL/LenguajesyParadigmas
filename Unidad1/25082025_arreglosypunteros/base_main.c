#include <stdio.h>
#include <stdlib.h>

int main(void) {
    printf("Hola, mundo!\n");    

    int vector[10];         // Arreglo de una dimensión con 10 elementos
    int matriz[10][10];     // Arreglo de dos dimensiones 10x10

   
    int *vector_dinamico = (int *)malloc(10 * sizeof(int));
    vector_dinamico[0] = 5;
    vector_dinamico[1] = 10;
    printf("vector_dinamico[0] = %d\n", vector_dinamico[0]);
    printf("vector_dinamico[1] = %d\n", vector_dinamico[1]);
    
    int **matriz_dinamica = (int **)malloc(10 * sizeof(int*));
    


    // liberar memoria
    free(vector_dinamico);
    for (int i = 0; i < 10; i++) {
        free(matriz_dinamica[i]);
    }
    free(matriz_dinamica);

    return 0;
}
