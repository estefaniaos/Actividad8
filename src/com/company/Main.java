package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck x = new Deck();

        x.Deck();
        x.createDeck();

        showMenu(x);

    }

    public static void showMenu(Deck x){
        int option;
        boolean onLoop = true;
        Scanner write = new Scanner(System.in);

        while(onLoop) {
            System.out.println("Bienvenido a Poker!\n" +
            "Selecciona una opción:\n" +
            "1 Mezclar deck\n" +
            "2 Sacar una carta\n" +
            "3 Carta al azar\n" +
            "4 Generar una mano de 5 cartas\n" +
            "0 Salir");
            option = write.nextInt();

            System.out.println();

            switch (option) {
                case 1:
                    x.shuffle();
                    System.out.println();
                    break;
                case 2:
                    x.head();
                    System.out.println();
                    break;
                case 3:
                    x.pick();
                    System.out.println();
                    break;
                case 4:
                    x.hand();
                    System.out.println();
                    break;
                case 0:
                    onLoop = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    System.out.println();
            }
        }
    }
}
