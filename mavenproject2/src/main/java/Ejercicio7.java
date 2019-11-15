
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam1
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número de minutos:");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int restominutos = minutos % 60;
        System.out.println("Los minutos en horas y minutos son: " +horas+ " horas y "+restominutos+ " minutos");
    }
}
