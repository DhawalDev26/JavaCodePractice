package jp.proctice.java17;

import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (str) {
            case "Add" -> System.out.println(a + b);
            case "subs" -> System.out.println(a - b);
            case "multiply" -> System.out.println(a * b);
            case "divide" -> System.out.println(a % b);
        }
    }
}
