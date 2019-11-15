package main;

import java.util.Scanner;

public class EjerciciosBasicos9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número y se realizará el factorial: ");
        double numero = sc.nextInt();
        double factorial = 1;

        while (numero !=0){
            factorial *= numero;
            numero--;
        }

        System.out.println("El factorial es "+factorial);

    }
}
