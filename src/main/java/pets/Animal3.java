package pets;

import features.Flyable;
import features.Protective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Animal3 {

    private Flyable flyable;
    private Protective protective;

    @Value("${animal.name}")
    private String name;

    @Value("${animal.type}")
    private String type;

    public Flyable getFlyable() {
        return flyable;
    }

    @Autowired
    public void setFlyable(@Qualifier("flyLow") Flyable flyable) {
        this.flyable = flyable;
    }

    public Protective getProtective() {
        return protective;
    }

    @Autowired
    public void setProtective(@Qualifier("attack") Protective protective) {
        this.protective = protective;
    }

    public void perform() {

        System.out.println("Hi i'm Animal3. My Name is " + name + " and I am a " + type + " one.");
        flyable.fly();
        protective.protect();
    }
}
