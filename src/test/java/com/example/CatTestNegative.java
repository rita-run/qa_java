package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertNotEquals;

@RunWith(Parameterized.class)
public class CatTestNegative {

    private final String expected;

    public CatTestNegative(String expected) {
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[][] getSoundsData() {
        return new Object[][]{
                {"Ква"},
                {"Гав"},
        };
    }

    @Test
    public void shouldBeMeow() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertNotEquals("Кошка должна мяукать!", expected, actual);
    }
}