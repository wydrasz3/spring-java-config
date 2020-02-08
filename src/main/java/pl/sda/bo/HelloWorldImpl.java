package pl.sda.bo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

    @Override
    public void printHelloWorld(String msg) {
        System.out.println("Hello World !!");
    }
}
