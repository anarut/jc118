package lesson22;

public class Store {

    private final int maxCount;
    private int count = 0;

    public Store(int maxCount) {
        this.maxCount = maxCount;
    }

    public void addToStore(String name) {
        while (count >= maxCount) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;

        System.out.printf("'%s' --- Added 1 item. %d items left in store.\n", name, count);
        notifyAll();
    }

    public void removeFromStore(String name) {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;

        System.out.printf("'%s' --- Removed 1 item. %d items left in store.\n", name, count);
        notifyAll();
    }
}
