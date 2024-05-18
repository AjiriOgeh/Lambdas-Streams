package files;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LambdaStreamExample {
    public static void main(String[] args) {
        // tree set is an ordered implementation
        // either you implement a comparable feature
        //Comparator defines a custom order and has only one abstract method
        // The comparator has to be of the same object as the collection
        // the comparator object is passed to the tree set to compare
        // the lambda expression is an object of type comparator
        // lambdas allows us to program in a functional way

        Comparator<Transaction> comparator = (previousTransaction, nextTransaction)->{
            return nextTransaction.getAmount().compareTo(previousTransaction.getAmount());
        };

        Set<Transaction> transactions = new TreeSet<>(comparator);
        transactions.add(new Transaction());
        transactions.add(new Transaction());
        transactions.add(new Transaction());
        transactions.add(new Transaction());

        System.out.println(transactions);



    }
}
