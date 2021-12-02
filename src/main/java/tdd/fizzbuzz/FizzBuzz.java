package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(int order) {

        if (order % 3 == 0) {
            if (order % 5 == 0) {
                return FIZZ + BUZZ;
            }
            if (order % 7 == 0) {
                return FIZZ + WHIZZ;
            }
            return FIZZ;
        } else if (order % 5 == 0) {
            if (order % 7 == 0) {
                return BUZZ + WHIZZ;
            }
            return BUZZ;
        } else if (order % 7 == 0) {
            return WHIZZ;
        }
        return String.valueOf(order);
    }
}
