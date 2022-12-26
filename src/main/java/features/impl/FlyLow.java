package features.impl;

import features.Flyable;
import org.springframework.stereotype.Component;

@Component
public class FlyLow implements Flyable {

    @Override
    public void fly() {

        System.out.println("I'm flying low.");
    }
}
