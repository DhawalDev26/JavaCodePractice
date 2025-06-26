package jp.proctice.java8;

import javax.swing.*;
import java.util.function.Consumer;

public class MethodReferenceUse {

    public void write(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {

        MethodReferenceUse obj = new MethodReferenceUse();
        Consumer<String> write = obj::write;
        write.accept("Hello World");
    }
}
