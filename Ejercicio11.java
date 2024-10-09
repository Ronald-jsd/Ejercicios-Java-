/*2. Un supermercado vende aceite en botellas de 1 litro a los precios por litro dados en la
siguiente tabla:
Aceite Precio por litro
Primor S/. 5.99
Girasol S/. 5.50
Cil S/.4.50
Cocinero S/. 4.70
Como oferta, el supermercado ofrece un porcentaje de descuento sobre el importe de la
compra de acuerdo con la siguiente tabla:
Cantidad de litros Descuento
< 4 5.0%
4 y < 7 7.5%
7 y < 10 10.0%
10 12.5%
Diseñe un algoritmo que determine el importe de la compra, el importe del descuento y el
importe a pagar por la compra de cierta cantidad de litros de una misma marca de aceite.

*/

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precioPrimor = 5.99;
        double precioGirasol = 5.50;
        double precioCil = 4.50;
        double precioCocinero = 4.70;

        // Solicitar marca del aceite
        System.out.println("Ingrese la marca del aceite: ");
        String marca = scanner.nextLine().toLowerCase();

        // Solicitar cantidad de litros
        System.out.println("Ingrese la cantidad de litros: ");
        double cantidadLitros = scanner.nextDouble();

        double precioPorLitro = 0;

        // Determinar el precio por litro según la marca
        switch (marca) {
            case "primor":
                precioPorLitro = precioPrimor;
                break;
            case "girasol":
                precioPorLitro = precioGirasol;
                break;
            case "cil":
                precioPorLitro = precioCil;
                break;
            case "cocinero":
                precioPorLitro = precioCocinero;
                break;
            default:
                System.out.println("Marca de aceite no válida.");
                return;
        }

        // Calcular el importe de la compra
        double importeCompra = precioPorLitro * cantidadLitros;

        // Determinar el porcentaje de descuento
        double porcentajeDescuento = 0;
        if (cantidadLitros < 4) {
            porcentajeDescuento = 5.0;
        } else if (cantidadLitros < 7) {
            porcentajeDescuento = 7.5;
        } else if (cantidadLitros < 10) {
            porcentajeDescuento = 10.0;
        } else if (cantidadLitros >= 10) {
            porcentajeDescuento = 12.5;
        }

        // Calcular el importe del descuento
        double importeDescuento = (importeCompra * porcentajeDescuento) / 100;

        // Calcular el importe a pagar
        double importeAPagar = importeCompra - importeDescuento;

        // Mostrar los resultados
        System.out.println("Importe de la compra: S/. " + importeCompra);
        System.out.println("Importe del descuento: S/. " + importeDescuento);
        System.out.println("Importe a pagar: S/. " + importeAPagar);
    }
}
