package lesson21;

import java.util.concurrent.atomic.AtomicInteger;

public class ClassA {

    volatile int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
