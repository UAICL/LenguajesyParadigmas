#include "stdio.h"
#include "stdlib.h"

int r = 20; // variable global

int sumar_dos(int n1, int n2){
    int r; 
    r = n1 + n2;
    return r;
} 


int main() {
    int resultado = sumar_dos(10,20);

    printf("Muestra la variable r %d \n ", r);

    long int variable_grande;

    printf("El resultado es %d  \n", resultado);

    printf("El tamaño de un entero es %d bytes o %d bits\n", (int)sizeof(int), 8*(int)sizeof(int));
    printf("El tamaño de un char es %d bytes o %d bits\n", (int)sizeof(char), 8*(int)sizeof(char));
    printf("El tamaño de un long int es %d bytes o %d bits\n", (int)sizeof(long int), 8*(int)sizeof(long int));
    printf("El tamaño de un short int es %d bytes o %d bits\n", (int)sizeof(short int), 8*(int)sizeof(short int));

    short int variable_corta = 32769;
    printf("el valor en variable corta es %d \n", variable_corta);


    int v1 = 100; // variables que utilizan lo que se llama la memoria stack
    {
        int v1 = 200;
        printf("el valor en v1 es %d \n", v1);
        {
            v1 = 300;
            printf("el valor en v1 es %d \n", v1);
        }
        printf("el valor en v1 es %d \n", v1);
    }
    printf("el valor en v1 es %d \n", v1);

    /*
    int *p;
    p : la dirección a la que apunta
    *p: el valor que hay en la dirección a la que apunta
    &p: la dirección donde se almacena el propio puntero
    */

    int v2 = 10;
    int *p = &v2;

    *p = 9;
    printf("El valor en *p es %d \n",*p);
    printf("El valor en v2 es %d \n",v2);

    int* ptr = (int*) malloc(sizeof(int));
    *ptr = 10;
    int *ptr2 = (int*)malloc(sizeof(int)); 
    *ptr2 = 20; 
    printf("El valor en ptr es %d \n",*ptr);

    printf("la memoria esta tomada en %p", ptr2);

    free(ptr);

    return 0;
}