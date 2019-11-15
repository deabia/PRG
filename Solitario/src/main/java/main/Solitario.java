package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Solitario {

    public static void ejercicio17(Random rand){
        Scanner sc = new Scanner(System.in);

        int cartas[] = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        int palo1[] = new int[10];
        int palo2[] = new int[10];
        int palo3[] = new int[10];
        int palo4[] = new int[10];
        int swap = 0;

        Random random = new Random();
        for(int i = 0; i < 40; i++){
            int cartaRandom = random.nextInt(40);
            swap = cartas[i];
            cartas[i] = cartas[cartaRandom];
            cartas[cartaRandom] = swap;
        }

        imprimirArray(cartas);

    }

    public static void changePosition(int array[],int origen,int destino) {
        int swap = array[destino];
        array[destino] = array[origen];
        array[origen] = swap;

    }

    public static int[] rellenaArray(int size, int bound) {
        int[] array = new int[size];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(bound);
        }

        return array;
    }

    public static void rellenaRandomArraySort(int array[], int bound) {
        rellenaRandomArray(array, bound);
        Arrays.sort(array);
    }

    public static void rellenaRandomArray(int array[], int bound) {

        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(bound);
        }
    }

    public static void imprimirArray(int array[]) {

        System.out.print("{");

        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
        System.out.println("}");
    }
}
