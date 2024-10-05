/*Problema 3
Una dulcería vende chocolates a los precios dados en la siguiente tabla:
Tipo de chocolate Precio unitario
Primor S/. 8.5
Dulzura S/. 10.0
Tentación S/. 7.0
Explosión S/. 12.5
Como oferta, la tienda aplica un porcentaje de descuento sobre el importe de la compra, sobre la
base de la cantidad de chocolates adquiridos, de acuerdo con la siguiente tabla:
Cantidad de chocolates Descuento
< 5 4.0%
≥ 5 y < 10 6.5%
≥ 10 y < 15 9.0%
≥ 15 11.5%
Adicionalmente, si el importe a pagar es no menor de S/. 250, la tienda obsequia 3 caramelos por
cada chocolate; en caso contrario, obsequia 2 caramelos por cada chocolate.
Dado el tipo de chocolate y la cantidad de unidades adquiridas, diseñe un programa que determine
el importe de la compra, el importe del descuento, el importe a pagar y la cantidad de caramelos
de obsequio.*/

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner teclado = new Scanner (System.in);
        
        imprimir("Ingrese el tipo");
        String tipo = teclado.nextLine();
        imprimir("Ingrese la cantidad");
        int cantidad = teclado.nextInt();
        double precioUnitario = 0; 
        double importeCompra = 0;
        double importeDescuento = 0;
        double importePagar = 0;
        int obsequio = 0;
        
            switch(tipo.toLowerCase()){
                case "primor":
                    precioUnitario = 8.50;
                    break;
                    case "dulzura":
                    precioUnitario = 10.00;
                    break;
                    case "tentacion":
                    precioUnitario = 7.00;
                    break;
                    case "explosion" :
                      precioUnitario =   12.50;
                    break;
                    default:
                    precioUnitario = 0;
            }
            
            //importe compra 
            importeCompra = precioUnitario * cantidad;
            
            //importe descuento
            if (cantidad < 5  ){
                importeDescuento = 0.04 * importeCompra;
            }else if(cantidad >= 5 && cantidad <= 10){
                importeDescuento = 0.065 * importeCompra;
            }else if(cantidad >= 10 && cantidad < 15){
                importeDescuento = 0.09 * importeCompra;
            }else importeDescuento = 0.115 * importeCompra;
            
            //importe pagar
            importePagar = importeCompra - importeDescuento; 
            
            if(importePagar == 0){
                obsequio = 0;
            }
            else if(importePagar >= 250 ){
                obsequio = 3*cantidad;
            } else obsequio = 2 * cantidad;
            
         imprimir("Precio unitario: " + precioUnitario);      
         imprimir("Importe compra: " + importeCompra);        
         imprimir("Importe descuento: " + importeDescuento);   
         imprimir("Importe pagar: " + importePagar); 
         String mensaje = obsequio==1? " unidad de caramelo":" unidades de caramelos"; 
         imprimir("El obsequio es: " + obsequio + mensaje);        
    }
    
     public static void imprimir(String cad){
         System.out.println(cad);
     }
     
     

}
