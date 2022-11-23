package lesson20;

public class ThreadUtil {

    public static synchronized void getThreadInfo(Thread thread) {
        System.out.println("------");
        System.out.println("Name: " + thread.getName() + " Id: " + thread.getId() +  " Group: " + thread.getThreadGroup().getName());
        System.out.println("Priority: " + thread.getPriority() + " alive: " + thread.isAlive());
        System.out.println("------");
    }
}
