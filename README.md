# estadistica

import java.util.Scanner;

public class Estadistica {
	
	public static double media(double[] v){
	   double res=0;
	   for(int i=0; i<v.length; i++){
	   	res+=v[i];
	   }
	   
	   return res/v.length;
	}
	
	public static double moda(double[] v){
		int cont=0;
		double num=0;
		for(int i=0; i<v.length; i++){
		   int aux=0;	
		   for(int j=0; j<v.length; j++){
		      if(v[i]==v[j]) aux++;
		   }
		   if(aux>=cont){
		   	cont=aux;
		   	num=v[i];
		   } 
		 }
		return num;
	}
	
	public static double desviacion_tipica(double[] v){
		double res=Math.sqrt(varianza(v));
		return res;
	}
	
	public static double varianza(double[] v){
	   double m=media(v);
	   double sum=0;
	   for(int i=0; i<v.length; i++){
	      sum+=Math.pow(v[i],2.0);
	   }
	   
	   return sum/v.length-Math.pow(m,2.0);	
	}
     
    public static void main(String[] args) {
    	System.out.println("Introduzca el tamaño de su secuencia de numeros");
    	Scanner sc=new Scanner(System.in);
    	
    	int n=sc.nextInt();
    	double[] vec=new double[n];
    	for(int i=0; i<n; i++){
    	   System.out.println("Introduzca un numero");
    	   sc=new Scanner(System.in);
    	   vec[i]=sc.nextFloat();
    	}
    	
    	System.out.println("Introduzca una operacion para realizar");
    	System.out.println("--------------------------------------");
    	System.out.println("1 - Media");
    	System.out.println("2 - Moda");
    	System.out.println("3 - Varianza");
    	System.out.println("4 - Desviacion tipica");
    	System.out.println("5 - Salir");
    	
    	sc=new Scanner(System.in);
    	int eleccion=sc.nextInt();
    	
    	switch(eleccion){
    	   case 1: System.out.println("La media es: " + media(vec));
    	   	break;
    	   case 2: System.out.println("La moda es: " + moda(vec));
    	   	break;
    	   case 3: System.out.println("La varianza es: " + varianza(vec));
    	   	break;
    	   case 4: System.out.println("La desviacion tipica es: " + desviacion_tipica(vec));
    	   	break;
    	   case 5: System.out.println("Adios");
    	   	break;
    	   default: System.err.println("Error, opción desconocida"); 
    	}
    }
}
