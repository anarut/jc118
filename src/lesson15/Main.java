package lesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<String> objects = new ArrayList<>();
        objects.add("zed");
        objects.add("abc");
        objects.sort(null);
        Iterator<String> iterator = objects.iterator();
        Iterator<String> iterator1 = objects.iterator();// another one
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        for (String s : objects) {
            System.out.println(s);
        }

        objects.forEach(s -> {
            System.out.println(s);
        });

        ListIterator<String> stringListIterator = objects.listIterator();
    }
}
