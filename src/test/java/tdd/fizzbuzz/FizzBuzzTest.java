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

    @Test
    void should_return_Buzz_when_count_off_given_order_number_multiple_of_5() {
        //given
        int order = 5;
        String expectedResult = "Buzz";

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_Whizz_when_count_off_given_order_number_multiple_of_7() {
        //given
        int order = 7;
        String expectedResult = "Whizz";

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_order_number_common_multiple_of_3_And_5() {
        //given
        int order = 15;
        String expectedResult = "FizzBuzz";

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_FizzWhizz_when_count_off_given_order_number_common_multiple_of_3_And_7() {
        //given
        int order = 21;
        String expectedResult = "FizzWhizz";

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_BuzzWhizz_when_count_off_given_order_number_common_multiple_of_5_And_7() {
        //given
        int order = 35;
        String expectedResult = "BuzzWhizz";

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(expectedResult, result);
    }

}
