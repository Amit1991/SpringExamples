package pets;

import features.Flyable;
import features.Protective;
import features.Swimable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Animal2 {

    private Flyable flyable;
    private Protective protective;
    private Swimable swimable;

    public void fly() {

        flyable.fly();
    }

    public void swim() {

        swimable.swim();
    }

    public void protect() {

        protective.protect();
    }

    public void perform() {

        System.out.println("Hi, I'm Animal2");
        fly();
        swim();
        protect();
    }

    public Animal2(@Qualifier("scareAway") Protective protective, Swimable swimable, @Qualifier("flyLow") Flyable flyable) {

        this.protective = protective;
        this.swimable = swimable;
        this.flyable = flyable;
    }
}
