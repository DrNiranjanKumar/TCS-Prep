package com.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumofTwoNumberTest {
    @Test
    void integerTypeSum() {
        assertEquals(5, SumofTwoNumbers.addTwoNumbers(2,3));
    }

    @Test
    void floatTypeSum() {
        assertEquals(5.1, SumofTwoNumbers.addTwoNumbers(2.1,3));
    }
}
