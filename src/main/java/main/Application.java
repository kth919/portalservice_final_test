package main;

import main.model.UserList;
import main.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

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


