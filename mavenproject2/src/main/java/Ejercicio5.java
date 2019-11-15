
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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un valor en grados Farenheit:");
        double gradosFarenheit = sc.nextInt();
        
        double celsius = ((gradosFarenheit-32)*5/9);
        
        System.out.println("Los grados en Celsius serían: "+celsius );
    }
}
