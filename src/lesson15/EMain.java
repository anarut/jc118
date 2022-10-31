package lesson15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.Random;

public class EMain {

    public static void main(String[] args)  {
        try {
            test();
        } catch (Throwable e) {
            e.printStackTrace();
        }


        try {
//            int a = 5 /0;

//        } catch (Exception e) {
//
        } finally {
            System.out.println("hehe");
        }
    }

    public static void test() throws FileNotFoundException, AccessDeniedException {
        if (new Random().nextBoolean()) {
            throw new FileNotFoundException("this is test");
        }

        if (new Random().nextBoolean()) {
            throw new AccessDeniedException("this is test");
        }
    }
}
