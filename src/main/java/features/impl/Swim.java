package features.impl;

import features.Swimable;
import org.springframework.stereotype.Component;

@Component
public class Swim implements Swimable {

    public void swim() {

        System.out.println("I'm swimming and I love it.");
    }
}
