package jp.proctice.oops.Interface;

public class FindEven implements TestInterface {
    @Override
    public void findEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("value is even: " + i);
            } else {
                System.out.println("value is odd: " + i);
            }
        }
    }

    public static void main(String[] args) {
        FindEven findEven = new FindEven();
        findEven.findEven(23);
    }
}
