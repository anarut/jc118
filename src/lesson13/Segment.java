package lesson13;

import java.util.Objects;

public class Segment {

    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Segment)) return false;
        Segment segment = (Segment) o;
        return Objects.equals(getStart(), segment.getStart()) &&
                    Objects.equals(getEnd(), segment.getEnd());
    }

    @Override
    public int hashCode() {
     return 31 * getStart().hashCode() + getEnd().hashCode();
//        return Objects.hash(getStart(), getEnd());
    }
}
