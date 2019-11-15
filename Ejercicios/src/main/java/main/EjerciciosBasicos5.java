package main;

import java.util.Scanner;

public class EjerciciosBasicos5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿De cuantos números harás la media?");

        double veces = sc.nextInt();

        System.out.println("Escribe 15 números y se hará una media");

        int suma = 0;

        for(int i= 0; i < veces; i++){
            suma += sc.nextInt();
        }

        System.out.println("El media de los número es "+suma/veces);
    }
}
