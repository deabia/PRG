package main;

import java.util.Scanner;

public class EjerciciosBasicos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ejercicio;

        do {

            System.out.println("¿Qué ejercicio quieres hacer?");
            System.out.println("1. Ejercicio 19 Secuencial");
            System.out.println("2. Ejercicio 20 Secuencial");
            System.out.println("3. Ejercicio 16 Alternativas");
            System.out.println("4. Ejercicio 19 Alternativas");
            System.out.println("5. Ejercicio 20 Alternativas");
            System.out.println("6. Ejercicio 8 Repetitivas");
            System.out.println("7. Ejercicio 12 Repetitivas");
            System.out.println("8. Ejercicio 14 Repetitivas");
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

            }
        }while (ejercicio != 0) ;
    }

    public static void ejercicio1(Scanner sc){

        System.out.println("¿Cuántas preguntas correctas has tenido?");
        int preguntasCorrectas = sc.nextInt();
        System.out.println("¿Cuántas preguntas fallidas has tenido?");
        int preguntasFallidas = sc.nextInt();
        System.out.println("¿Cuántas preguntas has dejado en blanco?");
        int preguntasBlanco = sc.nextInt();

        int puntos = (preguntasCorrectas * 5) - (preguntasFallidas);
        int preguntas = preguntasBlanco + preguntasCorrectas + preguntasFallidas;
        int totalpuntos = (preguntas * 5);

        System.out.println("Tu puntuación ha sido " + puntos + " sobre " + totalpuntos);

    }

    public static void ejercicio2(Scanner sc){

        System.out.println("Dime las monedas que tienes y te diré el total del dinero:");
        System.out.println("¿Cuántas monedas de 2 € tienes?");
        double monedas2e = sc.nextInt();
        System.out.println("¿Cuántas monedas de 1 € tienes?");
        double monedas1e = sc.nextInt();
        System.out.println("¿Cuántas monedas de 50 ct tienes?");
        double monedas50ct = sc.nextInt();
        System.out.println("¿Cuántas monedas de 20 ct tienes?");
        double monedas20ct = sc.nextInt();
        System.out.println("¿Cuántas monedas de 10 ct tienes?");
        double monedas10ct = sc.nextInt();

        double euros2e = monedas2e * 2;
        double euros50ct = monedas50ct / 2;
        double euros20ct = monedas20ct / 5;
        double euros10ct = monedas10ct / 10;

        double totalDinero = (euros2e + monedas1e + euros50ct + euros20ct + euros10ct);

        System.out.println("El total que tienes es: " + totalDinero + " €");

    }

    public static void ejercicio3(Scanner sc){

        System.out.println("¿Cuántos minutos ha durado tu llamada?");

        int minutos = sc.nextInt();
        double coste = 3;
        int turno = 0;

        System.out.println("¿Es domingo?");
        System.out.println("1. Si");
        System.out.println("2. No");

        int dia = sc.nextInt();

        if(dia == 2){
            System.out.println("Es en turno de día o turno de tarde");
            System.out.println("1. Turno de día");
            System.out.println("2. Turno de tarde");
            turno = sc.nextInt();
        }

        if (minutos > 10) {
        } else if (minutos <= 10) {
            coste -= 0.50;
            if (minutos <= 8) {
                coste -= 0.70;
                if (minutos <= 5) {
                    coste -= 0.80;
                }
            }
        }

        if(dia == 1){
            coste *= 1.03;
        }else{
            if(turno == 1){
                coste *= 1.15;
            }else{
                coste *= 1.10;
            }
        }

        System.out.println("El coste de tu llamada ha sido de " + coste + " €");

    }

    public static void ejercicio4(Scanner sc){

        System.out.println("Dime un número del 1 al 12 y te diré cuantos dias tiene su mes correspondiente");

        int mes = sc.nextInt();

        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tu mes tiene 31 días");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tu mes tiene 30 días");
            break;
            case 2:
                System.out.println("Tu mes tiene 28 días");
            break;
            default:
                System.out.println("No has escrito un número del 1 al 12");
            break;
        }

    }

    public static void ejercicio5(Scanner sc){

        System.out.println("Dime el peso de tu paquete en gramos: ");
        double peso = sc.nextDouble();

        if(peso > 5000){
            System.out.println("Tu paquete es demasiado pesado, no se puede enviar");
        }else{
            System.out.println("Dime dónde va a ir el paquete");
            System.out.println("1. América del Norte");
            System.out.println("2. América Central");
            System.out.println("3. América del Sur");
            System.out.println("4. Europa");
            System.out.println("5. Asia");
            int ubicacion = sc.nextInt();
            double precio;
            switch (ubicacion) {

                case 1:
                    precio = peso * 24;
                    System.out.println("El precio del envío es: " + precio + " €");
                    break;
                case 2:
                    precio = peso * 20;
                    System.out.println("El precio del envío es: " + precio + " €");
                    break;
                case 3:
                    precio = peso * 21;
                    System.out.println("El precio del envío es: " + precio + " €");
                    break;
                case 4:
                    precio = peso * 10;
                    System.out.println("El precio del envío es: " + precio + " €");
                    break;
                case 5:
                    precio = peso * 18;
                    System.out.println("El precio del envío es: " + precio + " €");
                    break;
            }
        }

    }

    public static void ejercicio6(Scanner sc){

        int principiointervalo = 0;
        int finalintervalo = 0;

        do {
            System.out.println("El primer número del intervalo debe ser menor al final del intervalo");
            System.out.println("Esribe el principio del intervalo");
            principiointervalo = sc.nextInt();
            System.out.println("Escribe el final del intervalo");
            finalintervalo = sc.nextInt();
        }while(principiointervalo > finalintervalo);

        System.out.println("Escribe ahora números y pon el 0 cuando quieras salir");
        int intervaloInicial = sc.nextInt();
        int sumaIntervalos = intervaloInicial;
        int numerosFuera = 0;
        int numerosIguales = 0;

        while (intervaloInicial != 0) {
            int intervalo = sc.nextInt();

            if (intervalo == 0) {
                intervaloInicial = 0;
            }
            if (intervalo < principiointervalo || intervalo > finalintervalo) {

                numerosFuera++;

            } else if (intervalo == principiointervalo || intervalo == finalintervalo) {

                numerosIguales++;

            } else {
                sumaIntervalos += intervalo;
            }

        }

        System.out.println("La suma de los números dentro del intervalo es: " + sumaIntervalos);
        System.out.println("Has escrito " + numerosIguales + " números iguales a los números del intervalo");
        System.out.println("Has escrito " + numerosFuera + " números fuera del intervalo");

    }

    public static void ejercicio7(Scanner sc){

        System.out.println("Indica cuánto dinero has depositado cada mes");

        double totalAhorro = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Mes " + i + " :");
            double cantidad = sc.nextInt();

            double ahorro = (cantidad * 0.21);

            System.out.println("Este mes has ahorrado " + ahorro + " €");

            totalAhorro += ahorro;
        }

        System.out.println("El total que has ahorrado es: " + totalAhorro + " €");

    }

    public static void ejercicio8(Scanner sc){

        System.out.println("Dos coches van en sentido opuesto y a la misma velocidad.");
        System.out.println("¿En qué kilómetro está el primer coche?");
        int primerCoche = sc.nextInt();
        System.out.println("¿En qué kilómetro está el segundo coche?");
        int segundoCoche = sc.nextInt();

        int kilometro = (primerCoche + segundoCoche) / 2;

        System.out.println("Se encontrarán en el kilómetro " + kilometro);

    }

}
