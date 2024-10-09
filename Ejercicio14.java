/*. Diseñar un programa que lea la temperatura promedio de un día e imprima el tipo de clima
correspondiente de acuerdo con la siguiente tabla:
Temperatura Clima
≤ 10 Frío
>10 pero ≤ 20 Nublado
>20 pero ≤ 30 Caluroso
> 30 Trópico*/
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de temperatura
        System.out.println("Ingrese la temperatura promedio del día:");
        double temperatura = scanner.nextDouble();

        // Determinar tipo
        String clima;
        if (temperatura <= 10) {
            clima = "Frío";
        } else if (temperatura > 10 && temperatura <= 20) {
            clima = "Nublado";
        } else if (temperatura > 20 && temperatura <= 30) {
            clima = "Caluroso";
        } else {
            clima = "Trópico";
        }

        // Resultado
        System.out.println("El tipo de clima es: " + clima);
    }
}
