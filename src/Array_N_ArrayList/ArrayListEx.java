package Array_N_ArrayList;

import java.util.ArrayList;

public class ArrayListEx {
    static void main() {
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133");
        System.out.println(pitches.get(0)); // 133
        for (int i = 0; i < pitches.size(); i++) {
            System.out.printf("%s ", pitches.get(i));
        }
        System.out.println();

        System.out.println(pitches.contains("142")); // true
        System.out.println(pitches.contains("1")); // false
        System.out.println(pitches.indexOf("129")); // 2
    }
}
