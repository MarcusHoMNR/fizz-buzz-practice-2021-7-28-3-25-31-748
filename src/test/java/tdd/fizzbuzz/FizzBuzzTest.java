package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_order_when_count_off_given_order_number_with_normal_case() {
        //given
        int order = 4;
        String expectedResult = "4";

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_Fizz_when_count_off_given_order_number_multiple_of_3() {
        //given
        int order = 3;
        String expectedResult = "Fizz";

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(expectedResult, result);
    }

}
