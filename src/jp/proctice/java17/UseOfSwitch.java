package jp.proctice.java17;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UseOfSwitch {

    public static void main(String[] args) {

        List<Integer> integerList = new LinkedList<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);
        integerList.add(400);
        integerList.add(500);
        integerList.add(700);
        Random random = new Random(5);

        for (Integer integer : integerList) {
            switch (integer) {
                case 100:
                    System.out.println("its a monday");
                    break;
                case 200:
                    System.out.println("its a tuesday");
                    break;
                case 300:
                    System.out.println("its a wednesday");
                    break;
                case 400:
                    System.out.println("its a thursday");
                    break;
                case 500:
                    System.out.println("its a friday");
                    break;
                default:
                    System.out.println("its a weekend");
                    break;
            }
        }
    }
}
