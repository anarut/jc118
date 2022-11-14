package lesson17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Main {

    public static final String PERSONS = "persons.data";
    public static void main(String[] args) throws Exception {
//        writeToFile();
        readFromFile();

        String data = "hello" + "friend";
    }


    public static void writeToFile() throws IOException {
        final Person person = new Person("Alex", "Black",
                LocalDate.of(2000, 2, 14),
                88.5, 179, true);

        person.setPassword("12341234");

        try (FileOutputStream fos = new FileOutputStream(PERSONS);
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(person);
        }
    }


    public static void readFromFile() throws IOException, ClassNotFoundException {
        try (var fis = new FileInputStream(PERSONS);
             var ois = new ObjectInputStream(fis)){

            Object o = ois.readObject();
            System.out.println(o.getClass());
            if (o instanceof Person p) {
                System.out.println(p);
                System.out.println(p.getFirstName());
                System.out.println(p.getBirthDate());
            }

            if (o.getClass().equals(Person.class)) {
                final Person p = (Person) o;
            }
        }
    }
}
