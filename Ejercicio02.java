/*. Diseñe un algoritmo que determine el área (A) de un rombo del que se ingresara por teclado su base mayor (B), su base menor (b) y su altura (h). Considere la siguiente fórmula: 𝐴 = (𝑏 + 𝐵) × ℎ 2
*/


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    
	    double area;
	    
	    
		System.out.println("Ingrese la base mayor");
	    double baseMayor = scanner.nextDouble(); 
	    
		System.out.println("Ingrese la base menor");
	    double baseMenor = scanner.nextDouble();
	    
    	System.out.println("Ingrese la altura");
	    double altura = scanner.nextDouble();	
	    
	    area = ( (baseMenor + baseMayor) * altura) / 2;

		System.out.println( "El area de un rombo es:  " + area );
	}
}

