package net.kaoutar.presentation;

import net.kaoutar.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.kaoutar");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("RES =" +metier.toString());
    }
}
