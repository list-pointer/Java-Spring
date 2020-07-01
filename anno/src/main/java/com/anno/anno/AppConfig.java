package com.anno.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.anno.anno")
public class AppConfig {
//    @Bean
//    public Samsung getPhone()
//    {
//        return new Samsung();
//    }
//    @Bean
//    public MobileProcessor getPrcessor()
//    {
//        return new SnapDragon();
//    }
}
