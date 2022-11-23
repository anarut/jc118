package lesson20;

import java.util.Random;

public class ThreadMain {

    public static void main(String[] args) {
        ThreadUtil.getThreadInfo(Thread.currentThread());
        Runnable r = () -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("force exit");
            } else {
                ThreadUtil.getThreadInfo(Thread.currentThread());
            }
        };
        Thread thread = new Thread(r);
//        thread.run();
        thread.start();
//        thread.interrupt();
//        thread.isInterrupted()
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(r);
            t.setPriority(new Random().nextInt(10) + 1);
            t.setName("Custom thread" + i);
            t.setDaemon(false);
            t.start();

        }


//        ThreadUtil.getThreadInfo(thread);

        new CustomThread().start();
    }
}
