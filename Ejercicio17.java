/*. Una librería estima los precios de sus libros de la siguiente forma: el precio básico de un libro
es de $5.00 más $0.15 por página. Sin embargo, si el número de páginas excede de 300, el precio
sufrirá un recargo adicional de $10. Además, si el número de páginas excede de 550, el precio
se incrementará en otros $7.50. Diseñe un programa que determine el precio de un libro.
*/


import java.util.Scanner;
class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioBasico = 0;
        System.out.println("Ingrese la cantidad de paginas");
        int nPagina = sc.nextInt();
        
        precioBasico = 500 + (0.15*nPagina);
        
        //Adicional
        if(nPagina > 300){
            precioBasico+=10;
        }
        
        //Adicional
        if(nPagina > 550){
            precioBasico+=7.50;
        }
        
        //Resultado
        System.out.println("Precio: " + precioBasico);
    }
}
