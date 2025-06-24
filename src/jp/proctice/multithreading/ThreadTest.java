package jp.proctice.multithreading;

public class ThreadTest{
    public static void main(String[] args) {

        MultithreadingExample multithreadingExample = new MultithreadingExample();
        Thread thread = new Thread(multithreadingExample);

        thread.start();
    }
}
