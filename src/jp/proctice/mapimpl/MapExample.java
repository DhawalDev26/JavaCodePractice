package jp.proctice.mapimpl;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public void findCharacter(String str) {
//        int count = 1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <= str.length() - 1; i++) { //i=0
            char ch = str.charAt(i); //a

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);   //a,1
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (value >= 2) {
                System.out.println("entry of map:" + entry.getKey() + " occurrence is: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        MapExample mapExample = new MapExample();
        mapExample.findCharacter("anurag");
    }
}
