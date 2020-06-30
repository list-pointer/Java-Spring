package com.mavenappusingannoation.mavenappusingannoation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MavenAppUsingAnnoationApplication {

    public static void main(String[] args) {
//        SpringApplication.run(MavenAppUsingAnnoationApplication.class, args);
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        Vehicle obj=(Vehicle)context.getBean("car");
//        obj.drive();
//        Tyre t=(Tyre)context.getBean("tyre");
//        System.out.println(t);

        Car obj=(Car)context.getBean("car");
        obj.drive();
    }

}
