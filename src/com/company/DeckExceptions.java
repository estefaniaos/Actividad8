package com.company;

public class DeckExceptions extends Exception{
    public Exception EmptyDeckException(int cardsLeft) {
        String eMessage;

        if(cardsLeft < 1){
            eMessage = "Se han agotado las cartas";
        }else{
            eMessage = "No alcanzan las cartas para generar la mano, solo quedan " + cardsLeft;
        }
        return new Exception(eMessage);
    }
}
