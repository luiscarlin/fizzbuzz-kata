package com.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzOfTwoIsTwo() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(2);
        assertThat(result, is("2"));
    }
}
