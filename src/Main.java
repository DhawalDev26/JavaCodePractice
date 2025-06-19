import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
//        MySingleton instance = MySingleton.getInstance();
//        MySingleton instance1 = MySingleton.getInstance();
//
//        System.out.println(instance == instance1);
//        System.out.println(instance.equals(instance1));

        //way to break singleton pattern
        //1. through Reflection.
        Constructor<MySingleton> declaredConstructor = MySingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        MySingleton instance = MySingleton.getInstance();
        MySingleton instance1 = MySingleton.getInstance();

        System.out.println(instance == instance1);
        System.out.println(instance.equals(instance1));
    }
}