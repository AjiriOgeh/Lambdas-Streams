import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumDifference {

    public static int minimumDifference(int x, int y, int[] numbers) {
        int[] difference = {0, numbers.length};
        int minimumValue = numbers.length - 1;

        for(int count = 0; count < numbers.length; count++) {
            if (numbers[count] == x) difference[0] = count;
            if (numbers[count] == y) difference[1] = count;
            System.out.println(Arrays.toString(difference));

            int absoluteDifference = difference[0] - difference[1];
            if (absoluteDifference < 0) absoluteDifference *= -1;

            if (absoluteDifference < minimumValue) minimumValue = absoluteDifference;
        }
        return minimumValue;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3, 5, 6,7,2,7,3,9,7};
        System.out.println(minimumDifference(3, 2, numbers));
    }
}
