package jp.proctice.multithreading;

public class MultithreadingExample implements Runnable {

    static String reverse = "";

    public static String revereseString() {
        String str = "Dhawal";
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    @Override
    public void run() {
        System.out.println(revereseString());
    }
}
