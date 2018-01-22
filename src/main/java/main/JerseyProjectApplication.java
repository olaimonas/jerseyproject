package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JerseyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JerseyProjectApplication.class, args);
    }
}

/*
Done according http://blog.codeleak.pl/2015/01/getting-started-with-jersey-and-spring.html
Works only if all classes are in the same package. If they are put separately, only standard error page is available.
 */