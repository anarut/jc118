package lesson20;

public class ThreadUtil {

    public static void getThreadInfo(Thread thread) {
        synchronized (Thread.class) {
            System.out.println("------");
            System.out.println("Name: " + thread.getName() + " Id: " + thread.getId() +  " Group: " + thread.getThreadGroup().getName());
            System.out.println("Priority: " + thread.getPriority() + " alive: " + thread.isAlive());
            System.out.println("------");
        }
    }

    public static void test() {
        synchronized (Thread.class) {
            System.out.println("TODO");
        }
    }

    public static synchronized void test1() { } // ThreadUtil.class
    public synchronized void test2() {
//        synchronized (this) {
//
//        }
    } //this
}
