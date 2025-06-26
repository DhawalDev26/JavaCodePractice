package jp.proctice.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionImpl {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Shankar");
        stringList.add("dhawal");
        stringList.add("Nikunj");
        stringList.add("advead");
        stringList.add("niraga");

        System.out.println("list of names are:");


//        String remove = stringList.remove(3);
//        System.out.println(remove);
//        System.out.println(stringList.set(2, "digvesh"));

        //iteration over foreach loop
//        for (String name : stringList) {
//            System.out.println(name);
//        }

        //collection method use
//        System.out.println(stringList.size());
//        System.out.println(stringList.remove(2));

//        List<String> a = stringList.stream().filter(n -> n.contains("a")).collect(Collectors.toList());
//
//        for (String str : a) {
//            System.out.println(str);
//        }
//
//        List<String> ans = a.stream().filter(n -> n.startsWith("a")).collect(Collectors.toList());
//
//        for (String str : ans) {
//            System.out.println(str);
//        }
    }
}
