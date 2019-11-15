
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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el cateto de un triángulo:");
        int cateto1 = sc.nextInt();
        System.out.println("Dime el otro cateto del triángulo");
        int cateto2 = sc.nextInt();
        
        int hipotenusa = ((cateto1 * cateto1) + (cateto2 * cateto2));
        
        System.out.println("La hipotenusa del triángulo es ");
        System.out.println(Math.sqrt(hipotenusa));
                
    }
}