package hello;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public String retrieveHelloWorldStatement() {
        return "Hello World!";
    }

}
