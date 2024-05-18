package files;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierSample {

    public static void main(String[] args) {

        // supplier just has get method can return someting
        Supplier<Integer> supplier = ()-> new Random().nextInt(0, 501);
//        System.out.println(supplier.get());
//
//        int number = new Random().nextInt(0, 500);
//        int count = 0;
//
//        while (number != 1) {
//            count++;
//            number = new Random().nextInt(0, 50000);
//        }
//
//        System.out.println(count);

        Stream.generate(supplier).forEach(x-> System.out.println(x));
    }
}
