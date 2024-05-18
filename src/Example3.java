import java.util.stream.IntStream;

public class Example3 {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 10)
                .filter((number)-> number % 2 == 0)
//                .sum()
                .forEach(System.out::println);


//        for(int count = 0; count < 11; count++) {
//            if (count % 2 == 0) System.out.println(count);
//        }

    }
}
