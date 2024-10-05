/*Diseñe un algoritmo que determine el área (A) de un rombo del que se conoce su diagonal mayor (D) y su diagonal menor (d). Considere la siguiente fórmula: 𝐴 = (𝐷 × 𝑑 )/ 2

  */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    
	    double area = 0;
	    
	    
		System.out.println("Ingrese la diagonal mayor");
	    double diagonalMayor = scanner.nextDouble(); 
	    
		System.out.println("Ingrese la diagonal menor");
	    double diagonalMenor = scanner.nextDouble();
	    
	    
	    area =  (diagonalMayor * diagonalMenor) / 2;

		System.out.println( "El area de un rombo es:  " + area );
	}
}


Diseñe un algoritmo que determine la frecuencia cardiaca de un varón conociendo su edad en años y su peso en kilogramos de acuerdo con la siguiente fórmula: 𝑓𝑟𝑒𝑐𝑢𝑒𝑛𝑐𝑖𝑎 = 210 − (0.5 × 𝑒𝑑𝑎𝑑) − (0.01 × 𝑝𝑒𝑠𝑜 + 4) 


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    //declaracion de variables
	    double fCardiaca = 0;
	    
	    // declaracion de variable + entrada por teclado
		System.out.println( "Ingrese su edad en anios" );
	    int edad = scanner.nextInt();
		System.out.println( "Ingrese su peso en kg" );
	    int peso = scanner.nextInt();
	    
	    //Proceso
	    fCardiaca = 210 - (0.5 * edad) - (0.01*peso + 4);
	    
	    //Mostrar resultados
		System.out.println( "Su frecuencia cardiaca  es:  " + fCardiaca );
	}
}
