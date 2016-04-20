package com.powemark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

    @Autowired
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println(demoService.processString(arg));
            }
        } else {
            System.out.println("no args");
        }
    }
}
