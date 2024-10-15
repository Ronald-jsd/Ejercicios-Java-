/*Una empresa química paga a sus vendedores un sueldo bruto que es igual a la suma de un
sueldo básico quincenal de S/.250 más una comisión igual a un porcentaje del total de las ventas
efectuadas de acuerdo con la siguiente tabla:
Monto vendido Comisión
20000 16%
15000 pero < 20000 14%
10000 pero < 15000 12%
< 10000 10%*/

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        double importeDescuento=0;
        double sueldoBruto=0;
        double sueldoBasicoQuinc = 250;
        double comision = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el total de ventas");
        int totalVentas = sc.nextInt();
      
        //Comision
        if(totalVentas<10000){
            comision = 0.10 * totalVentas;
        }else if(totalVentas < 15000){
            comision = 0.12 * totalVentas;
        }else if(totalVentas<20000){
            comision = 0.14 * totalVentas;
        }else if(totalVentas>=20000){
            comision = 0.16 * totalVentas;
        }else System.out.println("no valido");
        
        
        //Sueldo bruti
        sueldoBruto =  sueldoBasicoQuinc + comision;
  
        //Descuento
        if(sueldoBruto > 1800){
            importeDescuento = 0.11 * sueldoBruto;
        }
  
        //Sueldo netp
        double sueldoNeto = sueldoBruto - importeDescuento;
        
        //Resultados   
           System.out.println("Sueldo bruto: " + sueldoBruto);   
           System.out.println("Descuento: " + importeDescuento);
           System.out.println("Sueldo neto: " + sueldoNeto);
    }
}
