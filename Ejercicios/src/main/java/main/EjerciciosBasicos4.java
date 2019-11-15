package main;

import java.util.Scanner;

public class EjerciciosBasicos4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 15 números y se hará una media");

        int suma = 0;
        for(int i= 0; i < 15; i++){
            suma += sc.nextInt();
        }

        System.out.println("El media de los número es "+suma/15.0);
    }
}
