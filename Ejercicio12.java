/* Un supermercado vende yogurt en botellas de 1 litro a los precios dados en la siguiente tabla:
Yogurt Precio por litro
Buena vida S/. 3.90
Pura salud S/.3.80
Todo sabor S/. 4.20
Cielo S/. 3.60
INTRODUCCIÓN A LA ALGORITMIA Página 143
FACULTAD DE TECNOLOGÍAS DE LA INFORMACIÓN IES CIBERTEC
Como oferta, la tienda aplica un porcentaje de descuento sobre el importe de la compra,
basándose en la cantidad de botellas adquiridas, de acuerdo con la siguiente tabla:
Cantidad de botellas Descuento
≥ 45 11.5%
≥ 30 y < 45 9.0%
≥ 15 y < 30 6.5%
< 15 4.0%
Diseñe un algoritmo que determine el importe de la compra, el importe del descuento y el
importe a pagar por la compra de cierta cantidad de botellas de una misma marca de yogurt*/

import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      double precioPorLitro = 0;
      double importeCompra = 0;
      double porcentajeDescuento = 0;
      double importeDescuento  = 0;
      double importeAPagar = 0
        
        // Solicitar al usuario la marca de yogurt y la cantidad de botellas
        System.out.println("Ingrese la marca de yogurt (Buena Vida, Pura Salud, Todo Sabor, Cielo):");
        String marca = scanner.nextLine();
        System.out.println("Ingrese la cantidad de botellas:");
        int cantidad = scanner.nextInt();

        // Determinar el precio por litro según la marca
        switch (marca.toLowerCase()) {
            case "buena vida":
                precioPorLitro = 3.90;
                break;
            case "pura salud":
                precioPorLitro = 3.80;
                break;
            case "todo sabor":
                precioPorLitro = 4.20;
                break;
            case "cielo":
                precioPorLitro = 3.60;
                break;
            default:
                System.out.println("Marca de yogurt no válida.");
                return;
        }

        // Calcular el importe de la compra
        importeCompra = precioPorLitro * cantidad;

        // Determinar el porcentaje de descuento según la cantidad de botellas
        if (cantidad >= 45) {
            porcentajeDescuento = 11.5;
        } else if (cantidad >= 30) {
            porcentajeDescuento = 9.0;
        } else if (cantidad >= 15) {
            porcentajeDescuento = 6.5;
        } else {
            porcentajeDescuento = 4.0;
        }

        // Calcular el importe del descuento y el importe a pagar
        importeDescuento = (importeCompra * porcentajeDescuento) / 100;
        importeAPagar = importeCompra - importeDescuento;

        // Resultados
        System.out.println("Importe de la compra: S/. " + importeCompra);
        System.out.println("Importe del descuento: S/. " + importeDescuento);
        System.out.println("Importe a pagar: S/. " + importeAPagar);
    }
}
