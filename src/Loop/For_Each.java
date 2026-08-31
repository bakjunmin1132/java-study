package Loop;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class For_Each {
    static void main() {
//        String[] numbers = {"one", "two", "three"};
//        for (String number : numbers) {
//            System.out.println(number);

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
