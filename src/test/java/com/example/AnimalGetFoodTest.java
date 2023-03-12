package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;


@RunWith(Parameterized.class)
public class AnimalGetFoodTest {
    private final String animalKind;
    private final List<String> expected;

    Animal animal = new Animal();

    public AnimalGetFoodTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodReturnsCorrectList() throws Exception {
        List<String> result = animal.getFood(animalKind);
        Assert.assertEquals(expected, result);
    }

    @Test(expected=Exception.class)
    public void getFoodWithIncorrectReturnsException() throws Exception {
        List<String> actual = animal.getFood("Иное значение");
    }
}

