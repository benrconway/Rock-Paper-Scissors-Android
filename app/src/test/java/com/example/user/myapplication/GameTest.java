package com.example.user.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/09/2017.
 */

public class GameTest {
    Game game;

    @Test
    public void canPlayDraw(){
        game = new Game(Hand.SCISSORS, Hand.SCISSORS);
        String result = game.compete();
        assertEquals(result, "It's a draw!");
    }

    

}
