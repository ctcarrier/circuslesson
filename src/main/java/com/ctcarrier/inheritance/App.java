package com.ctcarrier.inheritance;

/**
 * Created by ctcarrier on 2/7/16.
 */
public class App {

    public static void main(String[] args) {

        Mouse mouse = new Mouse();
        Lion lion = new Lion();

        Snake snake = new Snake();
        Worm worm = new Worm();

        mouse.move(20, 20);
        lion.move(30, 30);
        snake.move(40, 40);
        worm.move(50, 50);
    }
}
