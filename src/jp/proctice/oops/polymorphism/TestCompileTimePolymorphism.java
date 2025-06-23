package jp.proctice.oops.polymorphism;

public class TestCompileTimePolymorphism {

    int totalAmount;

    public int creditAmount(int amount) {
        totalAmount += amount;
        return totalAmount;
    }

    public int creditAmount(int amount, int deductions) {
        totalAmount = totalAmount + amount - deductions;
        return totalAmount;
    }
}
