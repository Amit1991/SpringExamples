package features.impl;

import features.Flyable;

public class FlyHigh implements Flyable {
    @Override
    public void fly() {

        System.out.println("I'm flying high.");
    }
}
