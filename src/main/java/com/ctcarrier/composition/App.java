package com.ctcarrier.composition;

/**
 * Created by ctcarrier on 2/7/16.
 */
public class App {

    public static void main(String[] args) {

    	MovingService runner = new RunService();
    	MovingService slitherer = new SlitherService();
    	
        Animal rover = new Animal("dog", runner);
        Animal fuzzy = new Animal("lion", runner);

        Animal slippy = new Animal("snake", slitherer);
        Animal slimey = new Animal("worm", slitherer);

        rover.move(5, 5);
    }
}
