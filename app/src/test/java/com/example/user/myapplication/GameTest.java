package com.example.user.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GameTest {
    Game game;

    @Test
    public void canPlayDraw(){
        game = new Game(Hand.SCISSORS, Hand.SCISSORS);
        String result = game.compete();
        assertEquals(result, "It's a draw!");
    }

    @Test
    public void player1CanWin(){
        game = new Game(Hand.PAPER, Hand.ROCK);
        String result = game.compete();
        assertEquals(result, "Player 1 wins!");
    }

    @Test
    public void player2CanWin(){
        game = new Game(Hand.ROCK, Hand.PAPER);
        String result = game.compete();
        assertEquals(result, "Player 2 wins!");
    }

    @Test
    public void testScissorsCanWin(){
        game = new Game(Hand.PAPER, Hand.SCISSORS);
        String result = game.compete();
        assertEquals(result, "Player 2 wins!");
    }

}
