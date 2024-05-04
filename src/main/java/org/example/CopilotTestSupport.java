package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CopilotTestSupport {
    public static void main(String[] args) {
        System.out.println("Hello, Copilot!");
    }

    // simple multiplication method below written by Copilot
    public static int multiply(int a, int b) {
        return a * b;
    }

    // test multiply method below written by Copilot (with @Test annotation)
    @Test
    public void testMultiply() {
        // test cases for multiply method
        assertEquals(4, multiply(2, 2));
        assertEquals(0, multiply(0, 2));
        assertEquals(-4, multiply(2, -2));
    }

}
