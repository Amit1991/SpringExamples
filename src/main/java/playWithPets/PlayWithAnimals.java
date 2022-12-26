package playWithPets;

import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pets.Animal1;
import pets.Animal2;
import pets.Animal3;

public class PlayWithAnimals {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Animal1 animal1 = context.getBean("animal1", Animal1.class);
        animal1.perform();

        System.out.println("----------------------------");

        Animal2 animal2 = context.getBean("animal2", Animal2.class);
        animal2.perform();

        System.out.println("----------------------------");

        Animal3 animal3 = context.getBean("animal3", Animal3.class);
        animal3.perform();

        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        Animal1 animal11 = context1.getBean("animal1", Animal1.class);
        animal11.perform();

        System.out.println("----------------------------");

        Animal2 animal22 = context1.getBean("animal2", Animal2.class);
        animal22.perform();

        System.out.println("----------------------------");

        Animal3 animal33 = context1.getBean("animal3", Animal3.class);
        animal33.perform();
    }
}
