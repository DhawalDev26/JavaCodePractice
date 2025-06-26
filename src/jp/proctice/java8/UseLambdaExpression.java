package jp.proctice.java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class UseLambdaExpression {
    public static void main(String[] args) {
        Runnable hello = () -> System.out.println("hello this is with no param");
        hello.run();

        Consumer<String> c = str -> System.out.println("hello " + str + " this is one param impl");
        c.accept("dhawal");

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(20, 30));

        Function addResult = (a, b) -> a + b;
        System.out.println(addResult.Operation(20, 30));


        //before j8 use functional interface.
        Calculate calculate = new
                Calculate() {
                    @Override
                    public void apply(int a, int b) {
                        System.out.println(a + b);
                    }
                };
        calculate.apply(20, 30);
    }
}
