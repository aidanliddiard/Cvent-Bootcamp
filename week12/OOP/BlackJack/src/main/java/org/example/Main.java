package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Player> players = new ArrayList<>();

        System.out.println("Please enter name for player 1: ");
        players.add(new Player(scanner.nextLine()));

        System.out.println("Please enter name for player 2: ");
        players.add(new Player(scanner.nextLine()));

        Deck deck = new Deck();
        deck.shuffle();

        for (Player player : players) {
            for (int i = 0; i < 2; i ++) {
                Card card = deck.deal();
                Hand hand = new Hand();
                hand.deal(card);
                player.setPlayerHand(hand);
                int handValue = player.getPlayerHand().getValue();
                System.out.println("This hand is worth " + handValue);
            }
        }


    }
}