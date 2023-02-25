package com.example;

import org.junit.Test;
import static org.junit.Assert.*;


public class AnimalGetFamilyTest {

    Animal animal = new Animal();

    @Test
    public void getFamilyReturnsString() {
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, actual);
    }
}
