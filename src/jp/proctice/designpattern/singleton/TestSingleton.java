package jp.proctice.designpattern.singleton;

import java.lang.reflect.InvocationTargetException;

public class TestSingleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
//        SingletonPattern instance = SingletonPattern.getInstance();
//        SingletonPattern instance1 = SingletonPattern.getInstance();
//
//        System.out.println(instance == instance1);

        //break the singleton
        //1. by use reflection api.
//        Constructor<SingletonPattern> declaredConstructor = SingletonPattern.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//
//        SingletonPattern singletonPattern = declaredConstructor.newInstance();
//        SingletonPattern singletonPattern1 = declaredConstructor.newInstance();
//
//        System.out.println(singletonPattern == singletonPattern1);

        //2. by cloning
//        SingletonPattern instance = SingletonPattern.getInstance();
//        SingletonPattern clone = (SingletonPattern) instance.clone();
//
//        System.out.println(instance == clone);
    }
}
