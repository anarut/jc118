package lesson19;

import lesson13.Point;

public class Main {

    public static void main(String[] args) {
        Pointer pointer1 = (x, y) -> new Point(x, y);
        Pointer pointer2 = Point::new;

        Point point = pointer1.create(0, 0);
        Point point1 = pointer2.create(5, 7);
        Pointer pointer3 = (x, y) -> {
            Point p = new Point();
//            p.setX(x);
//            p.setY(y);
            return p;
        };



    }

    interface Pointer {
        Point create(int x, int y);
    }
}
