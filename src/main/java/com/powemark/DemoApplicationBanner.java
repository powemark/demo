package com.powemark;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class DemoApplicationBanner implements Banner {

    public static final String BANNER_FILE = "demo-banner.txt";

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        try {
            List<String> bannerLines = Resources.readLines(Resources.getResource(BANNER_FILE), Charsets.UTF_8);

            for (String line : bannerLines) {
                System.out.println(line);
            }

            out.println();
        } catch (IOException e) {
            System.out.println("Well, um, there was supposed to be a fancy banner here.. but it's, uh..not ... um... Never mind, I guess");
        }
    }
}
