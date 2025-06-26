package jp.proctice.setImpl;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetCollectionImpl {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("Shashank");
        stringSet.add("mughdha");
        stringSet.add("navneet");
        stringSet.add("garvit");

        Set<String> set = new HashSet<>();
        set.add("nirgun");
        set.add("priyanshu");

        stringSet.addAll(set);
        System.out.println("all the elements of set interface: " + stringSet);

        boolean isPresent = stringSet.contains("navneet");
        System.out.println(isPresent);

        boolean isFound = stringSet.equals("sughandha");
        System.out.println(isFound);

        boolean b = stringSet.containsAll(set);
        System.out.println(b);

        boolean b1 = stringSet.remove("nirgun");
        System.out.println(b1);

        boolean b2 = stringSet.retainAll(set);
        System.out.println(b2);

        Set<String> a = stringSet.stream().filter(s -> s.startsWith("a")).collect(Collectors.toSet());
        System.out.println(a);
    }
}
