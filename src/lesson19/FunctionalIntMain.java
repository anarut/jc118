package lesson19;

import lesson13.Point;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalIntMain {

    public static void main(String[] args) {
        String str = "I read book";
        Function<String, Integer> calc = s -> {
            String[] split = s.split("\\s+");
            return split.length;
        };

        System.out.println(calc.apply(str));

        System.out.println(calc.apply("Hello world"));

        BiFunction<String, String, Integer> calc1 = (s1, s2) ->
                calc.apply(s1) + calc.apply(s2);


        Consumer<String> calc2 = s -> {
            Integer apply = calc.apply(s);
            System.out.println(apply);
        };

        calc2.accept("test teste tet tset set te");

        System.out.println();
        Supplier<Integer> supplier = () -> new Random().nextInt(100) - 50;
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());


        Predicate<Integer> isDividedBy2 = i -> {
            return i % 2 == 0;
        };

        Predicate<Integer> isDividedBy3 = i -> {
            return i % 3 == 0;
        };

        Predicate<Integer> isDividedBy6 = i -> {
            return isDividedBy2.test(i) && isDividedBy3.test(i);
        };

        boolean test = isDividedBy6.test(66);
        boolean test1 = isDividedBy6.test(44);

//        i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0;


        BinaryOperator<Point> scalarSum = (p1, p2) -> {
            Point point = new Point();
            point.setX(p1.getX() + p2.getX());
            point.setY(p1.getY() + p2.getY());
            return point;
        };

        BiFunction<Point, Point, Point> s = scalarSum;

        Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 4);
        Point result = scalarSum.apply(point1, point2);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(result);
    }
}
