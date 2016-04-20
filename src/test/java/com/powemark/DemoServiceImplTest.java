package com.powemark;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoServiceImplTest {

    private DemoServiceImpl target = new DemoServiceImpl();

    @Test
    public void testProcessString() throws Exception {
        assertEquals("MARK POWILD", target.processString("Mark Powild"));
    }
}