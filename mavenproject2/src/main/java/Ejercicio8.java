
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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el sueldo base:");
        double sueldoBase = sc.nextInt();
        System.out.println("Dime el número de ventas que has realizado");
        double numeroVentas = sc.nextInt();

        double extra = ((numeroVentas * sueldoBase) *0.10);
        System.out.println("Cobrarás un extra de "+extra);

        double total = (extra + sueldoBase);
        System.out.println("Cobrarás un total de "+total);
    }
}
