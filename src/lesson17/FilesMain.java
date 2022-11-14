package lesson17;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;

public class FilesMain {

    public static void main(String[] args) throws IOException {
        final File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        final File file1 = new File("test1.txt");
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        if (!file1.exists()) {
            final boolean newFile = file1.createNewFile();
            System.out.println(newFile);
        }

        final String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        final File canonicalFile = file.getCanonicalFile();
        System.out.println(canonicalFile.getAbsolutePath());
        final File parentFile = canonicalFile.getParentFile();
        System.out.println(parentFile.getAbsolutePath());

        for (String s : parentFile.list()) {
            System.out.println(s);
        }

        final URI uri = parentFile.toURI();
        System.out.println(uri);
        System.out.println(uri.toURL());


        final File file2 = new File("test/test1.txt");
        file2.renameTo(new File("test15.txt"));

    }
}
