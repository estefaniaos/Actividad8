package com.company;

public class Card {
    String palo;
    String color;
    String valor;

    public void Card(){
        this.palo = "";
        this.color = "";
        this.valor = "";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
