
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alru
 */
public class EjerciciosBasicos1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el numero menor");
        int menor = sc.nextInt();
        System.out.println("Dime el numero mayor");
        int mayor = sc.nextInt();
        
        for(int i = menor ; i<= mayor; i++){
            System.out.println(+i);
        }
    }
            
}
