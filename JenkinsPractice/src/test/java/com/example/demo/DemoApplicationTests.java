package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTests {

    @Test
    void testHelloMessage() {
        DemoApplication app = new DemoApplication();
        assertEquals("Hello from Jenkins Demo!", app.sayHello());
    }
}
