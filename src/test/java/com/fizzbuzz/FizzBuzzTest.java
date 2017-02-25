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

    @Test
    public void fizzBuzzOfSixIsFizz() {
        String result = underTest.convert(6);
        assertThat(result, is("Fizz"));
    }

    @Test
    public void fizzBuzzOfTenIsBuzz() {
        String result = underTest.convert(10);
        assertThat(result, is("Buzz"));
    }

    @Test
    public void fizzBuzzOfFifteenIsFizzBuzz() throws Exception {
        String result = underTest.convert(15);
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void FizzBuzzOfElevenIsEleven() throws Exception {
        String result = underTest.convert(11);
        assertThat(result, is("11"));
    }
}
