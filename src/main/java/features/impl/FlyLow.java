package features.impl;

import features.Flyable;

public class FlyLow implements Flyable {

    @Override
    public void fly() {

        System.out.println("I'm flying low.");
    }
}
