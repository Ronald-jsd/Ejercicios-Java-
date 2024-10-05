/*Los ángulos se clasifican de la siguiente manera:
Magnitud Clasificación
β = 0º Nulo
0º < β < 90º Agudo
β = 90º Recto
90º < β < 180º Obtuso
β = 180º Llano
180º < β < 360º Cóncavo
β = 360º Completo
Diseñe un algoritmo que determine la clasificación de un ángulo dado en grados, minutos y
segundos.
Asuma que el ángulo está en el intervalo de 0º a 360º*/


import java.util.Scanner;

public class Myclass {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
       imprimir("Ingrese los grados del ángulo:");
        int grados = teclado.nextInt();
        
        imprimir("Ingrese los minutos del ángulo:");
        int minutos = teclado.nextInt();
        
        imprimir("Ingrese los segundos del ángulo:");
        int segundos = teclado.nextInt();
        
        // Convertir  angulo a grados
        double anguloTotal = grados + (minutos / 60.0) + (segundos / 3600.0);
        
        //Clasificación 
        String clasificacion;
        if (anguloTotal == 0) {
            clasificacion = "Nulo";
        } else if (anguloTotal > 0 && anguloTotal < 90) {
            clasificacion = "Agudo";
        } else if (anguloTotal == 90) {
            clasificacion = "Recto";
        } else if (anguloTotal > 90 && anguloTotal < 180) {
            clasificacion = "Obtuso";
        } else if (anguloTotal == 180) {
            clasificacion = "Llano";
        } else if (anguloTotal > 180 && anguloTotal < 360) {
            clasificacion = "Cóncavo";
        } else if (anguloTotal == 360) {
            clasificacion = "Completo";
        } else {
            clasificacion = "Rango no permitido";
        }
        
        // Resultados
        imprimir("El ángulo es: " + anguloTotal + " grados");
        imprimir("Su clasificación es: " + clasificacion);
    }

    public static void imprimir(String cad) {
        System.out.println(cad);
    }
}
