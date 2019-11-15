package main;

import java.util.Scanner;

public class EjerciciosBasicos8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número");
        int referenciaMayor = sc.nextInt();
        int referenciaMenor = referenciaMayor;


        for (int i = 0; i < 8; i++) {
            System.out.println("Escribe un número");
            int numero = sc.nextInt();

            if (numero > referenciaMayor) {
                referenciaMayor = numero;
            }
            if (numero < referenciaMenor) {
                referenciaMenor = numero;
            }
        }
            System.out.println("El numero mayor es: " + referenciaMayor);
            System.out.println("El numero mayor es: " + referenciaMenor);
    }
}

