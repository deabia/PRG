package main;

import Modelo.Carta;

import java.util.Random;
import java.util.Scanner;

public class Sieteymedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carta baraja[] = new Carta[40];
        for (int i = 0; i < 40; i++) {
            baraja[i] = new Carta();
        }

        for (int i = 0; i < 10; i++) {
            baraja[i].setValor(i + 1);
            baraja[i + 10].setValor(i + 1);
            baraja[i + 20].setValor(i + 1);
            baraja[i + 30].setValor(i + 1);
            baraja[i].setPalo(1);
            baraja[i + 10].setPalo(2);
            baraja[i + 20].setPalo(3);
            baraja[i + 30].setPalo(4);
        }

        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            int pos1 = r.nextInt(40);
            int pos2 = r.nextInt(40);
            Carta swap = baraja[pos1];
            baraja[pos1] = baraja[pos2];
            baraja[pos2] = swap;
        }

        System.out.println("¿Cuántos jugadores quieres?");

        int jugadores = sc.nextInt();

        System.out.println("Empieza el juego");

        int salir = 1;
        int contador = 0;
        double total = 0;
        double valor = 0;

        double resultados[] = new double[jugadores];

        for (int i = 0; i < jugadores; i++) {
            salir = 1;
            while (salir != 0) {

                System.out.println("Jugador " + (i + 1));

                valor = baraja[contador].getValor();

                System.out.println("Tu carta es: " + valor);

                if (valor > 7) {
                    valor = 0.5;
                }

                resultados[i] += valor;

                if (resultados[i] > 7.5) {
                    System.out.println("Sumas un total de " + resultados[i] + " puntos");
                    System.out.println("Has superado los 7.5 puntos");
                    salir = 0;
                } else if (resultados[i] == 7.5) {

                    System.out.println("Sumas un total de " + resultados[i] + " puntos");
                    salir = 0;

                } else {

                    System.out.println("Tienes un total de " + resultados[i] + " puntos");

                    contador++;

                    if (contador > 39) {
                        for (int j = 0; j < 10000; j++) {
                            int pos1 = r.nextInt(40);
                            int pos2 = r.nextInt(40);
                            Carta swap = baraja[pos1];
                            baraja[pos1] = baraja[pos2];
                            baraja[pos2] = swap;
                        }
                        contador = 0;
                    }

                    System.out.println("¿Quieres coger otra carta?");
                    System.out.println("1.Si");
                    System.out.println("0.No, me planto");
                    salir = sc.nextInt();
                }
            }
        }
        if(jugadores > 1) {

            int sieteymedia = 0;
            int pierde = 0;
            double ganador = 0;
            int jugador = 0;
            int ganadorPerfecto = 0;

            for (int i = 0; i < jugadores; i++) {
                if (resultados[i] == 7.5) {
                    System.out.println("El jugador " + (i + 1) + " ha conseguido la puntuación perfecta");
                    sieteymedia++;
                    ganadorPerfecto = (i+1);
                } else if (resultados[i] > 7.5) {
                    System.out.println("El jugador " + (i + 1) + " se ha pasado de 7.5");
                    pierde++;
                } else {
                    System.out.println("El jugador " + (i + 1) + " ha conseguido " + resultados[i] + " puntos");
                    if (resultados[i] > ganador) {
                        ganador = resultados[i];
                        jugador = (i + 1);
                    }
                }
            }
            if (sieteymedia > 0) {
                System.out.println("El ganador ha sido el jugador " + ganadorPerfecto + ", ha sido el último en llegar a la puntuación perfecta");
            } else if (pierde == jugadores) {
                System.out.println("Todos los jugadores se han pasado, no gana nadie");
            } else {
                System.out.println("El ganador es el jugador " + jugador + " con la puntuación " + ganador);
            }
        }else if(jugadores == 1){

            int ai = 1;
            double valorAI = 0;
            double totalAI = 0;

            System.out.println("Al jugar sólo un jugador jugarás contra la AI");

            if (resultados[0] > 7.5) {
                System.out.println("Has perdido, te has pasado de 7.5");
            } else if (resultados[0] == 7.5) {
                System.out.println("Has conseguido la puntuación perfecta, has ganado");
            }else {
                System.out.println("Turno de la AI");
                while (ai != 0) {

                    contador++;

                    valorAI = baraja[contador].getValor();

                    if (valorAI > 7) {
                        valorAI = 0.5;
                    }

                    totalAI += valorAI;


                    if (totalAI > resultados[0] && totalAI < 7.5) {
                        ai = 0;
                        System.out.println("La puntuación de la AI es " + totalAI + ", has perdido");
                    }else if (totalAI == resultados[0]) {
                    }
                    if (totalAI > 7.5) {
                        ai = 0;
                        System.out.println("La puntuación de la AI es " + totalAI + ", has ganado");
                    }
                }
            }
        }
    }
}


