package com.zrm.demo.springboot.annotation.condition;

import com.zrm.demo.pojo.Mocha;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoffeeConfiguration {

    @Bean
    @ConditionalOnClass(name = "com.zrm.demo.pojo.Mocha")
    public Mocha mocha(){
        return new Mocha();
    }
}
