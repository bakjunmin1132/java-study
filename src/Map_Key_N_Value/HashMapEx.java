package Map_Key_N_Value;

import java.util.HashMap;

public class HashMapEx {
    static void main() {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        map.put("bird", "새");
        System.out.println(map.get("people")); // 사람
        System.out.println(map.containsKey("people")); // true
        System.out.println(map.remove("people")); // 사람 출력 후 people 키 삭제
        System.out.println(map.size()); // 1

        System.out.println(map.keySet());
        System.out.println(map.values());


    }
}
