package jp.proctice.designpattern.singleton;

public class SingletonPattern {   //implements Cloneable{

    private static SingletonPattern instance;

    private SingletonPattern() {
        if (instance != null) {
            throw new RuntimeException("use getInstance method");
        }
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            System.out.println("this is first time instance will create");
            instance = new SingletonPattern();
        }

        System.out.println("this is shared instance");
        return instance;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
