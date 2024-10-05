/*Los cálculos salariales de los empleados de una empresa se efectúan de la siguiente manera:
Sueldo bruto : horas trabajadas x tarifa horaria
Descuento : 15% del sueldo bruto
Sueldo neto : sueldo bruto – descuento
La tarifa horaria depende de la categoría del trabajador de acuerdo con la siguiente tabla:
Categoría Tarifa horaria (S/.)
C1 45.0
C2 37.5
C3 35.0
C4 32.5
Dadas las horas trabajadas y la categoría de un empleado, diseñe un programa que determine la
tarifa horaria, el sueldo bruto, el descuento y el sueldo neto del empleado.

*/



import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      
        imprimir("Ingrese la categora del empleado (C1, C2, C3, C4):");
        String categoria = teclado.nextLine().toUpperCase();
        
        imprimir("Ingrese las horas trabajadas:");
        int horasTrabajadas = teclado.nextInt();
        
        // Determinar tarifa horaria
        double tarifaHoraria = 0;
        switch (categoria) {
            case "C1":
                tarifaHoraria = 45.0;
                break;
            case "C2":
                tarifaHoraria = 37.5;
                break;
            case "C3":
                tarifaHoraria = 35.0;
                break;
            case "C4":
                tarifaHoraria = 32.5;
                break;
            default:
                imprimir("Categora no vlida.");
                return;
        }
        
        //  sueldo bruto,
        double sueldoBruto = horasTrabajadas * tarifaHoraria;
      //descuento
        double descuento = sueldoBruto * 0.15;
      // sueldo neto
        double sueldoNeto = sueldoBruto - descuento;
        
        //  resultados
        imprimir("Tarifa horaria: S/. " + tarifaHoraria);
        imprimir("Sueldo bruto: S/. " + sueldoBruto);
        imprimir("Descuento: S/. " + descuento);
        imprimir("Sueldo neto: S/. " + sueldoNeto);
    }
    
    public static void imprimir(String cad){
        System.out.println(cad);
    }
}
