package lesson13;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Object> points = new HashSet<>();
        points.add(new Point(1, 1));
        points.add(new Point(1, 5));
        points.add(new Point(1, 1));
        points.add(new Point(3, 2));
        points.add(new Point(4, 7));
        points.add(new Point(3, 2));
        points.add(new Point(11, 6));

        System.out.println(points);
    }
}
