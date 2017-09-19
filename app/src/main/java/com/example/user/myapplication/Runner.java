package com.example.user.myapplication;

/**
 * Created by user on 19/09/2017.
 */

public class Runner {

    public static void main(String[] args){
        Game game = new Game();
        game.setHands(Hand.ROCK);
        System.out.println(game.compete());

    }
}
