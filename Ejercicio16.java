/*. Dadas las estaturas de Juan, Pedro y Miguel, diseñe un programa que determine quiénes de
ellos tienen una estatura menor que la estatura promedio e imprima un mensaje como: “Juan
y Pedro miden menos que el promedio” o “Pedro y Miguel miden menos que el promedio” o
“Juan mide menos que el promedio”, etc.*/

import java.util.Scanner;
class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double estaturaCMJuan = 160;
        double estaturaCMPedro =190;
        double estaturaCMMiguel = 150;
        
            //promedio de las estaturas
        double promedio = (estaturaCMJuan + estaturaCMPedro + estaturaCMMiguel) / 3;
        System.out.println("Promedio: " + promedio);
    
        String menoresQuePromedio = "";
    
        if (estaturaCMJuan < promedio) {
            menoresQuePromedio += "Juan ";
        }
        if (estaturaCMPedro < promedio) {
            menoresQuePromedio += "Pedro ";
        }
        if (estaturaCMMiguel < promedio) {
            menoresQuePromedio += "Miguel ";
        }
    
        if (!menoresQuePromedio.isEmpty()) {
            //dividir en partes
            String[] palabrasT = menoresQuePromedio.split(" ");
            
           System.out.println(menoresQuePromedio  + 
                              (palabrasT.length > 1 ?  "son menores" //contabilizo longitud elementos
                                                     : " es menor") + " que el promedio");
        } else {
            System.out.println("Ninguno es menor que el promedio");
        }

    }
}
