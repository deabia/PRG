package main;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int ejercicio;

        do {

            System.out.println("¿Qué ejercicio quieres hacer?");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("0. Salir");
            ejercicio = sc.nextInt();


            switch (ejercicio) {
                case 1:

                    ejercicio1(sc);

                    break;
                case 2:

                    ejercicio2(sc);

                    break;
                case 3:

                    ejercicio3(sc);

                    break;
                case 4:

                    ejercicio4(sc);

                    break;
                case 5:

                    ejercicio5(sc);

                    break;
                case 6:

                    ejercicio6(sc);

                    break;
                case 7:

                    ejercicio7(sc);

                    break;
                case 8:

                    ejercicio8(sc);

                    break;
                case 9:

                    ejercicio9(rand);

                    break;
                case 10:

                    ejercicio10(rand);

                    break;
            }
        }while (ejercicio != 0) ;
    }

    public static void ejercicio1(Scanner sc) {
            int numeros[]= new int[5];

            for( int i=0; i<numeros.length; i++){
                System.out.println("Dime un número");
                numeros[i] = sc.nextInt();
            }

            for( int i=0; i<numeros.length; i++){
                System.out.println(numeros[i]);
            }
    }

    public static void ejercicio2(Scanner sc) {
        int numeros[]= new int[5];

        for( int i=0; i<numeros.length; i++){
            System.out.println("Dime un número");
            numeros[i] = sc.nextInt();
        }

        for( int i= numeros.length - 1;i>=0; i--){
            System.out.println(numeros[i]);
        }
    }

    public static void ejercicio3(Scanner sc) {
        int totalNegativos = 0;
        int totalPositivos = 0;
        int numerosNegativos = 0;
        int numerosPositivos = 0;
        int numeroDeCeros = 0;
        int mediaPositivos = 0;
        int mediaNegativos = 0;
        int numeros[]= new int[5];

        for( int i=0; i<numeros.length; i++){
            System.out.println("Dime un número");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i< numeros.length; i++){
            if(numeros[i]<0){
                totalNegativos += numeros[i];
                numerosNegativos++;
            }else if (numeros[i]>0){
                totalPositivos += numeros[i];
                numerosPositivos++;
            }else{
                numeroDeCeros++;
            }
        }

        if(numerosNegativos!=0) {
            mediaNegativos = totalNegativos / numerosNegativos;
        }
        if(numerosPositivos !=0) {
            mediaPositivos = totalPositivos / numerosPositivos;
        }

        System.out.println("La media de los números negativos es: "+mediaNegativos);
        System.out.println("La media de los números positivos es: "+mediaPositivos);
        System.out.println("Has puesto "+numeroDeCeros+" ceros");
    }

    public static void ejercicio4(Scanner sc) {
        int numeros[]= new int[10];

        for( int i=0; i<numeros.length; i++){
            System.out.println("Dime un número");
            numeros[i] = sc.nextInt();
        }

        for( int i=0; i<=4; i++){
            System.out.println(numeros[i]);
            System.out.println(numeros[9-i]);

        }
    }

    public static void ejercicio5(Scanner sc) {
        int numerosTabla1[] = new int[10];

        System.out.println("Primera Tabla");

        for (int i = 0; i < numerosTabla1.length; i++) {
            System.out.println("Dime un número");
            numerosTabla1[i] = sc.nextInt();
        }

        int numerosTabla2[] = new int[10];

        System.out.println("Segunda Tabla");

        for (int i = 0; i < numerosTabla2.length; i++) {
            System.out.println("Dime un número");
            numerosTabla2[i] = sc.nextInt();
        }

        int numerosTabla3[]= new int[20];
        int contador = 0;

        for(int i = 0; i< numerosTabla1.length; i++){
            numerosTabla3[contador] = numerosTabla1[i];
            contador++;
            numerosTabla3[contador] = numerosTabla2[i];
            contador++;
        }

        System.out.println("La tecera tabla tendría estos valores: ");
        for(int i = 0; i<numerosTabla3.length; i++){
            System.out.println(numerosTabla3[i]);
        }
    }

    public static void ejercicio6(Scanner sc) {
        int numerosTabla1[] = new int[12];

        System.out.println("Tabla 1");

        for (int i = 0; i < numerosTabla1.length; i++) {
            System.out.println("Dime un número");
            numerosTabla1[i] = sc.nextInt();
        }

        int numerosTabla2[] = new int[12];

        System.out.println("Tabla 2");

        for (int i = 0; i < numerosTabla2.length; i++) {
            System.out.println("Dime un número");
            numerosTabla2[i] = sc.nextInt();
        }

        int numerosTabla3[]= new int[24];
        int contador = 0;
        int tabla3 = 0;

        while(contador<12){
            for(int i = 0;i<3;i++){
                numerosTabla3[tabla3]= numerosTabla1[contador+i];
                tabla3++;
            }
            for(int i = 0;i<3;i++){
                numerosTabla3[tabla3]= numerosTabla2[contador+i];
                tabla3++;
            }
            contador+=3;
        }

        System.out.println("La tecera tabla tendría estos valores: ");
        for(int i = 0; i<numerosTabla3.length; i++){
            System.out.println(numerosTabla3[i]);
        }
    }

    public static void ejercicio7(Scanner sc){



    }

    public static void ejercicio8(Scanner sc){



    }

    public static void ejercicio9(Random rand){

        int numerosTabla[] = new int[10];

        System.out.println("Tabla");

        for (int i = 0; i < numerosTabla.length; i++) {
            numerosTabla[i] = rand.nextInt(50);
        }

        for( int i=0; i<numerosTabla.length; i++){
            System.out.println(numerosTabla[i]);
        }

        System.out.println("Se cambiará el último valor al primero");

        int ultimaPos = numerosTabla[numerosTabla.length - 1];

        for (int i = numerosTabla.length - 1; i>=1; i--){
            numerosTabla[i] = numerosTabla[i-1];
        }

        numerosTabla[0] = ultimaPos;

        for( int i=0; i<numerosTabla.length; i++){
            System.out.println(numerosTabla[i]);
        }

    }

    public static void ejercicio10(Random rand){

        int numerosTabla[] = new int[10];

        System.out.println("Tabla");

        for (int i = 0; i < numerosTabla.length; i++) {
            numerosTabla[i] = rand.nextInt(50);
        }

        for( int i=0; i<numerosTabla.length; i++){
            System.out.println(numerosTabla[i]);
        }

        System.out.println("¿Cuántas posiciones quieres desplazarlo?");

        int ultimaPos = numerosTabla[numerosTabla.length - 1];

        for (int i = numerosTabla.length - 1; i>=1; i--){
            numerosTabla[i] = numerosTabla[i-1];
        }

        numerosTabla[0] = ultimaPos;

        for( int i=0; i<numerosTabla.length; i++){
            System.out.println(numerosTabla[i]);
        }


    }

}
