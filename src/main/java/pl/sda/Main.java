package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.bo.HelloWorld;
import pl.sda.config.AppConfiguration;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        HelloWorld obj = context.getBean(HelloWorld.class);
        obj.printHelloWorld("Spring5 Java Config");
    }
}
