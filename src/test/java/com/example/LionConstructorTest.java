package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;



@RunWith(Parameterized.class)
public class LionConstructorTest {

    private final String sex;
    private boolean expected;

    public LionConstructorTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void test() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        assertEquals(expected,lion.hasMane);
    }

    @Test(expected=Exception.class)
    public void shouldUnknownLionSexCorrectHasMane() throws Exception {
        Feline feline = new Feline();
        Lion lionUnknown = new Lion("Иное значение", feline);
    }
}
