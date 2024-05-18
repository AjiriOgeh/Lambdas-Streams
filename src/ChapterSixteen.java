import java.util.*;

public class ChapterSixteen {

    public static void main(String[] args) {

        //Collections work with generics and not primitives e.g Integer, Boolean.
        //Generics work with objects. This led to corresponding wrapper classes
        /*
        The wrapper classes are 8 in number. String is a reference type that can be used directly.
        Use wrapper claases instead of primitive types
        * Boolean
        * Byte
        * Character
        * Integer
        * Long
        * Float
        * Double
        * Short
        * *
        Generic objects deal with generics themselves
        /there is autoBoxing and autounboxing in java .
        The JVM implicitly converts a variable the object wrapper

        Boolean b = true;
        boolean b1 = b -> this is autounboxing. converting it to corresponding to its primitive type
         */

        boolean b = true;
        Collection<Boolean> transactions = new ArrayList<>();
        transactions.add(b);

        //Collection<String> words = new PriorityQueue<>();
        Collection<String> words = new TreeSet<>();

        words.add("happy");
        words.add("happy");
        words.add("happy");
        words.add("happy");

        System.out.println(words);

        List<Integer> numbers = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(4);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(8);
        numbers2.add(4);

        set.add(numbers);
        set.add(numbers2);
        System.out.println(set);

        List<List<Integer>> lists = new ArrayList<>(Arrays.asList(numbers2, numbers));
        System.out.println(lists);
    }
}
