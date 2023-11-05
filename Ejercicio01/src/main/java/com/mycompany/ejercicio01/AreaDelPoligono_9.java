/*
Algoritmo-9
El programa debe calcular el área del polígono. La figura se compone 
de un cuadrado perfecto (A), tres triángulos rectángulos iguales 
(B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, 
y un rectángulo cuyo ancho mide lo mismo que uno de los lados. del 
cuadrado, mientras que la altura mide lo mismo que la altura de 
los triángulos. Se pide que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula 
multiplicando su base por su altura; el área de un triángulo rectángulo 
se calcula multiplicando su base por su altura, y luego dividiendo el 
resultado entre dos; Finalmente, el área de un cuadrado se calcula 
elevando al cuadrado la medida de uno de sus lados.

La parte interesante de este problema es determinar el mínimo número 
de datos que hay que preguntar. 
*/
package com.mycompany.ejercicio01;
import java.util.Scanner;
public class AreaDelPoligono_9 {
    public static void main(String[] args) {
       double baseCuadrdo, alturaTriangulo, areaPoligono, areasTriangulo, areacuadrado, areaRectangulo;
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese la altura de uno de los triangulos: ");
        alturaTriangulo = teclado.nextDouble();
        System.out.println("Ingrese la base del cuadrado: ");
        baseCuadrdo = teclado.nextDouble();
        areasTriangulo = ((baseCuadrdo * alturaTriangulo)/ 2 * 3);
        areacuadrado = baseCuadrdo * baseCuadrdo * baseCuadrdo * baseCuadrdo;
        areaRectangulo = (baseCuadrdo * alturaTriangulo) / 2;
        areaPoligono = areasTriangulo + areaRectangulo + areacuadrado;
        System.out.println("El area del poligono es de: " + areaPoligono);
    }
    
}
