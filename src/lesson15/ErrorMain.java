package lesson15;

import java.util.Random;

public class ErrorMain {

    static int i = 0;
    public static void main(String[] args) {
        doNothing();
    }

    public static void doNothing() {
        System.out.println(++i);
        if (new Random().nextBoolean()) {
            doNothing();
        } else {
            doNothing();
        }

    }
}
