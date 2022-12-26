package features.impl;

import features.Protective;
import org.springframework.stereotype.Component;

@Component
public class Attack implements Protective {
    @Override
    public String protect() {
        System.out.println("Attacked on that prick!");
        return "You're safe.";
    }
}
