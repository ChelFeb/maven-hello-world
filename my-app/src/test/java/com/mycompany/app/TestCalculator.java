package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestCalculator {
    Calculator c = null;

    @Before
    public void setup() {
        c = new Calculator();
    }

    @Test
    public void testSum() {
        int sum = c.sum(2, 8);
        assertTrue("Ошибка сложения", sum == 10);
    }

    @Test
    public void testDiv() {
        assertTrue(c.div(10, 5) == 2);
    }
}
