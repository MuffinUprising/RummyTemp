package com.casey;

import java.util.*;

public class GameManager {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Would you like to start? y/n");
        String start = s.next();
        if(start.equals("n")){
            System.out.println("Thanks for your time!");
        }
        else if(start.equals("y")) {
            Deck game_start = new Deck("game1");
            Player1 player = new Player1("player1");
//            Player cpu = new hand("computer");
            for(int x = 0; x < 5; x ++){
                player.getCards().put(x, game_start.draw());
            }
            player.seeHand();
            System.out.println();
            System.out.println(Integer.toString(game_start.getdeck().size()));
        }
    }


    public static Integer handSize(Player name){
        return name.getCards().size();
    }

//    public void handOut(hand name){
//        System.out.println(name.getplayer() + " has " + Integer.toString(handSize(name)) + " cards in hand.");
//    }
//    public static void displayCards() {
        // TODO
        // for loops to display cards in player1 hand and in discard pile
        // add number to display for choice of card ( i.e. [1] 10 of Spades, [2] 3 of Clubs, etc.)
//    }

}
