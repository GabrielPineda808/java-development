package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int value = 0;
    public Hand(){
        cards = new ArrayList<>();
    }

    public void deal(Card card){
        cards.add(card);
    }

    public int getSize(){
        return cards.size();
    }

    public int getValue(){

        for(Card card : cards){
            card.flip();
            value += card.getPointValue();
            card.flip();
        }
        return value;
    }

    public void zeroValue(){
        value = 0;
    }
}
