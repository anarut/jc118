package lesson14;

import lesson13.Point;

import java.util.Comparator;

public class PointVectorComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        int v1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
        int v2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
        return Integer.compare(v1, v2);
    }
}
