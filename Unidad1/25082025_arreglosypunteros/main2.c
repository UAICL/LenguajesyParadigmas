#include <stdio.h>
#include <stdlib.h>

struct cuadrado{
    int lado;
    int area;
} typedef cuadrado;


int main(void) {
    // se utiliza punto para acceder a los campos de una estructura cuando se tiene una variable de tipo estructura
    cuadrado c1; 
    c1.lado = 5;
    c1.area = c1.lado * c1.lado; 
    printf("El area del cuadrado es: %d\n", c1.area);
    
    //
    cuadrado* c2 = (cuadrado*) malloc(sizeof(cuadrado));
    c2->lado = 10;
    c2->area = c2->lado * c2->lado;  
    printf("El area del cuadrado es: %d\n", c2->area);
    free(c2);

    return 0;
}