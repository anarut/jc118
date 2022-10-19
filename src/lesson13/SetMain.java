package lesson13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {
//        final Set<String> colors = new HashSet<>();
//        Set<String> colors = new LinkedHashSet<>();
        Set<String> colors = new TreeSet<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        System.out.println(colors.add("Red"));
        System.out.println(colors);
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Pink");
        System.out.println(colors);
        Set<String> subset = Set.of("Green", "Blue");
        colors.addAll(subset);
        System.out.println(colors);
//        subset.add("brown");

        List<String> objects = new ArrayList<>(colors);
        objects.add("Black");
        objects.add("Black");
        objects.add("Black");
        objects.add("Red");
        objects.add("Red");
        objects.add("Red");
        System.out.println(objects);
        Set<String> strings = new HashSet<>(objects);
        System.out.println(strings);
    }
}
