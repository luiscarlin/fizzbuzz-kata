package com.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
    FizzBuzz underTest;

    @Before
    public void setUp() {
        underTest = new FizzBuzz();
    }

    @Test
    public void fizzBuzzOfTwoIsTwo() {
        String result = underTest.convert(2);
        assertThat(result, is("2"));
    }

    @Test
    public void fizzBuzzOfThreeIsFizz() {
        String result = underTest.convert(3);
        assertThat(result, is("Fizz"));
    }

    @Test
    public void fizzBuzzOfFiveIsBuzz() {
        String result = underTest.convert(5);
        assertThat(result, is("Buzz"));
    }
}
