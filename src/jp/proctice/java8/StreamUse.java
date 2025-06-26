package jp.proctice.java8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUse {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);
        integerList.add(400);

//        List<Integer> list = new ArrayList<>();
//        list.add(500);
//        list.add(600);
//        list.add(700);

//        for (Integer i : list) {
//            Boolean b = i % 2 == 0;
//            System.out.println(b);
//        }

//        List<Boolean> collect = integerList.stream().map(i -> i % 2 != 0).collect(Collectors.toList());
//        System.out.println(collect);

        List<Integer> collect1 = integerList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect1);

        List<Integer> collect = integerList.stream().filter(i -> i % 6 == 0).collect(Collectors.toList());
        System.out.println(collect);


    }
}
