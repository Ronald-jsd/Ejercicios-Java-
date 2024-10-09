/*. El índice de masa corporal (IMC) permite medir el grado de sobrepeso u obesidad de una
persona. El IMC de una persona se calcula con la fórmula:
𝐼𝑀𝐶 =
𝑝𝑒𝑠𝑜
𝑒𝑠𝑡𝑎𝑡𝑢𝑟𝑎2
estando el peso en kilogramos y la estatura en metros. Basándose en el valor del IMC, se
obtiene el grado de obesidad de la persona de acuerdo a la tabla adjunta. Diseñe un
algoritmo que determine el grado de obesidad de una persona conociendo su peso y su
estatura.
IMC Grado de obesidad
< 20 Delgado
>=20 pero < 25 Normal
>=25 pero < 27 Sobrepeso
>=27 Obesidad*/

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String clasificacionIMC;
        double imc = 0;
        // Solicitar PESO Y TALLA
        System.out.println("Ingrese su peso en kilogramos:");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su estatura en metros:");
        double estatura = scanner.nextDouble();

        // Calcular el IMC
        imc = peso / (estatura * estatura);

        // Determinar grado de imc
        if (imc < 20) {
            clasificacionIMC = "Delgado";
        } else if (imc >= 20 && imc < 25) {
            clasificacionIMC = "Normal";
        } else if (imc >= 25 && imc < 27) {
            clasificacionIMC = "Sobrepeso";
        } else {
            clasificacionIMC = "Obesidad";
        }

        // Resultados
        System.out.println("Su IMC es: " + imc);
        System.out.println("Grado de obesidad: " + clasificacionIMC);
    }
}
