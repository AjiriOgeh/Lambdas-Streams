package files;

import java.util.function.Predicate;

public class PredicateSample {

    public static void main(String[] args) {
        Predicate<String> predicate = (word)-> word.length()<5;

        System.out.println(predicate.test("wale"));
    }
}
