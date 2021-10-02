import java.util.Scanner; public class Arreiglos {public static int [] llenarArreglo (int elementos) {int i; En televisión; v = new int [elementos]; Scanner sc = nuevo escáner (System.in);

for ( i = 0; i < elementos; i++ ) {
  System.out.print ( "v [ " + i + " ] = " );
  v [ i ] = sc.nextInt ( ); 
}

return v;
}

public static double promedio (int [] v) {double prom = 0.0; para (int i = 0; i <v.length; i ++) prom + = v [i];

return prom / ( double ) v.length;  
}

public static double desviacion (int [] v) {double prom, sum = 0; int i, n = v. longitud; prom = promedio (v);

for ( i = 0; i < n; i++ ) 
  sum += Math.pow ( v [ i ] - prom, 2 );

return Math.sqrt ( sum / ( double ) n );
}

public static int [] burbuja (int [] v, int ord) {int i, j, n = v.length, aux = 0;

for ( i = 0; i < n - 1; i++ )
  for ( j = i + 1; j < n; j++ )
    if ( ord == 0 )
      if ( v [ i ] > v [ j ] ) {
        aux = v [ j ];
        v [ j ] = v [ i ];
        v [ i ] = aux;
      }
    else if ( ord == 1 )
      if ( v [ i ] < v [ j ] ) {
        aux = v [ i ];
        v [ i ] = v [ j ];
        v [ j ] = aux;
      }

return v;
}

public static double mediana (int [] v) {int pos = 0, n = v.length; doble temp = 0, temp0 = 0;
// ordenar de menor a mayor v = burbuja (v, 0);

temp = n / 2;
if ( n % 2 == 0 ) {
  pos = (int)temp;      
  temp0 = (double)(v [ pos ] / v [ pos + 1 ]);
}
if ( n % 2 == 1 ) {
  pos = (int)(temp + 0.5);
  temp0 = (double)(v [ pos ]);  
}

return temp0;
}

public static int rango (int [] v) {

v = burbuja ( v, 1 );

return v [ v.length - 1 ] - v [ 0 ];
}

public static int moda (int [] v) {int i, j, moda = 0, n = v.length, frec; int frecTemp, frecModa = 0, moda1 = -1;

v = burbuja ( v, 0 );

for ( i = 0; i < n; i++ ) {
  frecTemp = 1; 
  for ( j = i + 1; j < n; j++ ) {
    if ( v [ i ] == v [ j ] )
      frecTemp++;
  }
  if ( frecTemp > frecModa ) {
    frecModa = frecTemp;
    moda1 = v [ i ];
  }
}
return moda1;
}

public static void reportaVector (int [] v) {for (int i = 0; i <v.length; i ++) System.out.print (v [i] + ""); System.out.println (""); }

public static void main (String [] args) {int n; En televisión; doble media, mediana, moda, rango, desviacion; Scanner sc = nuevo escáner (System.in); System.out.println ("Dimension Arreglo:"); n = sc.nextInt ();

v = llenarArreglo ( n );


media = promedio ( v );

mediana = mediana ( v );    


moda = moda ( v );


rango = rango ( v );      


desviacion = desviacion ( v );

System.out.println ( " Moda del vector: " + moda);
System.out.println ( " Media del vector: " + media);
System.out.println ( " Mediana del vector: " + mediana);
System.out.println ( " Rango del vector: " + rango);
System.out.println ( " Desviacion del vector: " + desviacion);

reportaVector ( v );
}}