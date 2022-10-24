package lesson14;

import lesson13.Point;

import java.util.Comparator;

public class PointYAscXAscComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        int result = Integer.compare(o1.getY(), o2.getY());
        if (result == 0) {
            return Integer.compare(o1.getX(), o2.getX());
        } else {
            return result;
        }
    }
}
