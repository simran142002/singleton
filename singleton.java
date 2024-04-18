public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
    }

    // Static method to get the singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Main method included for demonstration
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Both objects refer to the same instance
        System.out.println(singleton1 == singleton2);  // Output: true
    }
}
