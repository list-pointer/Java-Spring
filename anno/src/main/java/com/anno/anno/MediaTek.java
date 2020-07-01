package com.anno.anno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTek implements MobileProcessor
{
    @Override
    public void process() {
        System.out.println("Its okay not the best....");
    }
}
