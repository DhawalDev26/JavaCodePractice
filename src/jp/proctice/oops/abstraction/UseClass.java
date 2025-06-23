package jp.proctice.oops.abstraction;

public class UseClass extends TestAbstraction {

    @Override
    public int addSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        UseClass useClass = new UseClass();
        System.out.println(useClass.addSum(10, 30));
    }
}
