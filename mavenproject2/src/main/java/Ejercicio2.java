
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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime la base de un rectángulo:");
        int base = sc.nextInt();
        System.out.println("Dime la altura de un rectángulo");
        int altura = sc.nextInt();
        
        int area = (base * altura);
        int perimetro = ((base * 2) + (altura * 2));
        
        System.out.println("El area es "+area);
        System.out.println(" y el perimetro es " +perimetro);
    }
}
