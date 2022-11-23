package lesson20;

import lesson13.Point;
import lesson14.PointVectorComparator;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        Optional<Integer> any = Stream.of(1, 2, 3, 4, 5)
                .parallel()
                .findFirst();

        any.ifPresent(a -> System.out.println(a));

        System.out.println(any.orElse(0));

        System.out.println(any.orElse(new Random().nextInt(10))); // 5 sec
        System.out.println(any.orElseGet(() -> new Random().nextInt(10))); // 5sec or 0sec


        Optional<Point> max = Stream.of(new Point(1, 1), new Point(0, 3), new Point(1, 2))
                .max(new PointVectorComparator());
        System.out.println(max.get());


        Point reduce = Stream.of(new Point(1, 1), new Point(0, 3), new Point(1, 2))
                .reduce(new Point(0, 0), (p1, p2) -> new Point(p1.getX() + p2.getX(), p1.getY() + p2.getY()));
        System.out.println(reduce);

        OptionalDouble average = IntStream.of(1, 2, 3, 4).average();

        IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 3, 4).summaryStatistics();

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4)
                .map(i -> i + 1);
        Stream<Integer> integerStream1 = integerStream.filter(i -> i > 2);
        Stream<Integer> integerStream2 = integerStream.filter(i -> i > 3);
    }
}
