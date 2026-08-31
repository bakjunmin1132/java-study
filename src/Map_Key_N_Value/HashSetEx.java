package Map_Key_N_Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx {
    static void main() {
//        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
//        System.out.println(set);

//        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//        HashSet<Integer> s1_copy = new HashSet<>(s1);
//        HashSet<Integer> s1_copy2 = new HashSet<>(s1);
//        HashSet<Integer> s1_copy3 = new HashSet<>(s1);
//        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
//
//        s1_copy.retainAll(s2); // 교집합
//        System.out.println(s1_copy);
//
//        s1_copy2.addAll(s2); // 합집합
//        System.out.println(s1_copy2);
//
//        s1_copy3.removeAll(s2); // 차집합
//        System.out.println(s1_copy3);



        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");
        set.addAll(Arrays.asList("or", "Springboot", "?"));
        set.remove("or");
        set.removeAll(Arrays.asList("Springboot", "?"));
        System.out.println(set);
    }
}
