package my.study.DI;

import my.study.DI.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");

        System.out.println("\n" + "******PrimaryBean******");
        System.out.println(myController.sayHello() + "\n");

        System.out.println("******Property******");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting() + "\n");

        System.out.println("******Setter******");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting() + "\n");

        System.out.println("******Constructor******");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting() + "\n");

        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayHello() + "\n");

        PetController petController = (PetController) context.getBean("petController");
        System.out.println(petController.whichPetIsTheBest());
    }

}
