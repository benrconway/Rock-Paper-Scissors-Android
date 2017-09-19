package com.example.user.myapplication;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by user on 19/09/2017.
 */

public class Game {
    Hand hand1;
    Hand hand2;
    HashMap<Hand, Hand> victoryMethod;
    Random random;

    public Game() {
        setUpWinStrategy();
    }

    public Game(Hand firstHand, Hand secondHand){
        this.hand1 = firstHand;
        this.hand2 = secondHand;
        setUpWinStrategy();
    }

    public void setUpWinStrategy(){
        victoryMethod = new HashMap<>();
        victoryMethod.put(Hand.ROCK, Hand.SCISSORS);
        victoryMethod.put(Hand.SCISSORS, Hand.PAPER);
        victoryMethod.put(Hand.PAPER, Hand.ROCK);
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

    public void setHands(Hand playerHand){
        this.hand1 = playerHand;
        this.hand2 = computerHand();
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

    public Hand computerHand(){
        random = new Random();
        int randomInt = random.nextInt(3);
        return Hand.values()[randomInt];
    }

}
