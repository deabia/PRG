package Parte2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número");
        int num1 = sc.nextInt();

        if(num1 > 0){
            System.out.println(num1+ " es positivo");
        }else if(num1 < 0){
            System.out.println(num1+ " es negativo");
        }else{
        System.out.println(num1+ " es 0");
        }
    }

}