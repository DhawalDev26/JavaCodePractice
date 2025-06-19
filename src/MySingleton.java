public class MySingleton {
    private static MySingleton instance;

    private static boolean instanceCreated = false;

    private MySingleton() {
        System.out.println("this is single instance initialized!");
        if (instanceCreated)
            throw new RuntimeException("Use getInstance() only");
        instanceCreated = true;
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}

