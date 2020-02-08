package pl.sda.bo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

    @Value("${output.dir}")
    private String fileDirectory;

    @Override
    public void printHelloWorld(String msg) {
        System.out.println(msg + " " + fileDirectory);
    }
}
