package lesson13;

public class Point implements Comparable<Point> {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + '}';
    }

    @Override
    public boolean equals(Object anotherPoint) {
        if (this == anotherPoint) return true;
        if (anotherPoint == null || getClass() != anotherPoint.getClass()) return false;

        Point point = (Point) anotherPoint;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }


    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return Integer.compare(this.y, o.y);
//            return this.y == o.y ? 0 : (this.y > o.y ? 1 : -1);

//            if (this.y == o.y) {
//                return 0;
//            } else if (this.y > o.y) {
//                return 1;
//            } else {
//                return -1;
//            }
        } else if (this.x > o.x) {
            return 1;
        } else {
            return -1;
        }
    }
}
