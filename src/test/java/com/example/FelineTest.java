package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Кошачьи - это хищники, они должны питаться мясом!", expected, actual);
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Должно быть: Кошачьи", expected, actual);
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals("Проверь количество котят", expected, actual);
    }

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() {
        feline.getKittens(1);
        Mockito.verify(feline).getKittens(1);
    }
}