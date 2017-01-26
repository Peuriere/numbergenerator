package tdd.bdd.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by samanthapeuriere on 26/01/17.
 */
@SpringBootApplication
@ComponentScan("samster.sam")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
