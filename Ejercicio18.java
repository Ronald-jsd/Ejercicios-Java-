/*Una empresa calcula el sueldo bruto de sus empleados multiplicando las horas trabajadas por
una tarifa horaria que depende de la categoría del trabajador de acuerdo con la siguiente tabla:
Categoría Tarifa
A S/. 21.0
B S/. 19.5
C S/. 17.0
D S/. 15.5
Por ley, todo empleado se somete a un porcentaje de descuento del sueldo bruto: 20% si el
sueldo bruto es mayor de S/. 2500 y 15%, en caso contrario.
Dada la categoría y las horas trabajadas, diseñe un programa que determine el sueldo bruto,
el descuento y el sueldo neto correspondientes.*/
import java.util.Scanner;
class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la categoria A B C D ");     
        String categoria = sc.next().trim();
        System.out.println("Ingrese las horas trabajadas");     
        int horasTrabajadas = sc.nextInt();
        
        double sBruto = 0;
        double importeDescuento = 0;
        double sNeto = 0;
        double tarifaHoraria = 0;
        
        //Clasifciacion
        switch(categoria.toLowerCase()){
          case "a": 
          tarifaHoraria=21;
          break;
          case "b":
          tarifaHoraria = 19.5;
          break;
          case "c" : 
          tarifaHoraria = 17;
          break;
          case "d" :
          tarifaHoraria = 15.5;
          break;
          default:
          tarifaHoraria = 0;
          System.out.println("No valido");
        }
      
       //Calculo Sueldo Bruto
        sBruto = horasTrabajadas * tarifaHoraria;

        //Descuento
        if(sBruto > 2500){
            importeDescuento = 0.20 * sBruto;
        }else if(sBruto <= 2500){
            importeDescuento = 0.15 * sBruto;
        }
        
        //Sueldo neto
        sNeto = sBruto - importeDescuento;
        
        //Resultado
        System.out.println("Su tarifa horaria es: " + tarifaHoraria);
        System.out.println("Sueldo bruto: " + sBruto);
        System.out.println("Imp Descuento: " + importeDescuento);
        System.out.println("Sueldo Neto: " + sNeto);
    }
}
