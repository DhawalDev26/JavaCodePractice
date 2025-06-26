package jp.proctice.list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinklistImpl {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);
        integerList.add(400);

        List<Integer> list = new LinkedList<>();
        list.add(500);
        list.add(600);
        list.add(700);

        integerList.addAll(list);

        for (Integer integer : integerList) {
            System.out.println(integer);
        }
        System.out.println("================================================================");

        Integer remove = integerList.remove(3);
        System.out.println(remove);

        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        System.out.println("================================================================");

        System.out.println(integerList.set(2, 1000));
        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        System.out.println("================================================================");

        boolean b = integerList.retainAll(list);
        System.out.println(b);
    }
}
