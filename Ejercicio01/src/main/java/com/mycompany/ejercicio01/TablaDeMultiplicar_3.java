/*
Algoritmo-3
Se desea desarrollar un algoritmo que permita mostrar
la tabla de multiplicar de un número ingresado por el
usuario; solo en el caso que el valor del número esté entre 2 y 6.
*/
package com.mycompany.ejercicio01;
import java.util.Scanner;
public class TablaDeMultiplicar_3 {
    public static void main(String[] args) {
        int num01 = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=======Ingrese su numero: ");
        num01 = teclado.nextInt();
        
        if(num01 >= 2){
            if(num01 <= 6){
                System.out.println("=======Su tabla es igual a:  =======");
                System.out.println( num01 * 1);
                System.out.println( num01 * 2);
                System.out.println( num01 * 3);
                System.out.println( num01 * 4);
                System.out.println( num01 * 5);
                System.out.println( num01 * 6);
                System.out.println( num01 * 7);
                System.out.println( num01 * 8);
                System.out.println( num01 * 9);
                System.out.println( num01 * 10);
                System.out.println( num01 * 11);
                System.out.println( num01 * 12);
            } 
            else{
            System.out.println("Ingrese otro numero =) =======");
            }
        }
        else{
            System.out.println("Ingrese otro numero =) =======");
        }
        
    }
}
