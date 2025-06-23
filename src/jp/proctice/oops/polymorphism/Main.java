package jp.proctice.oops.polymorphism;

public class Main {

    public static void main(String[] args) {

//        TestCompileTimePolymorphism testCompileTimePolymorphism = new TestCompileTimePolymorphism();
//        System.out.println(testCompileTimePolymorphism.creditAmount(1000));
//        System.out.println(testCompileTimePolymorphism.creditAmount(2000, 200));

        RunTimeImpl runTime = new RunTimeImpl();
        System.out.println(runTime.creditAmount(3000));
    }
}
