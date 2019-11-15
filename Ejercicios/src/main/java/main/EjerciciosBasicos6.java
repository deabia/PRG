package main;

import java.util.Scanner;

public class EjerciciosBasicos6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una hora en horas:");
        int horas = sc.nextInt();
        System.out.println("Minutos:");
        int minutos = sc.nextInt();
        System.out.println("Segundos");
        int segundos = sc.nextInt();

        int horasAMin = (horas * 60);
        float segundosAMin = (segundos / 60);
        float totalMinutos = (minutos + horasAMin + segundosAMin);

        System.out.println("La hora que has puesto pasada a minutos es: " +totalMinutos+ " minutos");

    }
}
