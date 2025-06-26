package jp.proctice.mapimpl;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "dhawal");
        map.put(2, "Sakshi");
        map.put(3, "Mayuri");
        map.put(4, "latish");
        map.put(5, "mohish");

        System.out.println("map elements are: " + map);
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(null, null);
        map2.put(null, null);
        map2.put(null, null);
        map2.put(null, null);
        map2.put(null, null);

        map.putAll(map2);

        System.out.println("map elements are: " + map);


        //        map.clear();

//        boolean b = map.containsKey(null);
//        boolean b = map.containsValue(null);



//        System.out.println(b);
        System.out.println(map);


    }
}
