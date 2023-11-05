/*
Algoritmo-5
Generar un algoritmo que permita calcular y mostrar los
costos de una computadora de escritorio. La misma es 
comprada por partes; CPU, teclado, pantalla, ratón.
*/
package com.mycompany.ejercicio01;
import java.util.Scanner;
public class CostosDeCompu_5 {
    public static void main(String[] args) {
        int costoCPU, costoTeclado, costoPantalla, costoRaton, costoTotal;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el costo del CPU: ");
        costoCPU = teclado.nextInt();
        System.out.println("Ingrese el costo del Teclado: ");
        costoTeclado = teclado.nextInt();
        System.out.println("Ingrese el costo de la Pantalla: ");
        costoPantalla = teclado.nextInt();
        System.out.println("Ingrese el costo del Ratón: ");
        costoRaton = teclado.nextInt();
        
        costoTotal = costoCPU + costoTeclado + costoPantalla + costoRaton;
        System.out.println("Su costo Total es: "+costoTotal);
    }
    
}
