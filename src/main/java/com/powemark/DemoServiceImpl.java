package com.powemark;

import org.springframework.stereotype.Component;

@Component
public class DemoServiceImpl implements DemoService {

    @Override
    public String processString(String input) {
        return input.toUpperCase();
    }
}
