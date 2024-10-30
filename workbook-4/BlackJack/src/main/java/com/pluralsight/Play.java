package com.pluralsight;

import java.util.Scanner;

public class Play {
    Scanner s = new Scanner(System.in);
    public Play(){
        do{
            Deck deck = new Deck();

            deck.shuffle();

            Hand hand1 = new Hand();

            Hand dealer = new Hand();

            for(int i = 0; i < 2; i++){
                Card playerCard = deck.deal();
                Card dealerCard = deck.deal();

                hand1.deal(playerCard);
                dealer.deal(dealerCard);
            }


            int handValue = hand1.getValue();
            int dealerValue = dealer.getValue();
            System.out.println("The dealers hand is worth " + dealerValue);
            System.out.println("This hand is worth "+ handValue);
            dealer.zeroValue();
            hand1.zeroValue();

            System.out.println("Would you like to play another hand? Enter (y) yes or (n) no:");
            String anotherGame = s.nextLine();
        }while (true);
    }


}
