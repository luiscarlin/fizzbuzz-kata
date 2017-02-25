package com.fizzbuzz;

public class FizzBuzz {

    public String convert(int input) {
        String result = "";

        if (input % 3 == 0) {
            result += "Fizz";
        }

        if (input % 5 == 0) {
            result += "Buzz";
        }

        if (result.length() == 0) {
            result = String.valueOf(input);
        }

        return result;
    }
}
