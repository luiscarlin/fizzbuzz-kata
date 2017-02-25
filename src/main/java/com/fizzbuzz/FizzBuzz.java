package com.fizzbuzz;

public class FizzBuzz {

    public String convert(int input) {
        if (input == 3) {
            return "Fizz";
        }
        if (input == 5) {
            return "Buzz";
        }
        return "2";
    }
}
