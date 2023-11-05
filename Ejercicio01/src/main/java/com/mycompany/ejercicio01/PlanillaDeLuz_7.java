/*
Algoritmo-7
Generar un algoritmo que permita calcular y mostrar el
valor a cancelar de una planilla de luz. Se debe ingresar 
el valor de costo por kilovatio/hora y el número de kilovatios 
consumidos en el mes. Si el usuario tiene edad mayor a 65 años,
se debe descontar el 10%.
 */
package com.mycompany.ejercicio01;
import java.util.Scanner;
public class PlanillaDeLuz_7 {

    public static void main(String[] args) {
        int valorCostoKilobait, numeroKconsumidos, edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese edad del cliente: ");
        edad = teclado.nextInt();
        System.out.println("Ingrese valor de costo por kilovatios: ");
        valorCostoKilobait = teclado.nextInt();
        System.out.println("Ingrese el numero de kilovatios consumidos: ");
        numeroKconsumidos = teclado.nextInt();

        if (edad >= 65) {
            System.out.println("=======Su Valor a Cancelar es:  =======");
            System.out.println((valorCostoKilobait + numeroKconsumidos) * 10 / 100);
        } else {
            System.out.println("=======Su Valor a Cancelar es:  =======");
            System.out.println(valorCostoKilobait + numeroKconsumidos);
        }
    }

}
