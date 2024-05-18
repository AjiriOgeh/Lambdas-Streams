package files;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntSample {

    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (x)-> (int) (x - 9);

        System.out.println(doubleToIntFunction.applyAsInt(45.6));
    }
}
