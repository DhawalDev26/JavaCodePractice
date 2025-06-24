package jp.proctice.multithreading;

public class TablePrinter implements Runnable {

    @Override
    public void run() {
        for (int i = 2; i < 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(Thread.currentThread().getName() + ": " + i + " * " + j + " = " + (i * j));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = new TablePrinter();

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();

        Thread.sleep(1000);
        thread2.setPriority(1);
        Thread.yield();
        // Optional: Play with thread properties
//        System.out.println(thread1.getName());
//        thread1.setName("MyZecDataThread");
//        System.out.println(thread1.getName());
//
//        System.out.println("Priority: " + thread1.getPriority());
//        thread1.setPriority(8);
//        System.out.println("Updated Priority: " + thread1.getPriority());
    }
}
