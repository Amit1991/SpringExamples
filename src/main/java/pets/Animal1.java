package pets;

import features.Flyable;
import features.Protective;
import features.Swimable;
import features.impl.FlyHigh;
import features.impl.ScareAway;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Animal1 {

    @Autowired
    @Qualifier("attack")
    private Protective protective;
    @Autowired
    @Qualifier("flyHigh")
    private Flyable flyable;
    @Autowired
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

        System.out.println("Hi, I'm Animal1");
        fly();
        swim();
        protect();
    }
}
