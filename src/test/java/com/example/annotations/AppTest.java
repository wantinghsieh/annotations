package com.example.annotations;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void runsOnJava25OrLater() {
        assertTrue(Runtime.version().feature() >= 25);
    }
}
