package com.example;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void shouldBeMeow() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }

    @Test
    public void getFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        List<String> expected = List.<String>of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
}