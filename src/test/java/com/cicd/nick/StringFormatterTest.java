package com.cicd.nick;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringFormatterTest {

    private StringFormatter stringFormatter;

    @BeforeEach
    void setUp() {
        stringFormatter = new StringFormatter();
    }

    @Test
    void toNameFormat() {
        String result = stringFormatter.toNameFormat("HEJSAN");

        assertEquals("Hejsan", result);
    }
}