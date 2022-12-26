package features.impl;

import features.Protective;
import org.springframework.stereotype.Component;

@Component
public class ScareAway implements Protective {

    @Override
    public String protect() {
        System.out.println("Scared that prick away.. But he/she might come again.");
        return "You're safe but stay alert.";
    }
}
