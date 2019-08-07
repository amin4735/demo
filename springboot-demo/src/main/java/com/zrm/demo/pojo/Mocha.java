package com.zrm.demo.pojo;

import org.springframework.context.annotation.Conditional;

public class Mocha implements Coffee {
    @Override
    public String getName() {
        return "Mocha";
    }
}
