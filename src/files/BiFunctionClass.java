package files;

import java.util.function.BiFunction;

public class BiFunctionClass {
    //BiFunction takes in two things and returns something of the return type

    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction =
                (word, number) -> word.length() == number;

        System.out.println(biFunction.apply("jagaban", 7));
    }
}
