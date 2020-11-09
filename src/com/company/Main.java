package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Deck x = new Deck();
        boolean unfinished = true;

        x.Deck();
        x.createDeck();

        while(unfinished) {
            try {
                showMenu(x);
                unfinished = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void showMenu(Deck x) throws Exception{
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
                    try {
                        x.head();
                        System.out.println();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando el programa, vuelve pronto!");
                        onLoop = false;
                    }
                    break;
                case 3:
                    try {
                        x.pick();
                        System.out.println();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando el programa, vuelve pronto!");
                        onLoop = false;
                    }
                    break;
                case 4:
                    try {
                        x.hand();
                        System.out.println();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando el programa, vuelve pronto!");
                        onLoop = false;
                    }
                    break;
                case 0:
                    onLoop = false;
                    break;
                default:
                    throw new Exception("Opción no válida\n");
            }
        }

    }
}
