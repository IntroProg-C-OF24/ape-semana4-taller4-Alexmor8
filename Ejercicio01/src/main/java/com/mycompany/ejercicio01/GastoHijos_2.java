/*
Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; calcular y mostrar el total de gastos de los hijos del padre de familia.
*/
package com.mycompany.ejercicio01;
import java.util.Scanner;
public class GastoHijos_2 {
    public static void main(String[] args) {
        double gastosHijo1, gastosHijo2, gastosHijo3, gastosTotales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Gastos del primer Hijo: ");
        gastosHijo1 = teclado.nextDouble();
        System.out.println("Gastos del segundo Hijo: ");
        gastosHijo2 = teclado.nextDouble();
        System.out.println("Gastos del tercero Hijo: ");
        gastosHijo3 = teclado.nextDouble();
        
        gastosTotales = gastosHijo1 + gastosHijo2 + gastosHijo3;
        System.out.println("Los gastos totales son: "+gastosTotales);
        
    }
}
