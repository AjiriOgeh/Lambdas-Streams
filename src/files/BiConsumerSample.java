package files;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (firstname, surname)-> printFullName(firstname, surname);

        BiConsumer<String, Integer> newBiConsumer = (firstname, age)-> System.out.println(firstname + " is " + age+ " years old");

//        biConsumer.accept("femi", "oladeji");
//        newBiConsumer.accept("dele", 59);

        Map<String, Integer> map =Map.of(
                "john", 10,
                "jane", 20,
                "jack", 30
        );

        map.forEach(newBiConsumer);

    }

    private static void printFullName(String firstName, String surname) {
        System.out.println(firstName+" "+surname);
    }
}
