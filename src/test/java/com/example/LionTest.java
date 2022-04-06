package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest extends Feline {

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue("У льва должна быть грива!", lion.doesHaveMane());
    }

    @Test
    public void doesNotHaveMane() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse("У львиц грив не бывает!", lion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        List<String> actual = lion.getFood();
        List<String> expected = List.<String>of("Животные", "Птицы", "Рыба");
        assertEquals("Кошки - это хищники, они должны питаться мясом!", expected, actual);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        new Lion(feline);
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals("Проверь количество котят", expected, actual);
    }
}