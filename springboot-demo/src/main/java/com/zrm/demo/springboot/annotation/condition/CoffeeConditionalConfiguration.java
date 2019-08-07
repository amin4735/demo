package com.zrm.demo.springboot.annotation.condition;

import com.zrm.demo.pojo.Mocha;
import com.zrm.demo.springboot.annotation.condition.impl.Condition1;
import com.zrm.demo.springboot.annotation.condition.impl.Condition2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional({Condition1.class, Condition2.class})
public class CoffeeConditionalConfiguration {
    @Bean
    public Mocha mocha(){
        return new Mocha();
    }
}
