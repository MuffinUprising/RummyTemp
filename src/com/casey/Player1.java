package com.casey;
import java.util.*;
/**
 * Created by casey on 2/28/15.
 */
public class Player1 extends Player {
    //Player1 constructor
    public Player1(String n){
        this.player1 = n;
        this.setHand_cards();
    }

//    Player1.seeHand();

    // see hand method
    @Override
    public void seeHand() {
        for(int x = 0; x < this.getCards().size(); x ++){
            String[] view = this.getCards().get(x);
            for(int v = 0; v < view.length; v ++){

                System.out.print(Integer.toString(x) + "| " + view[v] + " |");
                if(v%2 != 0) {
                    System.out.println();
                }
            }
        }
    }

    // player turn method
    public void playerTurn(Scanner s) {

        boolean endTurn = false;

        while(!endTurn){        // while loop for turn options
            System.out.println("What would you like to do?");
            System.out.println("[1] Draw from the deck");
            System.out.println("[2] Draw from the discard pile");
            System.out.println("[3] Add cards to meld");
            System.out.println("[4] Discard and end turn");

            int choice = getPositiveIntInput(s);

            if (choice == 1) {      // draw from deck option
                //TODO draw from deck
                LinkedList<String[]> newCard  = new LinkedList<String[]>;

                newCard = Deck.draw();
            }
            if (choice == 2) {      // draw from discard pile option
                //TODO call discard pile
                Player1.getCards().add(Discard.drawDiscard());
            }
            if (choice == 3) {      // add cards to meld option
                //TODO choose cards for meld, check if valid meld
            }
            if (choice == 4) {      // discard and end turn option
                //TODO print hand
                //TODO ask user which card to discard
                Player1.dropCard(i, Player.getHand_cards());
                endTurn = true;
            }
        }
    }
    //method to check input for positive ints
    private static int getPositiveIntInput(Scanner s) {

        while (true) {
            try {
                String stringInput = s.nextLine();
                int intInput = Integer.parseInt(stringInput);
                if (intInput >= 0) {
                    return intInput;
                } else {
                    System.out.println("Please enter a positive number");
                    continue;
                }
            } catch (NumberFormatException ime) {
                System.out.println("Please type a positive number");
            }
        }
    }
}
