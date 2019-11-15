package main;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosBasicos11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el número que estoy pensando:");
        int numero = sc.nextInt();
        Random r = new Random();
        int respuesta = r.nextInt(101);

        while(numero != respuesta) {
            if (numero < 0) {
                System.out.println("No puedes poner un número negativo, prueba otra vez");
                numero = sc.nextInt();
            }else if(numero > 100){
                System.out.println("No puedes poner un número más alto que 100, prueba otra vez");
                numero = sc.nextInt();
            }else{
                if (numero == respuesta){
                }else if(numero > respuesta){
                        System.out.println("Ese número no es, prueba uno más bajo");
                        numero = sc.nextInt();
                }else {
                    System.out.println("Ese número no es, prueba uno más alto");
                    numero = sc.nextInt();
                }
            }
        }
        System.out.println("Enhorabuena, has acertado el número");
    }
}
