package main;

import java.util.Scanner;

public class EjerciciosBasicos7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una cantidad en segundos y la pasaré a horas, minutos y segundos: ");
        int totalSegundos = sc.nextInt();

        int restoHora = totalSegundos % 3600;
        int horas = totalSegundos / 3600;
        int minutos = restoHora / 60;
        int segundos = restoHora % 60;

        System.out.println("La hora pasada a horas, minutos y segundos es: "+ horas + "h" + minutos + "m" + segundos + "s");

    }
}
