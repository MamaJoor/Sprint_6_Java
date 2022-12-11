package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensTestWithInt() {
        Feline feline = new Feline();
        assertEquals(10, feline.getKittens(10));
    }

}