# estadistica
Public Class estadistica;

#define MAX 10
int main(int argc, char *argv[])
{
    
    int numeros[MAX];
    int contador=0;
    int auxiliar[MAX];
    int posicion=0;
    int numero=0;
    int contador2=0;
    int mayor=0;
    int posicionmayor=0;
    int bandera=0;
    float suma=0;
    
    for(contador=0;contador<MAX;contador++) {
        printf("No. %d : ",contador+1);
        scanf(" %d",&numeros[contador]);
    }
    printf("\nElementos del vector : ");
    for(contador=0;contador<MAX;contador++) {
        printf(" %d",numeros[contador]);
    }
    
 
    for(contador=0;contador<MAX;contador++) {
        auxiliar[contador]=0;
    }
    
    for(contador=0;contador<MAX;contador++) {
        numero = numeros[contador];
        posicion = contador;
        for(contador2=contador;contador2<MAX;contador2++) {
            if(numeros[contador2]==numero) auxiliar[posicion]++;
        }
    }
    
    mayor=auxiliar[0];
    posicionmayor = 0;
    for(contador=0;contador<MAX;contador++) {
        if(auxiliar[contador]>mayor) {
            posicionmayor=contador;
            mayor=auxiliar[contador];
        }
    }
    
    bandera=0;
    for(contador=MAX;contador>0 && bandera==0;contador--) {
        bandera=1;
        for(contador2=0;contador2<contador;contador2++) {
            if(numeros[contador2]>numeros[contador2+1]) {
                numero = numeros[contador2];
                numeros[contador2] = numeros[contador2+1];
                numeros[contador2+1]=numero;
                bandera=0;
            }
        }
    }
    printf("\nElementos del vector : ");
    for(contador=0;contador<MAX;contador++) {
        printf(" %d",numeros[contador]);
    }
    
    if(MAX%2!=0) {
        printf("\nEL valor de la mediana es : %d",numeros[MAX/2]);
    } else {
        printf("\nEL valor 1 de la mediana es : %d",numeros[MAX/2]);
       
    }
   
    suma = 0;
    for(contador=0;contador<MAX;contador++) {
        suma+=numeros[contador];
    }
    printf("\nMEDIA : %.2f\n",suma/MAX);
  return 0;
}
