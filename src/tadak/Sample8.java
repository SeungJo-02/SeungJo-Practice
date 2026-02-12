package tadak;

import java.util.HashMap;

public class Sample8 {
    static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",90);
        map.put("B",80);
        map.put("C",70);
        System.out.println(map.remove("B"));
        System.out.println(map);
    }
}
