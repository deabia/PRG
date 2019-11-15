
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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número:");
        int numero1 = sc.nextInt();
        System.out.println("Dime otro número");
        int numero2 = sc.nextInt();
        
        int suma = (numero1 + numero2);
        int resta = (numero1 - numero2);
        int multiplicacion = (numero1 * numero2);
        int division = (numero1 / numero2);
        
        System.out.println("La suma de los dos números es "+suma);
        System.out.println("La resta de los dos números es "+resta);
        System.out.println("La multiplicación de los dos números es "+multiplicacion);
        System.out.println("La división de los dos números es "+division);
    }
}
