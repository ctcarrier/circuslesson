package com.ctcarrier.inheritance;

/**
 * Created by ctcarrier on 2/7/16.
 */
abstract public class RunningAnimal implements MovingAnimal, BaseAnimal {

    public void move(int x, int y) {
        System.out.println(String.format("%s runs to %d %d", getName(), x, y));
    }
}
