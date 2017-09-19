package com.example.user.myapplication;

import java.util.HashMap;

/**
 * Created by user on 19/09/2017.
 */

public class Game {
    Hand hand1;
    Hand hand2;
    HashMap<Hand, Hand> victoryMethod;

    public Game() {
        victoryMethod = new HashMap<>();
        victoryMethod.put(Hand.ROCK, Hand.SCISSORS);
        victoryMethod.put(Hand.SCISSORS, Hand.PAPER);
        victoryMethod.put(Hand.PAPER, Hand.ROCK);
    }

    public Game(Hand hand1, Hand hand2){
        hand1 = hand1;
        hand2 = hand2;
    }

    public Hand getHand1() {
        return hand1;
    }

    public void setHand1(Hand hand1) {
        this.hand1 = hand1;
    }

    public Hand getHand2() {
        return hand2;
    }

    public void setHand2(Hand hand2) {
        this.hand2 = hand2;
    }

    public String compete(){
       if (hand1 == hand2){
           return "It's a draw!";
       }else{
           if (victoryMethod.get(hand1) == hand2){
            return "Player 1 wins!";
           }else{
               return "Player 2 wins!";
           }
       }



    }

}
