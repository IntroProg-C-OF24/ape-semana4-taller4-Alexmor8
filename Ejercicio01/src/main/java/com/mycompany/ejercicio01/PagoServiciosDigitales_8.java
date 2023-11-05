/*
Algoritmo-8
Se debe generar un algoritmo que permita calcular y
mostrar el valor total a pagar mensual de servicios 
digitales de una persona. Los servicios digitales 
son: netflix, youtube premium, dropbox, spotify. 
Si la persona es menor a 30 años se descuenta el 20% del total mensual.
*/
package com.mycompany.ejercicio01;
import java.util.Scanner;
public class PagoServiciosDigitales_8 {
    public static void main(String[] args) {
        double valorNetflix, valorYoutubePremium, valorDropbox, valorSpotify, porcentaje;
        int edad;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingese edad del cliente: ");
        edad = teclado.nextInt();
        System.out.println("Ingrese el valor de Netflix: ");
        valorNetflix = teclado.nextDouble();
        System.out.println("Ingrese el valor de Youtube Premium: ");
        valorYoutubePremium = teclado.nextDouble();
        System.out.println("Ingrese el valor de Dropbox: ");
        valorDropbox = teclado.nextDouble();
        System.out.println("Ingrese el valor de Spotify: ");
        valorSpotify = teclado.nextDouble();
        
        porcentaje =(valorNetflix + valorYoutubePremium + valorDropbox + valorSpotify) * 20 / 100;

        if (edad <= 30) {
            System.out.println("=======Su Valor a Cancelar es:  =======");
           
            System.out.println((valorNetflix + valorYoutubePremium + valorDropbox + valorSpotify) - porcentaje);
        } else {
            System.out.println("=======Su Valor a Cancelar es:  =======");
            System.out.println(valorNetflix + valorYoutubePremium + valorDropbox + valorSpotify);
        }
    }
    
}
