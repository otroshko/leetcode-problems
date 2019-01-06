package _0412;

import java.util.ArrayList;
import java.util.List;

/*
    Write a program that outputs the string representation of numbers from 1 to n.

    But for multiples of three it should output “Fizz” instead of the number and for the multiples of
    five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
*/

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0) {
                result.add(i % 5 == 0 ? "FizzBuzz" : "Fizz");
            } else if(i % 5 == 0) {
                result.add(i % 3 == 0 ? "FizzBuzz" : "Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
