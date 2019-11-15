/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Parte2;
import java.util.Scanner;
/**
 *
 * @author Alru
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número");
        int num1 = sc.nextInt();
        System.out.println("Dime otro número");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1+ " es mayor que " +num2);
        }else{
            System.out.println(num1+ " es menor que " +num2);
        }
    }
               
}
