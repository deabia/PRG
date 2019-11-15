/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el precio que vas a pagar:");
        double precio = sc.nextInt();

        double descuento = (precio * 0.85);
        System.out.println("El precio rebajado al 15% es: "+descuento);
    }
}
