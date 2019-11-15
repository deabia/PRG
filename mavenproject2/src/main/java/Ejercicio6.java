
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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número:");
        int numero1 = sc.nextInt();
        System.out.println("Dime otro número");
        int numero2 = sc.nextInt();
        System.out.println("Dime otro número");
        int numero3 = sc.nextInt();
        
        double media = ((numero1 + numero2 + numero3)/3.0);
        
        System.out.println("La media de esos tres números es: "+media);
    }
}
