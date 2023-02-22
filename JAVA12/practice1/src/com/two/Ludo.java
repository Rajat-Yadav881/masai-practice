package com.two;


import java.util.Random;

public class Ludo {
	public static void main(String[] args) {
		
	}
    private static final int NUM_PLAYERS = 4;
    private static final int NUM_TOKENS = 4;
    private static final int MAX_ROLL_VALUE = 6;
    private static final int MAX_BOARD_POS = 56;

    private int[] playerTokens; // position of each token
    private int currentPlayer;
    private boolean gameOver;
    private Random rand;

    // constructor
    public Ludo() {
        rand = new Random();
        playerTokens = new int[NUM_PLAYERS * NUM_TOKENS];
        resetGame();
    }

    // reset the game
    public void resetGame() {
        gameOver = false;
        currentPlayer = 0;
        for (int i = 0; i < playerTokens.length; i++) {
            playerTokens[i] = 0;
        }
    }

    // returns the position of the token of the current player
    public int getCurrentPlayerTokenPosition() {
        return playerTokens[currentPlayer];
    }

    // returns true if the current player has any token in the board
    public boolean isCurrentPlayerInBoard() {
        return getCurrentPlayerTokenPosition() > 0;
    }

    // roll the dice
    public int rollDice() {
        return rand.nextInt(MAX_ROLL_VALUE) + 1;
    }

    // returns true if the token can move forward
    public boolean canMoveForward(int steps) {
        int pos = getCurrentPlayerTokenPosition() + steps;
        return (pos <= MAX_BOARD_POS);
    }

    // move the token forward
    public void moveTokenForward(int steps) {
        if (canMoveForward(steps)) {
            playerTokens[currentPlayer] += steps;
        }
    }

    // returns true if the current player's token has reached the end
    public boolean isGameOver() {
        return gameOver;
    }

    // move to the next player
    public void nextPlayer() {
        currentPlayer = (currentPlayer + 1) % NUM_PLAYERS;
        if (getCurrentPlayerTokenPosition() == MAX_BOARD_POS) {
            gameOver = true;
        }
    }
}
//class Main{
//	public static void main(String[] args) {
//		Ludo ludo = new Ludo();
//		
//	}
//}