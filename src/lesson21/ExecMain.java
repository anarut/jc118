package lesson21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecMain {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Thread currentThread = Thread.currentThread();

        Runnable r = () -> {
            System.out.println("Start " + Thread.currentThread().getName());
            try {
                Thread.sleep(4000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Finish " + Thread.currentThread().getName());
        };
        for (int i = 0; i < 10; i++) {
            service.submit(r);
//            throw new NullPointerException();
        }

//        System.exit(101);
        service.shutdown();

        ScheduledExecutorService s = Executors.newScheduledThreadPool(3);
        s.schedule(r, 10, TimeUnit.HOURS);

        Callable<String> c = () -> {
            System.out.println("Start " + Thread.currentThread().getName());
            try {
                Thread.sleep(4000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Finish " + Thread.currentThread().getName());
            return "egg";
        };
        Future<String> submit = s.submit(c);

        try {
            Thread.sleep(6000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String s1 = null;
        try {
            s1 = submit.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(s1);

        s.shutdown();
    }
}
