package org.example;
import java.util.Collections;
import java.util.ArrayList;
public class Deck {
    private ArrayList<Card> cards;
    public Deck(){
        cards = new ArrayList<>();
        CardSuit[] suits = new CardSuit[]{CardSuit.CLUBS, CardSuit.HEARTS, CardSuit.SPADES, CardSuit.DIAMONDS};
        String[] values = {"2","3","4","5","6","7","8",
                "9","10","J","Q","K","A"};
        for(CardSuit suit: suits){
            for(String value: values){
                Card card = new Card(suit, value);
                cards.add(card);
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public Card deal(){
        if(!cards.isEmpty()){
            Card card = cards.remove(0);
            return card;
        } else {
            return null;
        }
    }
    public int getSize(){
        return cards.size();
    }
}