package com.ctcarrier.inheritance;

/**
 * Created by ctcarrier on 2/7/16.
 */
public class App {

    public static void main(String[] args) {

        Mouse rover = new Mouse();
        Lion fuzzy = new Lion();

        Snake slippy = new Snake();
        Worm slimey = new Worm();

        rover.move(5, 5);
    }
}
