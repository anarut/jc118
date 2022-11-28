package lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int pCount = 5;
        int cCount = 3;
        Store store = new Store(10);
        List<Runnable> runnables = new ArrayList<>();
        for (int i = 0; i < pCount; i++) {
            Producer producer = new Producer(store, 10 + i, i);
            runnables.add(producer);
        }

        for (int i = 0; i < cCount; i++) {
            Consumer consumer = new Consumer(store, 19 + i, i);
            runnables.add(consumer);
        }

        ExecutorService service = Executors.newFixedThreadPool(pCount + cCount);
        runnables.forEach(runnable -> {
//            new Thread(runnable).start();
            service.submit(runnable);
        });


        Thread.sleep(60000L);
        service.shutdown();
    }
}
