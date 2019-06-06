package per.jgx.singleton;

/**
 * @author Jiang Guangxing
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton;

    public static Singleton getInstance() {
        return singleton;
    }
}
