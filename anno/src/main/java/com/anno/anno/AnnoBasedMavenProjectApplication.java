package com.anno.anno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AnnoBasedMavenProjectApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AnnoBasedMavenProjectApplication.class, args);
        ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
        {
            Samsung s7=factory.getBean(Samsung.class);
            s7.config();
        }
    }

}
