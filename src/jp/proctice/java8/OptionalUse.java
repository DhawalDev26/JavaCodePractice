package jp.proctice.java8;

import java.util.Optional;
import java.util.Scanner;

public class OptionalUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Optional<String> optionalString = Optional.ofNullable(str);

        if (optionalString.isPresent()) {
            System.out.println("Input is: " + optionalString.get());
        } else {
            System.out.println("Name is not present.");
        }
    }
}
