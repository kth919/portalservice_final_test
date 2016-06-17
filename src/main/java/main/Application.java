package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by admin on 2016-06-10.
 */

@SpringBootApplication(exclude = ThymeleafAutoConfiguration.class)
//@EntityScan
@EnableJpaRepositories
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);


    }


}


