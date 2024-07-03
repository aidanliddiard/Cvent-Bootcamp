package org.example;

public class Player {
    private Hand playerHand;
    private String name;

//    private boolean dealer;

    public Player(String name) {
        this.playerHand = new Hand();
        this.name = name;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Card card) {
        playerHand.deal(card);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Hand addCard()

}
