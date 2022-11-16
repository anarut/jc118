package lesson19;

import lesson13.Point;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfMain {

    public static void main(String[] args) throws Exception {
        Stream<Integer> integerStream = Stream.of(1, 9, 17, 2, 3, 13, 41, 5, 61, 4, 5, 6, 7, 9, 10);
        int[] a = {1, 2, 3};
        IntStream stream = Arrays.stream(a);
        Stream<String> stream1 = new ArrayList<String>().stream();
//        Stream<String> lines = new BufferedReader(new FileReader("")).lines();

        integerStream
                //intermediate ops:
                .filter(s -> s % 2 != 0)
                .distinct()
                .sorted((a1, b1) -> -Integer.compare(a1, b1))
                .skip(3)
                .limit(5)
                .map(s -> s + 5)
                .map(s -> new Point(s, -s))
                .map(s -> String.valueOf(s))
//                .map(s -> s.length())
//                terminal op
                .forEach(s -> System.out.print(s + " "));


        System.out.println();

        Map<Character, List<Character>> collect =
                Stream.of("", "Hello", "Java world", "test", "Cucumber", "Bicycle")
                .map(String::toLowerCase)
                .map(s -> s.replaceAll("\\W", ""))
//                .map(s -> {
//                    char[] chars = s.toCharArray();
//                    return Arrays.stream(chars);
//                });
                .flatMapToInt(s -> s.chars())
//                .forEach(s -> System.out.print((char) s + " "));
                .mapToObj(c -> Character.valueOf((char) c))
                .collect(Collectors.groupingBy(c -> c));

        System.out.println(collect);

        Character key = Stream.of("", "Hello", "Java world", "test", "Cucumber", "Bicycle")
                .map(String::toLowerCase)
                .map(s -> s.replaceAll("\\W", ""))
//                .map(s -> {
//                    char[] chars = s.toCharArray();
//                    return Arrays.stream(chars);
//                });
                .flatMapToInt(s -> s.chars())
//                .forEach(s -> System.out.print((char) s + " "));
                .mapToObj(c -> Character.valueOf((char) c))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .max((o1, o2) -> Long.compare(o1.getValue(), o2.getValue()))
                .get()
                .getKey();

        System.out.println(key);

    }
}
