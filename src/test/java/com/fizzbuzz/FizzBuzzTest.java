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
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(2);
        assertThat(result, is("2"));
    }

    @Test
    public void fizzBuzzOfThreeIsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(3);
        assertThat(result, is("Fizz"));
    }
}
