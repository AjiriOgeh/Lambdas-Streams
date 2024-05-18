package files;

import java.util.function.BiPredicate;

public class BiPredicateSample {

    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (firstName, secondName)-> firstName.equalsIgnoreCase(secondName);
        BiPredicate<String, Integer> newBiPredicate = (firstName, number)-> firstName.length() == number;


        System.out.println(biPredicate.test("david", "wale"));
        System.out.println(newBiPredicate.test("johnny", 6));
    }
}
