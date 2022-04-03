package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CatTestNegative {
    private final String expected;

    public CatTestNegative(String expected) {
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSoundsData() {
        return new Object[][] {
                {"Ква"},
                {"Гав"},
        };
    }

    @Test
    public void shouldBeMeow() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertNotEquals(expected, actual);
    }
}
