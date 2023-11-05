/*
 Algoritmo-6
Generar una solución que permita calcular y mostrar el pago mensual 
de un préstamo de 1 año de plazo. Se debe ingresar el monto del
préstamo y el interés mensual a cobrar.
 */
package com.mycompany.ejercicio01;
import java.util.Scanner;
public class PagoMensualPrestamo_6 {
    public static void main(String[] args) {
        double montoPrestamo, interesMensual, plazoPrestamoMeses, pagoMensual;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese Monto del Prestamo: ");
        montoPrestamo = teclado.nextDouble();
        System.out.println("Ingrese el interes mensual: ");
        interesMensual = teclado.nextDouble();
        System.out.println("Ingrese el plazo del prestamo en meses: ");
        pagoMensual = teclado.nextDouble();
        
        pagoMensual = (interesMensual * montoPrestamo) / (1 - Math.pow(interesMensual, plazoPrestamoMeses));
    }
}
