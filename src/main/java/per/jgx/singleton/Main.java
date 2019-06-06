package per.jgx.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jiang Guangxing
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
        testMutiThreads();
    }

    private static void testMutiThreads() throws InterruptedException {
        int size = 200;
        CountDownLatch latch = new CountDownLatch(size);
        List<Singleton> singletons = new ArrayList<>(size);
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2 + 1);
        for (int i = 0; i < size; i++) {
            service.execute(() -> {
                try {
                    singletons.add(Singleton.getInstance());
                } finally {
                    latch.countDown();
                }
            });
        }
        latch.await();
        Singleton singleton = singletons.get(0);
        singletons.parallelStream().forEach(data -> System.out.println(data == singleton));
        service.shutdown();
        System.exit(1);
    }
}
