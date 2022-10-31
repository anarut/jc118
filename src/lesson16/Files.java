package lesson16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Files {

    public static final String FILE_NAME = "../test.jpeg";

    public static void main(String[] args) {
//        showProps();
//        writeIntoFile();
        try {
            readFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showProps() {
        Properties properties = System.getProperties();
        for (Object key: properties.keySet()) {
            System.out.println(key + " ---> " + properties.get(key));
        }
    }

    public static void readFromFile() throws IOException {
        final FileInputStream fis = new FileInputStream(FILE_NAME);
        try (FileInputStream fileInputStream = fis;
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
//            int read = fileInputStream.read();
//            while (read != -1) {
//                System.out.print((char) read);
//                read = fileInputStream.read();
//            }
            byte[] bytes = bufferedInputStream.readAllBytes();
            String s = new String(bytes);
            System.out.println(s);
        }
    }

    public static void writeIntoFile() {
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(FILE_NAME);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String txt = "Hello world!";
            bufferedOutputStream.write(txt.getBytes());
//            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
