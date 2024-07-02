package org.example;

public class Card {
    private CardSuit suit;
    private String value;
    private boolean isFaceUp;
    public Card(CardSuit suit, String value) {
        this.suit = CardSuit.valueOf(String.valueOf(suit));
        this.value = value;
        this.isFaceUp = false;
    }
    public CardSuit getSuit(){
        return suit;

    }
    public String getValue(){
        if(isFaceUp){
            return value;
        } else {
            return "#";
        }
    }
    public int getPointValue(){
        if(isFaceUp){
            if(getValue().equals("A")) {
                return 11;
            } else if (getValue().equals("K") || getValue().equals("Q") || getValue().equals("J")) {
                return 10;
            } else return Integer.parseInt(getValue());
        } else {
            return 0;
        }
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}
