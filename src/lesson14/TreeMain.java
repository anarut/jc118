package lesson14;

import lesson13.Point;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeMain {

    public static void main(String[] args) {
//        Set<Point> points = new TreeSet<>(new PointYAscXAscComparator());
//        Set<Point> points = new TreeSet<>(new PointVectorComparator());
        Set<Point> points = new TreeSet<>(new PointVectorComparator().thenComparing(new PointYAscXAscComparator()));
        points.add(new Point(1, 1));
        points.add(new Point(-1, -1));
        points.add(new Point(1, 5));
        points.add(new Point(1, -1));
        points.add(new Point(3, 2));
        points.add(new Point(4, 7));
        points.add(new Point(3, 2));
        points.add(new Point(11, 6));
        points.add(new Point(-2, -2));

        System.out.println(points);
    }
}
