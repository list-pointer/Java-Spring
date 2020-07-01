package com.anno.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Bean
    public Samsung getPhone()
    {
        return new Samsung();
    }
}
