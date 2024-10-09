/*Una web clasifica a sus usuarios basándose en la cantidad de mensajes publicados en los foros 
de acuerdo con la siguiente tabla: Número de mensajes Clase de usuario 0 a 49 Desconocido 50 a 99 
Humano 100 a 249 Diclonius Inicial 250 a 499 Diclonius Novato 500 a 999 Diclonius Experimentado 1000 a 1999
Diclonius Elite 2000 a 4999 Diclonius Definitivo 5000 a más Diclonius Legendario Dado el número de mensajes public*/
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner teclado = new Scanner (System.in);
        
        imprimir("Ingrese la cantidad de mensajes");
         int ctdMensajes = teclado.nextInt() ;
         imprimir("Su clasificacion es: " + EvaluarPuntaje(ctdMensajes));
         //Evaluar clasificacion segun la cantidad de mensajes
    }
    
     public static void imprimir(String cad){
         System.out.println(cad);
     }
     
     public static String EvaluarPuntaje(int ctdMensajes){
        if(ctdMensajes<0){
        return "Valor no encontrado";
         }else if (ctdMensajes>=0 && ctdMensajes <= 49 ){
             return "Desconocido";
         }else if (ctdMensajes>=50 && ctdMensajes <= 99 ){
             return"Humano";
         }else if (ctdMensajes>=100 && ctdMensajes <=249 ){
             return "Diclonius Inicial";
         }else if (ctdMensajes>=250 && ctdMensajes <= 499 ){
             return "Diclonius Novato";
         }else if (ctdMensajes>=500 && ctdMensajes <= 999 ){
             return "Diclonius Experimentado";
         }else if (ctdMensajes>=1000 && ctdMensajes <= 1999 ){
             return "Diclonius Elite";
         }else if (ctdMensajes>=2000 && ctdMensajes <= 4999 ){
             return "Diclonius Definitivo";
         }else 
             return "Diclonius Legendario";
        
    }
}

