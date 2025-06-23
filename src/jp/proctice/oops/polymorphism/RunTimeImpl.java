package jp.proctice.oops.polymorphism;

public class RunTimeImpl implements RunTime {
    int totalAmount;

    @Override
    public int creditAmount(int amount) {
        totalAmount += amount;
        return totalAmount;
    }

    public static void main(String[] args) {
        RunTimeImpl runTime = new RunTimeImpl();
        int i = runTime.creditAmount(1000);
        System.out.println("credit amount is:" + i);
    }
}
