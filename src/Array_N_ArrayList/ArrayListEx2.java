package Array_N_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListEx2 {
    static void main() {
//        String[] data = {"138", "129", "142"};
//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
//        System.out.println(pitches);

//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        String result = String.join(",", pitches);
//        System.out.println(result);

        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches);
        pitches.sort(Comparator.reverseOrder());
        System.out.println(pitches);

    }
}
