package main;

import java.util.Scanner;

public class EjerciciosBasicos2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int num= 1;

        while (suma < 125){
            num++;
            suma = 0;

            for(int i =num; i> 0; i--){
                suma += i;
            }

        }
        System.out.println(num);
    }



    }

