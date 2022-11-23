package lesson20;

public class CustomThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello");
        ThreadUtil.getThreadInfo(Thread.currentThread());
    }
}
