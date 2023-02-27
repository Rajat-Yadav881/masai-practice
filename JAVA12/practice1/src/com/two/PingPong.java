package com.two;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PingPong extends Application {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int PADDLE_WIDTH = 10;
    private static final int PADDLE_HEIGHT = 80;
    private static final int PADDLE_SPEED = 5;
    private static final int BALL_SIZE = 10;
    private static final int BALL_SPEED = 5;
    private int playerScore = 0;
    private int computerScore = 0;
    private boolean gameStarted = false;

    private Canvas canvas;
    private GraphicsContext gc;

    private double playerY = HEIGHT / 2 - PADDLE_HEIGHT / 2;
    private double computerY = HEIGHT / 2 - PADDLE_HEIGHT / 2;
    private double ballX = WIDTH / 2;
    private double ballY = HEIGHT / 2;
    private double ballDx = BALL_SPEED;
    private double ballDy = BALL_SPEED;

    private void update() {
        if (!gameStarted) {
            return;
        }

        // Move player paddle
        if (canvas.isFocused()) {
            if (canvas.isPressed(KeyCode.UP)) {
                playerY = Math.max(0, playerY - PADDLE_SPEED);
            }
            if (canvas.isPressed(KeyCode.DOWN)) {
                playerY = Math.min(HEIGHT - PADDLE_HEIGHT, playerY + PADDLE_SPEED);
            }
        }

        // Move computer paddle
        double targetY = ballY - PADDLE_HEIGHT / 2;
        if (computerY < targetY) {
            computerY = Math.min(HEIGHT - PADDLE_HEIGHT, computerY + PADDLE_SPEED);
        } else if (computerY > targetY) {
            computerY = Math.max(0, computerY - PADDLE_SPEED);
        }

        // Move ball
        ballX += ballDx;
        ballY += ballDy;

        // Check for collisions with walls
        if (ballY < BALL_SIZE / 2 || ballY > HEIGHT - BALL_SIZE / 2) {
            ballDy = -ballDy;
        }

        // Check for collisions with paddles
        if (ballX < PADDLE_WIDTH && ballY > playerY && ballY < playerY + PADDLE_HEIGHT) {
            ballDx = -ballDx;
        } else if (ballX > WIDTH - PADDLE_WIDTH - BALL_SIZE && ballY > computerY && ballY < computerY + PADDLE_HEIGHT) {
            ballDx = -ballDx;
        }

        // Check for out of bounds
        if (ballX < 0) {
            computerScore++;
            reset();
        } else if (ballX > WIDTH) {
            playerScore++;
            reset();
        }
    }

    private void reset() {
        gameStarted = false;
        ballX = WIDTH / 2;
        ballY = HEIGHT / 2;
        ballDx = BALL_SPEED;
        ballDy = BALL_SPEED;
    }

    private void draw() {
        // Clear canvas
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, WIDTH, HEIGHT);

        // Draw paddles
        gc.setFill(Color.WHITE);
        gc.fillRect
    }
}   
