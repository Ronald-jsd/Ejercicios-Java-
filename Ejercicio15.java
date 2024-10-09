/*Se denomina velocidad de escape a la velocidad mínima inicial que necesita un objeto para
escapar de la gravitación de un cuerpo astronómico y continuar desplazándose sin tener que
hacer otro esfuerzo propulsor. En la tabla adjunta, se dan velocidades de escape para los
planetas del sistema solar, en km/seg. Dado un planeta del sistema solar, diseñe un programa
que determine la velocidad de escape correspondiente.
Planeta Velocidad de escape (km/seg)
Mercurio 4.2
Venus 10.3
Tierra 11.2
Marte 5.0
Júpiter 61.0
Saturno 36.0
Urano 22.0
Neptuno 24.0
Plutón 5.3
Luna 2.4*/


import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del planeta
        System.out.println("Ingrese el nombre del planeta:");
        String planeta = scanner.nextLine().toLowerCase();

        // Determinar la velocidad de escape según el planeta
        double velocidadEscape = 0;
        switch (planeta) {
            case "mercurio":
                velocidadEscape = 4.2;
                break;
            case "venus":
                velocidadEscape = 10.3;
                break;
            case "tierra":
                velocidadEscape = 11.2;
                break;
            case "marte":
                velocidadEscape = 5.0;
                break;
            case "jupiter":
                velocidadEscape = 61.0;
                break;
            case "saturno":
                velocidadEscape = 36.0;
                break;
            case "urano":
                velocidadEscape = 22.0;
                break;
            case "neptuno":
                velocidadEscape = 24.0;
                break;
            case "pluton":
                velocidadEscape = 5.3;
                break;
            case "luna":
                velocidadEscape = 2.4;
                break;
            default:
                System.out.println("Planeta no válido.");
                return;
        }

        //Resultado
        System.out.println("La velocidad de escape para " + planeta + " es: " + velocidadEscape + " km/seg");
    }
}
