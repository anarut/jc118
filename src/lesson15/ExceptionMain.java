package lesson15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionMain {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = null;
        try {
             fileInputStream = new FileInputStream("");
        } catch (Exception e) {
//            e.printStackTrace();
            return;
        } finally {
//            try {
//                fileInputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            System.out.println("1");
        }
        System.out.println("2");
    }
}
