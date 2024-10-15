/*Una compañía cobra las cuotas mensuales de sus clientes de acuerdo con lo siguiente:
• Si el cliente paga dentro de los primeros diez días del mes, obtiene un descuento igual al
mayor valor entre $5 y el 2% de la cuota.
• Si el cliente paga en los siguientes diez días, no tiene derecho a ningún descuento; deberá
pagar exactamente la suma adeudada.
• Si el cliente paga dentro de los restantes días del mes, tendrá un recargo igual al mayor
valor entre $10 y el 3% de la cuota.
Dado el número del día de pago de un mes y la cuota mensual, diseñe un programa que
determine el importe total a pagar.*/

import java.util.Scanner;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        double importeDescuento=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su cantidad de pago mensual");
        double pagoCliente = sc.nextDouble();
          System.out.println("Ingrese el dia del mes");
          int diaPago = sc.nextInt();
          
          
          //Importe descuento
          //Mayor valor entre $5 y 2%
          if(diaPago <= 10){
              importeDescuento = Math.max(5, 0.02*pagoCliente);
          }else if(diaPago <= 20){
              importeDescuento = 0;
          }else if(diaPago > 20){
              importeDescuento = Math.max(10, 0.03*pagoCliente);
          }else  System.out.println("Dia no valido $" );
          
          //Importe a pagar
          double importePagar = pagoCliente - importeDescuento;
          
          //Resultado
          System.out.println("El importe a pagar es: $" + importePagar);
          
          
          
    }
}
