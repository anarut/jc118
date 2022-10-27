package lesson15;

import java.io.IOException;
import java.util.Random;

public class EMain {

    public static void main(String[] args) throws Exception {
        try {
//            int a = 5 /0;
            test();
//        } catch (Exception e) {
//
        } finally {
            System.out.println("hehe");
        }
    }

    public static void test() throws IOException {
        if (new Random().nextBoolean()) {
            throw new IOException("this is test");
        }
    }
}
