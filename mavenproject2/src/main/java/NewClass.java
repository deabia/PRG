
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
public class NewClass {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("hola " +nombre);
        System.out.println("Dime un numero:");
        int numero = sc.nextInt();
        int doble = numero *2;
        System.out.println("El doble de ese numero es " +doble);
        
    }
    
}
