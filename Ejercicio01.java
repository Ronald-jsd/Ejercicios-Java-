/*1. Diseñe un algoritmo que determine el área (A) y el perímetro (P) de un rectángulo del que se conoce su base (b) y su altura (h). Considere las siguientes fórmulas: 𝐴 = 𝑏 × ℎ 𝑃 = 2 × (𝑏 + ℎ)
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    
	//declaracion de variables
	    double area, perimetro;
	    double base, altura
	
	//Entrada de datos
	    
		System.out.println("Ingrese la base");
	    base = scanner.nextDouble(); 
	    
		System.out.println("Ingrese la altura");
	     altura = scanner.nextDouble();
	    
	    //Proceso 
	    
	    area =  base * altura;
	    perimetro = 2 *(base + altura);
	    
	    
	    //Mostrar resultados
		System.out.println( "El area es:  " + area + "   La altura es: "+ altura);
	}
}

