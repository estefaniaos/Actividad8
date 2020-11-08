package com.company;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Deck x = new Deck();

        x.Deck();
        x.createDeck();
        x.shuffle();
        System.out.println();

        x.head();
        System.out.println();

        x.pick();
        System.out.println();

        x.hand();
    }
}
