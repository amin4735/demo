package com.zrm.demo.springboot.annotation.condition;

import com.zrm.demo.pojo.Mocha;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=CoffeeConfiguration.class)
public class CoditionalOnClassTest {
    @Autowired
    private Mocha mocha;

    @Test
    public void testGetName(){
        String name = mocha.getName();
        assert name == "Mocha";
    }
}
