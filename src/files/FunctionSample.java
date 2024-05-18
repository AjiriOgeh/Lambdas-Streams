package files;

import java.util.function.Function;

public class FunctionSample {
    //takes something and gives something
    //<T, R> t is the type its takes, r is the return type
    // if you have only one argument, you can take out the parenthesis


    public static void main(String[] args) {
        Function<String, Integer> function = (word)-> word.length();

        System.out.println(function.apply("jagaban"));
    }


}
