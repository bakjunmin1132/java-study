package Array_N_ArrayList;

import java.util.ArrayList;

public class ArrayListEx {
    static void main() {
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133");
        pitches.remove(0); // or pitches.remove("133");
        System.out.println(pitches.get(0));
        System.out.println(pitches);

        System.out.println(pitches.contains("142")); // true
        System.out.println(pitches.contains("1")); // false
        System.out.println(pitches.indexOf("129")); // 1

        System.out.println(pitches.size()); // 3
    }
}
