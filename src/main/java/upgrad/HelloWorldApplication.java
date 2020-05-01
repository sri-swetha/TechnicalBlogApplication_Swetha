package upgrad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
@ComponentScan
@EnableAutoConfiguration
public class HelloWorldApplication {
    public static void main(String [] args)
    {
        //System.out.println("Hello World");
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
