package jp.proctice.multithreading;

import java.util.HashMap;
import java.util.Map;

public class MyThreadByExtends extends Thread {

    int a = 20, b = 30;

    @Override
    public void run() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        MyThreadByExtends myThreadByExtends = new
                MyThreadByExtends();
        myThreadByExtends.start();
    }
}
