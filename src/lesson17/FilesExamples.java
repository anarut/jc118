package lesson17;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class FilesExamples {

    public static void main(String[] args) {
        final File dir = new File("/Users/Andrey/Downloads");
        System.out.println(dir.exists());
        final File[] files = dir.listFiles();
        System.out.println();
        System.out.println("LIST OF FILES:");
        for (File file : files) {
            final long l = file.lastModified();
            final Instant instant = Instant.ofEpochMilli(l);
            if (file.getName().startsWith("FY20")) {
                System.out.println("DELETE: "  + file.getName() );
                file.delete();
            } else {
                System.out.println("DO NOTHING: "  + file.getName()+ " "  + LocalDateTime.ofInstant(instant, ZoneOffset.UTC));
            }
        }
        System.out.println("-----");
    }
}
