package files;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {

    public static void main(String[] args) {
        //takes two things of the same type and returns the same thing of the same type
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b ;
        System.out.println(binaryOperator.apply(3, 5));
    }
}
