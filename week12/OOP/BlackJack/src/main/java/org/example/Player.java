package org.example;

public class Player {
    private Hand playerHand;
    private String name;
    private int handTotal;
    boolean bust;

    public Player(Hand playerHand, String name) {
        this.playerHand = playerHand;
        this.name = name;
        this.handTotal = 0;
        this.bust = false;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHandTotal() {
        return playerHand.getValue();
    }

    public void setHandTotal(int handTotal) {
        this.handTotal = handTotal;
    }

    public boolean isBust() {
        return bust;
    }

    public void setBust(boolean bust) {
        this.bust = bust;
    }
}
