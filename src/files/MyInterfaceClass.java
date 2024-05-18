package files;

import java.util.Scanner;

public class MyInterfaceClass {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        String result = name.equals("ekko") ? "zaun" : "demacia";
//
//        System.out.println(result);

        MyInterface myMethod = (x, y) -> x + y;
        System.out.println(myMethod.doSomething(3, 5));
    }
}
