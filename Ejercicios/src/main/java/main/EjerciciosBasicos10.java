package main;

import java.util.Scanner;

public class EjerciciosBasicos10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime hasta qué numero quieres ver los número primos: ");
        int fin = sc.nextInt();

        int j, i;
        boolean primo;
        for(i = 2;i <= fin;i++){
            primo=true;
            for(j = 2;j < i;j++){
                if(i % j == 0){
                    primo = false;
                }
            }
            if(primo){
                System.out.println(i+"\n");
            }
        }

    }
}
