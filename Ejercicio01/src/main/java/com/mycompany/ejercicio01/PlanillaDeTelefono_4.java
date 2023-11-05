/*
Algoritmo-4
Generar un algoritmo que permita calcular y mostrar el 
valor de la planilla de teléfono de una casa. Se debe
ingresar el costo por minutos, el número de minutos consumidos en el mes.
 */
package com.mycompany.ejercicio01;
import java.util.Scanner;
public class PlanillaDeTelefono_4 {
    public static void main(String[] args) {
        double costoPorMinuto, numeroMinutosConsu, valorDePlanilla;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese Costos Por Minuto: ");
        costoPorMinuto = teclado.nextDouble();
        System.out.println("Ingrese Numero de Minutos Consumidos: ");
        numeroMinutosConsu = teclado.nextDouble();
        
        valorDePlanilla = costoPorMinuto + numeroMinutosConsu;
        System.out.println("Costo de Planilla de Teléfono es: " + valorDePlanilla );
    }
}
