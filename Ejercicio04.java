/*	• Diseñe un algoritmo que determine el área (𝐴) y el volumen (𝑉) de un cubo del que se conoce su lado (𝑙). Considere las siguientes fórmulas: 𝐴 = 6𝑙^ 2         𝑉 = l ^3
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	   double area= 0;
	   double volumen = 0;
	   
		System.out.println("Ingrese el lado del cubo");
	   double lado = scanner.nextDouble();
	    
	 area = 6*(lado*lado);
	 volumen = Math.pow(lado,3);
	    
	    //Mostrar resultados
		System.out.println( "Su area del cubo es: " + area + " Su volumen del cubo es: " + volumen);
	}
}
