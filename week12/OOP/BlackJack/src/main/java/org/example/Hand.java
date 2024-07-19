package org.example;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private boolean bust;
    public Hand(){
        cards = new ArrayList<>();
        this.bust = false;
    }
    public void deal(Card card){
        cards.add(card);
    }
    public int getSize(){
        return cards.size();
    }
    public int getValue(){
        int value = 0;
        for(Card card: cards){
            card.flip();
            value += card.getPointValue();
            card.flip();
        }
        return value;
    }

    public void checkBust() {
//        if ()
    }
}
