package com.casey;

import java.util.*;

/**
 * Created by casey on 2/28/15.
 */
public class Player {
    protected String player1;
    protected HashMap<Integer, String[]> hand_cards;

//    protected HashMap<Integer, String[]> cpu_cards;
//
//    public void setCpu_cards(HashMap<Integer, String[]> cpu_cards) { this.cpu_cards = cpu_cards;}
//
//    public HashMap<Integer, String[]> getCpu_cards() {return cpu_cards;}


    public void setHand(String name){
        this.player1 = name;
    }

    public String getPlayer1(){
        return this.player1;
    }


    public void setHand_cards(){
        this.hand_cards = new HashMap<Integer, String[]>();
    }

    public HashMap<Integer, String[]> getCards() {return this.hand_cards;}

    public void seeHand(){
    }
}
