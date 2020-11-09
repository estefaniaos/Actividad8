package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Deck {
    ArrayList<Card> cards;
    HashMap<String, String> atributos;

    public void Deck(){
        cards = new ArrayList<Card>();
        atributos = new HashMap<>();
    }

    public void createDeck(){
        atributos.put("Treboles", "Negro");
        atributos.put("Picas", "Negro");
        atributos.put("Corazones", "Rojo");
        atributos.put("Diamantes", "Rojo");

        for (int i = 0; i < 13; i++) {

            switch (i){
                case 0:
                    createQuartet("A");
                    break;
                case 10:
                    createQuartet("J");
                    break;
                case 11:
                    createQuartet("Q");
                    break;
                case 12:
                    createQuartet("K");
                    break;
                default:
                    String valor = Integer.toString(i);
                    createQuartet(valor);
                    break;
            }

        }
    }

    public void createQuartet(String valor){
        for (Map.Entry<String, String> entry : atributos.entrySet()) {
            String palo = entry.getKey();
            String color = entry.getValue();

            Card card = new Card();
            card.Card();
            card.setColor(color);
            card.setPalo(palo);
            card.setValor(valor);

            cards.add(card);
            //System.out.println(card.color + card.palo + card.valor);
        }
    }

    public void shuffle(){
        System.out.println("Se mezclo el Deck");
    }

    public void head() throws Exception{
        if( cards.toArray().length < 1 ){
            throw new DeckExceptions().EmptyDeckException(cards.toArray().length);
        }
        Card firstCard;
        firstCard = cards.get(0);

        System.out.println("La primera carta es: " + firstCard.valor + " de " + firstCard.palo + " " + firstCard.color);
        cards.remove(0);
        System.out.println("Quedan " + cards.toArray().length + " cartas.");
    }

    public void pick() throws Exception{
        if( cards.toArray().length < 1 ){
            throw new DeckExceptions().EmptyDeckException(cards.toArray().length);
        }

        Random random = new Random();
        int pickedNum = random.nextInt(cards.toArray().length);

        Card pickedCard;
        pickedCard = cards.get(pickedNum);

        System.out.println("La carta elegida es: " + pickedCard.valor + " de " + pickedCard.palo + " " + pickedCard.color);
        cards.remove(pickedNum);
        System.out.println("Quedan " + cards.toArray().length + " cartas.");
    }

    public void  hand() throws Exception{
        if( cards.toArray().length < 5 ){
            throw new DeckExceptions().EmptyDeckException(cards.toArray().length);
        }

        Card[] hand = new Card[5];
        Card randomCard;
        Random random = new Random();
        int randomNum;

        System.out.println("Tus cartas son:");
        for (int i = 0; i < 5; i++) {
            randomNum = random.nextInt(cards.toArray().length);
            randomCard = cards.get(randomNum);
            hand[i] = randomCard;

            System.out.println(randomCard.valor + " de " + randomCard.palo + " " + randomCard.color);
            cards.remove(randomCard);
        }

        System.out.println("Quedan " + cards.toArray().length + " cartas.");

    }


}
