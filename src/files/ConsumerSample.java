package files;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        //The consumer interface takes an argument and returns nothing. it returns void
        // accept is the abstract method in the consumer class. so when invoked in a lambda, it calls accept
        // default method does not work with default and static method
        Consumer<String> consumer = (word)->{
            System.out.println("you have entered " +word);
            System.out.println(word);
        };
        List<String> names = List.of("john", "james", "johnny");

        names.forEach(consumer);
        consumer.andThen((a)-> System.out.println("running and then for " +a));
    }
}
