package files;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {

    public static void main(String[] args) {
        // takes an element of a type and return an element of the same type
        UnaryOperator<String> unaryOperator = (word)-> word + " loves programming";

        System.out.println(unaryOperator.apply("john"));
    }
}
