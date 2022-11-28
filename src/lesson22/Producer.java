package lesson22;

public class Producer implements Runnable {

    public static final int DEFAULT_COUNT = 10;

    private final Store store;
    private final int itemsCount;
    private final int idx;

    public Producer(Store store) {
        this(store, DEFAULT_COUNT, -1);
    }

    public Producer(Store store, int itemsCount, int idx) {
        this.store = store;
        this.itemsCount = itemsCount;
        this.idx = idx;
    }

    @Override
    public void run() {
        for (int i = 0; i < itemsCount; i++) {
            store.addToStore("Producer-" + idx);
            //processing
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
