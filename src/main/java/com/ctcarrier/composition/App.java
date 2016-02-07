package com.ctcarrier.composition;

/**
 * Created by ctcarrier on 2/7/16.
 */
public class App {

    public static void main(String[] args) {

    	MovingService runner = new RunService();
    	MovingService slitherer = new SlitherService();
    	
        Animal mouse = new Animal("mouse", runner);
        Animal lion = new Animal("lion", runner);

        Animal snake = new Animal("snake", slitherer);
        Animal worm = new Animal("worm", slitherer);

        mouse.move(20, 20);
        lion.move(30, 30);
        snake.move(40, 40);
        worm.move(50, 50);
    }
}
